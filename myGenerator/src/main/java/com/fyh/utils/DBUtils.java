package com.fyh.utils;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.commons.lang.StringUtils;

import com.fyh.beans.ColumnInfo;
import com.fyh.beans.TableInfo;

/**
 * 数据库工具类
 * 
 * @author fengyh
 * @date 2016年7月10日
 */
public class DBUtils {

    /**
     * 数据库驱动类名称
     */
    private static String driverClassName;
    /**
     * 数据库连接地址
     */
    private static String url;
    /**
     * 数据库用户名
     */
    private static String username;
    /**
     * 数据库密码
     */
    private static String password;

    /**
     * 数据库连接
     */
    private static Connection conn;
    
    static {
        Properties properties = new Properties();
        try {
            properties.load(DBUtils.class
                    .getResourceAsStream("../../../conf.properties"));
        } catch (IOException e) {
            System.err.println("未找到配置文件：conf.properties");
            ;
            System.exit(0);
        }
        driverClassName = properties.getProperty("driverClassName");
        url = properties.getProperty("url");
        username = properties.getProperty("username");
        password = properties.getProperty("password");
    }

    public static Connection getConnection() throws Exception {
        if (null == conn) {
            Class.forName(driverClassName);
            conn = DriverManager.getConnection(url, username, password);
        }
        return conn;
    }

    /**
     * 获取数据库表信息
     * @param schemaPattern 表模式，like查询
     * @param tableNames 表名，中间用英文逗号分开
     * @return
     * @throws Exception
     */
    public static List<TableInfo> getTableInfos(String schemaPattern, String tableNames)
            throws Exception {
        List<TableInfo> tables = new ArrayList<>();
        conn = getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql;
        try {
            if (StringUtils.isEmpty(tableNames)) {
                sql = "select * from information_schema.tables where table_schema like ?";
            } else {
                tableNames = tableNames.replaceAll(" ","").replaceAll(",", "','");
                sql = "select * from information_schema.tables where table_schema like ? and TABLE_NAME in('" + tableNames + "')";
            }
            ps = conn.prepareStatement(sql);
            ps.setString(1, StringUtils.isBlank(schemaPattern) ? "%" : schemaPattern);
            rs = ps.executeQuery();
            while (rs.next()) {
                TableInfo info = new TableInfo();
                tables.add(info);
                info.setTableCatalog(rs.getString("TABLE_CATALOG"));
                info.setTableSchema(rs.getString("TABLE_SCHEMA"));
                info.setTableName(rs.getString("TABLE_NAME"));
                info.setTableType(rs.getString("TABLE_TYPE"));
                info.setEngine(rs.getString("ENGINE"));
                info.setVersion(rs.getLong("VERSION"));
                info.setRowFormat(rs.getString("ROW_FORMAT"));
                info.setTableRows(rs.getLong("TABLE_ROWS"));
                info.setAvgRoeLength(rs.getLong("AVG_ROW_LENGTH"));
                info.setDataLength(rs.getLong("DATA_LENGTH"));
                info.setMaxDataLength(rs.getLong("MAX_DATA_LENGTH"));
                info.setIndexLength(rs.getLong("INDEX_LENGTH"));
                info.setDataFree(rs.getLong("DATA_FREE"));
                info.setAntoIncrement(rs.getLong("AUTO_INCREMENT"));
                info.setCreateTime(rs.getTimestamp("CREATE_TIME"));
                info.setUpdateTime(rs.getTimestamp("UPDATE_TIME"));
                info.setCheckTime(rs.getTimestamp("CHECK_TIME"));
                info.setTableCollation(rs.getString("TABLE_COLLATION"));
                info.setCheckSum(rs.getLong("CHECKSUM"));
                info.setCreateOptions(rs.getString("CREATE_OPTIONS"));
                info.setTableComment(rs.getString("TABLE_COMMENT"));
            }
        } catch (Exception e) {
            System.out.println("读取表信息失败" + e);
            System.exit(1);
        } finally {
            closeQuietly(ps);
            closeQuietly(rs);
        }
        return tables;
    }
    
    /**
     * 获取列数据
     * @param schemaPattern 表模式，like查询
     * @param tableName 表名
     * @return
     * @throws Exception
     */
    public static List<ColumnInfo> getColumnInfos(String schemaPattern, String tableName) throws Exception {
        List<ColumnInfo> infos = new ArrayList<>();
        conn = getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "select *  from information_schema.columns where table_schema like ? and table_name=? order by ordinal_position";
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, schemaPattern);
            ps.setString(2, tableName);
            rs = ps.executeQuery();
            while(rs.next()) {
                ColumnInfo info = new ColumnInfo();
                infos.add(info);
                info.setTableCatalog(rs.getString("TABLE_CATALOG"));
                info.setTableSchema(rs.getString("TABLE_SCHEMA"));
                info.setTableName(rs.getString("TABLE_NAME"));
                info.setColumnName(rs.getString("COLUMN_NAME"));
                info.setOrdinalPosition(rs.getLong("ORDINAL_POSITION"));
                info.setColumnDefault(rs.getString("COLUMN_DEFAULT"));
                info.setIsNullable(rs.getString("IS_NULLABLE"));
                info.setDataType(rs.getString("DATA_TYPE"));
                info.setCharacteMaximumLength(rs.getLong("CHARACTER_MAXIMUM_LENGTH"));
                info.setCharacterOctetLength(rs.getLong("CHARACTER_OCTET_LENGTH"));
                info.setNumericPrecision(rs.getLong("NUMERIC_PRECISION"));
                info.setNumericScale(rs.getLong("NUMERIC_SCALE"));
                info.setDatetimePrecision(rs.getLong("DATETIME_PRECISION"));
                info.setCharacterSetName(rs.getString("CHARACTER_SET_NAME"));
                info.setCollationName(rs.getString("COLLATION_NAME"));
                info.setColumnType(rs.getString("COLUMN_TYPE"));
                info.setColumnKey(rs.getString("COLUMN_KEY"));
                info.setExtra(rs.getString("EXTRA"));
                info.setPrivileges(rs.getString("PRIVILEGES"));
                info.setColumnComment(rs.getString("COLUMN_COMMENT"));
            }
        } catch (Exception e) {
            System.out.println("获取列数据失败：" + tableName);
        }
        return infos;
    }
    
    public static void closeQuietly(AutoCloseable closeable) {
        if (null != closeable) {
            try {
                closeable.close();
            } catch (Exception e) {
            }
        }
    }
    
    public static void main(String[] args) throws Exception {
        List<TableInfo> infos = DBUtils.getTableInfos("%", "tables, files, ");
        System.out.println(infos.size());
    }

}

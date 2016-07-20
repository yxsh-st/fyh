package com.fyh.beans;

import java.util.Date;
import java.util.List;

/**
 * 数据库表信息
 * 
 * @author fengyh
 * @date 2016年7月10日
 */
/**
 * 
 * 
 * @author fengyh
 * @date 2016年7月14日
 */
public class TableInfo {

    /**
     * 表目录
     */
    private String tableCatalog;

    /**
     * 表模式
     */
    private String tableSchema;

    /**
     * 表名
     */
    private String tableName;

    /**
     * 表类型
     */
    private String tableType;

    /**
     * 引擎
     */
    private String engine;

    /**
     * 版本
     */
    private Long version;

    /**
     * 行格式
     */
    private String rowFormat;

    /**
     * 表行数
     */
    private Long tableRows;

    /**
     * 平均行长度
     */
    private Long avgRoeLength;

    /**
     * 数据长度
     */
    private Long dataLength;

    /**
     * 数据最大长度
     */
    private Long maxDataLength;

    /**
     * 
     */
    private Long indexLength;

    /**
     * 
     * */
    private Long dataFree;

    /**
     * 自动增长值
     */
    private Long antoIncrement;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 核查时间
     */
    private Date checkTime;

    /**
     * 排序规则
     */
    private String tableCollation;

    /**
     * 校验和
     */
    private Long checkSum;

    /**
     * 创建参数
     */
    private String createOptions;

    /**
     * 表注释
     */
    private String tableComment;
    
    /**
     * 列信息
     */
    private List<ColumnInfo> columns;

    /**
     * @return 表目录
     */
    public String getTableCatalog() {
        return tableCatalog;
    }

    /**
     * @param tableCatalog
     *            表目录
     */
    public void setTableCatalog(String tableCatalog) {
        this.tableCatalog = tableCatalog;
    }

    /**
     * @return 表模式
     */
    public String getTableSchema() {
        return tableSchema;
    }

    /**
     * @param tableSchema
     *            表模式
     */
    public void setTableSchema(String tableSchema) {
        this.tableSchema = tableSchema;
    }

    /**
     * @return 表名
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * @param tableName
     *            表名
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * @return 表类型
     */
    public String getTableType() {
        return tableType;
    }

    /**
     * @param tableType
     *            表类型
     */
    public void setTableType(String tableType) {
        this.tableType = tableType;
    }

    /**
     * @return 引擎
     */
    public String getEngine() {
        return engine;
    }

    /**
     * @param engine
     *            引擎
     */
    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * @return 版本
     */
    public Long getVersion() {
        return version;
    }

    /**
     * @param version
     *            版本
     */
    public void setVersion(Long version) {
        this.version = version;
    }

    /**
     * @return 行格式
     */
    public String getRowFormat() {
        return rowFormat;
    }

    /**
     * @param rowFormat
     *            行格式
     */
    public void setRowFormat(String rowFormat) {
        this.rowFormat = rowFormat;
    }

    /**
     * @return 表行数
     */
    public Long getTableRows() {
        return tableRows;
    }

    /**
     * @param tableRows
     *            表行数
     */
    public void setTableRows(Long tableRows) {
        this.tableRows = tableRows;
    }

    /**
     * @return 平均行长度
     */
    public Long getAvgRoeLength() {
        return avgRoeLength;
    }

    /**
     * @param avgRoeLength
     *            平均行长度
     */
    public void setAvgRoeLength(Long avgRoeLength) {
        this.avgRoeLength = avgRoeLength;
    }

    /**
     * @return 数据长度
     */
    public Long getDataLength() {
        return dataLength;
    }

    /**
     * @param dataLength
     *            数据长度
     */
    public void setDataLength(Long dataLength) {
        this.dataLength = dataLength;
    }

    /**
     * @return 数据最大长度
     */
    public Long getMaxDataLength() {
        return maxDataLength;
    }

    /**
     * @param maxDataLength
     *            数据最大长度
     */
    public void setMaxDataLength(Long maxDataLength) {
        this.maxDataLength = maxDataLength;
    }

    /**
     * @return
     */
    public Long getIndexLength() {
        return indexLength;
    }

    /**
     * @param indexLength
     */
    public void setIndexLength(Long indexLength) {
        this.indexLength = indexLength;
    }

    /**
     * @return
     */
    public Long getDataFree() {
        return dataFree;
    }

    /**
     * @param dataFree
     */
    public void setDataFree(Long dataFree) {
        this.dataFree = dataFree;
    }

    /**
     * @return 自动增长值
     */
    public Long getAntoIncrement() {
        return antoIncrement;
    }

    /**
     * @param antoIncrement
     *            自动增长值
     */
    public void setAntoIncrement(Long antoIncrement) {
        this.antoIncrement = antoIncrement;
    }

    /**
     * @return 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     *            创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     *            更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * @return 核查时间
     */
    public Date getCheckTime() {
        return checkTime;
    }

    /**
     * @param checkTime
     *            核查时间
     */
    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    /**
     * @return 排序规则
     */
    public String getTableCollation() {
        return tableCollation;
    }

    /**
     * @param tableCollation
     *            排序规则
     */
    public void setTableCollation(String tableCollation) {
        this.tableCollation = tableCollation;
    }

    /**
     * @return 校验和
     */
    public Long getCheckSum() {
        return checkSum;
    }

    /**
     * @param checkSum
     *            校验和
     */
    public void setCheckSum(Long checkSum) {
        this.checkSum = checkSum;
    }

    /**
     * @return 创建参数
     */
    public String getCreateOptions() {
        return createOptions;
    }

    /**
     * @param createOptions
     *            创建参数
     */
    public void setCreateOptions(String createOptions) {
        this.createOptions = createOptions;
    }

    /**
     * @return 表注释
     */
    public String getTableComment() {
        return tableComment;
    }

    /**
     * @param tableComment
     *            表注释
     */
    public void setTableComment(String tableComment) {
        this.tableComment = tableComment;
    }

    /**
     * @return 列信息
     */
    public List<ColumnInfo> getColumns() {
        return columns;
    }

    /**
     * @param columns 列信息
     */
    public void setColumns(List<ColumnInfo> columns) {
        this.columns = columns;
    }

}

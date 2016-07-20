package com.fyh.beans;

/**
 * 数据库列信息
 * 
 * @author fengyh
 * @date 2016年7月10日
 */
public class ColumnInfo {

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
     * 列名
     */
    private String columnName;

    /**
     * 排序位置
     */
    private Long ordinalPosition;

    /**
     * 默认值
     */
    private String columnDefault;

    /**
     * 是否可为空
     */
    private String isNullable;

    /**
     * 数据类型
     */
    private String dataType;

    /**
     * 字符最大长度
     */
    private Long characteMaximumLength;

    /**
     * 八进制字符长度
     */
    private Long characterOctetLength;

    /**
     * 精度
     */
    private Long numericPrecision;

    /**
     * 小数位数
     */
    private Long numericScale;

    /**
     * 时间精度
     */
    private Long datetimePrecision;

    /**
     * 编码名称
     */
    private String characterSetName;

    /**
     * 排序规则名称
     */
    private String collationName;

    /**
     * 列类型
     */
    private String columnType;

    /**
     * 列主键
     */
    private String columnKey;

    /**
     * 其他
     */
    private String extra;

    /**
     * 权限
     */
    private String privileges;

    /**
     * 列注释
     */
    private String columnComment;

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
     * @return 列名
     */
    public String getColumnName() {
        return columnName;
    }

    /**
     * @param columnName
     *            列名
     */
    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    /**
     * @return 排序位置
     */
    public Long getOrdinalPosition() {
        return ordinalPosition;
    }

    /**
     * @param ordinalPosition
     *            排序位置
     */
    public void setOrdinalPosition(Long ordinalPosition) {
        this.ordinalPosition = ordinalPosition;
    }

    /**
     * @return 默认值
     */
    public String getColumnDefault() {
        return columnDefault;
    }

    /**
     * @param columnDefault
     *            默认值
     */
    public void setColumnDefault(String columnDefault) {
        this.columnDefault = columnDefault;
    }

    /**
     * @return 是否可为空
     */
    public String getIsNullable() {
        return isNullable;
    }

    /**
     * @param isNullable
     *            是否可为空
     */
    public void setIsNullable(String isNullable) {
        this.isNullable = isNullable;
    }

    /**
     * @return 数据类型
     */
    public String getDataType() {
        return dataType;
    }

    /**
     * @param dataType
     *            数据类型
     */
    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    /**
     * @return 字符最大长度
     */
    public Long getCharacteMaximumLength() {
        return characteMaximumLength;
    }

    /**
     * @param characteMaximumLength
     *            字符最大长度
     */
    public void setCharacteMaximumLength(Long characteMaximumLength) {
        this.characteMaximumLength = characteMaximumLength;
    }

    /**
     * @return 八进制字符长度
     */
    public Long getCharacterOctetLength() {
        return characterOctetLength;
    }

    /**
     * @param characterOctetLength
     *            八进制字符长度
     */
    public void setCharacterOctetLength(Long characterOctetLength) {
        this.characterOctetLength = characterOctetLength;
    }

    /**
     * @return 精度
     */
    public Long getNumericPrecision() {
        return numericPrecision;
    }

    /**
     * @param numericPrecision
     *            精度
     */
    public void setNumericPrecision(Long numericPrecision) {
        this.numericPrecision = numericPrecision;
    }

    /**
     * @return 小数位数
     */
    public Long getNumericScale() {
        return numericScale;
    }

    /**
     * @param numericScale
     *            小数位数
     */
    public void setNumericScale(Long numericScale) {
        this.numericScale = numericScale;
    }

    /**
     * @return 时间精度
     */
    public Long getDatetimePrecision() {
        return datetimePrecision;
    }

    /**
     * @param datetimePrecision
     *            时间精度
     */
    public void setDatetimePrecision(Long datetimePrecision) {
        this.datetimePrecision = datetimePrecision;
    }

    /**
     * @return 编码名称
     */
    public String getCharacterSetName() {
        return characterSetName;
    }

    /**
     * @param characterSetName
     *            编码名称
     */
    public void setCharacterSetName(String characterSetName) {
        this.characterSetName = characterSetName;
    }

    /**
     * @return 排序规则名称
     */
    public String getCollationName() {
        return collationName;
    }

    /**
     * @param collationName
     *            排序规则名称
     */
    public void setCollationName(String collationName) {
        this.collationName = collationName;
    }

    /**
     * @return 列类型
     */
    public String getColumnType() {
        return columnType;
    }

    /**
     * @param columnType
     *            列类型
     */
    public void setColumnType(String columnType) {
        this.columnType = columnType;
    }

    /**
     * @return 列主键
     */
    public String getColumnKey() {
        return columnKey;
    }

    /**
     * @param columnKey
     *            列主键
     */
    public void setColumnKey(String columnKey) {
        this.columnKey = columnKey;
    }

    /**
     * @return 其他
     */
    public String getExtra() {
        return extra;
    }

    /**
     * @param extra
     *            其他
     */
    public void setExtra(String extra) {
        this.extra = extra;
    }

    /**
     * @return 权限
     */
    public String getPrivileges() {
        return privileges;
    }

    /**
     * @param privileges
     *            权限
     */
    public void setPrivileges(String privileges) {
        this.privileges = privileges;
    }

    /**
     * @return 列注释
     */
    public String getColumnComment() {
        return columnComment;
    }

    /**
     * @param columnComment
     *            列注释
     */
    public void setColumnComment(String columnComment) {
        this.columnComment = columnComment;
    }

}

package io.ymq.kafka.utils;

/**
 * @author whp 18-10-19
 */
public enum EsTypeEnum {
    HDFSAUDIT("hdfs_audit"),
    HBASEAUDIT("hbase_audit"),
    YARNAUDIT("yarn_audit"),
    HIVEAUDIT("hive_audit"),
    IMPALAAUDIT("impala_audit");

    private String value;

    EsTypeEnum(String value){
        this.value=value;
    }

    public String getValue(){
        return value;
    }
}

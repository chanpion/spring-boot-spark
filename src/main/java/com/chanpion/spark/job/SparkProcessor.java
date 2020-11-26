package com.chanpion.spark.job;

import org.apache.spark.sql.SparkSession;

import java.io.Serializable;

/**
 * Spark任务处理
 *
 * @author April Chen
 * @date 2020/11/25 10:52
 */
public abstract class SparkProcessor implements Serializable {
    private static final long serialVersionUID = 8570494489678087387L;

    /**
     * Spark计算过程
     */
    public abstract void process();

    protected SparkSession sparkSession(String jobName) {
        return SparkSession.builder()
                .appName(jobName)
                .config("spark.serializer", "org.apache.spark.serializer.KryoSerializer")
                .config("spark.sql.hive.convertMetastoreOrc", true)
                .config("spark.sql.orc.impl", "native")
                .getOrCreate();
    }
}

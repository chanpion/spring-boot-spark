package com.chanpion.spark.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author April Chen
 * @date 2020/11/25 9:41
 */
@Configuration
@ConfigurationProperties(prefix = "spark-job")
public class JobConfig {
    private String jobName;

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }
}

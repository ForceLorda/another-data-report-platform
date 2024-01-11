package com.forcelorda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;

/**
 * 启动程序
 * 
 * @author ruoyi
 */
@SpringBootApplication(exclude = { DruidDataSourceAutoConfigure.class })
public class AnotherDataReportApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(AnotherDataReportApplication.class, args);
    }
}

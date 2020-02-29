package com.hongxuan;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@MapperScan("com.hongxuan.mapper")
@SpringBootApplication
public class MoocApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(MoocApplication.class,args);
    }
}

package org.stronger.learn_mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 * Created by macro on 2019/4/8.
 */
@Configuration
@MapperScan("org.stronger.learn_mall.mbg.mapper")
public class MyBatisConfig {
}
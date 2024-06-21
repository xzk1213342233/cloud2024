package com.atguigu.cloud.config;


import feign.Logger;
import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {


    @Bean
    public Retryer retryer(){

        //最大请求次数为3（1+2）。初始间隔时间为100ms，重试时最大时间间隔为1s
//         return new Retryer.Default(100,1,3);

          return Retryer.NEVER_RETRY; //Feign默认配置是不走重试策略的
    }


    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }
}

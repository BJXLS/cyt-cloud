package com.bjxls.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import com.bjxls.common.security.annotation.EnableRyFeignClients;

/**
 * 认证授权中心
 * 
 * @author bjxls
 */
@EnableRyFeignClients
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class CYTAuthApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(CYTAuthApplication.class, args);
        System.out.println("认证授权中心启动成功\n" +
                "  ___  _  _  ____ \n" +
                " / __)( \\/ )(_  _)\n" +
                "( (__  \\  /   )(  \n" +
                " \\___) (__)  (__)");
    }
}

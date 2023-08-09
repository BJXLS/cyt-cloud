package com.bjxls.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 网关启动程序
 * 
 * @author bjxls
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class CYTGatewayApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(CYTGatewayApplication.class, args);
        System.out.println("CYT网关启动成功\n" +
                "  ___  _  _  ____ \n" +
                " / __)( \\/ )(_  _)\n" +
                "( (__  \\  /   )(  \n" +
                " \\___) (__)  (__)");

    }
}

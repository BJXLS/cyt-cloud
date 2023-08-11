package com.bjxls.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.bjxls.common.security.annotation.EnableCustomConfig;
import com.bjxls.common.security.annotation.EnableRyFeignClients;
import com.bjxls.common.swagger.annotation.EnableCustomSwagger2;

/**
 * 系统模块
 * 
 * @author bjxls
 */
@EnableCustomConfig
@EnableCustomSwagger2
@EnableRyFeignClients
@SpringBootApplication
public class CYTSystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(CYTSystemApplication.class, args);
        System.out.println("系统模块启动成功\n" +
                "  ___  _  _  ____ \n" +
                " / __)( \\/ )(_  _)\n" +
                "( (__  \\  /   )(  \n" +
                " \\___) (__)  (__)");
    }
}

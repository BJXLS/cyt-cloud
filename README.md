<h1 align="center" style="margin: 30px 0 30px; font-weight: bold;">CYT-Control Your Time v0.0.1</h1>

## 平台简介
智能日程管理平台。

## 技术选型
1. Spring Boot
2. Spring Cloud Alibaba
3. Redis
4. RocketMQ
5. 
* 后端采用Spring Boot、Spring Cloud & Alibaba。
* 注册中心、配置中心选型Nacos，权限认证使用Redis。
* 流量控制框架选型Sentinel，分布式事务选型Seata。

## 系统服务
1. cyt-gateway：网关服务
2. cyt-auth：授权服务
3. cyt-system：系统服务
4. cyt-todo：todo服务




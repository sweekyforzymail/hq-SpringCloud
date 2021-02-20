# Spring Cloud 纯净框架  

## 【前言】  
一个傻瓜式的 Spring Cloud 简版微服务框架，可根据该框架来进行自定义改造，
实现自己业务需求。

### 一，场景描述与分析  
- 1，前期介绍：  
原项目系统整体为一个单独的Server，部署于CentOS。PC端仅仅使用已部署好的Server。同时，该Server对外提供API接口。
API接口被外部多个App访问。App种类包括Android、IOS、微信小程序...等。  
      
- 2，问题分析：  
由于项目系统是一个单独的Server，版本发布时所有APP都会受到影响。无法兼顾各种应用的服务调用！

- 3，达成期望：  
 分解原系统垂直结构，分解并重构业务，按照RPC治理方式，改造系统应用为微服务结构。兼顾不同应用的服务调用。

### 二，构建模型
  
##### 示意图
<table>
    <tr>
        <td><img src="https://github.com/sweekyforzymail/hq-SpringCloud/blob/master/%E6%9C%8D%E5%8A%A1%E6%B2%BB%E7%90%86.jpg"/></td>
    </tr>
    <tr>
        <td><img src="https://github.com/sweekyforzymail/hq-SpringCloud/blob/master/%E5%AE%98%E5%9B%BE.png"/></td>
    </tr>
</table>
  
### 三，框架组件
SpringBoot 1.5.9.RELEASE：对应SpringCloud版本(此处有坑)  
SpringCloud Dalston.SR1：对应SpringBoot版本(此处有坑)  
Eureka :注册中心  
Feign :发现&调用&负载均衡  
Hystrix :熔断降级  
Zuul :服务网关  

#### 四，快速开始
启动顺序：  
_1 注册中心：hqcloud-eurekaserver  
_2 网关：hqcloud-gateway  
_3 俱乐部模块(服务发布)：hqcloud-club  
_4 机构模块(服务消费)：hqcloud-training

#### 五，模块信息  
##### hqcloud-api（公共类目）
##### hqcloud-club（俱乐部模块-服务发布/消费方）
##### hqcloud-training（机构模块-服务发布/消费方）  
##### hqcloud-eurekaserver（注册中心）  
##### hqcloud-gateway（网关）  


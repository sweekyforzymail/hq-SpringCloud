# Spring Cloud 纯净框架  

## 【前言】  
一个傻瓜式的 Spring Cloud 简版微服务框架，可根据该框架来进行自定义改造，
实现自己业务需求。

#### 一，介绍与分析  
- 1，前期介绍：  
项目系统整体为一个独立的WebServer部署于CentOS。PC端仅仅使用已部署好的WebServer即可。同时，该Server对外提供API接口。
API接口被外部多个App访问。App种类包括Android、IOS、微信小程序...等。  
垂直结构(如)：  
  |——业务模块一  
  |——业务模块二  
  |——业务模块三  
  |——业务模块... ...  
  |——API接口  
  |——页面 
      
- 2，问题分析：  
由于项目系统是一个独立的WebServer，各个App的正常使用受到WebServer版本发布的影响，每种App无法独立良好调用API接口。

- 3，达成期望：  
 分解原系统垂直结构，分解并重构业务，按照RPC治理方式，改造系统应用为微服务结构。

#### 二，构建模型
微服务结构(如)：  
网关  
服务调度  
业务一  
  |——服务发布  
  |——服务消费  
  |——自有业务一  
  |——自有业务... ...  
业务二  
  |——服务发布  
  |——服务消费  
  |——自有业务一  
  |——自有业务... ...  
业务三  
  |——服务发布  
  |——服务消费  
  |——自有业务一  
  |——自有业务... ...  
API-Android  
  |——服务发布  
  |——服务消费  
  |——自有业务一  
  |——自有业务... ...  
API-IOS  
  |——服务发布  
  |——服务消费  
  |——自有业务一  
  |——自有业务... ...  
API-微信小程序  
  |——服务发布  
  |——服务消费  
  |——自有业务一  
  |——自有业务... ...  
  
[如图](https://github.com/sweekyforzymail/hq-SpringCloud/blob/master/%E6%9C%8D%E5%8A%A1%E6%B2%BB%E7%90%86.jpg)  
<table>
    <tr>
        <td><img src="https://github.com/sweekyforzymail/hq-SpringCloud/blob/master/%E6%9C%8D%E5%8A%A1%E6%B2%BB%E7%90%86.jpg"/></td>
    </tr>
</table>
  
#### 二，框架组件
SpringBoot 1.5.9.RELEASE：对应SpringCloud版本(此处有坑)  
SpringCloud Dalston.SR1：对应SpringBoot版本(此处有坑)  
Eureka :注册中心  
Feign :发现&调用&负载均衡  
Hystrix :熔断降级  
Zuul :服务网关  

#### 三，快速使用
启动顺序：  
_1 注册中心：hqcloud-eurekaserver  
_2 网关：hqcloud-gateway  
_3 俱乐部模块(服务发布)：hqcloud-club  
_4 机构模块(服务消费)：hqcloud-training

#### 四，模块信息  
##### hqcloud-api（公共类目）
##### hqcloud-club（俱乐部模块-服务发布/消费方）
##### hqcloud-training（机构模块-服务发布/消费方）  
##### hqcloud-eurekaserver（注册中心）  
##### hqcloud-gateway（网关）  


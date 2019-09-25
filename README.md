# Project Name: Nzuki
这个项目是一个平台集成项目，项目名称为(Nzuki,卯月)，没有使用Spring Cloud使用的是alibaba旗下的Dubbo+ZooKeeper实现的分布式服务,SOA机制.
如果你们有兴趣可以访问[我的Cloudera Manager](http://pluto.iask.in:10775),账号密码均为guest。
## Module Function description
| **Module Name** | **Fuction** | **Descritpion** |
| :----- | :---- | :---- |
| BIGDATE-PARENT | 版本管理 | 版本依赖控制 |
| BIGDATE-COMMON-UTIL | 通用模块 | 第三方依赖包 |
| BIGDATE-SERVICE-UTIL | 通用模块 | SERVICE层包 |
| BIGDATE-WEB-UTIL | 通用模块 | WEB层包 |
| BIGDATE-API | 接口及bean管理 | 接口及实体 |
| BIGDATE-SSO-Service | 单点登陆service层 | Port:8070 |
| BIGDATE-SSO-Web | 单点登陆web层 | Port:8071 |
| BIGDATE-Manager-Service | 后台管理器service层 | Port:8072 |
| BIGDATE-Manager-Web | 后台管理器web层 | Port:8073 |
| BIGDATE-Auth-Service | 认证拦截器 | Port:8077 |
| BIGDATE-Auth-Web | 认证拦截器 | Port:8074 |
| BIGDATE-User-Service | 用户服务 | Port:8075 |
| BIGDATE-User-Web | 用户服务 | Port:8076 |
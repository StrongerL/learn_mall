

## 目的

该项目用于本人学习[mall](https://github.com/macrozheng/mall)。  

## 几项常用的信息

### 常用账户的账号密码

| 账号  | 密码     |
| ----- | -------- |
| test  | 123456   |
| admin | macro123 |

### MongoDB命令

```cmd
# 安装服务：
H:\MongoDB\bin\mongod.exe --config "H:\MongoDB\mongod.cfg" --install
# 启动服务：
net start MongoDB
# 关闭服务：
net stop MongoDB
# 移除服务：
H:\MongoDB\bin\mongod.exe --remove
```



## 需要去学习的知识

- JWT
- SpringSecurity
- SpringTask
- Elasticsearch
- Kibana
- MondoDB
- RabbitMQ
- Lombok



## 2020/11/25  

搭建项目框架，配置swagger。mybatis为类生成swagger注解时出错，问题还未找出。  

## 2020/12/07

之前整合了redis，忘记记录了，今天完成了以下部分。

### mall整合SpringSecurity和JWT实现认证和授权

教程中缺失的部分：

- mybatis generator配置文件修改；

- pom.xml中，添加的依赖可能少了一项；

  ```xml
  <dependency>
      <groupId>org.hibernate</groupId>
      <artifactId>hibernate-validator</artifactId>
      <version>5.0.2.Final</version>
  </dependency>
  ```

- 在application.yml中添加# 自定义jwt key；

- 添加UmsAdminLoginParam类；

- UmsAdminRoleRelationDao的添加；

  - 添加类文件；
  - 添加xml文件；
  - MyBatisConfig中添加扫描的包。

- 数据库问题，ums_admin_role_relation表中将test也设置为了超级管理员；此外ums_role_permission_relation表中，没有设置超级管理员的权限。

### mall整合SpringTask实现定时任务

按照教程进行。

### mall整合Elasticsearch实现商品搜索

遇到的问题：

- 版本问题，我使用了elasticsearch7.6.2和kibana7.6.2，但是springboot2.4.0废弃了一些相关语法，所以我将springboot版本修改为了2.3.0.RELEASE。

教程中缺失的部分：

- EsProductDao类的添加
  - 添加类文件；
  - 添加xml文件。

### mall整合Mongodb实现文档操作

按照教程进行。

### mall整合RabbitMQ实现延迟消息

教程中缺失的部分：

- 添加OrderParam类

### mall整合OSS实现文件上传

教程中缺失的部分：

- 使用前端测试时的跨域问题；

  参考教程中[前后端分离项目，如何解决跨域问题](http://www.macrozheng.com/#/technology/springboot_cors)。

- 暂时应该还无法使用前端测试，因为很多后端api还没有写。


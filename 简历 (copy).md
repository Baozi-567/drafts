# Java后端开发求职简历

## 求职意向
Java后端开发工程师（实习/全职）

---

## 基本信息  
- **姓名**：张三（示例）  
- **联系方式**：+86 188-XXXX-XXXX | 27@163.com  
- **Gitee**：[iajie](https://gitee.com/iajie)  
- **技术博客**：[个人博客](http://blog.example.com)  
- **教育背景**：  
  - **学校**：XX大学  
  - **专业**：空间信息与数字技术（主修课程：Java程序设计、数据结构与算法、数据库原理、计算机网络、操作系统）  
  - **毕业时间**：2025年6月（预计）  

---

## 专业技能  

### **编程基础**  
- 熟练掌握Java核心语法及OOP思想，遵循阿里巴巴开发规范，具备高质量代码编写能力  
- 熟悉多线程编程及线程池技术，理解锁机制（如ReentrantLock、Synchronized）及CAS底层原理  
- 扎实的数据结构与算法基础（链表、二叉树、哈希表、排序算法等），LeetCode刷题200+  

### **数据库与中间件**  
- 熟悉MySQL索引（B+树）、事务隔离级别（ACID）、SQL优化（如Explain分析）  
- 掌握Redis核心数据类型（String/Hash/List/Set/ZSet）及持久化策略（RDB/AOF）  
- 熟练使用RabbitMQ实现异步通信，熟悉消息可靠性传输（持久化、Confirm机制）及延迟队列  

### **开发框架**  
- 精通Spring全家桶（Spring Boot/Spring MVC/Spring Security），熟悉MyBatis-Plus动态SQL  
- 了解Spring Cloud微服务组件（Nacos注册中心、OpenFeign远程调用、Gateway网关）  
- 使用Sentinel实现服务熔断限流，结合Seata完成分布式事务（AT模式）  

### **运维与工具**  
- 掌握Docker容器化部署（Dockerfile编写、Compose多容器编排）  
- 熟悉Linux常用命令（如日志分析：grep/awk，进程管理：ps/netstat）  
- 熟练使用Git进行版本控制（分支管理、冲突解决），熟悉Nginx反向代理与负载均衡  

---

## 项目经历  

### **云端论坛系统**（2023.09-2024.02）  
**技术栈**：Spring Cloud Alibaba + MyBatis-Plus + Redis + RabbitMQ + Docker + Nginx  

**项目描述**：  
- 基于微服务架构的在线社区平台，支持用户发帖、私信聊天、热搜排行等功能，日均PV 5k+  
- 后台集成音乐播放器与OSS文件管理，前端采用若依框架实现响应式布局  

**核心贡献**：  
1. **网关与安全**：  
   - 基于Spring Cloud Gateway实现统一鉴权，通过Redis存储JWT令牌，拦截非法请求  
   - 集成Spring Security OAuth2完成RBAC权限管理，支持动态路由配置  

2. **异步通信优化**：  
   - 使用RabbitMQ延迟队列实现注册邮件异步发送，减少用户等待时间（平均响应时间降低40%）  
   - 通过死信队列处理消息重试，结合手动ACK机制保证消息零丢失  

3. **分布式事务**：  
   - 采用Seata AT模式解决跨服务数据一致性问题（如用户积分与帖子发布的原子性操作）  
   - 使用Sentinel配置熔断规则，接口异常率下降至1%以下  

4. **性能优化**：  
   - 基于Redis缓存热点文章数据，QPS从500提升至2000+  
   - 通过Gzip压缩HTTP响应体，结合Nginx静态资源缓存，页面加载速度优化35%  

**部署实践**：  
- 编写Dockerfile构建镜像，通过Docker Compose编排MySQL、Redis等依赖服务  
- 使用Jenkins实现CI/CD流水线，自动化部署至阿里云ECS  

**源码**：[Gitee仓库](https://gitee.com/iajie/cloud-forum)  

---

### **其他补充**  
- **竞赛经历**：获2023年XX省大学生程序设计竞赛三等奖  
- **英语能力**：CET-6，能熟练阅读英文技术文档  
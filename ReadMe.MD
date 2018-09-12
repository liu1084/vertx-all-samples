### Vert.x
是一个基于Netty的异步编程工具包，有了它，我们可以快速的开发异步/非阻塞的应用

#### Verticle
通过创建基于AbstractVerticle的verticle，可以创建一个个的应用；


### 简单应用创建步骤 

1. 创建一个maven工程，在pom.xml中添加vertx-core依赖
1. 继承AbstractVerticle，创建一个应用
1. 重写start方法


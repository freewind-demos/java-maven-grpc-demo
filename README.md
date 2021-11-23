Java Protocol Buffers Demo
=======================

```
sdk use java 16.0.1.hs-adpt
```

### 生成/更新protobuf对应的Java代码

```
mvn clean package
```

将会在`src/main/java/demo/protobuf/generated`生成相关的Java文件，包括message和service

## 编译运行

```
mvn clean compile
```

server:
```
mvn exec:java -Dexec.mainClass="demo.main.Server"
```

client:

```
mvn exec:java -Dexec.mainClass="demo.main.Client"
```


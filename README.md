### This project Database is ran on a docker file in Railway.app
[Railway.app Docs](https://docs.railway.app/)
[More about Railway.app](https://youtu.be/eMPPhtEIvOU?si=v_6YHbUY18Mq2Di7)
[Alternative for Railway.app](https://youtu.be/prjMJtXCR-g?si=ixeKJWRzJ5zSmg0B)

### 1. Add following config to `application.properites` file in
```
/src/main/resources/application.properties
```

### 2. Add following to the file
```application.properites
spring.data.mongodb.host=mongodb://mongo:<password>@monorail.proxy.rlwy.net:<portNumber>
spring.data.mongodb.uri=mongodb://mongo:<password>@monorail.proxy.rlwy.net:<portNumber>
spring.data.mongodb.port=<portNumber>
spring.data.mongodb.database=test
```

```eg
spring.data.mongodb.host=mongodb://mongo:#####@monorail.proxy.rlwy.net:#####
spring.data.mongodb.uri=mongodb://mongo:#####@monorail.proxy.rlwy.net:#####
spring.data.mongodb.port=#####
spring.data.mongodb.database=test
```
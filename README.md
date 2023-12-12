### This project Database is ran on a docker file in Railway.app
[Railway Docs](https://docs.railway.app/)

### 1. Create `application.properites` file in
```
/Users/rusira/Documents/codes/java/test-mongodb/src/main/resources/application.properties
```

### 2. Add following to the file
```application.properites
spring.data.mongodb.host=mongodb://mongo:<password>@monorail.proxy.rlwy.net:<portNumber>
spring.data.mongodb.uri=mongodb://mongo:<password>@monorail.proxy.rlwy.net:<portNumber>
spring.data.mongodb.port=<portNumber>
spring.data.mongodb.database=test
```
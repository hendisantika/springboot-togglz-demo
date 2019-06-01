# springboot-togglz-demo

## Requirements

* Java 8
* Maven 3.2.x

#### Building the artifact
```
mvn clean package
```

####  Running the application from command line
```
mvn clean spring-boot:run
```

#### Available URLs
```
curl -v "http://localhost:8080/api/demo-cms/0"
curl -v "http://localhost:8080/api/demo-es/0
curl -v "http://localhost:8080/api/demo-someservice/0"
```

should result in successful responses. 

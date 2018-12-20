"# microservice-1.0-with-spring-boot" 

## Build all-service project

```
$./mvnw clean package -DskipTests=true
```

## Build ALL Docker Image
```
./docker-compose build
```

## Run all Docker Image in Container (Background mode -d)
```
./docker-compose up --build -d
```

## Show all Container
```
./docker container ls
```

## Stop all-service
```
./docker-compose stop
```

## all-service
* product-service -> http://[docker-machine]:8088
* store-service -> http://[docker-machine]:8089

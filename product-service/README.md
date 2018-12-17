## Run project

```
$./mvnw clean package -DskipTests=true
```

## Build Docker Image
```
docker build -t product-service .
```

## Run Docker Image in Container
```
docker run -p 9000:8000 product-service
```

## Product service (port = 8080)
* http://localhost:9000

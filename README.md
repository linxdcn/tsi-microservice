# tsi-microservice

## Requirement

* Java 1.8
* Maven 3.3.9
* Docker and Docker compose

## How to run

```sbtshell
git clone https://github.com/linxdcn/tsi-microservice.git
cd tsi-microservice
mvn clean install
cd docker
docker-compose up
```

## Note

Delete the `<none>` images in docker

`docker rmi $(docker images -f "dangling=true" -q)`
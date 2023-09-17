## Setting up the project

### Requirements

```
Java 17
```

### Running the project

```sh
./mvnw spring-boot:run
```

### Running the project in docker

```sh
docker build -t cardgame_server .
```

```sh
docker run -p 8080:8080 cardgame_server
```

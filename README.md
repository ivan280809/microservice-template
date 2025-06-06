
# Microservice Template

A professional microservice template using Java 21+ and Spring Boot 3.x, following Hexagonal Architecture principles.

## Features

✅ Clean Hexagonal Architecture  
✅ REST API with versioning `/api/v1/...`  
✅ DTO / Domain separation  
✅ Centralized Error Handling  
✅ Advanced Logging with CorrelationId  
✅ Unit and Integration Tests (JUnit + Testcontainers ready)  
✅ Docker and CI/CD ready  
✅ Flyway migrations support  
✅ Multiple environment profiles (`dev`, `prod`, `test`)  
✅ Utility classes and common patterns

## Tech Stack

- Java 21+
- Spring Boot 3.x
- Maven
- PostgreSQL + Flyway
- JUnit 5 + AssertJ + Testcontainers
- Logback with MDC
- GitHub Actions for CI/CD
- Docker

## Project Structure

```
src/
├── main/java/com/example/microservice
│   ├── MicroserviceApplication.java
│   ├── application
│   │   ├── dtos
│   │   └── services
│   ├── domain
│   │   ├── model
│   │   └── services
│   ├── infrastructure
│   │   ├── config
│   │   ├── controller
│   │   ├── exception
│   │   ├── mapper
│   │   └── repository
│   └── shared
│       ├── logging
│       └── utils
├── resources
│   ├── application.yml
│   ├── application-dev.yml
│   ├── application-prod.yml
│   ├── db/migration
└── test/java/com/example/microservice
    ├── integration
    └── unit
```

## Running Locally

```bash
# Start database
docker-compose up -d

# Run app in dev profile
./run.sh
# or manually:
./mvnw spring-boot:run -Dspring-boot.run.profiles=dev
```

## Running Tests

```bash
# Run unit and integration tests
./mvnw clean verify
```

> Integration tests use Testcontainers. Ensure Docker is running.

## Building Production Image

```bash
# Build Docker image
docker build -t my-microservice .

# Run in production profile
docker-compose -f docker-compose.prod.yml up -d
```

## Example `.env.prod`

```dotenv
SPRING_DATASOURCE_URL=jdbc:postgresql://postgres:5432/mydb
SPRING_DATASOURCE_USERNAME=user
SPRING_DATASOURCE_PASSWORD=pass
JWT_SECRET=replace-this-prod-secret
```

## Author

Created by [Iván Roberto Manero](https://github.com/ivan280809)

## License

MIT License

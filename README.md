
# Microservice Template ![CI](https://github.com/ivan280809/microservice-template/actions/workflows/ci.yml/badge.svg) ![GitHub license](https://img.shields.io/github/license/ivan280809/microservice-template)

A professional microservice template using Java 21+ + Spring Boot + Hexagonal Architecture.

## Tech Stack

- Java 21+
- Spring Boot 3.x
- Maven
- Architecture: Hexagonal / Ports & Adapters
- Logging: Logback + CorrelationId
- Metrics: Spring Boot Actuator
- Database: PostgreSQL (switchable), Flyway migrations
- Testing: JUnit 5 + AssertJ + Testcontainers
- API Versioning: `/api/v1/...`
- Containerization: Docker

## Features

✅ Clean Hexagonal Architecture  
✅ Centralized Error Handling  
✅ Advanced Logging with CorrelationId  
✅ Integration and Unit Tests Structure  
✅ Docker and CI/CD Ready  
✅ Environment Variables Support  
✅ Example GitHub Actions CI Pipeline  
✅ Example deploy configuration for production

## Getting Started

### Run locally

```bash
docker-compose up -d
./run.sh
```

### Build Docker image

```bash
docker build -t my-microservice .
```

### Production Deployment

```bash
docker-compose -f docker-compose.prod.yml up -d
```

### Example .env.prod

```dotenv
SPRING_DATASOURCE_URL=jdbc:postgresql://postgres:5432/mydb
SPRING_DATASOURCE_USERNAME=user
SPRING_DATASOURCE_PASSWORD=pass
JWT_SECRET=replace-this-prod-secret
```

## Project Structure

```
microservice-template/
├── .github/workflows/ci.yml
├── .github/workflows/ci-deploy.yml
├── .env.example
├── .env.prod.example
├── Dockerfile
├── docker-compose.yml
├── docker-compose.prod.yml
├── README.md
├── run.sh
├── .gitignore
├── pom.xml
└── src
    ├── main/java/com/example/microservice
    ├── main/resources
    └── test/java/com/example/microservice
```

## Author

Created by [Iván Roberto Manero](https://github.com/ivan280809)

## License

MIT License

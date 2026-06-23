# Dev Quote API

A Spring Boot REST API built to practice DevOps skills end-to-end.

## Endpoints
- `GET /quote` — returns a random developer quote
- `GET /health` — returns UP

## Tech Stack
- Java 17 + Spring Boot
- Docker + Docker Hub
- GitHub Actions (CI/CD)
- Terraform (AWS EC2 + Security Group)
- Kubernetes (Minikube)

## How to Run Locally
```bash
./mvnw spring-boot:run
```
Then visit: `http://localhost:8080/quote`

## CI/CD
Every push to main triggers GitHub Actions:
1. Builds the JAR
2. Builds the Docker image
3. Pushes to Docker Hub (`abdallahmohamed7/dev-quote-api:latest`)

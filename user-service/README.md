# Spring Boot Load Balancer with Nginx and Docker

## Project Overview

This project demonstrates horizontal scaling and load balancing using:

* Spring Boot (3 instances)
* MySQL 8
* Nginx (Reverse Proxy and Load Balancer)
* Docker and Docker Compose

The application exposes REST APIs and distributes incoming traffic across multiple backend instances using Nginx.

---

## Architecture

Client → Nginx (Port 8080) → Spring Boot Instances (8081, 8082, 8083) → MySQL

* Nginx acts as a reverse proxy and distributes traffic.
* Three Spring Boot containers simulate horizontal scaling.
* A MySQL container stores application data.
* All services run inside Docker containers within the same network.

---

## Tech Stack

* Java 17+
* Spring Boot
* Spring Data JPA
* MySQL 8
* Nginx
* Docker
* Docker Compose

---

## Project Structure

```
src/
Dockerfile
docker-compose.yml
nginx.conf
pom.xml
mvnw
.mvn/
.gitignore
```

---

## How to Run

### 1. Clone the repository

```
git clone https://github.com/mathalapavankalyan/load-balancer.git
cd load-balancer
```

### 2. Build and start the containers

```
docker compose up --build
```

---

## Access the Application

### Load Balancer (Nginx)

```
http://localhost:8080
```

### Direct Service Access

```
http://localhost:8081
http://localhost:8082
http://localhost:8083
```

---

## Load Balancing Strategy

Nginx uses the default Round Robin strategy.

Requests sent to:

```
http://localhost:8080/users
```

are distributed across:

* app1
* app2
* app3

---

## Concepts Demonstrated

* Horizontal scaling
* Load balancing
* Reverse proxy configuration
* Docker networking
* Multi-container orchestration
* Database connectivity inside containers
* Infrastructure as Code using Docker Compose

---

## Scaling vs Load Balancing

* Horizontal Scaling: Running multiple instances of the same application.
* Load Balancing: Distributing incoming traffic across those instances.

This project demonstrates both concepts together.

---

## Author

Pavan Kalyan
GitHub: https://github.com/mathalapavankalyan

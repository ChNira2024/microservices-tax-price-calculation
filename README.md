## Project Repository
Check out the below github url for kubernetes deployment for this project:  
(https://github.com/ChNira2024/docker-k8s-deployment)

# 🚀 Microservices Tax Price Calculation System

## 📌 Project Description
Microservices-based tax and price calculation system built using Spring Boot, Docker, and Kubernetes. Price service calls tax service to calculate total cost dynamically based on country code. Includes containerization, Docker Hub deployment, and Kubernetes orchestration for scalable architecture.

---

## 🧠 Overview

This project contains two microservices:

- 🟦 **Tax Service (4000)** → Returns tax based on country code
- 🟩 **Price Service (3000)** → Calculates final price using tax service
- 🟨 **React Frontend (5173)** → UI to interact with backend APIs

### 🔁 Flow
Client (React UI) → Price Service → Tax Service → Response → UI

---

## 🛠️ Tech Stack

Java 21, Spring Boot, Maven, REST API, Docker, Kubernetes, RestTemplate

---

## 📦 APIs

### Tax Service
GET /api/tax?country=IN

### Price Service
GET /api/price?amount=1000&country=IN

### tax-price-calculation-react
Frontend (React)
Built using React + Vite
Runs on port 5173
Calls backend API using:
VITE_API_URL=http://localhost:3000

---

## 🐳 Docker Commands

```bash id="docker1"
docker build -t tax-service-image .
docker build -t price-service-image .

docker run -d -p 4000:4000 --name tax-service tax-service-image
docker run -d -p 3000:3000 --name price-service price-service-image

Service Communication (K8s DNS)
tax.service.url=http://tax-service:4000

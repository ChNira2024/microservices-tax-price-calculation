FROM eclipse-temurin:21-jdk
WORKDIR /app
COPY target/*.jar price-service.jar
EXPOSE 3000
CMD ["java","-jar","price-service.jar","--server.port=3000"]
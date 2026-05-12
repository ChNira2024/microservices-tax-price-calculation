FROM eclipse-temurin:21-jdk
WORKDIR /app
COPY target/*.jar tax-service.jar
EXPOSE 4000
CMD ["java","-jar","tax-service.jar","--server.port=4000"]
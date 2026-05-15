# ✅ JRE is enough to RUN, JDK is only needed to compile
FROM eclipse-temurin:21-jre
WORKDIR /app
COPY target/*.jar price-service.jar
EXPOSE 3000
CMD ["java", "-jar", "price-service.jar"]
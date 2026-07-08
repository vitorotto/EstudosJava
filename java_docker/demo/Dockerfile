FROM  maven:4.0.0-rc-5-sapmachine-21 AS build

COPY src /app/src
COPY pom.xml /app

WORKDIR /app
RUN mvn clean install

# Pega imagem do Java 21 para rodar a aplicação
FROM openjdk:21-rc-jdk-bullseye

COPY --from=build /app/target/*.jar /app/app.jar

WORKDIR /app

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]

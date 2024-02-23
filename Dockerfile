# Use a imagem Maven com Eclipse Temurin JDK 17
FROM maven:3.8.5-openjdk-17 AS build

# Define o diretório de trabalho
WORKDIR /app

# Copia o arquivo pom.xml e os arquivos de origem do projeto
COPY pom.xml .
COPY src ./src

# Executa o comando Maven para compilar e empacotar o projeto
RUN mvn clean package -DskipTests

# Define a imagem base para a execução do aplicativo
FROM eclipse-temurin:17-jdk-jammy

# Define o diretório de trabalho na imagem final
WORKDIR /app

COPY --from=build /app/target/*.jar ./springmanutencao.jar

ENTRYPOINT ["java", "-jar", "springmanutencao.jar"]

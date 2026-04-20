FROM eclipse-temurin:21-jdk-jammy as builder
WORKDIR /opt/app
COPY .mvn/ .mvn
COPY mvnw pom.xml ./
# Make mvnw executable first, then run it
RUN chmod +x mvnw && ./mvnw dependency:go-offline
COPY ./src ./src
RUN ./mvnw clean install
FROM eclipse-temurin:21-jre-jammy
WORKDIR /opt/app
EXPOSE 8080
COPY --from=builder /opt/app/target/*.jar /opt/app/*.jar
ENTRYPOINT ["java", "-jar", "-DPIGPIOD_HOST=<pi-ipaddress>", "/opt/app/*.jar" ]

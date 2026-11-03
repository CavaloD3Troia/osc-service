# The jar is built on the host first (`make package`), so building the image needs no Maven
# and no GitHub Packages credentials.
FROM eclipse-temurin:25-jre

RUN groupadd --system osc && useradd --system --gid osc osc

WORKDIR /app
COPY application/target/osc-service-exec.jar app.jar

USER osc
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/app.jar"]

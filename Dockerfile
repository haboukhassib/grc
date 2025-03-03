FROM amazoncorretto:17-alpine
RUN adduser -S jmix-user
USER jmix-user
COPY build/libs/*.jar app.jar

# NOTE:
# Application JAR file should be built with "-Pvaadin.productionMode=true".
# See more information about deployment in Jmix docs.

ENTRYPOINT ["java", "-jar", "/app.jar"]

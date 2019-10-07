FROM openjdk:8-jre-alpine
# copy WAR into image
COPY gateway-1.0-SNAPSHOT.jar /app.jar
# run application with this command line
CMD ["/usr/bin/java", "-jar", "/app.jar"]
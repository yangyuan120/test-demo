FROM java:8

WORKDIR app

COPY *.jar app.jar

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]

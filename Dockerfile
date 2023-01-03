FROM openjdk:8
ADD target/todo-0.0.1-SNAPSHOT.jar todo-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "todo-0.0.1-SNAPSHOT.jar"]
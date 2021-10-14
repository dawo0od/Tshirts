FROM openjdk:8
EXPOSE 8080
ADD target/springboot-aws-exe.jar springboot-aws-exe.jar
ENTRYPOINT ["java" , "-jar" , "/springboot-aws-exe.jar"]
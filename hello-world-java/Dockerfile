# Build a JAR File
FROM maven:3.6.3-jdk-8-slim AS stage1
WORKDIR /home/app
COPY . /home/app/
RUN mvn -f /home/app/pom.xml clean package

# Create an Image
FROM openjdk:8-jdk-alpine
EXPOSE 5000
COPY --from=stage1 /home/app/target/hello-world-java.jar hello-world-java.jar
ENTRYPOINT ["sh", "-c", "java -jar /hello-world-java.jar"]
{"name":"Ram","age":"23","message":"You are not eligible to buy tickets as you age is less than 15"}
{"name":"Ram","age":"23","message":"You are eligible for buying tickets. Please find the url bellow","URL":"https://in.bookmyshow.com/"}
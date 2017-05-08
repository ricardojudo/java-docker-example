FROM openjdk:7-jre-alpine
RUN mkdir -p /usr/calculator
COPY ./target/calculator.jar /usr/calculator
WORKDIR /usr/calculator
ENTRYPOINT ["java","-jar","calculator.jar"]
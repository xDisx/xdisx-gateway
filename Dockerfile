FROM amazoncorretto:17-alpine-jdk
COPY /build/libs/xdisx-gateway-0.1.0.jar xdisx-gateway-0.1.0.jar
ENTRYPOINT ["java", "-jar", "/xdisx-gateway-0.1.0.jar"]

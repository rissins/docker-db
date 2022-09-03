FROM openjdk:11-jdk
LABEL maintainer="tnalsqqq@gmail.com"
COPY . .
CMD ["./gradlew", "bootRun"]

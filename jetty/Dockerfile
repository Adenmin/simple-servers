FROM openjdk:8-jre-slim
EXPOSE 8081
COPY build/libs/jetty-1.0-SNAPSHOT-all.jar /app/jetty.jar
RUN bash -c 'touch /app/jetty.jar'
ENTRYPOINT ["java", "-XX:+UnlockExperimentalVMOptions", "-XX:+UseCGroupMemoryLimitForHeap", "-Djava.security.egd=file:/dev/./urandom","-jar","/app/jetty.jar"]

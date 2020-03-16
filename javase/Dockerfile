FROM openjdk:8-jre-slim
EXPOSE 8082
COPY build/libs/javase-1.0-SNAPSHOT-all.jar /app/javase.jar
RUN bash -c 'touch /app/javase.jar'
ENTRYPOINT ["java", "-XX:+UnlockExperimentalVMOptions", "-XX:+UseCGroupMemoryLimitForHeap", "-Djava.security.egd=file:/dev/./urandom","-jar","/app/javase.jar"]

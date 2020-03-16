FROM openjdk:8-jre-slim
EXPOSE 8083
COPY build/libs/undertow-1.0-SNAPSHOT-all.jar /app/undertow.jar
RUN bash -c 'touch /app/undertow.jar'
ENTRYPOINT ["java", "-XX:+UnlockExperimentalVMOptions", "-XX:+UseCGroupMemoryLimitForHeap", "-Djava.security.egd=file:/dev/./urandom","-jar","/app/undertow.jar"]

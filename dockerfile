FROM openjdk:17
EXPOSE 8086
ADD target/DockerSpringBoot-0.0.1-SNAPSHOT.war DockerSpringBoot-0.0.1-SNAPSHOT.war
ENTRYPOINT ["java","-jar","/DockerSpringBoot-0.0.1-SNAPSHOT.war"]
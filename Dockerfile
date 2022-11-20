FROM openjdk:17-alpine
MAINTAINER leanderonline.be
COPY target/cscg-0.0.1.jar cscg-0.0.q.jar
ENTRYPOINT ["java","-jar","/cscg-0.0.1.jar"]
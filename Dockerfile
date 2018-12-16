FROM openjdk:11

LABEL name=stripe-demo

COPY build/distributions/ /

RUN mkdir /service \
    && unzip -o /*.zip -d / \
    && mv /*-boot-*/* /service \
    && rm -fr /*-boot-*


EXPOSE 8080 8081

WORKDIR /service

ENTRYPOINT ./bin/stripe
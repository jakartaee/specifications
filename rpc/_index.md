---
title: "Jakarta RPC"
summary: "Jakarta RPC defines a standard for using gRPC in Jakarta EE"
#<!--.................0123456789.123456789.123456789.123456789.123456789.123456789-->
summary_sixty_char: "Standardizes gRPC within Jakarta EE"
project_id: "ee4j.jakarta-rpc"
---

The main goal of Jakarta RPC project is to make gRPC easier to use within Jakarta EE ecosystem, by allowing developers to define gRPC services and clients the same way they are defining REST services and clients today -- via annotated classes (a la Jakarta REST) on the server, and annotated interfaces (a la Eclipse MicroProfile REST Client) on the client -- and by making them easier to integrate with existing Jakarta EE technologies, such as CDI and Config.

An additional goal is to eliminate the need for special tooling and build-time code generation that favors one serialization format: Protobuf. gRPC was designed to be agnostic to the serialization format, and allows independent configuration of payload marshaller for request and response at the RPC method level, so we see no reason to prefer one serialization format over another and force Protobuf upon everyone.
---
title: "Jakarta RPC"
summary: "Jakarta RPC defines a standard for using gRPC in Jakarta EE"
#<!--.................0123456789.123456789.123456789.123456789.123456789.123456789-->
summary_sixty_char: "Standardizes gRPC within Jakarta EE"
project_id: "ee4j.rpc"
---

The main goal of Jakarta RPC project is to make gRPC easier to use within Jakarta EE ecosystem, by allowing developers to define gRPC services and clients the same way they are defining REST services and clients today -- via annotated classes (a la Jakarta REST) on the server, and annotated interfaces (a la Eclipse MicroProfile REST Client) on the client -- and by making them easier to integrate with existing Jakarta EE technologies, such as CDI and Config.

An additional goal is to eliminate the need for special tooling and build-time code generation that favors one serialization format: Protobuf. gRPC was designed to be agnostic to the serialization format, and allows independent configuration of payload marshaller for request and response at the RPC method level, so we see no reason to prefer one serialization format over another and force Protobuf upon everyone.

## Creation Review

The Specification Committee Ballot concluded successfully on 2022-01-19 with the following results.

| Representative                                 | Representative for: | Vote   |
|------------------------------------------------|---------------------|--------|
| Kenji Kazumura                                 | Fujitsu             |    +1  |
| Tom Watson, Emily Jiang                        | IBM                 |    +1  |
| Ed Bratt, Dmitry Kornilov                      | Oracle              |    +1  |
| Andrew Pielage, Matt Gill                      | Payara              |    +1  |
| David Blevins, Jean-Louis Monteiro             | Tomitribe           |    +1  |
| Ivar Grimstad                                  | EE4J PMC            |    +1  |
| Marcelo Ancelmo, Martijn Verburg               | Participant Members |    +1  |
| Werner Keil                                    | Committer Members   |    +1  |
| Jun Qian                                       | Enterprise Members  |    +1  |
| Zhai Luchao                                    | Enterprise Members  |    +1  |
|                                                | **Total**           | **10** |

The ballot was run in the [jakarta.ee-spec mailing list](https://www.eclipse.org/lists/jakarta.ee-spec/msg02093.html)

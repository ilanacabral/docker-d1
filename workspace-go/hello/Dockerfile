FROM golang:1.16.4-alpine3.13 AS build

WORKDIR /usr/local/go/

COPY hello.go go.* /usr/local/go/

RUN CGO_ENABLED=0 go build -o /usr/local/go/bin/hello

FROM scratch

COPY --from=build /usr/local/go/bin/hello /usr/local/go/bin/hello

ENTRYPOINT ["/usr/local/go/bin/hello"]
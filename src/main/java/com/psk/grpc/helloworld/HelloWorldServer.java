package com.psk.grpc.helloworld;

import io.grpc.stub.StreamObserver;

public class HelloWorldServer extends HelloWorldServiceGrpc.HelloWorldServiceImplBase {
    @Override
    public void sayHello(Person request, StreamObserver<Greeting> responseObserver) {
        responseObserver.onCompleted();
    }
}

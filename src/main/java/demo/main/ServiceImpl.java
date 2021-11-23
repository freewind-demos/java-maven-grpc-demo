package demo.main;

import demo.protobuf.generated.Message;
import demo.protobuf.generated.ServiceGrpc;
import demo.protobuf.generated.ServiceResponse;
import io.grpc.stub.StreamObserver;

public class ServiceImpl extends ServiceGrpc.ServiceImplBase {
    @Override
    public void hello(Message request, StreamObserver<ServiceResponse> responseObserver) {
        System.out.println(request.toString());
        var response = ServiceResponse.newBuilder().setCode(100).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}

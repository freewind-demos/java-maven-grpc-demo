package demo.main;

import demo.protobuf.generated.Message;
import demo.protobuf.generated.ServiceGrpc;
import io.grpc.ManagedChannelBuilder;

import static java.util.concurrent.TimeUnit.SECONDS;

public class Client {

    public static void main(String[] args) throws Exception {
        var channel = ManagedChannelBuilder.forAddress("localhost", 5000).usePlaintext().build();
        var stub = ServiceGrpc.newBlockingStub(channel);

        Message message = Message.newBuilder()
                .setNumber(111)
                .setText("aaa")
                .setEnum(Message.Enum.WHITE)
                .build();

        var response = stub.hello(message);
        System.out.println(response.getCode());

        channel.shutdown().awaitTermination(1, SECONDS);
    }

}

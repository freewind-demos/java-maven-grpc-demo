package demo.main;

import io.grpc.ServerBuilder;

public class Server {

    public static void main(String[] args) throws Exception {
        var server = ServerBuilder.forPort(5000).addService(new ServiceImpl())
                .build().start();
        System.out.println("Server started and listing on 5000");
        server.awaitTermination();
    }

}

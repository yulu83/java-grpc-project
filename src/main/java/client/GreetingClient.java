package client;

import com.proto.greet.GreetManyTimesRequest;
import com.proto.greet.GreetServiceGrpc;
import com.proto.greet.Greeting;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GreetingClient {
    public static void main(String[] args) {
        System.out.println("Hello I'm a gRPC client");

        // grpc code
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
                .usePlaintext().build();

        //DummyServiceGrpc.DummyServiceBlockingStub syncClient = DummyServiceGrpc.newBlockingStub(channel);

        GreetServiceGrpc.GreetServiceBlockingStub greetClient = GreetServiceGrpc.newBlockingStub(channel);
//
//        Greeting greeting = Greeting.newBuilder()
//                .setFirstName("Yuan")
//                .setLastName("Lu")
//                .build();
//        GreetResponse greetResponse = greetClient.greet(GreetRequest.newBuilder().setGreeting(greeting).build());
//        System.out.println(greetResponse.getResult());
        //syncClient

        // server streaming
        GreetManyTimesRequest greetManyTimesRequest =
                GreetManyTimesRequest.newBuilder()
                .setGreeting(Greeting.newBuilder().setFirstName("Yuan").build())
                .build();
        greetClient.greetManyTimes(greetManyTimesRequest)
                   .forEachRemaining(greetManyTimesResponse -> {
                       System.out.println(greetManyTimesResponse.getResult());
                   });

        channel.shutdown();
    }
}

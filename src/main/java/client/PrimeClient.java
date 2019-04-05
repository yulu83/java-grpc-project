package client;

import com.proto.prime.PrimeDecompositionServiceGrpc;
import com.proto.prime.PrimeNumberRequest;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class PrimeClient {
    public static void main(String[] args) {
        System.out.println("Hello I'm a gRPC client");

        // grpc code
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
                .usePlaintext().build();

        PrimeDecompositionServiceGrpc.PrimeDecompositionServiceBlockingStub primeClient = PrimeDecompositionServiceGrpc.newBlockingStub(channel);

        // server streaming
        PrimeNumberRequest request = PrimeNumberRequest.newBuilder().setNumber(120).build();

        primeClient.decompose(request)
                   .forEachRemaining(decompositionResponse -> {
                       System.out.println(decompositionResponse.getNumber());
                   });

        channel.shutdown();
    }
}

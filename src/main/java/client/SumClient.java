package client;

import com.proto.sum.SumRequest;
import com.proto.sum.SumResponse;
import com.proto.sum.SumServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class SumClient {

    public static void main(String[] args) {

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
                .usePlaintext()
                .build();

        SumServiceGrpc.SumServiceBlockingStub sumClient = SumServiceGrpc.newBlockingStub(channel);

        // request
        SumRequest sumRequest = SumRequest.newBuilder()
                                          .setA(2)
                                          .setB(3)
                                          .build();

        // send request
        SumResponse response = sumClient.sum(sumRequest);

        // get response
        System.out.println(response.getResult());

    }
}

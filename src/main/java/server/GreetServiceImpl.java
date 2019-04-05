package server;

import com.proto.greet.GreetManyTimesRequest;
import com.proto.greet.GreetManyTimesResponse;
import com.proto.greet.GreetRequest;
import com.proto.greet.GreetResponse;
import com.proto.greet.GreetServiceGrpc;
import com.proto.greet.Greeting;
import io.grpc.stub.StreamObserver;

import java.util.stream.IntStream;

public class GreetServiceImpl extends GreetServiceGrpc.GreetServiceImplBase {

    @Override
    public void greet(GreetRequest request, StreamObserver<GreetResponse> responseObserver) {
        Greeting greeting = request.getGreeting();
        String firstName = greeting.getFirstName();
        String result = "Hello " + firstName;

        /*
         * create response
         */
        GreetResponse response = GreetResponse.newBuilder()
                                              .setResult(result)
                                              .build();

        // send the request
        responseObserver.onNext(response);

        // complete the RPC call
        responseObserver.onCompleted();
    }

    @Override
    public void greetManyTimes(GreetManyTimesRequest request, StreamObserver<GreetManyTimesResponse> responseObserver) {
        String firstName = request.getGreeting().getFirstName();
            IntStream.range(0, 10).forEach(i -> {
                String result = "Hello " + firstName + ",  response number: " + i;
                GreetManyTimesResponse response = GreetManyTimesResponse.newBuilder().
                        setResult(result).build();
                responseObserver.onNext(response);
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    responseObserver.onCompleted();
                }
            });
         responseObserver.onCompleted();
    }
}

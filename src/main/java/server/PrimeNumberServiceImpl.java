package server;

import com.proto.prime.DecompositionResponse;
import com.proto.prime.PrimeDecompositionServiceGrpc;
import com.proto.prime.PrimeNumberRequest;
import io.grpc.stub.StreamObserver;

public class PrimeNumberServiceImpl extends PrimeDecompositionServiceGrpc.PrimeDecompositionServiceImplBase {

    @Override
    public void decompose(PrimeNumberRequest request, StreamObserver<DecompositionResponse> responseObserver) {
        int n = request.getNumber();
        int k = 2;
        while (n > 1) {
            if ((n % k) == 0) {
                // this is a factor
                // send the factor to client
                responseObserver.onNext(DecompositionResponse.newBuilder().setNumber(k).build());
                n = n / k;
            } else {
                k++;
            }
        }
        responseObserver.onCompleted();
    }

    //    @Override
//    public void greetManyTimes(GreetManyTimesRequest request, StreamObserver<GreetManyTimesResponse> responseObserver) {
//        String firstName = request.getGreeting().getFirstName();
//            IntStream.range(0, 10).forEach(i -> {
//                String result = "Hello " + firstName + ",  response number: " + i;
//                GreetManyTimesResponse response = GreetManyTimesResponse.newBuilder().
//                        setResult(result).build();
//                responseObserver.onNext(response);
//                try {
//                    Thread.sleep(1000L);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                    responseObserver.onCompleted();
//                }
//            });
//         responseObserver.onCompleted();
//    }
}

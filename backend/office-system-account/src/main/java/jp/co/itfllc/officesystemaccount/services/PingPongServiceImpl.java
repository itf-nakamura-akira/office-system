package jp.co.itfllc.officesystemaccount.services;

import org.lognet.springboot.grpc.GRpcService;
import io.grpc.stub.StreamObserver;
import jp.co.itfllc.officesystemaccount.grpcserver.PingRequest;
import jp.co.itfllc.officesystemaccount.grpcserver.PongResponse;
import jp.co.itfllc.officesystemaccount.grpcserver.PingPongServiceGrpc.PingPongServiceImplBase;

@GRpcService
public class PingPongServiceImpl extends PingPongServiceImplBase {
    @Override
    public void ping(PingRequest request, StreamObserver<PongResponse> responseObserver) {
        String ping = new StringBuilder().append("pong").toString();
        PongResponse response = PongResponse.newBuilder().setPong(ping).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}

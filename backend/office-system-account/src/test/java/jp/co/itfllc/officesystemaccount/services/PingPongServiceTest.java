package jp.co.itfllc.officesystemaccount.services;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import io.grpc.internal.testing.StreamRecorder;
import jp.co.itfllc.officesystemaccount.grpcserver.PingRequest;
import jp.co.itfllc.officesystemaccount.grpcserver.PongResponse;

@SpringBootTest
public class PingPongServiceTest {
    @Autowired
    private PingPongServiceImpl pingPongService;

    @Test
    void pingPong() throws Exception {
        PingRequest request = PingRequest.newBuilder().setPing("Test").build();
        StreamRecorder<PongResponse> responseObserver = StreamRecorder.create();

        this.pingPongService.ping(request, responseObserver);

        if (!responseObserver.awaitCompletion(5, TimeUnit.SECONDS)) {
            fail("タイムアウト");
        }

        // エラーで無いこと
        assertNull(responseObserver.getError());

        // レスポンスの数が1つ
        List<PongResponse> results = responseObserver.getValues();
        assertEquals(1, results.size());

        // レスポンスの中身の確認
        PongResponse response = results.get(0);
        assertEquals(PongResponse.newBuilder().setPong("pong").build(), response);
    }
}

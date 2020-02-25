package me.potato.spring.cloud.stream.springcloudstreamkafkaconsumer;

import lombok.extern.slf4j.Slf4j;
import me.potato.spring.cloud.stream.springcloudstreamkafkaconsumer.models.TestDTO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;

@Slf4j
@SpringBootApplication
@EnableBinding(Sink.class)
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @StreamListener(Sink.INPUT)
    public void on(@Payload TestDTO message, @Headers MessageHeaders headers){

        log.info("Received: {}", message);
        log.info(headers.toString());

    }
}

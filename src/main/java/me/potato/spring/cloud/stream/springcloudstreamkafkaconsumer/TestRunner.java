package me.potato.spring.cloud.stream.springcloudstreamkafkaconsumer;

import lombok.extern.slf4j.Slf4j;
import me.potato.spring.cloud.stream.springcloudstreamkafkaconsumer.models.TestDTO;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class TestRunner implements ApplicationRunner {

    private final KafkaTemplate kafkaTemplate;

    public TestRunner(KafkaTemplate kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Thread.sleep(1000);
        log.info("Start Runner");
        kafkaTemplate.send("topic01", new TestDTO(1234L, "Hello"));

    }
}

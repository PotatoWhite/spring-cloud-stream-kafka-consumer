package me.potato.spring.cloud.stream.springcloudstreamkafkaconsumer.models;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TestDTO {
    private Long someKey;
    private String someData;

}

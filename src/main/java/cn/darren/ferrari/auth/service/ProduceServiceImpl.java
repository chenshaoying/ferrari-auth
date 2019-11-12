package cn.darren.ferrari.auth.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFuture;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * @author chensy
 * @date 2019/11/8 14:42
 */
@Service
public class ProduceServiceImpl implements ProduceService {

    private static final Logger log = LoggerFactory.getLogger(ProduceServiceImpl.class);

    @Autowired
    private KafkaTemplate kafkaTemplate;

    @Override
    public <T> void produce(String topic, T t) {
        ListenableFuture<SendResult> future= kafkaTemplate.send(topic, t);

        try {
            future.get(1000, TimeUnit.MILLISECONDS);
        } catch (Exception e) {
            log.error("send to kafka fail",e);
        }
    }
}

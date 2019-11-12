package cn.darren.ferrari.auth.service;

import cn.darren.ferrari.auth.domain.dto.UserDto;
import cn.darren.ferrari.auth.utils.JsonUtil;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

/**
 * @author chensy
 * @date 2019/11/8 15:27
 */
@Service
public class ConsumerServiceImpl implements ConsumerService {

    private static final Logger log = LoggerFactory.getLogger(ConsumerServiceImpl.class);

    @Override
    @KafkaListener(topics = {"register"})
    public void consume(UserDto userDto) {
        log.info("receive msg[{}]", JsonUtil.toJsonString(userDto));
    }
}

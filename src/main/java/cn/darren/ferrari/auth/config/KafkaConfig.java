package cn.darren.ferrari.auth.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author chensy
 * @date 2019/11/11 16:52
 */
@Configuration
public class KafkaConfig {

    /**
     * 通常注解方式初始化topic
     * @return
     */
    @Bean
    public NewTopic initialTopic() {
        return new NewTopic("topic.quick.initial",3, (short) 1 );
    }
}

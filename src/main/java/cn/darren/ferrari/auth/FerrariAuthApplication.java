package cn.darren.ferrari.auth;

import com.netflix.discovery.DiscoveryClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableEurekaClient
@EnableKafka
public class FerrariAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(FerrariAuthApplication.class, args);
        Runtime.getRuntime().addShutdownHook(new Thread(){
            @Override
            public void run() {
                System.out.println("23231123131");
            }
        });
    }
}

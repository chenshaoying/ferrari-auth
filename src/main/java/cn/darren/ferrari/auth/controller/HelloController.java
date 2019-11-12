package cn.darren.ferrari.auth.controller;

import cn.darren.ferrari.auth.domain.dto.UserDto;
import cn.darren.ferrari.auth.service.ProduceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private static final Logger log = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    private ProduceService produceService;

    @GetMapping("/hello")
    public String hello() {
        log.info("receive request");
        return "hello world";
    }

    @PostMapping("/login")
    public String login(@RequestBody UserDto userDto) {
        log.info("User[{}] login in", userDto.getName());
        return "SUCCESS";
    }

    @PostMapping("/register")
    public String register(@RequestBody UserDto userDto) {
        log.info("User[{}] register", userDto.getName());
        produceService.produce("register", userDto);
        return "SUCCESS";
    }
}

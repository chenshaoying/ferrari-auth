package cn.darren.ferrari.auth.service;

import cn.darren.ferrari.auth.domain.dto.UserDto;

/**
 * @author chensy
 * @date 2019/11/8 15:26
 */
public interface ConsumerService {

    void consume(UserDto userDto);
}

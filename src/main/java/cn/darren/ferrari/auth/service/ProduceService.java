package cn.darren.ferrari.auth.service;

/**
 * @author chensy
 * @date 2019/11/8 14:40
 */
public interface ProduceService {

    <T> void produce(String topic, T t);
}

package cn.darren.ferrari.auth.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author chensy
 * @date 2019/11/8 15:37
 */
public class JsonUtil {

    private JsonUtil(){}

    public static String toJsonString(Object object) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(object);
        } catch (JsonProcessingException e) {
           throw new RuntimeException(e);
        }
    }
}

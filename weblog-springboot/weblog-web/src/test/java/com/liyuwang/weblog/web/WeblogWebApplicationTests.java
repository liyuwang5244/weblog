package com.liyuwang.weblog.web;

import com.liyuwang.weblog.common.domain.dos.UserDo;
import com.liyuwang.weblog.common.domain.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
@Slf4j
class WeblogWebApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    void testLog() {
        log.info("这是一行 Info 级别日志");
        log.warn("这是一行 Warn 级别日志");
        log.error("这是一行 Error 级别日志");

        String author = "liyuwang";
        log.info("作者：{}", author);
    }

    @Test
    void insertTest() {
        UserDo userDo = UserDo.builder()
                .username("宇安2")
                .password("123456")
                .createTime(new Date())
                .updateTime(new Date())
                .isDeleted(false)
                .build();

        userMapper.insert(userDo);
    }

}

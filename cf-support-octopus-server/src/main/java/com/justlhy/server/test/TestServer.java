package com.justlhy.server.test;

import com.justlhy.api.test.TestApi;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * description:
 *
 * @author liuhuayang
 * date: 2024/6/7 11:25
 */
@Slf4j
@RestController
@RequestMapping("/test")
public class TestServer implements TestApi {
    @RequestMapping("/test")
    @Override
    public void test(HttpServletRequest request, HttpServletResponse response) {
        log.info("成功请求");
    }
}

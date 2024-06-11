package com.justlhy.api.test;

import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * description:
 *
 * @author liuhuayang
 * date: 2024/6/7 11:24
 */
public interface TestApi {
    @GetMapping
    void test(HttpServletRequest request, HttpServletResponse response);

}

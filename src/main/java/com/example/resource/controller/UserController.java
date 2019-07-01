package com.example.resource.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author LvNing
 * @since 2019-06-12
 */
@RestController
@RequestMapping("/api/v1")
@Slf4j
public class UserController {

    @GetMapping("/user")
    public Authentication getUser(Authentication authentication) {
        log.info("resource: user {}", authentication);
        return authentication;
    }

    @GetMapping("/language")
    public List<String> language() {
        return Arrays.asList("java","Rube","Python","C++");
    }

}

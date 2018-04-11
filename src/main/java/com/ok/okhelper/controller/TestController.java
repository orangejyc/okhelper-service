package com.ok.okhelper.controller;

import com.ok.okhelper.common.ServerResponse;
import com.ok.okhelper.po.User;
import com.ok.okhelper.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by zc on 2018/4/11.
 */
@RestController
public class TestController {
    @Autowired
    private TestService testService;


    @GetMapping("/get")
    public ServerResponse<List<User>> getInfo() {
        return testService.get();
    }

}

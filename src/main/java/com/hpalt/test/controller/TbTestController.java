package com.hpalt.test.controller;


import com.hpalt.test.service.ITbTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lotus
 * @since 2021-10-09
 */
@RestController
@RequestMapping("/test/tb-test")
public class TbTestController {
    @Autowired
    private ITbTestService testService;

    @GetMapping("/{id}")
    public Object get(@PathVariable(value = "id") int id){
        return testService.getById(id);
    }
}

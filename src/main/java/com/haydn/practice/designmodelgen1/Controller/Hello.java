package com.haydn.practice.designmodelgen1.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author haydn
 * @create 2020/8/23 1:11
 */
@RestController
@RequestMapping("/designModel")
public class Hello {

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }


    public void hello2(){

    }

}

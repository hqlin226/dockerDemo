package com.example.docker;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by HOUQL on 2017/4/12.
 */
@RestController
public class demoController {

   @RequestMapping("/")
   public String home(){
        return "Hello Docker World_"+System.currentTimeMillis()/1000;
    }

    @RequestMapping("/name")
    public String name(){
        return "Hello name_dierci"+System.currentTimeMillis()/1000;
    }
}

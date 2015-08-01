/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sevenative.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Paweł
 */
@Controller
public class MovieController {

    @RequestMapping(value = "/sayHello")
    public String sayHello() {

        System.out.println("Hello :)");
        return "hello";

    }
}

package com.blanton.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hellos")
public class HelloController {

    public HelloController() { }

    @GetMapping(value = {"/",""})
    public String helloDefault() {
        return "You have reached the hello world app, where everyone says hello!";
    }

    @GetMapping(value = "/{name}")
    public String helloByName(@PathVariable("name") String name) {
        return "Hello " + name + "!";
    }
}

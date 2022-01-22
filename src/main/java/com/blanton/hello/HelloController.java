package com.blanton.hello;

import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hellos")
@Slf4j
@NoArgsConstructor
public class HelloController {

    @GetMapping(value = {"/",""})
    public String helloDefault() {
        log.trace("Client call to the default hello path, who knows what they want?");
        return "You have reached the hello world app, where everyone says hello!";
    }

    @GetMapping(value = "/{name}")
    public String helloByName(@PathVariable("name") String name) {
        log.info("Telling {} hello!", name);
        return "Hello " + name + "!";
    }
}

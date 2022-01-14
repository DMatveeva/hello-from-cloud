package com.dmatveeva.hellofromcloud;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
     String convert() {
         SayHello sayHello = new SayHelloImpl();
         return sayHello.hello();
     }
}

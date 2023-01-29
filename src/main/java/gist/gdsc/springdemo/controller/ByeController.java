package gist.gdsc.springdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ByeController {

    @RequestMapping("/bye")
    public String bye() {
        return "Bye!";
    }

}

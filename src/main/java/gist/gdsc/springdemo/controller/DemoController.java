package gist.gdsc.springdemo.controller;

import gist.gdsc.springdemo.service.DemoInterface;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DemoController {

    DemoInterface DemoInterface;

    public DemoController(DemoInterface DemoInterface) {
        this.DemoInterface = DemoInterface;
    }

    @GetMapping("/hello")
    public String hello() {
        return this.DemoInterface.hello();
    }

    // TODO: Bye Controller
}

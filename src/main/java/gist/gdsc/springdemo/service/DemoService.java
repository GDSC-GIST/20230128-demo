package gist.gdsc.springdemo.service;

import org.springframework.stereotype.Service;

@Service
public class DemoService implements DemoInterface {

    public String hello() {
        return "Hello World!";
    }
}

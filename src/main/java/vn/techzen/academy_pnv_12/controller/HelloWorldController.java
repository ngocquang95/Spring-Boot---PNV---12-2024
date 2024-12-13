package vn.techzen.academy_pnv_12.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping("/greeting")
    public String greeting(@RequestParam(defaultValue = "") String name,
                           @RequestParam(defaultValue = "Dang Nang") String address) {
        return "Hello " + name + ", " + address + "!";
    }
}

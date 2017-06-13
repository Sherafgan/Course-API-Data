package me.sherafgan.springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Sherafgan Kandov (sherafgan.kandov@gmail.com)
 */
@RestController
public class HelloController {
    @RequestMapping
    public String sayHi() {
        return "Hi!";
    }
}

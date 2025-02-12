package covy.myfirstservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <클래스 설명>
 *
 * @author : junni802
 * @date : 2025-02-12
 */

@RestController
@RequestMapping("/")
public class FirstServiceController {

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to the First service";
    }

}

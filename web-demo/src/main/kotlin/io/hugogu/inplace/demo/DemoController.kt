package io.hugogu.inplace.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam

@RestController
class DemoController {
    @GetMapping("/say")
    fun sayHello(@RequestParam greeting: String): Any {
        return greeting
    }
}
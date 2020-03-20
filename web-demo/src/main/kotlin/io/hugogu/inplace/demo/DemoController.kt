package io.hugogu.inplace.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam
import reactor.core.publisher.Mono

@RestController
class DemoController {
    @GetMapping("/say")
    fun sayHello(@RequestParam greeting: String): Mono<Any> {
        return Mono.just(greeting)
    }
}

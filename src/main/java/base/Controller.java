package base;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/cache")
public class Controller {

    @Cacheable(key = "#idempotencyKey+#testex", value = "teste")
    @GetMapping("/{testex}")
    public Mono<String> get(@RequestHeader("x-idempotency-key") String idempotencyKey,
                            @PathVariable String testex){

        System.out.println("REALLL CALL");

        return Mono.just("ai sim");
    }

}
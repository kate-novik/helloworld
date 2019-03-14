package hello;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Kate Novik
 */
@RestController
public class GreetingController {
    
    private static final String template = "hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    
    @RequestMapping(value = "/greeting", method = GET)
    public Greeting greeting(@RequestParam(value="name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
    
}

package example.micronaut;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;

import java.util.Locale;

@Controller
class GreetingController {
    private final GreetingService greetingService;

    GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @Produces(MediaType.TEXT_PLAIN)
    @Get
    String greet() {
        return greetingService.greet().toUpperCase(Locale.ROOT);
    }
}

package humuson.tason.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api", produces = "application/JSON")
public class TestController {

    @GetMapping("/test/{msg}")
    public String test(@PathVariable String msg){
        return "Hello " + msg + " welcome";
    }
}

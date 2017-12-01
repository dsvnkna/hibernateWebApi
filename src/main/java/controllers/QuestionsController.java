package controllers;

import database.Description;
import hello.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.Session;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class QuestionsController {
    private static final String template = "hello.Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    private final String description = "";

    public QuestionsController(long l, String format) {
    }

    @RequestMapping("/testdescription")
    public QuestionsController getTestDescription(@RequestParam(value="description") String description) {
        Description.browseDescription();
        return new QuestionsController(counter.incrementAndGet(), String.format(template, description));
    }

}

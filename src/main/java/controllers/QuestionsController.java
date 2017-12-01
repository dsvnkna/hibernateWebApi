package controllers;

import hello.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.Session;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class QuestionsController {
    private final String description = "";
    @RequestMapping("/testdescription")
    public QuestionsController getTestDescription(@RequestParam(value="description") String description) {
        Session newSession = getSessionFactory().openSession();
        Transaction newTransaction = newSession.beginTransaction();
        description = newSession.find("from WomanSafety.surveys description text");
        System.out.println( description);
        return new QuestionsController();
    }

}

package robert.o.eurekasentence.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import robert.o.eurekasentence.service.SentenceService;

@RestController
public class DemoController {

    @Autowired
    private SentenceService sentenceService;

    @GetMapping("/sentence")
    public @ResponseBody
    String getSentence() {
        return sentenceService.getSentence();
    }
}

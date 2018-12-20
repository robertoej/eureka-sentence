package robert.o.eurekasentence.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import robert.o.eurekasentence.service.SentenceService;
import robert.o.eurekasentence.service.WordService;

@Service
public class SentenceServiceImpl implements SentenceService {

    @Autowired
    private WordService wordService;

    @Override
    public String getSentence() {
        return wordService.getSubject() + " "
                + wordService.getVerb() + " "
                + wordService.getArticle() + " "
                + wordService.getAdjective() + " "
                + wordService.getNoun() + ".";
    }
}

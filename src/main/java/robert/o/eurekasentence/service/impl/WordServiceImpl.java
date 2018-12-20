package robert.o.eurekasentence.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import robert.o.eurekasentence.dao.AdjectiveClient;
import robert.o.eurekasentence.dao.ArticleClient;
import robert.o.eurekasentence.dao.NounClient;
import robert.o.eurekasentence.dao.SubjectClient;
import robert.o.eurekasentence.dao.VerbClient;
import robert.o.eurekasentence.service.WordService;

@Service
public class WordServiceImpl implements WordService {
    @Autowired
    private NounClient nounClient;

    @Autowired
    private AdjectiveClient adjectiveClient;

    @Autowired
    private ArticleClient articleClient;

    @Autowired
    private SubjectClient subjectClient;

    @Autowired
    private VerbClient verbClient;

    @Override
    public String getArticle() {
        return articleClient.getWord();
    }

    @Override
    @HystrixCommand(fallbackMethod = "getAdjectiveFallback")
    public String getAdjective() {
        return adjectiveClient.getWord();
    }

    public String getAdjectiveFallback() {
        return "?";
    }

    @Override
    public String getSubject() {
        return subjectClient.getWord();
    }

    @Override
    public String getVerb() {
        return verbClient.getWord();
    }

    @Override
    public String getNoun() {
        return nounClient.getWord();
    }
}

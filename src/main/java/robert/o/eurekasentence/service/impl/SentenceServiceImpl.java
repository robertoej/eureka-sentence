package robert.o.eurekasentence.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import robert.o.eurekasentence.dao.AdjectiveClient;
import robert.o.eurekasentence.dao.ArticleClient;
import robert.o.eurekasentence.dao.NounClient;
import robert.o.eurekasentence.dao.SubjectClient;
import robert.o.eurekasentence.dao.VerbClient;
import robert.o.eurekasentence.service.SentenceService;

@Service
public class SentenceServiceImpl implements SentenceService {

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
    public String getSentence() {
        return subjectClient.getWord() + " "
                + verbClient.getWord() + " "
                + articleClient.getWord() + " "
                + adjectiveClient.getWord() + " "
                + nounClient.getWord() + ".";
    }
}

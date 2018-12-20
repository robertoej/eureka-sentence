package robert.o.eurekasentence.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import robert.o.eurekasentence.dao.NounClient;
import robert.o.eurekasentence.service.SentenceService;

@Service
public class SentenceServiceImpl implements SentenceService {

    @Autowired
    private NounClient nounClient;

    @Autowired
    private RestTemplate template;

    private String getWord(String service) {
        return template.getForObject("http://" + service, String.class);
    }

    @Override
    public String getSentence() {
        return getWord("SUBJECT") + " "
                + getWord("VERB") + " "
                + getWord("ARTICLE") + " "
                + getWord("ADJECTIVE") + " "
                + nounClient.getWord() + ".";
    }
}

package robert.o.eurekasentence.dao;

import robert.o.eurekasentence.domain.Word;

public interface WordDAO {
    String SUBJECT = "SUBJECT";
    String VERB = "VERB";
    String ARTICLE = "ARTICLE";
    String ADJECTIVE = "ADJECTIVE";
    String NOUN = "NOUN";

    Word getWord();
}

package robert.o.eurekasentence.dao.impl;

import org.springframework.stereotype.Component;

@Component("articleService")
public class ArticleDaoImpl extends WordDAOImpl {

	@Override
	public String getPartOfSpeech() {
		return ARTICLE;
	}

	
}

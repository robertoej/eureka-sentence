package robert.o.eurekasentence.dao.impl;

import org.springframework.stereotype.Component;

@Component("verbService")
public class VerbDaoImpl extends WordDAOImpl {

	@Override
	public String getPartOfSpeech() {
		return VERB;
	}

	
}

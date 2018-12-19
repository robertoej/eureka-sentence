package robert.o.eurekasentence.dao.impl;

import org.springframework.stereotype.Component;

@Component("nounService")
public class NounDaoImpl extends WordDAOImpl {

	@Override
	public String getPartOfSpeech() {
		return NOUN;
	}

	
}

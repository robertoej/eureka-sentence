package robert.o.eurekasentence.dao.impl;

import org.springframework.stereotype.Component;

@Component("adjectiveService")
public class AdjectiveDaoImpl extends WordDAOImpl {

	@Override
	public String getPartOfSpeech() {
		return ADJECTIVE;
	}
}

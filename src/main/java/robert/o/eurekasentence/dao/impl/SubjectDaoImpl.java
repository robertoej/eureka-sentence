package robert.o.eurekasentence.dao.impl;

import org.springframework.stereotype.Component;

@Component("subjectService")
public class SubjectDaoImpl extends WordDAOImpl {

	@Override
	public String getPartOfSpeech() {
		return SUBJECT;
	}

	
}

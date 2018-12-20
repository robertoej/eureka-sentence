package robert.o.eurekasentence.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.client.RestTemplate;
import robert.o.eurekasentence.dao.WordDAO;
import robert.o.eurekasentence.domain.Word;

public abstract class WordDAOImpl implements WordDAO {

	@Autowired LoadBalancerClient loadBalancer;
	
	public abstract String getPartOfSpeech();
	
	public Word getWord() {
		ServiceInstance instance = loadBalancer.choose(getPartOfSpeech());

   		return instance == null ? null : (new RestTemplate()).getForObject(instance.getUri(), Word.class);
	}
}

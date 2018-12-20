package robert.o.eurekasentence.dao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("ADJECTIVE")
public interface AdjectiveClient {

    @GetMapping("/")
    String getWord();
}

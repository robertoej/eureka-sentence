package robert.o.eurekasentence.dao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("ARTICLE")
public interface ArticleClient {

    @GetMapping("/")
    String getWord();
}

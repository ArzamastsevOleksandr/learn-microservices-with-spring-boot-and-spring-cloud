package api.core.recommendation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

public interface RecommendationService {

    @GetMapping(value = "/recommendation", produces = APPLICATION_JSON_VALUE)
    List<Recommendation> getRecommendations(@RequestParam(value = "productId") int productId);

}

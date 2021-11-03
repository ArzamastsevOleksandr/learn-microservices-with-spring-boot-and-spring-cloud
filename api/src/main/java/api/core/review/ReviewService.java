package api.core.review;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

public interface ReviewService {

    @GetMapping(value = "/review", produces = APPLICATION_JSON_VALUE)
    List<Review> getReviews(@RequestParam(value = "productId") int productId);

}

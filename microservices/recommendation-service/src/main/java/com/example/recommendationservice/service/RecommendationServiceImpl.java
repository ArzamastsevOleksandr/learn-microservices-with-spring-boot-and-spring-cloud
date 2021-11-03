package com.example.recommendationservice.service;

import api.core.recommendation.Recommendation;
import api.core.recommendation.RecommendationService;
import api.exception.InvalidInputException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;
import util.http.ServiceUtil;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
public class RecommendationServiceImpl implements RecommendationService {

    private final ServiceUtil serviceUtil;

    @Override
    public List<Recommendation> getRecommendations(int productId) {
        if (productId < 1) {
            throw new InvalidInputException("Invalid productId: " + productId);
        }
        if (productId == 113) {
            log.debug("No recommendations found for productId: {}", productId);
            return new ArrayList<>();
        }

        List<Recommendation> list = List.of(
                new Recommendation(productId, 1, "Author 1", 1, "Content 1", serviceUtil.getServiceAddress()),
                new Recommendation(productId, 2, "Author 2", 2, "Content 2", serviceUtil.getServiceAddress()),
                new Recommendation(productId, 3, "Author 3", 3, "Content 3", serviceUtil.getServiceAddress())
        );
        log.debug("/recommendation response size: {}", list.size());
        return list;
    }

}

package com.commercetools.api;

import com.commercetools.api.ml.generated.models.common.TaskStatusEnum;
import com.commercetools.api.ml.generated.models.common.TaskToken;
import com.commercetools.api.ml.generated.models.general_category_recommendations.GeneralCategoryRecommendationPagedQueryResponse;
import com.commercetools.api.ml.generated.models.similar_products.SimilarProductSearchRequestBuilder;
import com.commercetools.api.ml.generated.models.similar_products.SimilarProductsTaskStatus;
import io.vrap.rmf.base.client.ApiHttpResponse;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.Assertions.assertThat;
import static org.awaitility.Awaitility.await;

public class MLAPITest extends TestBase {

    @Test
    public void generalRecommendationsTest() {

        ApiHttpResponse<GeneralCategoryRecommendationPagedQueryResponse> response = apiBuilder
                .recommendations()
                .generalCategories()
                .get()
                .addProductName("vase")
                .executeBlocking();
        assertThat(response.getStatusCode()).isEqualTo(200);
    }

    @Test
    public void similaritiesTest() {
        ApiHttpResponse<TaskToken> tokenApiHttpResponse = apiBuilder
                .similarities()
                .products()
                .post(
                        new SimilarProductSearchRequestBuilder().build()
                )
                .executeBlocking();

        assertThat(tokenApiHttpResponse.getStatusCode()).isEqualTo(202);
        await().atMost(30, TimeUnit.SECONDS)
                .pollInterval(2, TimeUnit.SECONDS)
                .untilAsserted(
                        () -> assertThat(
                                getSimilarProducts(tokenApiHttpResponse.getBody().getTaskId()).getBody().getState()
                        ).isEqualTo(TaskStatusEnum.SUCCESS)
                );
    }

    public ApiHttpResponse<SimilarProductsTaskStatus> getSimilarProducts(final String taskId) {
        return apiBuilder
                .similarities()
                .products()
                .status()
                .withTaskId(taskId)
                .get()
                .executeBlocking();
    }
}

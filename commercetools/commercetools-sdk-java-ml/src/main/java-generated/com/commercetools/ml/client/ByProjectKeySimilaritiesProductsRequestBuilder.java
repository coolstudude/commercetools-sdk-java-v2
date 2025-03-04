
package com.commercetools.ml.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeySimilaritiesProductsRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeySimilaritiesProductsRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeySimilaritiesProductsPost post(
            com.commercetools.ml.models.similar_products.SimilarProductSearchRequest similarProductSearchRequest) {
        return new ByProjectKeySimilaritiesProductsPost(apiHttpClient, projectKey, similarProductSearchRequest);
    }

    public ByProjectKeySimilaritiesProductsPostString post(final String similarProductSearchRequest) {
        return new ByProjectKeySimilaritiesProductsPostString(apiHttpClient, projectKey, similarProductSearchRequest);
    }

    public ByProjectKeySimilaritiesProductsPost post(
            UnaryOperator<com.commercetools.ml.models.similar_products.SimilarProductSearchRequestBuilder> op) {
        return post(
            op.apply(com.commercetools.ml.models.similar_products.SimilarProductSearchRequestBuilder.of()).build());
    }

    public ByProjectKeySimilaritiesProductsStatusRequestBuilder status() {
        return new ByProjectKeySimilaritiesProductsStatusRequestBuilder(apiHttpClient, projectKey);
    }

}


package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyQuoteRequestsKeyByKeyRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String key;

    public ByProjectKeyQuoteRequestsKeyByKeyRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey,
            final String key) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.key = key;
    }

    public ByProjectKeyQuoteRequestsKeyByKeyGet get() {
        return new ByProjectKeyQuoteRequestsKeyByKeyGet(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyQuoteRequestsKeyByKeyPost post(
            com.commercetools.api.models.quote_request.QuoteRequestUpdate quoteRequestUpdate) {
        return new ByProjectKeyQuoteRequestsKeyByKeyPost(apiHttpClient, projectKey, key, quoteRequestUpdate);
    }

    public ByProjectKeyQuoteRequestsKeyByKeyPostString post(final String quoteRequestUpdate) {
        return new ByProjectKeyQuoteRequestsKeyByKeyPostString(apiHttpClient, projectKey, key, quoteRequestUpdate);
    }

    public ByProjectKeyQuoteRequestsKeyByKeyPost post(
            UnaryOperator<com.commercetools.api.models.quote_request.QuoteRequestUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.quote_request.QuoteRequestUpdateBuilder.of()).build());
    }

    public ByProjectKeyQuoteRequestsKeyByKeyDelete delete() {
        return new ByProjectKeyQuoteRequestsKeyByKeyDelete(apiHttpClient, projectKey, key);
    }

    public <TValue> ByProjectKeyQuoteRequestsKeyByKeyDelete delete(TValue version) {
        return delete().withVersion(version);
    }

}


package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyQuoteRequestsRequestBuilder implements ByProjectKeyQuoteRequestsRequestBuilderMixin {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyQuoteRequestsRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyQuoteRequestsGet get() {
        return new ByProjectKeyQuoteRequestsGet(apiHttpClient, projectKey);
    }

    public ByProjectKeyQuoteRequestsPost post(
            com.commercetools.api.models.quote_request.QuoteRequestDraft quoteRequestDraft) {
        return new ByProjectKeyQuoteRequestsPost(apiHttpClient, projectKey, quoteRequestDraft);
    }

    public ByProjectKeyQuoteRequestsPostString post(final String quoteRequestDraft) {
        return new ByProjectKeyQuoteRequestsPostString(apiHttpClient, projectKey, quoteRequestDraft);
    }

    public ByProjectKeyQuoteRequestsPost post(
            UnaryOperator<com.commercetools.api.models.quote_request.QuoteRequestDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.quote_request.QuoteRequestDraftBuilder.of()).build());
    }

    public ByProjectKeyQuoteRequestsKeyByKeyRequestBuilder withKey(String key) {
        return new ByProjectKeyQuoteRequestsKeyByKeyRequestBuilder(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyQuoteRequestsByIDRequestBuilder withId(String ID) {
        return new ByProjectKeyQuoteRequestsByIDRequestBuilder(apiHttpClient, projectKey, ID);
    }

}


package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyProductSelectionsRequestBuilder implements ByProjectKeyProductSelectionsRequestMixin {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyProductSelectionsRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyProductSelectionsGet get() {
        return new ByProjectKeyProductSelectionsGet(apiHttpClient, projectKey);
    }

    public ByProjectKeyProductSelectionsPost post(
            com.commercetools.api.models.product_selection.ProductSelectionDraft productSelectionDraft) {
        return new ByProjectKeyProductSelectionsPost(apiHttpClient, projectKey, productSelectionDraft);
    }

    public ByProjectKeyProductSelectionsPostString post(final String productSelectionDraft) {
        return new ByProjectKeyProductSelectionsPostString(apiHttpClient, projectKey, productSelectionDraft);
    }

    public ByProjectKeyProductSelectionsPost post(
            UnaryOperator<com.commercetools.api.models.product_selection.ProductSelectionDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.product_selection.ProductSelectionDraftBuilder.of()).build());
    }

    public ByProjectKeyProductSelectionsKeyByKeyRequestBuilder withKey(String key) {
        return new ByProjectKeyProductSelectionsKeyByKeyRequestBuilder(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyProductSelectionsByIDRequestBuilder withId(String ID) {
        return new ByProjectKeyProductSelectionsByIDRequestBuilder(apiHttpClient, projectKey, ID);
    }

}

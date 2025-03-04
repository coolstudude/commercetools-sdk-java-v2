
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyMePaymentsRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyMePaymentsRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyMePaymentsGet get() {
        return new ByProjectKeyMePaymentsGet(apiHttpClient, projectKey);
    }

    public ByProjectKeyMePaymentsPost post(com.commercetools.api.models.me.MyPaymentDraft myPaymentDraft) {
        return new ByProjectKeyMePaymentsPost(apiHttpClient, projectKey, myPaymentDraft);
    }

    public ByProjectKeyMePaymentsPostString post(final String myPaymentDraft) {
        return new ByProjectKeyMePaymentsPostString(apiHttpClient, projectKey, myPaymentDraft);
    }

    public ByProjectKeyMePaymentsPost post(UnaryOperator<com.commercetools.api.models.me.MyPaymentDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.me.MyPaymentDraftBuilder.of()).build());
    }

    public ByProjectKeyMePaymentsKeyByKeyRequestBuilder withKey(String key) {
        return new ByProjectKeyMePaymentsKeyByKeyRequestBuilder(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyMePaymentsByIDRequestBuilder withId(String ID) {
        return new ByProjectKeyMePaymentsByIDRequestBuilder(apiHttpClient, projectKey, ID);
    }

}

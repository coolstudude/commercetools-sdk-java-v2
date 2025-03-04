
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyCustomersRequestBuilder implements ByProjectKeyCustomersRequestBuilderMixin {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyCustomersRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyCustomersGet get() {
        return new ByProjectKeyCustomersGet(apiHttpClient, projectKey);
    }

    public ByProjectKeyCustomersPost post(com.commercetools.api.models.customer.CustomerDraft customerDraft) {
        return new ByProjectKeyCustomersPost(apiHttpClient, projectKey, customerDraft);
    }

    public ByProjectKeyCustomersPostString post(final String customerDraft) {
        return new ByProjectKeyCustomersPostString(apiHttpClient, projectKey, customerDraft);
    }

    public ByProjectKeyCustomersPost post(
            UnaryOperator<com.commercetools.api.models.customer.CustomerDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.customer.CustomerDraftBuilder.of()).build());
    }

    public ByProjectKeyCustomersPasswordTokenByPasswordTokenRequestBuilder withPasswordToken(String passwordToken) {
        return new ByProjectKeyCustomersPasswordTokenByPasswordTokenRequestBuilder(apiHttpClient, projectKey,
            passwordToken);
    }

    public ByProjectKeyCustomersEmailTokenByEmailTokenRequestBuilder withEmailToken(String emailToken) {
        return new ByProjectKeyCustomersEmailTokenByEmailTokenRequestBuilder(apiHttpClient, projectKey, emailToken);
    }

    public ByProjectKeyCustomersEmailTokenRequestBuilder emailToken() {
        return new ByProjectKeyCustomersEmailTokenRequestBuilder(apiHttpClient, projectKey);
    }

    public ByProjectKeyCustomersEmailConfirmRequestBuilder emailConfirm() {
        return new ByProjectKeyCustomersEmailConfirmRequestBuilder(apiHttpClient, projectKey);
    }

    public ByProjectKeyCustomersPasswordRequestBuilder password() {
        return new ByProjectKeyCustomersPasswordRequestBuilder(apiHttpClient, projectKey);
    }

    public ByProjectKeyCustomersPasswordResetRequestBuilder passwordReset() {
        return new ByProjectKeyCustomersPasswordResetRequestBuilder(apiHttpClient, projectKey);
    }

    public ByProjectKeyCustomersPasswordTokenRequestBuilder passwordToken() {
        return new ByProjectKeyCustomersPasswordTokenRequestBuilder(apiHttpClient, projectKey);
    }

    public ByProjectKeyCustomersKeyByKeyRequestBuilder withKey(String key) {
        return new ByProjectKeyCustomersKeyByKeyRequestBuilder(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyCustomersByIDRequestBuilder withId(String ID) {
        return new ByProjectKeyCustomersByIDRequestBuilder(apiHttpClient, projectKey, ID);
    }

}

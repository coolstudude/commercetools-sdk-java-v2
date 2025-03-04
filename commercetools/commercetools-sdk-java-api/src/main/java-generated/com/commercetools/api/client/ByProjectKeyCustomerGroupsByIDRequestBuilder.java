
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyCustomerGroupsByIDRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String ID;

    public ByProjectKeyCustomerGroupsByIDRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey,
            final String ID) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.ID = ID;
    }

    public ByProjectKeyCustomerGroupsByIDGet get() {
        return new ByProjectKeyCustomerGroupsByIDGet(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyCustomerGroupsByIDPost post(
            com.commercetools.api.models.customer_group.CustomerGroupUpdate customerGroupUpdate) {
        return new ByProjectKeyCustomerGroupsByIDPost(apiHttpClient, projectKey, ID, customerGroupUpdate);
    }

    public ByProjectKeyCustomerGroupsByIDPostString post(final String customerGroupUpdate) {
        return new ByProjectKeyCustomerGroupsByIDPostString(apiHttpClient, projectKey, ID, customerGroupUpdate);
    }

    public ByProjectKeyCustomerGroupsByIDPost post(
            UnaryOperator<com.commercetools.api.models.customer_group.CustomerGroupUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.customer_group.CustomerGroupUpdateBuilder.of()).build());
    }

    public ByProjectKeyCustomerGroupsByIDDelete delete() {
        return new ByProjectKeyCustomerGroupsByIDDelete(apiHttpClient, projectKey, ID);
    }

    public <TValue> ByProjectKeyCustomerGroupsByIDDelete delete(TValue version) {
        return delete().withVersion(version);
    }

}

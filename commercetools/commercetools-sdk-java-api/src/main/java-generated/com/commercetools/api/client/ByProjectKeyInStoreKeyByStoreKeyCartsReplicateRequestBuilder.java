
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyCartsReplicateRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String storeKey;

    public ByProjectKeyInStoreKeyByStoreKeyCartsReplicateRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey, final String storeKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.storeKey = storeKey;
    }

    public ByProjectKeyInStoreKeyByStoreKeyCartsReplicatePost post(
            com.commercetools.api.models.cart.ReplicaCartDraft replicaCartDraft) {
        return new ByProjectKeyInStoreKeyByStoreKeyCartsReplicatePost(apiHttpClient, projectKey, storeKey,
            replicaCartDraft);
    }

    public ByProjectKeyInStoreKeyByStoreKeyCartsReplicatePostString post(final String replicaCartDraft) {
        return new ByProjectKeyInStoreKeyByStoreKeyCartsReplicatePostString(apiHttpClient, projectKey, storeKey,
            replicaCartDraft);
    }

    public ByProjectKeyInStoreKeyByStoreKeyCartsReplicatePost post(
            UnaryOperator<com.commercetools.api.models.cart.ReplicaCartDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.cart.ReplicaCartDraftBuilder.of()).build());
    }

}

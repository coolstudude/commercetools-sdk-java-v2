
package com.commercetools.api.client;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>Creates a new Cart by replicating an existing Cart or Order. Can be useful in cases where a customer wants to cancel a recent order to make some changes or reorder a previous order.</p>
 *  <p>The replicated Cart preserves Customer information, Line Items and Custom Line Items, Custom Fields, Discount Codes, and other settings of the Cart or Order. If the Line Items become invalid, for example, due to removed Products or Prices, they are removed from the new Cart. If the Customer switches to another Customer Group, the new Cart is updated with the new value. It has up-to-date Tax Rates, Prices, and Line Item product data and is in <code>Active</code> CartState.</p>
 *  <p>The new Cart does not contain payments or deliveries. The State of Line Items and Custom Line Items is reset to <code>initial</code>.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.cart.Cart>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .inStoreKeyWithStoreKeyValue("{storeKey}")
 *            .carts()
 *            .replicate()
 *            .post(null)
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyCartsReplicatePost extends
        BodyApiMethod<ByProjectKeyInStoreKeyByStoreKeyCartsReplicatePost, com.commercetools.api.models.cart.Cart, com.commercetools.api.models.cart.ReplicaCartDraft>
        implements com.commercetools.api.client.ErrorableTrait<ByProjectKeyInStoreKeyByStoreKeyCartsReplicatePost> {

    private String projectKey;
    private String storeKey;

    private com.commercetools.api.models.cart.ReplicaCartDraft replicaCartDraft;

    public ByProjectKeyInStoreKeyByStoreKeyCartsReplicatePost(final ApiHttpClient apiHttpClient, String projectKey,
            String storeKey, com.commercetools.api.models.cart.ReplicaCartDraft replicaCartDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.replicaCartDraft = replicaCartDraft;
    }

    public ByProjectKeyInStoreKeyByStoreKeyCartsReplicatePost(ByProjectKeyInStoreKeyByStoreKeyCartsReplicatePost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.storeKey = t.storeKey;
        this.replicaCartDraft = t.replicaCartDraft;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/in-store/key=%s/carts/replicate", this.projectKey, this.storeKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(replicaCartDraft)));

    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.cart.Cart> executeBlocking(final ApiHttpClient client,
            final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.cart.Cart.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.cart.Cart>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.cart.Cart.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public String getStoreKey() {
        return this.storeKey;
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setStoreKey(final String storeKey) {
        this.storeKey = storeKey;
    }

    public com.commercetools.api.models.cart.ReplicaCartDraft getBody() {
        return replicaCartDraft;
    }

    public ByProjectKeyInStoreKeyByStoreKeyCartsReplicatePost withBody(
            com.commercetools.api.models.cart.ReplicaCartDraft replicaCartDraft) {
        ByProjectKeyInStoreKeyByStoreKeyCartsReplicatePost t = copy();
        t.replicaCartDraft = replicaCartDraft;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyInStoreKeyByStoreKeyCartsReplicatePost that = (ByProjectKeyInStoreKeyByStoreKeyCartsReplicatePost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(storeKey, that.storeKey)
                .append(replicaCartDraft, that.replicaCartDraft)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(storeKey).append(replicaCartDraft).toHashCode();
    }

    @Override
    protected ByProjectKeyInStoreKeyByStoreKeyCartsReplicatePost copy() {
        return new ByProjectKeyInStoreKeyByStoreKeyCartsReplicatePost(this);
    }
}

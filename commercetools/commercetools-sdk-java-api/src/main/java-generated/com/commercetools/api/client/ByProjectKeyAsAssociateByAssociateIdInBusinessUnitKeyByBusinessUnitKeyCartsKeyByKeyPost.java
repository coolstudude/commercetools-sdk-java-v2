
package com.commercetools.api.client;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>If the Cart exists in the Project but does not reference the requested BusinessUnit, this method returns an InvalidOperation error.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.cart.Cart>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .asAssociate()
 *            .withAssociateIdValue("{associateId}")
 *            .inBusinessUnitKeyWithBusinessUnitKeyValue("{businessUnitKey}")
 *            .carts()
 *            .withKey("{key}")
 *            .post(null)
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyCartsKeyByKeyPost extends
        BodyApiMethod<ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyCartsKeyByKeyPost, com.commercetools.api.models.cart.Cart, com.commercetools.api.models.cart.CartUpdate>
        implements
        com.commercetools.api.client.ConflictingTrait<ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyCartsKeyByKeyPost>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyCartsKeyByKeyPost>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyCartsKeyByKeyPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyCartsKeyByKeyPost> {

    private String projectKey;
    private String associateId;
    private String businessUnitKey;
    private String key;

    private com.commercetools.api.models.cart.CartUpdate cartUpdate;

    public ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyCartsKeyByKeyPost(
            final ApiHttpClient apiHttpClient, String projectKey, String associateId, String businessUnitKey,
            String key, com.commercetools.api.models.cart.CartUpdate cartUpdate) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.associateId = associateId;
        this.businessUnitKey = businessUnitKey;
        this.key = key;
        this.cartUpdate = cartUpdate;
    }

    public ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyCartsKeyByKeyPost(
            ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyCartsKeyByKeyPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.associateId = t.associateId;
        this.businessUnitKey = t.businessUnitKey;
        this.key = t.key;
        this.cartUpdate = t.cartUpdate;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/as-associate/%s/in-business-unit/key=%s/carts/key=%s",
            this.projectKey, this.associateId, this.businessUnitKey, this.key);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(cartUpdate)));

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

    public String getAssociateId() {
        return this.associateId;
    }

    public String getBusinessUnitKey() {
        return this.businessUnitKey;
    }

    public String getKey() {
        return this.key;
    }

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setAssociateId(final String associateId) {
        this.associateId = associateId;
    }

    public void setBusinessUnitKey(final String businessUnitKey) {
        this.businessUnitKey = businessUnitKey;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    /**
     * set expand with the specified value
     * @param expand value to be set
     * @param <TValue> value type
     * @return ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyCartsKeyByKeyPost
     */
    public <TValue> ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyCartsKeyByKeyPost withExpand(
            final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     * @param expand value to be added
     * @param <TValue> value type
     * @return ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyCartsKeyByKeyPost
     */
    public <TValue> ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyCartsKeyByKeyPost addExpand(
            final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyCartsKeyByKeyPost
     */
    public ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyCartsKeyByKeyPost withExpand(
            final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyCartsKeyByKeyPost
     */
    public ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyCartsKeyByKeyPost addExpand(
            final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyCartsKeyByKeyPost
     */
    public ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyCartsKeyByKeyPost withExpand(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyCartsKeyByKeyPost
     */
    public ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyCartsKeyByKeyPost addExpand(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     * @param expand values to be set
     * @param <TValue> value type
     * @return ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyCartsKeyByKeyPost
     */
    public <TValue> ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyCartsKeyByKeyPost withExpand(
            final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     * @param expand values to be added
     * @param <TValue> value type
     * @return ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyCartsKeyByKeyPost
     */
    public <TValue> ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyCartsKeyByKeyPost addExpand(
            final Collection<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public com.commercetools.api.models.cart.CartUpdate getBody() {
        return cartUpdate;
    }

    public ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyCartsKeyByKeyPost withBody(
            com.commercetools.api.models.cart.CartUpdate cartUpdate) {
        ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyCartsKeyByKeyPost t = copy();
        t.cartUpdate = cartUpdate;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyCartsKeyByKeyPost that = (ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyCartsKeyByKeyPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(associateId, that.associateId)
                .append(businessUnitKey, that.businessUnitKey)
                .append(key, that.key)
                .append(cartUpdate, that.cartUpdate)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey)
                .append(associateId)
                .append(businessUnitKey)
                .append(key)
                .append(cartUpdate)
                .toHashCode();
    }

    @Override
    protected ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyCartsKeyByKeyPost copy() {
        return new ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyCartsKeyByKeyPost(this);
    }
}

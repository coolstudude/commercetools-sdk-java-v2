
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
 *
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.customer_group.CustomerGroup>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .customerGroups()
 *            .withId("{ID}")
 *            .post(null)
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyCustomerGroupsByIDPost extends
        BodyApiMethod<ByProjectKeyCustomerGroupsByIDPost, com.commercetools.api.models.customer_group.CustomerGroup, com.commercetools.api.models.customer_group.CustomerGroupUpdate>
        implements com.commercetools.api.client.ConflictingTrait<ByProjectKeyCustomerGroupsByIDPost>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyCustomerGroupsByIDPost>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyCustomerGroupsByIDPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyCustomerGroupsByIDPost> {

    private String projectKey;
    private String ID;

    private com.commercetools.api.models.customer_group.CustomerGroupUpdate customerGroupUpdate;

    public ByProjectKeyCustomerGroupsByIDPost(final ApiHttpClient apiHttpClient, String projectKey, String ID,
            com.commercetools.api.models.customer_group.CustomerGroupUpdate customerGroupUpdate) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.ID = ID;
        this.customerGroupUpdate = customerGroupUpdate;
    }

    public ByProjectKeyCustomerGroupsByIDPost(ByProjectKeyCustomerGroupsByIDPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.ID = t.ID;
        this.customerGroupUpdate = t.customerGroupUpdate;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/customer-groups/%s", this.projectKey, this.ID);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(customerGroupUpdate)));

    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.customer_group.CustomerGroup> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.customer_group.CustomerGroup.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.customer_group.CustomerGroup>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.customer_group.CustomerGroup.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public String getID() {
        return this.ID;
    }

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setID(final String ID) {
        this.ID = ID;
    }

    /**
     * set expand with the specified value
     * @param expand value to be set
     * @param <TValue> value type
     * @return ByProjectKeyCustomerGroupsByIDPost
     */
    public <TValue> ByProjectKeyCustomerGroupsByIDPost withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     * @param expand value to be added
     * @param <TValue> value type
     * @return ByProjectKeyCustomerGroupsByIDPost
     */
    public <TValue> ByProjectKeyCustomerGroupsByIDPost addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyCustomerGroupsByIDPost
     */
    public ByProjectKeyCustomerGroupsByIDPost withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyCustomerGroupsByIDPost
     */
    public ByProjectKeyCustomerGroupsByIDPost addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyCustomerGroupsByIDPost
     */
    public ByProjectKeyCustomerGroupsByIDPost withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyCustomerGroupsByIDPost
     */
    public ByProjectKeyCustomerGroupsByIDPost addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     * @param expand values to be set
     * @param <TValue> value type
     * @return ByProjectKeyCustomerGroupsByIDPost
     */
    public <TValue> ByProjectKeyCustomerGroupsByIDPost withExpand(final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     * @param expand values to be added
     * @param <TValue> value type
     * @return ByProjectKeyCustomerGroupsByIDPost
     */
    public <TValue> ByProjectKeyCustomerGroupsByIDPost addExpand(final Collection<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public com.commercetools.api.models.customer_group.CustomerGroupUpdate getBody() {
        return customerGroupUpdate;
    }

    public ByProjectKeyCustomerGroupsByIDPost withBody(
            com.commercetools.api.models.customer_group.CustomerGroupUpdate customerGroupUpdate) {
        ByProjectKeyCustomerGroupsByIDPost t = copy();
        t.customerGroupUpdate = customerGroupUpdate;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyCustomerGroupsByIDPost that = (ByProjectKeyCustomerGroupsByIDPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(ID, that.ID)
                .append(customerGroupUpdate, that.customerGroupUpdate)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(ID).append(customerGroupUpdate).toHashCode();
    }

    @Override
    protected ByProjectKeyCustomerGroupsByIDPost copy() {
        return new ByProjectKeyCustomerGroupsByIDPost(this);
    }
}

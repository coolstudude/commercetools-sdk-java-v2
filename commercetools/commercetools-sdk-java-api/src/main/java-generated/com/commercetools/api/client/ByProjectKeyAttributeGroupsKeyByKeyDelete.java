
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
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.attribute_group.AttributeGroup>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .attributeGroups()
 *            .withKey("{key}")
 *            .delete()
 *            .withVersion(version)
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyAttributeGroupsKeyByKeyDelete extends
        ApiMethod<ByProjectKeyAttributeGroupsKeyByKeyDelete, com.commercetools.api.models.attribute_group.AttributeGroup>
        implements
        com.commercetools.api.client.ApiDeleteMethod<ByProjectKeyAttributeGroupsKeyByKeyDelete, com.commercetools.api.models.attribute_group.AttributeGroup>,
        com.commercetools.api.client.VersionedTrait<ByProjectKeyAttributeGroupsKeyByKeyDelete>,
        com.commercetools.api.client.ConflictingTrait<ByProjectKeyAttributeGroupsKeyByKeyDelete>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyAttributeGroupsKeyByKeyDelete>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyAttributeGroupsKeyByKeyDelete>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyAttributeGroupsKeyByKeyDelete> {

    private String projectKey;
    private String key;

    public ByProjectKeyAttributeGroupsKeyByKeyDelete(final ApiHttpClient apiHttpClient, String projectKey, String key) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.key = key;
    }

    public ByProjectKeyAttributeGroupsKeyByKeyDelete(ByProjectKeyAttributeGroupsKeyByKeyDelete t) {
        super(t);
        this.projectKey = t.projectKey;
        this.key = t.key;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/attribute-groups/key=%s", this.projectKey, this.key);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.DELETE, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.attribute_group.AttributeGroup> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.attribute_group.AttributeGroup.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.attribute_group.AttributeGroup>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.attribute_group.AttributeGroup.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public String getKey() {
        return this.key;
    }

    public List<String> getVersion() {
        return this.getQueryParam("version");
    }

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    /**
     * set version with the specified value
     * @param version value to be set
     * @param <TValue> value type
     * @return ByProjectKeyAttributeGroupsKeyByKeyDelete
     */
    public <TValue> ByProjectKeyAttributeGroupsKeyByKeyDelete withVersion(final TValue version) {
        return copy().withQueryParam("version", version);
    }

    /**
     * add additional version query parameter
     * @param version value to be added
     * @param <TValue> value type
     * @return ByProjectKeyAttributeGroupsKeyByKeyDelete
     */
    public <TValue> ByProjectKeyAttributeGroupsKeyByKeyDelete addVersion(final TValue version) {
        return copy().addQueryParam("version", version);
    }

    /**
     * set version with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyAttributeGroupsKeyByKeyDelete
     */
    public ByProjectKeyAttributeGroupsKeyByKeyDelete withVersion(final Supplier<Long> supplier) {
        return copy().withQueryParam("version", supplier.get());
    }

    /**
     * add additional version query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyAttributeGroupsKeyByKeyDelete
     */
    public ByProjectKeyAttributeGroupsKeyByKeyDelete addVersion(final Supplier<Long> supplier) {
        return copy().addQueryParam("version", supplier.get());
    }

    /**
     * set version with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyAttributeGroupsKeyByKeyDelete
     */
    public ByProjectKeyAttributeGroupsKeyByKeyDelete withVersion(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("version", op.apply(new StringBuilder()));
    }

    /**
     * add additional version query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyAttributeGroupsKeyByKeyDelete
     */
    public ByProjectKeyAttributeGroupsKeyByKeyDelete addVersion(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("version", op.apply(new StringBuilder()));
    }

    /**
     * set version with the specified values
     * @param version values to be set
     * @param <TValue> value type
     * @return ByProjectKeyAttributeGroupsKeyByKeyDelete
     */
    public <TValue> ByProjectKeyAttributeGroupsKeyByKeyDelete withVersion(final Collection<TValue> version) {
        return copy().withoutQueryParam("version")
                .addQueryParams(
                    version.stream().map(s -> new ParamEntry<>("version", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional version query parameters
     * @param version values to be added
     * @param <TValue> value type
     * @return ByProjectKeyAttributeGroupsKeyByKeyDelete
     */
    public <TValue> ByProjectKeyAttributeGroupsKeyByKeyDelete addVersion(final Collection<TValue> version) {
        return copy().addQueryParams(
            version.stream().map(s -> new ParamEntry<>("version", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set expand with the specified value
     * @param expand value to be set
     * @param <TValue> value type
     * @return ByProjectKeyAttributeGroupsKeyByKeyDelete
     */
    public <TValue> ByProjectKeyAttributeGroupsKeyByKeyDelete withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     * @param expand value to be added
     * @param <TValue> value type
     * @return ByProjectKeyAttributeGroupsKeyByKeyDelete
     */
    public <TValue> ByProjectKeyAttributeGroupsKeyByKeyDelete addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyAttributeGroupsKeyByKeyDelete
     */
    public ByProjectKeyAttributeGroupsKeyByKeyDelete withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyAttributeGroupsKeyByKeyDelete
     */
    public ByProjectKeyAttributeGroupsKeyByKeyDelete addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyAttributeGroupsKeyByKeyDelete
     */
    public ByProjectKeyAttributeGroupsKeyByKeyDelete withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyAttributeGroupsKeyByKeyDelete
     */
    public ByProjectKeyAttributeGroupsKeyByKeyDelete addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     * @param expand values to be set
     * @param <TValue> value type
     * @return ByProjectKeyAttributeGroupsKeyByKeyDelete
     */
    public <TValue> ByProjectKeyAttributeGroupsKeyByKeyDelete withExpand(final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     * @param expand values to be added
     * @param <TValue> value type
     * @return ByProjectKeyAttributeGroupsKeyByKeyDelete
     */
    public <TValue> ByProjectKeyAttributeGroupsKeyByKeyDelete addExpand(final Collection<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyAttributeGroupsKeyByKeyDelete that = (ByProjectKeyAttributeGroupsKeyByKeyDelete) o;

        return new EqualsBuilder().append(projectKey, that.projectKey).append(key, that.key).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(key).toHashCode();
    }

    @Override
    protected ByProjectKeyAttributeGroupsKeyByKeyDelete copy() {
        return new ByProjectKeyAttributeGroupsKeyByKeyDelete(this);
    }
}

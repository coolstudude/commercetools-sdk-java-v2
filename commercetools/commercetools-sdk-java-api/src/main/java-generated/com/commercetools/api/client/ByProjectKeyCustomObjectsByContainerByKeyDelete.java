
package com.commercetools.api.client;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
*  <p>Delete CustomObject by container and key</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyCustomObjectsByContainerByKeyDelete extends
        ApiMethod<ByProjectKeyCustomObjectsByContainerByKeyDelete, com.commercetools.api.models.custom_object.CustomObject>
        implements com.commercetools.api.client.DataerasureTrait<ByProjectKeyCustomObjectsByContainerByKeyDelete>,
        com.commercetools.api.client.VersionedTrait<ByProjectKeyCustomObjectsByContainerByKeyDelete>,
        com.commercetools.api.client.ConflictingTrait<ByProjectKeyCustomObjectsByContainerByKeyDelete>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyCustomObjectsByContainerByKeyDelete>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyCustomObjectsByContainerByKeyDelete>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyCustomObjectsByContainerByKeyDelete> {

    private String projectKey;
    private String container;
    private String key;

    public ByProjectKeyCustomObjectsByContainerByKeyDelete(final ApiHttpClient apiHttpClient, String projectKey,
            String container, String key) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.container = container;
        this.key = key;
    }

    public ByProjectKeyCustomObjectsByContainerByKeyDelete(ByProjectKeyCustomObjectsByContainerByKeyDelete t) {
        super(t);
        this.projectKey = t.projectKey;
        this.container = t.container;
        this.key = t.key;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/custom-objects/%s/%s", this.projectKey, this.container, this.key);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }

        return new ApiHttpRequest(ApiHttpMethod.DELETE, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.custom_object.CustomObject> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.custom_object.CustomObject.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.custom_object.CustomObject>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.custom_object.CustomObject.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public String getContainer() {
        return this.container;
    }

    public String getKey() {
        return this.key;
    }

    public List<String> getVersion() {
        return this.getQueryParam("version");
    }

    public List<String> getDataErasure() {
        return this.getQueryParam("dataErasure");
    }

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setContainer(final String container) {
        this.container = container;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    /**
     * set version with the specificied value
     */
    public ByProjectKeyCustomObjectsByContainerByKeyDelete withVersion(final long version) {
        return copy().withQueryParam("version", version);
    }

    /**
     * add additional version query parameter
     */
    public ByProjectKeyCustomObjectsByContainerByKeyDelete addVersion(final long version) {
        return copy().addQueryParam("version", version);
    }

    /**
     * set version with the specificied values
     */
    public ByProjectKeyCustomObjectsByContainerByKeyDelete withVersion(final List<Long> version) {
        return copy().withoutQueryParam("version")
                .addQueryParams(
                    version.stream().map(s -> new ParamEntry<>("version", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional version query parameters
     */
    public ByProjectKeyCustomObjectsByContainerByKeyDelete addVersion(final List<Long> version) {
        return copy().addQueryParams(
            version.stream().map(s -> new ParamEntry<>("version", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set dataErasure with the specificied value
     */
    public ByProjectKeyCustomObjectsByContainerByKeyDelete withDataErasure(final boolean dataErasure) {
        return copy().withQueryParam("dataErasure", dataErasure);
    }

    /**
     * add additional dataErasure query parameter
     */
    public ByProjectKeyCustomObjectsByContainerByKeyDelete addDataErasure(final boolean dataErasure) {
        return copy().addQueryParam("dataErasure", dataErasure);
    }

    /**
     * set dataErasure with the specificied values
     */
    public ByProjectKeyCustomObjectsByContainerByKeyDelete withDataErasure(final List<Boolean> dataErasure) {
        return copy().withoutQueryParam("dataErasure")
                .addQueryParams(dataErasure.stream()
                        .map(s -> new ParamEntry<>("dataErasure", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional dataErasure query parameters
     */
    public ByProjectKeyCustomObjectsByContainerByKeyDelete addDataErasure(final List<Boolean> dataErasure) {
        return copy().addQueryParams(
            dataErasure.stream().map(s -> new ParamEntry<>("dataErasure", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set expand with the specificied value
     */
    public ByProjectKeyCustomObjectsByContainerByKeyDelete withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyCustomObjectsByContainerByKeyDelete addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specificied values
     */
    public ByProjectKeyCustomObjectsByContainerByKeyDelete withExpand(final List<String> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     */
    public ByProjectKeyCustomObjectsByContainerByKeyDelete addExpand(final List<String> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyCustomObjectsByContainerByKeyDelete that = (ByProjectKeyCustomObjectsByContainerByKeyDelete) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(container, that.container)
                .append(key, that.key)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(container).append(key).toHashCode();
    }

    @Override
    protected ByProjectKeyCustomObjectsByContainerByKeyDelete copy() {
        return new ByProjectKeyCustomObjectsByContainerByKeyDelete(this);
    }
}

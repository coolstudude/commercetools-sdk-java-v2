
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

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyReviewsByIDDelete
        extends ApiMethod<ByProjectKeyReviewsByIDDelete, com.commercetools.api.models.review.Review>
        implements com.commercetools.api.client.DataerasureTrait<ByProjectKeyReviewsByIDDelete>,
        com.commercetools.api.client.VersionedTrait<ByProjectKeyReviewsByIDDelete>,
        com.commercetools.api.client.ConflictingTrait<ByProjectKeyReviewsByIDDelete>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyReviewsByIDDelete>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyReviewsByIDDelete>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyReviewsByIDDelete> {

    private String projectKey;
    private String ID;

    public ByProjectKeyReviewsByIDDelete(final ApiHttpClient apiHttpClient, String projectKey, String ID) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.ID = ID;
    }

    public ByProjectKeyReviewsByIDDelete(ByProjectKeyReviewsByIDDelete t) {
        super(t);
        this.projectKey = t.projectKey;
        this.ID = t.ID;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/reviews/%s", this.projectKey, this.ID);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }

        return new ApiHttpRequest(ApiHttpMethod.DELETE, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.review.Review> executeBlocking(final ApiHttpClient client,
            final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.review.Review.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.review.Review>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.review.Review.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public String getID() {
        return this.ID;
    }

    public List<String> getDataErasure() {
        return this.getQueryParam("dataErasure");
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

    public void setID(final String ID) {
        this.ID = ID;
    }

    /**
     * set dataErasure with the specificied value
     */
    public ByProjectKeyReviewsByIDDelete withDataErasure(final boolean dataErasure) {
        return copy().withQueryParam("dataErasure", dataErasure);
    }

    /**
     * add additional dataErasure query parameter
     */
    public ByProjectKeyReviewsByIDDelete addDataErasure(final boolean dataErasure) {
        return copy().addQueryParam("dataErasure", dataErasure);
    }

    /**
     * set dataErasure with the specificied values
     */
    public ByProjectKeyReviewsByIDDelete withDataErasure(final List<Boolean> dataErasure) {
        return copy().withoutQueryParam("dataErasure")
                .addQueryParams(dataErasure.stream()
                        .map(s -> new ParamEntry<>("dataErasure", s.toString()))
                        .collect(Collectors.toList()));
    }

    /**
     * add additional dataErasure query parameters
     */
    public ByProjectKeyReviewsByIDDelete addDataErasure(final List<Boolean> dataErasure) {
        return copy().addQueryParams(
            dataErasure.stream().map(s -> new ParamEntry<>("dataErasure", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set version with the specificied value
     */
    public ByProjectKeyReviewsByIDDelete withVersion(final long version) {
        return copy().withQueryParam("version", version);
    }

    /**
     * add additional version query parameter
     */
    public ByProjectKeyReviewsByIDDelete addVersion(final long version) {
        return copy().addQueryParam("version", version);
    }

    /**
     * set version with the specificied values
     */
    public ByProjectKeyReviewsByIDDelete withVersion(final List<Long> version) {
        return copy().withoutQueryParam("version")
                .addQueryParams(
                    version.stream().map(s -> new ParamEntry<>("version", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional version query parameters
     */
    public ByProjectKeyReviewsByIDDelete addVersion(final List<Long> version) {
        return copy().addQueryParams(
            version.stream().map(s -> new ParamEntry<>("version", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set expand with the specificied value
     */
    public ByProjectKeyReviewsByIDDelete withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyReviewsByIDDelete addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specificied values
     */
    public ByProjectKeyReviewsByIDDelete withExpand(final List<String> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     */
    public ByProjectKeyReviewsByIDDelete addExpand(final List<String> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyReviewsByIDDelete that = (ByProjectKeyReviewsByIDDelete) o;

        return new EqualsBuilder().append(projectKey, that.projectKey).append(ID, that.ID).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(ID).toHashCode();
    }

    @Override
    protected ByProjectKeyReviewsByIDDelete copy() {
        return new ByProjectKeyReviewsByIDDelete(this);
    }
}


package com.commercetools.api.client;

import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyMessagesGet extends
        ApiMethod<ByProjectKeyMessagesGet, com.commercetools.api.models.message.MessagePagedQueryResponse> implements
        com.commercetools.api.models.PagedQueryResourceRequest<ByProjectKeyMessagesGet, com.commercetools.api.models.message.MessagePagedQueryResponse>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyMessagesGet>,
        com.commercetools.api.client.SortableTrait<ByProjectKeyMessagesGet>,
        com.commercetools.api.client.PagingTrait<ByProjectKeyMessagesGet>,
        com.commercetools.api.client.QueryTrait<ByProjectKeyMessagesGet>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyMessagesGet>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyMessagesGet> {

    private String projectKey;

    public ByProjectKeyMessagesGet(final ApiHttpClient apiHttpClient, String projectKey) {
        super(apiHttpClient);
        this.projectKey = projectKey;
    }

    public ByProjectKeyMessagesGet(ByProjectKeyMessagesGet t) {
        super(t);
        this.projectKey = t.projectKey;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/messages", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }

        return new ApiHttpRequest(ApiHttpMethod.GET, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.message.MessagePagedQueryResponse> executeBlocking(
            final ApiHttpClient client, Duration timeout) {
        ApiHttpRequest request = this.createHttpRequest();
        return blockingWait(
            client.execute(request, com.commercetools.api.models.message.MessagePagedQueryResponse.class), request,
            timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.message.MessagePagedQueryResponse>> execute(
            final ApiHttpClient client) {
        return client.execute(this.createHttpRequest(),
            com.commercetools.api.models.message.MessagePagedQueryResponse.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public List<String> getSort() {
        return this.getQueryParam("sort");
    }

    public List<String> getLimit() {
        return this.getQueryParam("limit");
    }

    public List<String> getOffset() {
        return this.getQueryParam("offset");
    }

    public List<String> getWithTotal() {
        return this.getQueryParam("withTotal");
    }

    public List<String> getWhere() {
        return this.getQueryParam("where");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    /**
     * set expand with the specificied value
     */
    public ByProjectKeyMessagesGet withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyMessagesGet addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set sort with the specificied value
     */
    public ByProjectKeyMessagesGet withSort(final String sort) {
        return copy().withQueryParam("sort", sort);
    }

    /**
     * add additional sort query parameter
     */
    public ByProjectKeyMessagesGet addSort(final String sort) {
        return copy().addQueryParam("sort", sort);
    }

    /**
     * set limit with the specificied value
     */
    public ByProjectKeyMessagesGet withLimit(final int limit) {
        return copy().withQueryParam("limit", limit);
    }

    /**
     * add additional limit query parameter
     */
    public ByProjectKeyMessagesGet addLimit(final int limit) {
        return copy().addQueryParam("limit", limit);
    }

    /**
     * set offset with the specificied value
     */
    public ByProjectKeyMessagesGet withOffset(final int offset) {
        return copy().withQueryParam("offset", offset);
    }

    /**
     * add additional offset query parameter
     */
    public ByProjectKeyMessagesGet addOffset(final int offset) {
        return copy().addQueryParam("offset", offset);
    }

    /**
     * set withTotal with the specificied value
     */
    public ByProjectKeyMessagesGet withWithTotal(final boolean withTotal) {
        return copy().withQueryParam("withTotal", withTotal);
    }

    /**
     * add additional withTotal query parameter
     */
    public ByProjectKeyMessagesGet addWithTotal(final boolean withTotal) {
        return copy().addQueryParam("withTotal", withTotal);
    }

    /**
     * set where with the specificied value
     */
    public ByProjectKeyMessagesGet withWhere(final String where) {
        return copy().withQueryParam("where", where);
    }

    /**
     * add additional where query parameter
     */
    public ByProjectKeyMessagesGet addWhere(final String where) {
        return copy().addQueryParam("where", where);
    }

    /**
     * set predicateVar with the specificied value
     */
    public ByProjectKeyMessagesGet withPredicateVar(final String varName, final String predicateVar) {
        return copy().withQueryParam(String.format("var.%s", varName), predicateVar);
    }

    /**
     * add additional predicateVar query parameter
     */
    public ByProjectKeyMessagesGet addPredicateVar(final String varName, final String predicateVar) {
        return copy().addQueryParam(String.format("var.%s", varName), predicateVar);
    }

    @Override
    protected ByProjectKeyMessagesGet copy() {
        return new ByProjectKeyMessagesGet(this);
    }
}

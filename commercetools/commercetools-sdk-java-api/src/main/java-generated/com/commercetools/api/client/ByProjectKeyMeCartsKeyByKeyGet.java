
package com.commercetools.api.client;

import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>Get MyCart by key</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyMeCartsKeyByKeyGet
        extends ApiMethod<ByProjectKeyMeCartsKeyByKeyGet, com.commercetools.api.models.me.MyCart>
        implements com.commercetools.api.client.ExpandableTrait<ByProjectKeyMeCartsKeyByKeyGet>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyMeCartsKeyByKeyGet>,
        com.commercetools.api.client.DeprecatableTrait<ByProjectKeyMeCartsKeyByKeyGet> {

    private String projectKey;
    private String key;

    public ByProjectKeyMeCartsKeyByKeyGet(final ApiHttpClient apiHttpClient, String projectKey, String key) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.key = key;
    }

    public ByProjectKeyMeCartsKeyByKeyGet(ByProjectKeyMeCartsKeyByKeyGet t) {
        super(t);
        this.projectKey = t.projectKey;
        this.key = t.key;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/me/carts/key=%s", this.projectKey, this.key);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }

        return new ApiHttpRequest(ApiHttpMethod.GET, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.me.MyCart> executeBlocking(Duration timeout) {
        return blockingWait(execute(), timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.me.MyCart>> execute() {
        return apiHttpClient().execute(this.createHttpRequest(), com.commercetools.api.models.me.MyCart.class);
    }

    public String getProjectKey() {
        return this.projectKey;
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

    public void setKey(final String key) {
        this.key = key;
    }

    public ByProjectKeyMeCartsKeyByKeyGet withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    public ByProjectKeyMeCartsKeyByKeyGet addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    @Override
    protected ByProjectKeyMeCartsKeyByKeyGet copy() {
        return new ByProjectKeyMeCartsKeyByKeyGet(this);
    }
}

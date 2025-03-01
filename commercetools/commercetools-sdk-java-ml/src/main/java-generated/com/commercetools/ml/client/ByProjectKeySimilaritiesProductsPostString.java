
package com.commercetools.ml.client;

import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

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
 *   CompletableFuture<ApiHttpResponse<com.commercetools.ml.models.common.TaskToken>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .similarities()
 *            .products()
 *            .post("")
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeySimilaritiesProductsPostString extends
        StringBodyApiMethod<ByProjectKeySimilaritiesProductsPostString, com.commercetools.ml.models.common.TaskToken> {

    private String projectKey;

    private String similarProductSearchRequest;

    public ByProjectKeySimilaritiesProductsPostString(final ApiHttpClient apiHttpClient, String projectKey,
            String similarProductSearchRequest) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.similarProductSearchRequest = similarProductSearchRequest;
    }

    public ByProjectKeySimilaritiesProductsPostString(ByProjectKeySimilaritiesProductsPostString t) {
        super(t);
        this.projectKey = t.projectKey;
        this.similarProductSearchRequest = t.similarProductSearchRequest;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/similarities/products", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            similarProductSearchRequest.getBytes(StandardCharsets.UTF_8));

    }

    @Override
    public ApiHttpResponse<com.commercetools.ml.models.common.TaskToken> executeBlocking(final ApiHttpClient client,
            final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.ml.models.common.TaskToken.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.ml.models.common.TaskToken>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.ml.models.common.TaskToken.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public String getBody() {
        return similarProductSearchRequest;
    }

    public ByProjectKeySimilaritiesProductsPostString withBody(String similarProductSearchRequest) {
        ByProjectKeySimilaritiesProductsPostString t = copy();
        t.similarProductSearchRequest = similarProductSearchRequest;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeySimilaritiesProductsPostString that = (ByProjectKeySimilaritiesProductsPostString) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(similarProductSearchRequest, that.similarProductSearchRequest)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(similarProductSearchRequest).toHashCode();
    }

    @Override
    protected ByProjectKeySimilaritiesProductsPostString copy() {
        return new ByProjectKeySimilaritiesProductsPostString(this);
    }
}

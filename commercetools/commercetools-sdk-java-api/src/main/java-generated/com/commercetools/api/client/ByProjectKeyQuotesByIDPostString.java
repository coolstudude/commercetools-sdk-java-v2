
package com.commercetools.api.client;

import java.net.URI;
import java.nio.charset.StandardCharsets;
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
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.quote.Quote>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .quotes()
 *            .withId("{ID}")
 *            .post("")
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyQuotesByIDPostString
        extends StringBodyApiMethod<ByProjectKeyQuotesByIDPostString, com.commercetools.api.models.quote.Quote>
        implements com.commercetools.api.client.ConflictingTrait<ByProjectKeyQuotesByIDPostString>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyQuotesByIDPostString>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyQuotesByIDPostString>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyQuotesByIDPostString> {

    private String projectKey;
    private String ID;

    private String quoteUpdate;

    public ByProjectKeyQuotesByIDPostString(final ApiHttpClient apiHttpClient, String projectKey, String ID,
            String quoteUpdate) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.ID = ID;
        this.quoteUpdate = quoteUpdate;
    }

    public ByProjectKeyQuotesByIDPostString(ByProjectKeyQuotesByIDPostString t) {
        super(t);
        this.projectKey = t.projectKey;
        this.ID = t.ID;
        this.quoteUpdate = t.quoteUpdate;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/quotes/%s", this.projectKey, this.ID);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            quoteUpdate.getBytes(StandardCharsets.UTF_8));

    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.quote.Quote> executeBlocking(final ApiHttpClient client,
            final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.quote.Quote.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.quote.Quote>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.quote.Quote.class);
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
     * @param <TValue> value type
     * @param expand value to be set
     * @return ByProjectKeyQuotesByIDPostString
     */
    public <TValue> ByProjectKeyQuotesByIDPostString withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     * @param <TValue> value type
     * @param expand value to be added
     * @return ByProjectKeyQuotesByIDPostString
     */
    public <TValue> ByProjectKeyQuotesByIDPostString addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyQuotesByIDPostString
     */
    public ByProjectKeyQuotesByIDPostString withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyQuotesByIDPostString
     */
    public ByProjectKeyQuotesByIDPostString addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyQuotesByIDPostString
     */
    public ByProjectKeyQuotesByIDPostString withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyQuotesByIDPostString
     */
    public ByProjectKeyQuotesByIDPostString addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     * @param <TValue> value type
     * @param expand values to be set
     * @return ByProjectKeyQuotesByIDPostString
     */
    public <TValue> ByProjectKeyQuotesByIDPostString withExpand(final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     * @param <TValue> value type
     * @param expand values to be added
     * @return ByProjectKeyQuotesByIDPostString
     */
    public <TValue> ByProjectKeyQuotesByIDPostString addExpand(final Collection<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public String getBody() {
        return quoteUpdate;
    }

    public ByProjectKeyQuotesByIDPostString withBody(String quoteUpdate) {
        ByProjectKeyQuotesByIDPostString t = copy();
        t.quoteUpdate = quoteUpdate;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyQuotesByIDPostString that = (ByProjectKeyQuotesByIDPostString) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(ID, that.ID)
                .append(quoteUpdate, that.quoteUpdate)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(ID).append(quoteUpdate).toHashCode();
    }

    @Override
    protected ByProjectKeyQuotesByIDPostString copy() {
        return new ByProjectKeyQuotesByIDPostString(this);
    }
}

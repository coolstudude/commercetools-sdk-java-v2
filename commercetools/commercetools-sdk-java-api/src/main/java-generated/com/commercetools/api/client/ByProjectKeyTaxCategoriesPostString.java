
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
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.tax_category.TaxCategory>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .taxCategories()
 *            .post("")
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyTaxCategoriesPostString extends
        StringBodyApiMethod<ByProjectKeyTaxCategoriesPostString, com.commercetools.api.models.tax_category.TaxCategory>
        implements com.commercetools.api.client.ExpandableTrait<ByProjectKeyTaxCategoriesPostString>,
        com.commercetools.api.client.Deprecatable201Trait<ByProjectKeyTaxCategoriesPostString>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyTaxCategoriesPostString> {

    private String projectKey;

    private String taxCategoryDraft;

    public ByProjectKeyTaxCategoriesPostString(final ApiHttpClient apiHttpClient, String projectKey,
            String taxCategoryDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.taxCategoryDraft = taxCategoryDraft;
    }

    public ByProjectKeyTaxCategoriesPostString(ByProjectKeyTaxCategoriesPostString t) {
        super(t);
        this.projectKey = t.projectKey;
        this.taxCategoryDraft = t.taxCategoryDraft;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/tax-categories", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            taxCategoryDraft.getBytes(StandardCharsets.UTF_8));

    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.tax_category.TaxCategory> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.tax_category.TaxCategory.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.tax_category.TaxCategory>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.tax_category.TaxCategory.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    /**
     * set expand with the specified value
     * @param <TValue> value type
     * @param expand value to be set
     * @return ByProjectKeyTaxCategoriesPostString
     */
    public <TValue> ByProjectKeyTaxCategoriesPostString withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     * @param <TValue> value type
     * @param expand value to be added
     * @return ByProjectKeyTaxCategoriesPostString
     */
    public <TValue> ByProjectKeyTaxCategoriesPostString addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyTaxCategoriesPostString
     */
    public ByProjectKeyTaxCategoriesPostString withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyTaxCategoriesPostString
     */
    public ByProjectKeyTaxCategoriesPostString addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyTaxCategoriesPostString
     */
    public ByProjectKeyTaxCategoriesPostString withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyTaxCategoriesPostString
     */
    public ByProjectKeyTaxCategoriesPostString addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     * @param <TValue> value type
     * @param expand values to be set
     * @return ByProjectKeyTaxCategoriesPostString
     */
    public <TValue> ByProjectKeyTaxCategoriesPostString withExpand(final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     * @param <TValue> value type
     * @param expand values to be added
     * @return ByProjectKeyTaxCategoriesPostString
     */
    public <TValue> ByProjectKeyTaxCategoriesPostString addExpand(final Collection<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public String getBody() {
        return taxCategoryDraft;
    }

    public ByProjectKeyTaxCategoriesPostString withBody(String taxCategoryDraft) {
        ByProjectKeyTaxCategoriesPostString t = copy();
        t.taxCategoryDraft = taxCategoryDraft;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyTaxCategoriesPostString that = (ByProjectKeyTaxCategoriesPostString) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(taxCategoryDraft, that.taxCategoryDraft)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(taxCategoryDraft).toHashCode();
    }

    @Override
    protected ByProjectKeyTaxCategoriesPostString copy() {
        return new ByProjectKeyTaxCategoriesPostString(this);
    }
}

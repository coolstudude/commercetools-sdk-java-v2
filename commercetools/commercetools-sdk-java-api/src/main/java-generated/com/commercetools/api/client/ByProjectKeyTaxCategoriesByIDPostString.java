
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
 *            .withId("{ID}")
 *            .post("")
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyTaxCategoriesByIDPostString extends
        StringBodyApiMethod<ByProjectKeyTaxCategoriesByIDPostString, com.commercetools.api.models.tax_category.TaxCategory>
        implements com.commercetools.api.client.ConflictingTrait<ByProjectKeyTaxCategoriesByIDPostString>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyTaxCategoriesByIDPostString>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyTaxCategoriesByIDPostString>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyTaxCategoriesByIDPostString> {

    private String projectKey;
    private String ID;

    private String taxCategoryUpdate;

    public ByProjectKeyTaxCategoriesByIDPostString(final ApiHttpClient apiHttpClient, String projectKey, String ID,
            String taxCategoryUpdate) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.ID = ID;
        this.taxCategoryUpdate = taxCategoryUpdate;
    }

    public ByProjectKeyTaxCategoriesByIDPostString(ByProjectKeyTaxCategoriesByIDPostString t) {
        super(t);
        this.projectKey = t.projectKey;
        this.ID = t.ID;
        this.taxCategoryUpdate = t.taxCategoryUpdate;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/tax-categories/%s", this.projectKey, this.ID);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            taxCategoryUpdate.getBytes(StandardCharsets.UTF_8));

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
     * @return ByProjectKeyTaxCategoriesByIDPostString
     */
    public <TValue> ByProjectKeyTaxCategoriesByIDPostString withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     * @param <TValue> value type
     * @param expand value to be added
     * @return ByProjectKeyTaxCategoriesByIDPostString
     */
    public <TValue> ByProjectKeyTaxCategoriesByIDPostString addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyTaxCategoriesByIDPostString
     */
    public ByProjectKeyTaxCategoriesByIDPostString withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyTaxCategoriesByIDPostString
     */
    public ByProjectKeyTaxCategoriesByIDPostString addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyTaxCategoriesByIDPostString
     */
    public ByProjectKeyTaxCategoriesByIDPostString withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyTaxCategoriesByIDPostString
     */
    public ByProjectKeyTaxCategoriesByIDPostString addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     * @param <TValue> value type
     * @param expand values to be set
     * @return ByProjectKeyTaxCategoriesByIDPostString
     */
    public <TValue> ByProjectKeyTaxCategoriesByIDPostString withExpand(final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     * @param <TValue> value type
     * @param expand values to be added
     * @return ByProjectKeyTaxCategoriesByIDPostString
     */
    public <TValue> ByProjectKeyTaxCategoriesByIDPostString addExpand(final Collection<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public String getBody() {
        return taxCategoryUpdate;
    }

    public ByProjectKeyTaxCategoriesByIDPostString withBody(String taxCategoryUpdate) {
        ByProjectKeyTaxCategoriesByIDPostString t = copy();
        t.taxCategoryUpdate = taxCategoryUpdate;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyTaxCategoriesByIDPostString that = (ByProjectKeyTaxCategoriesByIDPostString) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(ID, that.ID)
                .append(taxCategoryUpdate, that.taxCategoryUpdate)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(ID).append(taxCategoryUpdate).toHashCode();
    }

    @Override
    protected ByProjectKeyTaxCategoriesByIDPostString copy() {
        return new ByProjectKeyTaxCategoriesByIDPostString(this);
    }
}

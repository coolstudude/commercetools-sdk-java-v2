
package com.commercetools.api.models.tax_category;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TaxCategoryReplaceTaxRateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TaxCategoryReplaceTaxRateAction taxCategoryReplaceTaxRateAction = TaxCategoryReplaceTaxRateAction.builder()
 *             .taxRateId("{taxRateId}")
 *             .taxRate(taxRateBuilder -> taxRateBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TaxCategoryReplaceTaxRateActionBuilder implements Builder<TaxCategoryReplaceTaxRateAction> {

    private String taxRateId;

    private com.commercetools.api.models.tax_category.TaxRateDraft taxRate;

    /**
     *  <p>ID of the TaxRate to replace.</p>
     * @param taxRateId value to be set
     * @return Builder
     */

    public TaxCategoryReplaceTaxRateActionBuilder taxRateId(final String taxRateId) {
        this.taxRateId = taxRateId;
        return this;
    }

    /**
     *  <p>New TaxRate to replace with.</p>
     * @param builder function to build the taxRate value
     * @return Builder
     */

    public TaxCategoryReplaceTaxRateActionBuilder taxRate(
            Function<com.commercetools.api.models.tax_category.TaxRateDraftBuilder, com.commercetools.api.models.tax_category.TaxRateDraftBuilder> builder) {
        this.taxRate = builder.apply(com.commercetools.api.models.tax_category.TaxRateDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>New TaxRate to replace with.</p>
     * @param taxRate value to be set
     * @return Builder
     */

    public TaxCategoryReplaceTaxRateActionBuilder taxRate(
            final com.commercetools.api.models.tax_category.TaxRateDraft taxRate) {
        this.taxRate = taxRate;
        return this;
    }

    /**
     *  <p>ID of the TaxRate to replace.</p>
     * @return taxRateId
     */

    public String getTaxRateId() {
        return this.taxRateId;
    }

    /**
     *  <p>New TaxRate to replace with.</p>
     * @return taxRate
     */

    public com.commercetools.api.models.tax_category.TaxRateDraft getTaxRate() {
        return this.taxRate;
    }

    /**
     * builds TaxCategoryReplaceTaxRateAction with checking for non-null required values
     * @return TaxCategoryReplaceTaxRateAction
     */
    public TaxCategoryReplaceTaxRateAction build() {
        Objects.requireNonNull(taxRateId, TaxCategoryReplaceTaxRateAction.class + ": taxRateId is missing");
        Objects.requireNonNull(taxRate, TaxCategoryReplaceTaxRateAction.class + ": taxRate is missing");
        return new TaxCategoryReplaceTaxRateActionImpl(taxRateId, taxRate);
    }

    /**
     * builds TaxCategoryReplaceTaxRateAction without checking for non-null required values
     * @return TaxCategoryReplaceTaxRateAction
     */
    public TaxCategoryReplaceTaxRateAction buildUnchecked() {
        return new TaxCategoryReplaceTaxRateActionImpl(taxRateId, taxRate);
    }

    /**
     * factory method for an instance of TaxCategoryReplaceTaxRateActionBuilder
     * @return builder
     */
    public static TaxCategoryReplaceTaxRateActionBuilder of() {
        return new TaxCategoryReplaceTaxRateActionBuilder();
    }

    /**
     * create builder for TaxCategoryReplaceTaxRateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TaxCategoryReplaceTaxRateActionBuilder of(final TaxCategoryReplaceTaxRateAction template) {
        TaxCategoryReplaceTaxRateActionBuilder builder = new TaxCategoryReplaceTaxRateActionBuilder();
        builder.taxRateId = template.getTaxRateId();
        builder.taxRate = template.getTaxRate();
        return builder;
    }

}

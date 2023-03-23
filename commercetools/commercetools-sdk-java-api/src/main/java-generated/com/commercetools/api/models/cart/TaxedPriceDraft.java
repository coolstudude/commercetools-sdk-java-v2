
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Money;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * TaxedPriceDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TaxedPriceDraft taxedPriceDraft = TaxedPriceDraft.builder()
 *             .totalNet(totalNetBuilder -> totalNetBuilder)
 *             .totalGross(totalGrossBuilder -> totalGrossBuilder)
 *             .plusTaxPortions(taxPortionsBuilder -> taxPortionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = TaxedPriceDraftImpl.class)
public interface TaxedPriceDraft extends io.vrap.rmf.base.client.Draft<TaxedPriceDraft> {

    /**
     *  <p>Total net price of the Line Item or Custom Line Item.</p>
     * @return totalNet
     */
    @NotNull
    @Valid
    @JsonProperty("totalNet")
    public Money getTotalNet();

    /**
     *  <p>Total gross price of the Line Item or Custom Line Item.</p>
     * @return totalGross
     */
    @NotNull
    @Valid
    @JsonProperty("totalGross")
    public Money getTotalGross();

    /**
     *  <p>Taxable portions added to the <code>totalGross</code>.</p>
     *  <p>Calculated from the TaxRates.</p>
     * @return taxPortions
     */
    @NotNull
    @Valid
    @JsonProperty("taxPortions")
    public List<TaxPortionDraft> getTaxPortions();

    public void setTotalNet(final Money totalNet);

    public void setTotalGross(final Money totalGross);

    @JsonIgnore
    public void setTaxPortions(final TaxPortionDraft... taxPortions);

    public void setTaxPortions(final List<TaxPortionDraft> taxPortions);

    public static TaxedPriceDraft of() {
        return new TaxedPriceDraftImpl();
    }

    public static TaxedPriceDraft of(final TaxedPriceDraft template) {
        TaxedPriceDraftImpl instance = new TaxedPriceDraftImpl();
        instance.setTotalNet(template.getTotalNet());
        instance.setTotalGross(template.getTotalGross());
        instance.setTaxPortions(template.getTaxPortions());
        return instance;
    }

    public static TaxedPriceDraftBuilder builder() {
        return TaxedPriceDraftBuilder.of();
    }

    public static TaxedPriceDraftBuilder builder(final TaxedPriceDraft template) {
        return TaxedPriceDraftBuilder.of(template);
    }

    default <T> T withTaxedPriceDraft(Function<TaxedPriceDraft, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<TaxedPriceDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TaxedPriceDraft>() {
            @Override
            public String toString() {
                return "TypeReference<TaxedPriceDraft>";
            }
        };
    }
}


package com.commercetools.importapi.models.orders;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.common.Money;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShippingRateDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingRateDraft shippingRateDraft = ShippingRateDraft.builder()
 *             .price(priceBuilder -> priceBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShippingRateDraftImpl.class)
public interface ShippingRateDraft extends io.vrap.rmf.base.client.Draft<ShippingRateDraft> {

    /**
     *
     * @return price
     */
    @NotNull
    @Valid
    @JsonProperty("price")
    public Money getPrice();

    /**
     *
     * @return freeAbove
     */
    @Valid
    @JsonProperty("freeAbove")
    public Money getFreeAbove();

    /**
     *
     * @return tiers
     */
    @Valid
    @JsonProperty("tiers")
    public List<ShippingRatePriceTier> getTiers();

    /**
     * set price
     * @param price value to be set
     */

    public void setPrice(final Money price);

    /**
     * set freeAbove
     * @param freeAbove value to be set
     */

    public void setFreeAbove(final Money freeAbove);

    /**
     * set tiers
     * @param tiers values to be set
     */

    @JsonIgnore
    public void setTiers(final ShippingRatePriceTier... tiers);

    /**
     * set tiers
     * @param tiers values to be set
     */

    public void setTiers(final List<ShippingRatePriceTier> tiers);

    /**
     * factory method
     * @return instance of ShippingRateDraft
     */
    public static ShippingRateDraft of() {
        return new ShippingRateDraftImpl();
    }

    /**
     * factory method to create a shallow copy ShippingRateDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static ShippingRateDraft of(final ShippingRateDraft template) {
        ShippingRateDraftImpl instance = new ShippingRateDraftImpl();
        instance.setPrice(template.getPrice());
        instance.setFreeAbove(template.getFreeAbove());
        instance.setTiers(template.getTiers());
        return instance;
    }

    /**
     * factory method to create a deep copy of ShippingRateDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ShippingRateDraft deepCopy(@Nullable final ShippingRateDraft template) {
        if (template == null) {
            return null;
        }
        ShippingRateDraftImpl instance = new ShippingRateDraftImpl();
        instance.setPrice(Optional.ofNullable(template.getPrice())
                .map(com.commercetools.importapi.models.common.Money::deepCopy)
                .orElse(null));
        instance.setFreeAbove(Optional.ofNullable(template.getFreeAbove())
                .map(com.commercetools.importapi.models.common.Money::deepCopy)
                .orElse(null));
        instance.setTiers(Optional.ofNullable(template.getTiers())
                .map(t -> t.stream()
                        .map(com.commercetools.importapi.models.orders.ShippingRatePriceTier::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ShippingRateDraft
     * @return builder
     */
    public static ShippingRateDraftBuilder builder() {
        return ShippingRateDraftBuilder.of();
    }

    /**
     * create builder for ShippingRateDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingRateDraftBuilder builder(final ShippingRateDraft template) {
        return ShippingRateDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withShippingRateDraft(Function<ShippingRateDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ShippingRateDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShippingRateDraft>() {
            @Override
            public String toString() {
                return "TypeReference<ShippingRateDraft>";
            }
        };
    }
}

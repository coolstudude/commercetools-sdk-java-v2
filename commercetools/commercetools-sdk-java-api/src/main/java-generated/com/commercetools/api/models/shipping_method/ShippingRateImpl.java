
package com.commercetools.api.models.shipping_method;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * ShippingRate
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShippingRateImpl implements ShippingRate, ModelBase {

    private com.commercetools.api.models.common.TypedMoney price;

    private com.commercetools.api.models.common.TypedMoney freeAbove;

    private Boolean isMatching;

    private java.util.List<com.commercetools.api.models.shipping_method.ShippingRatePriceTier> tiers;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ShippingRateImpl(@JsonProperty("price") final com.commercetools.api.models.common.TypedMoney price,
            @JsonProperty("freeAbove") final com.commercetools.api.models.common.TypedMoney freeAbove,
            @JsonProperty("isMatching") final Boolean isMatching,
            @JsonProperty("tiers") final java.util.List<com.commercetools.api.models.shipping_method.ShippingRatePriceTier> tiers) {
        this.price = price;
        this.freeAbove = freeAbove;
        this.isMatching = isMatching;
        this.tiers = tiers;
    }

    /**
     * create empty instance
     */
    public ShippingRateImpl() {
    }

    /**
     *  <p>Currency amount of the ShippingRate.</p>
     */

    public com.commercetools.api.models.common.TypedMoney getPrice() {
        return this.price;
    }

    /**
     *  <p>Shipping is free if the sum of the (Custom) Line Item Prices reaches the specified value.</p>
     */

    public com.commercetools.api.models.common.TypedMoney getFreeAbove() {
        return this.freeAbove;
    }

    /**
     *  <p><code>true</code> if the ShippingRate matches given Cart or Location. Only appears in response to requests for Get ShippingMethods for a Cart or Get ShippingMethods for a Location.</p>
     */

    public Boolean getIsMatching() {
        return this.isMatching;
    }

    /**
     *  <p>Price tiers for the ShippingRate.</p>
     */

    public java.util.List<com.commercetools.api.models.shipping_method.ShippingRatePriceTier> getTiers() {
        return this.tiers;
    }

    public void setPrice(final com.commercetools.api.models.common.TypedMoney price) {
        this.price = price;
    }

    public void setFreeAbove(final com.commercetools.api.models.common.TypedMoney freeAbove) {
        this.freeAbove = freeAbove;
    }

    public void setIsMatching(final Boolean isMatching) {
        this.isMatching = isMatching;
    }

    public void setTiers(final com.commercetools.api.models.shipping_method.ShippingRatePriceTier... tiers) {
        this.tiers = new ArrayList<>(Arrays.asList(tiers));
    }

    public void setTiers(
            final java.util.List<com.commercetools.api.models.shipping_method.ShippingRatePriceTier> tiers) {
        this.tiers = tiers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ShippingRateImpl that = (ShippingRateImpl) o;

        return new EqualsBuilder().append(price, that.price)
                .append(freeAbove, that.freeAbove)
                .append(isMatching, that.isMatching)
                .append(tiers, that.tiers)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(price)
                .append(freeAbove)
                .append(isMatching)
                .append(tiers)
                .toHashCode();
    }

}

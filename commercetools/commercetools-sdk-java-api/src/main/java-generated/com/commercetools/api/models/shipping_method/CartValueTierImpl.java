
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
 *  <p>Used when the ShippingRate maps to the sum of LineItem Prices. The value of the Cart is used to select a tier. If chosen, it is not possible to set a value for the <code>shippingRateInput</code> on the Cart. Tiers contain the <code>centAmount</code> (a value of <code>100</code> in the currency <code>USD</code> corresponds to <code>$ 1.00</code>), and start at <code>1</code>.'</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartValueTierImpl implements CartValueTier, ModelBase {

    private com.commercetools.api.models.shipping_method.ShippingRateTierType type;

    private Long minimumCentAmount;

    private com.commercetools.api.models.common.Money price;

    private Boolean isMatching;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CartValueTierImpl(@JsonProperty("minimumCentAmount") final Long minimumCentAmount,
            @JsonProperty("price") final com.commercetools.api.models.common.Money price,
            @JsonProperty("isMatching") final Boolean isMatching) {
        this.minimumCentAmount = minimumCentAmount;
        this.price = price;
        this.isMatching = isMatching;
        this.type = ShippingRateTierType.findEnum("CartValue");
    }

    /**
     * create empty instance
     */
    public CartValueTierImpl() {
        this.type = ShippingRateTierType.findEnum("CartValue");
    }

    /**
     *
     */

    public com.commercetools.api.models.shipping_method.ShippingRateTierType getType() {
        return this.type;
    }

    /**
     *  <p>Minimum total price of a Cart for which a shipping rate applies.</p>
     */

    public Long getMinimumCentAmount() {
        return this.minimumCentAmount;
    }

    /**
     *  <p>Fixed shipping rate Price for a CartValue.</p>
     */

    public com.commercetools.api.models.common.Money getPrice() {
        return this.price;
    }

    /**
     *  <p>Appears in response to Get ShippingMethods for a Cart if the shipping rate matches the search query.</p>
     */

    public Boolean getIsMatching() {
        return this.isMatching;
    }

    public void setMinimumCentAmount(final Long minimumCentAmount) {
        this.minimumCentAmount = minimumCentAmount;
    }

    public void setPrice(final com.commercetools.api.models.common.Money price) {
        this.price = price;
    }

    public void setIsMatching(final Boolean isMatching) {
        this.isMatching = isMatching;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CartValueTierImpl that = (CartValueTierImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(minimumCentAmount, that.minimumCentAmount)
                .append(price, that.price)
                .append(isMatching, that.isMatching)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(minimumCentAmount)
                .append(price)
                .append(isMatching)
                .toHashCode();
    }

}

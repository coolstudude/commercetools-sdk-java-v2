
package com.commercetools.api.models.order;

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
 * DiscountedLineItemPriceDraft
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DiscountedLineItemPriceDraftImpl implements DiscountedLineItemPriceDraft, ModelBase {

    private com.commercetools.api.models.common.Money value;

    private java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPortion> includedDiscounts;

    /**
     * create instance with all properties
     */
    @JsonCreator
    DiscountedLineItemPriceDraftImpl(@JsonProperty("value") final com.commercetools.api.models.common.Money value,
            @JsonProperty("includedDiscounts") final java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPortion> includedDiscounts) {
        this.value = value;
        this.includedDiscounts = includedDiscounts;
    }

    /**
     * create empty instance
     */
    public DiscountedLineItemPriceDraftImpl() {
    }

    /**
     *  <p>Draft type that stores amounts only in cent precision for the specified currency.</p>
     */

    public com.commercetools.api.models.common.Money getValue() {
        return this.value;
    }

    /**
     *
     */

    public java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPortion> getIncludedDiscounts() {
        return this.includedDiscounts;
    }

    public void setValue(final com.commercetools.api.models.common.Money value) {
        this.value = value;
    }

    public void setIncludedDiscounts(
            final com.commercetools.api.models.cart.DiscountedLineItemPortion... includedDiscounts) {
        this.includedDiscounts = new ArrayList<>(Arrays.asList(includedDiscounts));
    }

    public void setIncludedDiscounts(
            final java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPortion> includedDiscounts) {
        this.includedDiscounts = includedDiscounts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        DiscountedLineItemPriceDraftImpl that = (DiscountedLineItemPriceDraftImpl) o;

        return new EqualsBuilder().append(value, that.value)
                .append(includedDiscounts, that.includedDiscounts)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(value).append(includedDiscounts).toHashCode();
    }

}


package com.commercetools.api.models.shipping_method;

import java.time.*;
import java.util.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.shipping_method.ShippingMethodUpdateAction;
import com.commercetools.api.models.shipping_method.ShippingRateDraft;
import com.commercetools.api.models.zone.ZoneResourceIdentifier;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ShippingMethodRemoveShippingRateActionImpl implements ShippingMethodRemoveShippingRateAction {

    private String action;

    private com.commercetools.api.models.zone.ZoneResourceIdentifier zone;

    private com.commercetools.api.models.shipping_method.ShippingRateDraft shippingRate;

    @JsonCreator
    ShippingMethodRemoveShippingRateActionImpl(
            @JsonProperty("zone") final com.commercetools.api.models.zone.ZoneResourceIdentifier zone,
            @JsonProperty("shippingRate") final com.commercetools.api.models.shipping_method.ShippingRateDraft shippingRate) {
        this.zone = zone;
        this.shippingRate = shippingRate;
        this.action = ShippingMethodRemoveShippingRateAction.REMOVE_SHIPPING_RATE;
    }

    public ShippingMethodRemoveShippingRateActionImpl() {
        this.action = ShippingMethodRemoveShippingRateAction.REMOVE_SHIPPING_RATE;
    }

    public String getAction() {
        return this.action;
    }

    public com.commercetools.api.models.zone.ZoneResourceIdentifier getZone() {
        return this.zone;
    }

    public com.commercetools.api.models.shipping_method.ShippingRateDraft getShippingRate() {
        return this.shippingRate;
    }

    public void setZone(final com.commercetools.api.models.zone.ZoneResourceIdentifier zone) {
        this.zone = zone;
    }

    public void setShippingRate(final com.commercetools.api.models.shipping_method.ShippingRateDraft shippingRate) {
        this.shippingRate = shippingRate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ShippingMethodRemoveShippingRateActionImpl that = (ShippingMethodRemoveShippingRateActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(zone, that.zone).append(shippingRate,
            that.shippingRate).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(zone).append(shippingRate).toHashCode();
    }

}

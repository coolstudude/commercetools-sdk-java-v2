
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.message.MessagePayload;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class DeliveryAddressSetMessagePayloadImpl implements DeliveryAddressSetMessagePayload {

    private String type;

    private String deliveryId;

    private com.commercetools.api.models.common.Address address;

    private com.commercetools.api.models.common.Address oldAddress;

    @JsonCreator
    DeliveryAddressSetMessagePayloadImpl(@JsonProperty("deliveryId") final String deliveryId,
            @JsonProperty("address") final com.commercetools.api.models.common.Address address,
            @JsonProperty("oldAddress") final com.commercetools.api.models.common.Address oldAddress) {
        this.deliveryId = deliveryId;
        this.address = address;
        this.oldAddress = oldAddress;
        this.type = DeliveryAddressSetMessagePayload.DELIVERY_ADDRESS_SET;
    }

    public DeliveryAddressSetMessagePayloadImpl() {
        this.type = DeliveryAddressSetMessagePayload.DELIVERY_ADDRESS_SET;
    }

    public String getType() {
        return this.type;
    }

    public String getDeliveryId() {
        return this.deliveryId;
    }

    public com.commercetools.api.models.common.Address getAddress() {
        return this.address;
    }

    public com.commercetools.api.models.common.Address getOldAddress() {
        return this.oldAddress;
    }

    public void setDeliveryId(final String deliveryId) {
        this.deliveryId = deliveryId;
    }

    public void setAddress(final com.commercetools.api.models.common.Address address) {
        this.address = address;
    }

    public void setOldAddress(final com.commercetools.api.models.common.Address oldAddress) {
        this.oldAddress = oldAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        DeliveryAddressSetMessagePayloadImpl that = (DeliveryAddressSetMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type).append(deliveryId, that.deliveryId).append(address,
            that.address).append(oldAddress, that.oldAddress).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(deliveryId).append(address).append(
            oldAddress).toHashCode();
    }

}

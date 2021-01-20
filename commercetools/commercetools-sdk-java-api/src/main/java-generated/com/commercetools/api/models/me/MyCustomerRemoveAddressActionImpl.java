
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.me.MyCustomerUpdateAction;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MyCustomerRemoveAddressActionImpl implements MyCustomerRemoveAddressAction {

    private String action;

    private String addressId;

    private String addressKey;

    @JsonCreator
    MyCustomerRemoveAddressActionImpl(@JsonProperty("addressId") final String addressId,
            @JsonProperty("addressKey") final String addressKey) {
        this.addressId = addressId;
        this.addressKey = addressKey;
        this.action = MyCustomerRemoveAddressAction.REMOVE_ADDRESS;
    }

    public MyCustomerRemoveAddressActionImpl() {
        this.action = MyCustomerRemoveAddressAction.REMOVE_ADDRESS;
    }

    public String getAction() {
        return this.action;
    }

    public String getAddressId() {
        return this.addressId;
    }

    public String getAddressKey() {
        return this.addressKey;
    }

    public void setAddressId(final String addressId) {
        this.addressId = addressId;
    }

    public void setAddressKey(final String addressKey) {
        this.addressKey = addressKey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        MyCustomerRemoveAddressActionImpl that = (MyCustomerRemoveAddressActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(addressId, that.addressId).append(addressKey,
            that.addressKey).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(addressId).append(addressKey).toHashCode();
    }

}

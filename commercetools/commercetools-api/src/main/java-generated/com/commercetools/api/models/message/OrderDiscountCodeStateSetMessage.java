package com.commercetools.api.models.message;

import com.commercetools.api.models.cart.DiscountCodeState;
import com.commercetools.api.models.discount_code.DiscountCodeReference;
import com.commercetools.api.models.message.Message;
import com.commercetools.api.models.message.OrderDiscountCodeStateSetMessageImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = OrderDiscountCodeStateSetMessageImpl.class)
public interface OrderDiscountCodeStateSetMessage extends Message {

    
    @NotNull
    @Valid
    @JsonProperty("discountCode")
    public DiscountCodeReference getDiscountCode();
    
    @NotNull
    @JsonProperty("state")
    public DiscountCodeState getState();
    
    
    @JsonProperty("oldState")
    public DiscountCodeState getOldState();

    public void setDiscountCode(final DiscountCodeReference discountCode);
    
    public void setState(final DiscountCodeState state);
    
    public void setOldState(final DiscountCodeState oldState);

    public static OrderDiscountCodeStateSetMessageImpl of(){
        return new OrderDiscountCodeStateSetMessageImpl();
    }
    

    public static OrderDiscountCodeStateSetMessageImpl of(final OrderDiscountCodeStateSetMessage template) {
        OrderDiscountCodeStateSetMessageImpl instance = new OrderDiscountCodeStateSetMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(template.getResource());
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
        instance.setDiscountCode(template.getDiscountCode());
        instance.setState(template.getState());
        instance.setOldState(template.getOldState());
        return instance;
    }

}

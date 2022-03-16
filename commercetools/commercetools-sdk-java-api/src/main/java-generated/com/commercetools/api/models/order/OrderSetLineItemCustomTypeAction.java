
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderSetLineItemCustomTypeActionImpl.class)
public interface OrderSetLineItemCustomTypeAction extends OrderUpdateAction {

    String SET_LINE_ITEM_CUSTOM_TYPE = "setLineItemCustomType";

    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();

    /**
    *  <p>Defines the <a href="ctp:api:type:Type">Type</a> that extends the LineItem with <a href="/../api/projects/custom-fields">Custom Fields</a>.
    *  If absent, any existing Type and Custom Fields are removed from the LineItem.</p>
    */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
    *  <p>Sets the <a href="/../api/projects/custom-fields">Custom Fields</a> fields for the LineItem.</p>
    */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    public void setLineItemId(final String lineItemId);

    public void setType(final TypeResourceIdentifier type);

    public void setFields(final FieldContainer fields);

    public static OrderSetLineItemCustomTypeAction of() {
        return new OrderSetLineItemCustomTypeActionImpl();
    }

    public static OrderSetLineItemCustomTypeAction of(final OrderSetLineItemCustomTypeAction template) {
        OrderSetLineItemCustomTypeActionImpl instance = new OrderSetLineItemCustomTypeActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public static OrderSetLineItemCustomTypeActionBuilder builder() {
        return OrderSetLineItemCustomTypeActionBuilder.of();
    }

    public static OrderSetLineItemCustomTypeActionBuilder builder(final OrderSetLineItemCustomTypeAction template) {
        return OrderSetLineItemCustomTypeActionBuilder.of(template);
    }

    default <T> T withOrderSetLineItemCustomTypeAction(Function<OrderSetLineItemCustomTypeAction, T> helper) {
        return helper.apply(this);
    }
}

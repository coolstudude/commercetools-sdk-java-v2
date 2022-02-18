
package com.commercetools.api.models.me;

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
@JsonDeserialize(as = MyShoppingListSetLineItemCustomTypeActionImpl.class)
public interface MyShoppingListSetLineItemCustomTypeAction extends MyShoppingListUpdateAction {

    String SET_LINE_ITEM_CUSTOM_TYPE = "setLineItemCustomType";

    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();

    /**
    *  <p><a href="/../api/types#resourceidentifier">ResourceIdentifier</a> of a <a href="ctp:api:type:Type">Type</a>.</p>
    */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    public void setLineItemId(final String lineItemId);

    public void setType(final TypeResourceIdentifier type);

    public void setFields(final FieldContainer fields);

    public static MyShoppingListSetLineItemCustomTypeAction of() {
        return new MyShoppingListSetLineItemCustomTypeActionImpl();
    }

    public static MyShoppingListSetLineItemCustomTypeAction of(
            final MyShoppingListSetLineItemCustomTypeAction template) {
        MyShoppingListSetLineItemCustomTypeActionImpl instance = new MyShoppingListSetLineItemCustomTypeActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public static MyShoppingListSetLineItemCustomTypeActionBuilder builder() {
        return MyShoppingListSetLineItemCustomTypeActionBuilder.of();
    }

    public static MyShoppingListSetLineItemCustomTypeActionBuilder builder(
            final MyShoppingListSetLineItemCustomTypeAction template) {
        return MyShoppingListSetLineItemCustomTypeActionBuilder.of(template);
    }

    default <T> T withMyShoppingListSetLineItemCustomTypeAction(
            Function<MyShoppingListSetLineItemCustomTypeAction, T> helper) {
        return helper.apply(this);
    }
}

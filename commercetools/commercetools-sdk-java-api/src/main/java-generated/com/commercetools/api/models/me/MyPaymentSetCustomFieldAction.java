
package com.commercetools.api.models.me;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.me.MyPaymentSetCustomFieldActionImpl;
import com.commercetools.api.models.me.MyPaymentUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MyPaymentSetCustomFieldActionImpl.class)
public interface MyPaymentSetCustomFieldAction extends MyPaymentUpdateAction {

    String SET_CUSTOM_FIELD = "setCustomField";

    @NotNull
    @JsonProperty("name")
    public String getName();

    @JsonProperty("value")
    public JsonNode getValue();

    public void setName(final String name);

    public void setValue(final JsonNode value);

    public static MyPaymentSetCustomFieldAction of() {
        return new MyPaymentSetCustomFieldActionImpl();
    }

    public static MyPaymentSetCustomFieldAction of(final MyPaymentSetCustomFieldAction template) {
        MyPaymentSetCustomFieldActionImpl instance = new MyPaymentSetCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static MyPaymentSetCustomFieldActionBuilder builder() {
        return MyPaymentSetCustomFieldActionBuilder.of();
    }

    public static MyPaymentSetCustomFieldActionBuilder builder(final MyPaymentSetCustomFieldAction template) {
        return MyPaymentSetCustomFieldActionBuilder.of(template);
    }

    default <T> T withMyPaymentSetCustomFieldAction(Function<MyPaymentSetCustomFieldAction, T> helper) {
        return helper.apply(this);
    }
}

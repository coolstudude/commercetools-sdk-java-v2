
package com.commercetools.api.models.customer_group;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerGroupUpdateAction
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerGroupUpdateAction customerGroupUpdateAction = CustomerGroupUpdateAction.changeNameBuilder()
 *             name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.customer_group.CustomerGroupChangeNameActionImpl.class, name = CustomerGroupChangeNameAction.CHANGE_NAME),
        @JsonSubTypes.Type(value = com.commercetools.api.models.customer_group.CustomerGroupSetCustomFieldActionImpl.class, name = CustomerGroupSetCustomFieldAction.SET_CUSTOM_FIELD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.customer_group.CustomerGroupSetCustomTypeActionImpl.class, name = CustomerGroupSetCustomTypeAction.SET_CUSTOM_TYPE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.customer_group.CustomerGroupSetKeyActionImpl.class, name = CustomerGroupSetKeyAction.SET_KEY) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "action", defaultImpl = CustomerGroupUpdateActionImpl.class, visible = true)
@JsonDeserialize(as = CustomerGroupUpdateActionImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface CustomerGroupUpdateAction
        extends com.commercetools.api.models.ResourceUpdateAction<CustomerGroupUpdateAction> {

    /**
     *
     * @return action
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();

    /**
     * factory method to create a deep copy of CustomerGroupUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerGroupUpdateAction deepCopy(@Nullable final CustomerGroupUpdateAction template) {
        if (template == null) {
            return null;
        }
        if (template instanceof com.commercetools.api.models.customer_group.CustomerGroupChangeNameAction) {
            return com.commercetools.api.models.customer_group.CustomerGroupChangeNameAction
                    .deepCopy((com.commercetools.api.models.customer_group.CustomerGroupChangeNameAction) template);
        }
        if (template instanceof com.commercetools.api.models.customer_group.CustomerGroupSetCustomFieldAction) {
            return com.commercetools.api.models.customer_group.CustomerGroupSetCustomFieldAction
                    .deepCopy((com.commercetools.api.models.customer_group.CustomerGroupSetCustomFieldAction) template);
        }
        if (template instanceof com.commercetools.api.models.customer_group.CustomerGroupSetCustomTypeAction) {
            return com.commercetools.api.models.customer_group.CustomerGroupSetCustomTypeAction
                    .deepCopy((com.commercetools.api.models.customer_group.CustomerGroupSetCustomTypeAction) template);
        }
        if (template instanceof com.commercetools.api.models.customer_group.CustomerGroupSetKeyAction) {
            return com.commercetools.api.models.customer_group.CustomerGroupSetKeyAction
                    .deepCopy((com.commercetools.api.models.customer_group.CustomerGroupSetKeyAction) template);
        }
        CustomerGroupUpdateActionImpl instance = new CustomerGroupUpdateActionImpl();
        return instance;
    }

    /**
     * builder for changeName subtype
     * @return builder
     */
    public static com.commercetools.api.models.customer_group.CustomerGroupChangeNameActionBuilder changeNameBuilder() {
        return com.commercetools.api.models.customer_group.CustomerGroupChangeNameActionBuilder.of();
    }

    /**
     * builder for setCustomField subtype
     * @return builder
     */
    public static com.commercetools.api.models.customer_group.CustomerGroupSetCustomFieldActionBuilder setCustomFieldBuilder() {
        return com.commercetools.api.models.customer_group.CustomerGroupSetCustomFieldActionBuilder.of();
    }

    /**
     * builder for setCustomType subtype
     * @return builder
     */
    public static com.commercetools.api.models.customer_group.CustomerGroupSetCustomTypeActionBuilder setCustomTypeBuilder() {
        return com.commercetools.api.models.customer_group.CustomerGroupSetCustomTypeActionBuilder.of();
    }

    /**
     * builder for setKey subtype
     * @return builder
     */
    public static com.commercetools.api.models.customer_group.CustomerGroupSetKeyActionBuilder setKeyBuilder() {
        return com.commercetools.api.models.customer_group.CustomerGroupSetKeyActionBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerGroupUpdateAction(Function<CustomerGroupUpdateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerGroupUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerGroupUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerGroupUpdateAction>";
            }
        };
    }
}

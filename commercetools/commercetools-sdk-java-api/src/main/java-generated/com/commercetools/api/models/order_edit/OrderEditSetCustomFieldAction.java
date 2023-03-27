
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderEditSetCustomFieldAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderEditSetCustomFieldAction orderEditSetCustomFieldAction = OrderEditSetCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderEditSetCustomFieldActionImpl.class)
public interface OrderEditSetCustomFieldAction extends OrderEditUpdateAction {

    /**
     * discriminator value for OrderEditSetCustomFieldAction
     */
    String SET_CUSTOM_FIELD = "setCustomField";

    /**
     *  <p>Name of the Custom Field.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @return value
     */

    @JsonProperty("value")
    public Object getValue();

    /**
     *  <p>Name of the Custom Field.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @param value value to be set
     */

    public void setValue(final Object value);

    /**
     * factory method
     * @return instance of OrderEditSetCustomFieldAction
     */
    public static OrderEditSetCustomFieldAction of() {
        return new OrderEditSetCustomFieldActionImpl();
    }

    /**
     * factory method to copy an instance of OrderEditSetCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderEditSetCustomFieldAction of(final OrderEditSetCustomFieldAction template) {
        OrderEditSetCustomFieldActionImpl instance = new OrderEditSetCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for OrderEditSetCustomFieldAction
     * @return builder
     */
    public static OrderEditSetCustomFieldActionBuilder builder() {
        return OrderEditSetCustomFieldActionBuilder.of();
    }

    /**
     * create builder for OrderEditSetCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderEditSetCustomFieldActionBuilder builder(final OrderEditSetCustomFieldAction template) {
        return OrderEditSetCustomFieldActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderEditSetCustomFieldAction(Function<OrderEditSetCustomFieldAction, T> helper) {
        return helper.apply(this);
    }

    public static OrderEditSetCustomFieldAction ofUnset(final String name) {
        return OrderEditSetCustomFieldActionBuilder.of().name(name).build();
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderEditSetCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderEditSetCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderEditSetCustomFieldAction>";
            }
        };
    }
}

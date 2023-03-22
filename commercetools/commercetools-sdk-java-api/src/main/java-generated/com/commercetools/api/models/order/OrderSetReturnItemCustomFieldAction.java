
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSetReturnItemCustomFieldAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSetReturnItemCustomFieldAction orderSetReturnItemCustomFieldAction = OrderSetReturnItemCustomFieldAction.builder()
 *             .returnItemId("{returnItemId}")
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderSetReturnItemCustomFieldActionImpl.class)
public interface OrderSetReturnItemCustomFieldAction extends OrderUpdateAction {

    String SET_RETURN_ITEM_CUSTOM_FIELD = "setReturnItemCustomField";

    /**
     *
     * @return returnItemId
     */
    @NotNull
    @JsonProperty("returnItemId")
    public String getReturnItemId();

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

    public void setReturnItemId(final String returnItemId);

    public void setName(final String name);

    public void setValue(final Object value);

    public static OrderSetReturnItemCustomFieldAction of() {
        return new OrderSetReturnItemCustomFieldActionImpl();
    }

    public static OrderSetReturnItemCustomFieldAction of(final OrderSetReturnItemCustomFieldAction template) {
        OrderSetReturnItemCustomFieldActionImpl instance = new OrderSetReturnItemCustomFieldActionImpl();
        instance.setReturnItemId(template.getReturnItemId());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static OrderSetReturnItemCustomFieldActionBuilder builder() {
        return OrderSetReturnItemCustomFieldActionBuilder.of();
    }

    public static OrderSetReturnItemCustomFieldActionBuilder builder(
            final OrderSetReturnItemCustomFieldAction template) {
        return OrderSetReturnItemCustomFieldActionBuilder.of(template);
    }

    default <T> T withOrderSetReturnItemCustomFieldAction(Function<OrderSetReturnItemCustomFieldAction, T> helper) {
        return helper.apply(this);
    }

    public static OrderSetReturnItemCustomFieldAction ofUnset(final String name, final String returnItemId) {
        return OrderSetReturnItemCustomFieldActionBuilder.of().name(name).returnItemId(returnItemId).build();
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderSetReturnItemCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderSetReturnItemCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderSetReturnItemCustomFieldAction>";
            }
        };
    }
}


package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderSetReturnItemCustomFieldAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetReturnItemCustomFieldAction stagedOrderSetReturnItemCustomFieldAction = StagedOrderSetReturnItemCustomFieldAction.builder()
 *             .returnItemId("{returnItemId}")
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetReturnItemCustomFieldActionImpl.class)
public interface StagedOrderSetReturnItemCustomFieldAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderSetReturnItemCustomFieldAction
     */
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

    /**
     * set returnItemId
     * @param returnItemId value to be set
     */

    public void setReturnItemId(final String returnItemId);

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
     * @return instance of StagedOrderSetReturnItemCustomFieldAction
     */
    public static StagedOrderSetReturnItemCustomFieldAction of() {
        return new StagedOrderSetReturnItemCustomFieldActionImpl();
    }

    /**
     * factory method to create a shallow copy StagedOrderSetReturnItemCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderSetReturnItemCustomFieldAction of(
            final StagedOrderSetReturnItemCustomFieldAction template) {
        StagedOrderSetReturnItemCustomFieldActionImpl instance = new StagedOrderSetReturnItemCustomFieldActionImpl();
        instance.setReturnItemId(template.getReturnItemId());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of StagedOrderSetReturnItemCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedOrderSetReturnItemCustomFieldAction deepCopy(
            @Nullable final StagedOrderSetReturnItemCustomFieldAction template) {
        if (template == null) {
            return null;
        }
        StagedOrderSetReturnItemCustomFieldActionImpl instance = new StagedOrderSetReturnItemCustomFieldActionImpl();
        instance.setReturnItemId(template.getReturnItemId());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for StagedOrderSetReturnItemCustomFieldAction
     * @return builder
     */
    public static StagedOrderSetReturnItemCustomFieldActionBuilder builder() {
        return StagedOrderSetReturnItemCustomFieldActionBuilder.of();
    }

    /**
     * create builder for StagedOrderSetReturnItemCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetReturnItemCustomFieldActionBuilder builder(
            final StagedOrderSetReturnItemCustomFieldAction template) {
        return StagedOrderSetReturnItemCustomFieldActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedOrderSetReturnItemCustomFieldAction(
            Function<StagedOrderSetReturnItemCustomFieldAction, T> helper) {
        return helper.apply(this);
    }

    public static StagedOrderSetReturnItemCustomFieldAction ofUnset(final String name, final String returnItemId) {
        return StagedOrderSetReturnItemCustomFieldActionBuilder.of().name(name).returnItemId(returnItemId).build();
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetReturnItemCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetReturnItemCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderSetReturnItemCustomFieldAction>";
            }
        };
    }
}

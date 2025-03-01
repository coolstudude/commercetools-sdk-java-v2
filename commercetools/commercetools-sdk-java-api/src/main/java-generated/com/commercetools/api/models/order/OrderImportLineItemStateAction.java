
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderImportLineItemStateAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderImportLineItemStateAction orderImportLineItemStateAction = OrderImportLineItemStateAction.builder()
 *             .lineItemId("{lineItemId}")
 *             .plusState(stateBuilder -> stateBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderImportLineItemStateActionImpl.class)
public interface OrderImportLineItemStateAction extends OrderUpdateAction {

    /**
     * discriminator value for OrderImportLineItemStateAction
     */
    String IMPORT_LINE_ITEM_STATE = "importLineItemState";

    /**
     *
     * @return lineItemId
     */
    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();

    /**
     *
     * @return state
     */
    @NotNull
    @Valid
    @JsonProperty("state")
    public List<ItemState> getState();

    /**
     * set lineItemId
     * @param lineItemId value to be set
     */

    public void setLineItemId(final String lineItemId);

    /**
     * set state
     * @param state values to be set
     */

    @JsonIgnore
    public void setState(final ItemState... state);

    /**
     * set state
     * @param state values to be set
     */

    public void setState(final List<ItemState> state);

    /**
     * factory method
     * @return instance of OrderImportLineItemStateAction
     */
    public static OrderImportLineItemStateAction of() {
        return new OrderImportLineItemStateActionImpl();
    }

    /**
     * factory method to create a shallow copy OrderImportLineItemStateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderImportLineItemStateAction of(final OrderImportLineItemStateAction template) {
        OrderImportLineItemStateActionImpl instance = new OrderImportLineItemStateActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setState(template.getState());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderImportLineItemStateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderImportLineItemStateAction deepCopy(@Nullable final OrderImportLineItemStateAction template) {
        if (template == null) {
            return null;
        }
        OrderImportLineItemStateActionImpl instance = new OrderImportLineItemStateActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setState(Optional.ofNullable(template.getState())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.order.ItemState::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for OrderImportLineItemStateAction
     * @return builder
     */
    public static OrderImportLineItemStateActionBuilder builder() {
        return OrderImportLineItemStateActionBuilder.of();
    }

    /**
     * create builder for OrderImportLineItemStateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderImportLineItemStateActionBuilder builder(final OrderImportLineItemStateAction template) {
        return OrderImportLineItemStateActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderImportLineItemStateAction(Function<OrderImportLineItemStateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderImportLineItemStateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderImportLineItemStateAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderImportLineItemStateAction>";
            }
        };
    }
}

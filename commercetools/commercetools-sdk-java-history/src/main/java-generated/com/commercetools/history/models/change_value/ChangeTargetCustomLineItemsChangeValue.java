
package com.commercetools.history.models.change_value;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Shape of the value for cart discounts line item and custom line items target.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeTargetCustomLineItemsChangeValue changeTargetCustomLineItemsChangeValue = ChangeTargetCustomLineItemsChangeValue.builder()
 *             .predicate("{predicate}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChangeTargetCustomLineItemsChangeValueImpl.class)
public interface ChangeTargetCustomLineItemsChangeValue extends ChangeTargetChangeValue {

    /**
     * discriminator value for ChangeTargetCustomLineItemsChangeValue
     */
    String CUSTOM_LINE_ITEMS = "customLineItems";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *
     * @return predicate
     */
    @NotNull
    @JsonProperty("predicate")
    public String getPredicate();

    /**
     * set predicate
     * @param predicate value to be set
     */

    public void setPredicate(final String predicate);

    /**
     * factory method
     * @return instance of ChangeTargetCustomLineItemsChangeValue
     */
    public static ChangeTargetCustomLineItemsChangeValue of() {
        return new ChangeTargetCustomLineItemsChangeValueImpl();
    }

    /**
     * factory method to copy an instance of ChangeTargetCustomLineItemsChangeValue
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeTargetCustomLineItemsChangeValue of(final ChangeTargetCustomLineItemsChangeValue template) {
        ChangeTargetCustomLineItemsChangeValueImpl instance = new ChangeTargetCustomLineItemsChangeValueImpl();
        instance.setPredicate(template.getPredicate());
        return instance;
    }

    /**
     * builder factory method for ChangeTargetCustomLineItemsChangeValue
     * @return builder
     */
    public static ChangeTargetCustomLineItemsChangeValueBuilder builder() {
        return ChangeTargetCustomLineItemsChangeValueBuilder.of();
    }

    /**
     * create builder for ChangeTargetCustomLineItemsChangeValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeTargetCustomLineItemsChangeValueBuilder builder(
            final ChangeTargetCustomLineItemsChangeValue template) {
        return ChangeTargetCustomLineItemsChangeValueBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangeTargetCustomLineItemsChangeValue(
            Function<ChangeTargetCustomLineItemsChangeValue, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangeTargetCustomLineItemsChangeValue> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeTargetCustomLineItemsChangeValue>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeTargetCustomLineItemsChangeValue>";
            }
        };
    }
}

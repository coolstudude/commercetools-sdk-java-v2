
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderSetCustomerIdAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetCustomerIdAction stagedOrderSetCustomerIdAction = StagedOrderSetCustomerIdAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetCustomerIdActionImpl.class)
public interface StagedOrderSetCustomerIdAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderSetCustomerIdAction
     */
    String SET_CUSTOMER_ID = "setCustomerId";

    /**
     *
     * @return customerId
     */

    @JsonProperty("customerId")
    public String getCustomerId();

    /**
     * set customerId
     * @param customerId value to be set
     */

    public void setCustomerId(final String customerId);

    /**
     * factory method
     * @return instance of StagedOrderSetCustomerIdAction
     */
    public static StagedOrderSetCustomerIdAction of() {
        return new StagedOrderSetCustomerIdActionImpl();
    }

    /**
     * factory method to create a shallow copy StagedOrderSetCustomerIdAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderSetCustomerIdAction of(final StagedOrderSetCustomerIdAction template) {
        StagedOrderSetCustomerIdActionImpl instance = new StagedOrderSetCustomerIdActionImpl();
        instance.setCustomerId(template.getCustomerId());
        return instance;
    }

    /**
     * factory method to create a deep copy of StagedOrderSetCustomerIdAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedOrderSetCustomerIdAction deepCopy(@Nullable final StagedOrderSetCustomerIdAction template) {
        if (template == null) {
            return null;
        }
        StagedOrderSetCustomerIdActionImpl instance = new StagedOrderSetCustomerIdActionImpl();
        instance.setCustomerId(template.getCustomerId());
        return instance;
    }

    /**
     * builder factory method for StagedOrderSetCustomerIdAction
     * @return builder
     */
    public static StagedOrderSetCustomerIdActionBuilder builder() {
        return StagedOrderSetCustomerIdActionBuilder.of();
    }

    /**
     * create builder for StagedOrderSetCustomerIdAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetCustomerIdActionBuilder builder(final StagedOrderSetCustomerIdAction template) {
        return StagedOrderSetCustomerIdActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedOrderSetCustomerIdAction(Function<StagedOrderSetCustomerIdAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetCustomerIdAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetCustomerIdAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderSetCustomerIdAction>";
            }
        };
    }
}

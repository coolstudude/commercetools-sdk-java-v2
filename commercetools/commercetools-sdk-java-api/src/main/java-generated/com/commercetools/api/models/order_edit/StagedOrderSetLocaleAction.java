
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderSetLocaleAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetLocaleAction stagedOrderSetLocaleAction = StagedOrderSetLocaleAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetLocaleActionImpl.class)
public interface StagedOrderSetLocaleAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderSetLocaleAction
     */
    String SET_LOCALE = "setLocale";

    /**
     *
     * @return locale
     */

    @JsonProperty("locale")
    public String getLocale();

    /**
     * set locale
     * @param locale value to be set
     */

    public void setLocale(final String locale);

    /**
     * factory method
     * @return instance of StagedOrderSetLocaleAction
     */
    public static StagedOrderSetLocaleAction of() {
        return new StagedOrderSetLocaleActionImpl();
    }

    /**
     * factory method to copy an instance of StagedOrderSetLocaleAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderSetLocaleAction of(final StagedOrderSetLocaleAction template) {
        StagedOrderSetLocaleActionImpl instance = new StagedOrderSetLocaleActionImpl();
        instance.setLocale(template.getLocale());
        return instance;
    }

    /**
     * builder factory method for StagedOrderSetLocaleAction
     * @return builder
     */
    public static StagedOrderSetLocaleActionBuilder builder() {
        return StagedOrderSetLocaleActionBuilder.of();
    }

    /**
     * create builder for StagedOrderSetLocaleAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetLocaleActionBuilder builder(final StagedOrderSetLocaleAction template) {
        return StagedOrderSetLocaleActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedOrderSetLocaleAction(Function<StagedOrderSetLocaleAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetLocaleAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetLocaleAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderSetLocaleAction>";
            }
        };
    }
}

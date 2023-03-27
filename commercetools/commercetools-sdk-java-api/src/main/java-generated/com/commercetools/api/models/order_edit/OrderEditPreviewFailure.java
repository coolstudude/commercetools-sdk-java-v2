
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.error.ErrorObject;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderEditPreviewFailure
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderEditPreviewFailure orderEditPreviewFailure = OrderEditPreviewFailure.builder()
 *             .plusErrors(errorsBuilder -> errorsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderEditPreviewFailureImpl.class)
public interface OrderEditPreviewFailure extends OrderEditResult {

    /**
     * discriminator value for OrderEditPreviewFailure
     */
    String PREVIEW_FAILURE = "PreviewFailure";

    /**
     *
     * @return errors
     */
    @NotNull
    @Valid
    @JsonProperty("errors")
    public List<ErrorObject> getErrors();

    /**
     * set errors
     * @param errors values to be set
     */

    @JsonIgnore
    public void setErrors(final ErrorObject... errors);

    /**
     * set errors
     * @param errors values to be set
     */

    public void setErrors(final List<ErrorObject> errors);

    /**
     * factory method
     * @return instance of OrderEditPreviewFailure
     */
    public static OrderEditPreviewFailure of() {
        return new OrderEditPreviewFailureImpl();
    }

    /**
     * factory method to copy an instance of OrderEditPreviewFailure
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderEditPreviewFailure of(final OrderEditPreviewFailure template) {
        OrderEditPreviewFailureImpl instance = new OrderEditPreviewFailureImpl();
        instance.setErrors(template.getErrors());
        return instance;
    }

    /**
     * builder factory method for OrderEditPreviewFailure
     * @return builder
     */
    public static OrderEditPreviewFailureBuilder builder() {
        return OrderEditPreviewFailureBuilder.of();
    }

    /**
     * create builder for OrderEditPreviewFailure instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderEditPreviewFailureBuilder builder(final OrderEditPreviewFailure template) {
        return OrderEditPreviewFailureBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderEditPreviewFailure(Function<OrderEditPreviewFailure, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderEditPreviewFailure> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderEditPreviewFailure>() {
            @Override
            public String toString() {
                return "TypeReference<OrderEditPreviewFailure>";
            }
        };
    }
}

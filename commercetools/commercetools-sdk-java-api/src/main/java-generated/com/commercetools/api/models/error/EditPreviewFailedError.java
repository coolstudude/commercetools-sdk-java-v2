
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.order_edit.OrderEditPreviewFailure;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Returned when a preview to find an appropriate Shipping Method for an OrderEdit could not be generated.</p>
 *  <p>The error is returned as a failed response to the Get Shipping Methods for an OrderEdit request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     EditPreviewFailedError editPreviewFailedError = EditPreviewFailedError.builder()
 *             .message("{message}")
 *             .result(resultBuilder -> resultBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = EditPreviewFailedErrorImpl.class)
public interface EditPreviewFailedError extends ErrorObject {

    String EDIT_PREVIEW_FAILED = "EditPreviewFailed";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"Error while applying staged actions. ShippingMethods could not be determined."</code></p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p>State of the OrderEdit where the <code>stagedActions</code> cannot be applied to the Order.</p>
     * @return result
     */
    @NotNull
    @Valid
    @JsonProperty("result")
    public OrderEditPreviewFailure getResult();

    public void setMessage(final String message);

    public void setResult(final OrderEditPreviewFailure result);

    public static EditPreviewFailedError of() {
        return new EditPreviewFailedErrorImpl();
    }

    public static EditPreviewFailedError of(final EditPreviewFailedError template) {
        EditPreviewFailedErrorImpl instance = new EditPreviewFailedErrorImpl();
        instance.setMessage(template.getMessage());

        instance.setResult(template.getResult());
        return instance;
    }

    public static EditPreviewFailedErrorBuilder builder() {
        return EditPreviewFailedErrorBuilder.of();
    }

    public static EditPreviewFailedErrorBuilder builder(final EditPreviewFailedError template) {
        return EditPreviewFailedErrorBuilder.of(template);
    }

    default <T> T withEditPreviewFailedError(Function<EditPreviewFailedError, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<EditPreviewFailedError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<EditPreviewFailedError>() {
            @Override
            public String toString() {
                return "TypeReference<EditPreviewFailedError>";
            }
        };
    }
}

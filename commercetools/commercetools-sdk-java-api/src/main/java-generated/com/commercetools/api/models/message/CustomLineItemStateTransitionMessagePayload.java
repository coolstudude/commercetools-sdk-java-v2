
package com.commercetools.api.models.message;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.state.StateReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Transition Custom Line Item State update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomLineItemStateTransitionMessagePayload customLineItemStateTransitionMessagePayload = CustomLineItemStateTransitionMessagePayload.builder()
 *             .customLineItemId("{customLineItemId}")
 *             .transitionDate(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .quantity(0.3)
 *             .fromState(fromStateBuilder -> fromStateBuilder)
 *             .toState(toStateBuilder -> toStateBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomLineItemStateTransitionMessagePayloadImpl.class)
public interface CustomLineItemStateTransitionMessagePayload extends OrderMessagePayload {

    String CUSTOM_LINE_ITEM_STATE_TRANSITION = "CustomLineItemStateTransition";

    /**
     *  <p>Unique identifier of the Custom Line Item.</p>
     */
    @NotNull
    @JsonProperty("customLineItemId")
    public String getCustomLineItemId();

    /**
     *  <p>Date and time (UTC) when the transition of the Custom Line Item State was performed.</p>
     */
    @NotNull
    @JsonProperty("transitionDate")
    public ZonedDateTime getTransitionDate();

    /**
     *  <p>Number of Custom Line Items for which the State was transitioned.</p>
     */
    @NotNull
    @JsonProperty("quantity")
    public Long getQuantity();

    /**
     *  <p>State the Custom Line Item was transitioned from.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("fromState")
    public StateReference getFromState();

    /**
     *  <p>State the Custom Line Item was transitioned to.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("toState")
    public StateReference getToState();

    public void setCustomLineItemId(final String customLineItemId);

    public void setTransitionDate(final ZonedDateTime transitionDate);

    public void setQuantity(final Long quantity);

    public void setFromState(final StateReference fromState);

    public void setToState(final StateReference toState);

    public static CustomLineItemStateTransitionMessagePayload of() {
        return new CustomLineItemStateTransitionMessagePayloadImpl();
    }

    public static CustomLineItemStateTransitionMessagePayload of(
            final CustomLineItemStateTransitionMessagePayload template) {
        CustomLineItemStateTransitionMessagePayloadImpl instance = new CustomLineItemStateTransitionMessagePayloadImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setTransitionDate(template.getTransitionDate());
        instance.setQuantity(template.getQuantity());
        instance.setFromState(template.getFromState());
        instance.setToState(template.getToState());
        return instance;
    }

    public static CustomLineItemStateTransitionMessagePayloadBuilder builder() {
        return CustomLineItemStateTransitionMessagePayloadBuilder.of();
    }

    public static CustomLineItemStateTransitionMessagePayloadBuilder builder(
            final CustomLineItemStateTransitionMessagePayload template) {
        return CustomLineItemStateTransitionMessagePayloadBuilder.of(template);
    }

    default <T> T withCustomLineItemStateTransitionMessagePayload(
            Function<CustomLineItemStateTransitionMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CustomLineItemStateTransitionMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomLineItemStateTransitionMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<CustomLineItemStateTransitionMessagePayload>";
            }
        };
    }
}

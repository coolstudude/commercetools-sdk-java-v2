
package com.commercetools.api.models.order;

import java.time.*;
import java.time.ZonedDateTime;
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
 * ReturnInfoDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ReturnInfoDraft returnInfoDraft = ReturnInfoDraft.builder()
 *             .plusItems(itemsBuilder -> itemsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ReturnInfoDraftImpl.class)
public interface ReturnInfoDraft extends io.vrap.rmf.base.client.Draft<ReturnInfoDraft> {

    /**
     *
     * @return items
     */
    @NotNull
    @Valid
    @JsonProperty("items")
    public List<ReturnItemDraft> getItems();

    /**
     *  <p>Identifies, which return tracking ID is connected to this particular return.</p>
     * @return returnTrackingId
     */

    @JsonProperty("returnTrackingId")
    public String getReturnTrackingId();

    /**
     *
     * @return returnDate
     */

    @JsonProperty("returnDate")
    public ZonedDateTime getReturnDate();

    /**
     * set items
     * @param items values to be set
     */

    @JsonIgnore
    public void setItems(final ReturnItemDraft... items);

    /**
     * set items
     * @param items values to be set
     */

    public void setItems(final List<ReturnItemDraft> items);

    /**
     *  <p>Identifies, which return tracking ID is connected to this particular return.</p>
     * @param returnTrackingId value to be set
     */

    public void setReturnTrackingId(final String returnTrackingId);

    /**
     * set returnDate
     * @param returnDate value to be set
     */

    public void setReturnDate(final ZonedDateTime returnDate);

    /**
     * factory method
     * @return instance of ReturnInfoDraft
     */
    public static ReturnInfoDraft of() {
        return new ReturnInfoDraftImpl();
    }

    /**
     * factory method to create a shallow copy ReturnInfoDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static ReturnInfoDraft of(final ReturnInfoDraft template) {
        ReturnInfoDraftImpl instance = new ReturnInfoDraftImpl();
        instance.setItems(template.getItems());
        instance.setReturnTrackingId(template.getReturnTrackingId());
        instance.setReturnDate(template.getReturnDate());
        return instance;
    }

    /**
     * factory method to create a deep copy of ReturnInfoDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ReturnInfoDraft deepCopy(@Nullable final ReturnInfoDraft template) {
        if (template == null) {
            return null;
        }
        ReturnInfoDraftImpl instance = new ReturnInfoDraftImpl();
        instance.setItems(Optional.ofNullable(template.getItems())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.order.ReturnItemDraft::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setReturnTrackingId(template.getReturnTrackingId());
        instance.setReturnDate(template.getReturnDate());
        return instance;
    }

    /**
     * builder factory method for ReturnInfoDraft
     * @return builder
     */
    public static ReturnInfoDraftBuilder builder() {
        return ReturnInfoDraftBuilder.of();
    }

    /**
     * create builder for ReturnInfoDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ReturnInfoDraftBuilder builder(final ReturnInfoDraft template) {
        return ReturnInfoDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withReturnInfoDraft(Function<ReturnInfoDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ReturnInfoDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ReturnInfoDraft>() {
            @Override
            public String toString() {
                return "TypeReference<ReturnInfoDraft>";
            }
        };
    }
}

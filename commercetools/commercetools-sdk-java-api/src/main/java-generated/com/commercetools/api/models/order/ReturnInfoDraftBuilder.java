
package com.commercetools.api.models.order;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ReturnInfoDraftBuilder
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
public class ReturnInfoDraftBuilder implements Builder<ReturnInfoDraft> {

    private java.util.List<com.commercetools.api.models.order.ReturnItemDraft> items;

    @Nullable
    private String returnTrackingId;

    @Nullable
    private java.time.ZonedDateTime returnDate;

    /**
     * set values to the items
     * @param items value to be set
     * @return Builder
     */

    public ReturnInfoDraftBuilder items(final com.commercetools.api.models.order.ReturnItemDraft... items) {
        this.items = new ArrayList<>(Arrays.asList(items));
        return this;
    }

    /**
     * set value to the items
     * @param items value to be set
     * @return Builder
     */

    public ReturnInfoDraftBuilder items(
            final java.util.List<com.commercetools.api.models.order.ReturnItemDraft> items) {
        this.items = items;
        return this;
    }

    /**
     * add values to the items
     * @param items value to be set
     * @return Builder
     */

    public ReturnInfoDraftBuilder plusItems(final com.commercetools.api.models.order.ReturnItemDraft... items) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.addAll(Arrays.asList(items));
        return this;
    }

    /**
     * add the value to the items using the builder function
     * @param builder function to build the items value
     * @return Builder
     */

    public ReturnInfoDraftBuilder plusItems(
            Function<com.commercetools.api.models.order.ReturnItemDraftBuilder, com.commercetools.api.models.order.ReturnItemDraftBuilder> builder) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(builder.apply(com.commercetools.api.models.order.ReturnItemDraftBuilder.of()).build());
        return this;
    }

    /**
     * set the value to the items using the builder function
     * @param builder function to build the items value
     * @return Builder
     */

    public ReturnInfoDraftBuilder withItems(
            Function<com.commercetools.api.models.order.ReturnItemDraftBuilder, com.commercetools.api.models.order.ReturnItemDraftBuilder> builder) {
        this.items = new ArrayList<>();
        this.items.add(builder.apply(com.commercetools.api.models.order.ReturnItemDraftBuilder.of()).build());
        return this;
    }

    /**
     * add the value to the items using the builder function
     * @param builder function to build the items value
     * @return Builder
     */

    public ReturnInfoDraftBuilder addItems(
            Function<com.commercetools.api.models.order.ReturnItemDraftBuilder, com.commercetools.api.models.order.ReturnItemDraft> builder) {
        return plusItems(builder.apply(com.commercetools.api.models.order.ReturnItemDraftBuilder.of()));
    }

    /**
     * set the value to the items using the builder function
     * @param builder function to build the items value
     * @return Builder
     */

    public ReturnInfoDraftBuilder setItems(
            Function<com.commercetools.api.models.order.ReturnItemDraftBuilder, com.commercetools.api.models.order.ReturnItemDraft> builder) {
        return items(builder.apply(com.commercetools.api.models.order.ReturnItemDraftBuilder.of()));
    }

    /**
     *  <p>Identifies, which return tracking ID is connected to this particular return.</p>
     * @param returnTrackingId value to be set
     * @return Builder
     */

    public ReturnInfoDraftBuilder returnTrackingId(@Nullable final String returnTrackingId) {
        this.returnTrackingId = returnTrackingId;
        return this;
    }

    /**
     * set the value to the returnDate
     * @param returnDate value to be set
     * @return Builder
     */

    public ReturnInfoDraftBuilder returnDate(@Nullable final java.time.ZonedDateTime returnDate) {
        this.returnDate = returnDate;
        return this;
    }

    /**
     * value of items}
     * @return items
     */

    public java.util.List<com.commercetools.api.models.order.ReturnItemDraft> getItems() {
        return this.items;
    }

    /**
     *  <p>Identifies, which return tracking ID is connected to this particular return.</p>
     * @return returnTrackingId
     */

    @Nullable
    public String getReturnTrackingId() {
        return this.returnTrackingId;
    }

    /**
     * value of returnDate}
     * @return returnDate
     */

    @Nullable
    public java.time.ZonedDateTime getReturnDate() {
        return this.returnDate;
    }

    /**
     * builds ReturnInfoDraft with checking for non-null required values
     * @return ReturnInfoDraft
     */
    public ReturnInfoDraft build() {
        Objects.requireNonNull(items, ReturnInfoDraft.class + ": items is missing");
        return new ReturnInfoDraftImpl(items, returnTrackingId, returnDate);
    }

    /**
     * builds ReturnInfoDraft without checking for non-null required values
     * @return ReturnInfoDraft
     */
    public ReturnInfoDraft buildUnchecked() {
        return new ReturnInfoDraftImpl(items, returnTrackingId, returnDate);
    }

    /**
     * factory method for an instance of ReturnInfoDraftBuilder
     * @return builder
     */
    public static ReturnInfoDraftBuilder of() {
        return new ReturnInfoDraftBuilder();
    }

    /**
     * create builder for ReturnInfoDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ReturnInfoDraftBuilder of(final ReturnInfoDraft template) {
        ReturnInfoDraftBuilder builder = new ReturnInfoDraftBuilder();
        builder.items = template.getItems();
        builder.returnTrackingId = template.getReturnTrackingId();
        builder.returnDate = template.getReturnDate();
        return builder;
    }

}

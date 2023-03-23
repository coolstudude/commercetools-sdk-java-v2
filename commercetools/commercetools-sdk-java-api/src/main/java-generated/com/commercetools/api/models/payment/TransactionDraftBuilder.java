
package com.commercetools.api.models.payment;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TransactionDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TransactionDraft transactionDraft = TransactionDraft.builder()
 *             .type(TransactionType.AUTHORIZATION)
 *             .amount(amountBuilder -> amountBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TransactionDraftBuilder implements Builder<TransactionDraft> {

    @Nullable
    private java.time.ZonedDateTime timestamp;

    private com.commercetools.api.models.payment.TransactionType type;

    private com.commercetools.api.models.common.Money amount;

    @Nullable
    private String interactionId;

    @Nullable
    private com.commercetools.api.models.payment.TransactionState state;

    @Nullable
    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    /**
     *  <p>Date and time (UTC) the Transaction took place.</p>
     * @param timestamp
     * @return Builder
     */

    public TransactionDraftBuilder timestamp(@Nullable final java.time.ZonedDateTime timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     *  <p>Type of the Transaction.</p>
     * @param type
     * @return Builder
     */

    public TransactionDraftBuilder type(final com.commercetools.api.models.payment.TransactionType type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Money value for the Transaction.</p>
     * @return Builder
     */

    public TransactionDraftBuilder amount(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.amount = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Money value for the Transaction.</p>
     * @param amount
     * @return Builder
     */

    public TransactionDraftBuilder amount(final com.commercetools.api.models.common.Money amount) {
        this.amount = amount;
        return this;
    }

    /**
     *  <p>Identifier used by the payment service that manages the Transaction. Can be used to correlate the Transaction to an interface interaction.</p>
     * @param interactionId
     * @return Builder
     */

    public TransactionDraftBuilder interactionId(@Nullable final String interactionId) {
        this.interactionId = interactionId;
        return this;
    }

    /**
     *  <p>State of the Transaction.</p>
     * @param state
     * @return Builder
     */

    public TransactionDraftBuilder state(@Nullable final com.commercetools.api.models.payment.TransactionState state) {
        this.state = state;
        return this;
    }

    /**
     *  <p>Custom Fields of the Transaction.</p>
     * @return Builder
     */

    public TransactionDraftBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields of the Transaction.</p>
     * @param custom
     * @return Builder
     */

    public TransactionDraftBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }

    @Nullable
    public java.time.ZonedDateTime getTimestamp() {
        return this.timestamp;
    }

    public com.commercetools.api.models.payment.TransactionType getType() {
        return this.type;
    }

    public com.commercetools.api.models.common.Money getAmount() {
        return this.amount;
    }

    @Nullable
    public String getInteractionId() {
        return this.interactionId;
    }

    @Nullable
    public com.commercetools.api.models.payment.TransactionState getState() {
        return this.state;
    }

    @Nullable
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    public TransactionDraft build() {
        Objects.requireNonNull(type, TransactionDraft.class + ": type is missing");
        Objects.requireNonNull(amount, TransactionDraft.class + ": amount is missing");
        return new TransactionDraftImpl(timestamp, type, amount, interactionId, state, custom);
    }

    /**
     * builds TransactionDraft without checking for non null required values
     */
    public TransactionDraft buildUnchecked() {
        return new TransactionDraftImpl(timestamp, type, amount, interactionId, state, custom);
    }

    public static TransactionDraftBuilder of() {
        return new TransactionDraftBuilder();
    }

    public static TransactionDraftBuilder of(final TransactionDraft template) {
        TransactionDraftBuilder builder = new TransactionDraftBuilder();
        builder.timestamp = template.getTimestamp();
        builder.type = template.getType();
        builder.amount = template.getAmount();
        builder.interactionId = template.getInteractionId();
        builder.state = template.getState();
        builder.custom = template.getCustom();
        return builder;
    }

}

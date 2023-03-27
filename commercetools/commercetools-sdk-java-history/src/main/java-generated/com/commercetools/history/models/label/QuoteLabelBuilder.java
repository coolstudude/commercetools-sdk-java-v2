
package com.commercetools.history.models.label;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * QuoteLabelBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     QuoteLabel quoteLabel = QuoteLabel.builder()
 *             .key("{key}")
 *             .customer(customerBuilder -> customerBuilder)
 *             .stagedQuote(stagedQuoteBuilder -> stagedQuoteBuilder)
 *             .quoteRequest(quoteRequestBuilder -> quoteRequestBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class QuoteLabelBuilder implements Builder<QuoteLabel> {

    private String key;

    private com.commercetools.history.models.common.Reference customer;

    private com.commercetools.history.models.common.Reference stagedQuote;

    private com.commercetools.history.models.common.Reference quoteRequest;

    /**
     * set the value to the key
     * @param key value to be set
     * @return Builder
     */

    public QuoteLabelBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     * set the value to the customer using the builder function
     * @param builder function to build the customer value
     * @return Builder
     */

    public QuoteLabelBuilder customer(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.ReferenceBuilder> builder) {
        this.customer = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the customer
     * @param customer value to be set
     * @return Builder
     */

    public QuoteLabelBuilder customer(final com.commercetools.history.models.common.Reference customer) {
        this.customer = customer;
        return this;
    }

    /**
     * set the value to the stagedQuote using the builder function
     * @param builder function to build the stagedQuote value
     * @return Builder
     */

    public QuoteLabelBuilder stagedQuote(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.ReferenceBuilder> builder) {
        this.stagedQuote = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the stagedQuote
     * @param stagedQuote value to be set
     * @return Builder
     */

    public QuoteLabelBuilder stagedQuote(final com.commercetools.history.models.common.Reference stagedQuote) {
        this.stagedQuote = stagedQuote;
        return this;
    }

    /**
     * set the value to the quoteRequest using the builder function
     * @param builder function to build the quoteRequest value
     * @return Builder
     */

    public QuoteLabelBuilder quoteRequest(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.ReferenceBuilder> builder) {
        this.quoteRequest = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the quoteRequest
     * @param quoteRequest value to be set
     * @return Builder
     */

    public QuoteLabelBuilder quoteRequest(final com.commercetools.history.models.common.Reference quoteRequest) {
        this.quoteRequest = quoteRequest;
        return this;
    }

    /**
     * value of key}
     * @return key
     */

    public String getKey() {
        return this.key;
    }

    /**
     * value of customer}
     * @return customer
     */

    public com.commercetools.history.models.common.Reference getCustomer() {
        return this.customer;
    }

    /**
     * value of stagedQuote}
     * @return stagedQuote
     */

    public com.commercetools.history.models.common.Reference getStagedQuote() {
        return this.stagedQuote;
    }

    /**
     * value of quoteRequest}
     * @return quoteRequest
     */

    public com.commercetools.history.models.common.Reference getQuoteRequest() {
        return this.quoteRequest;
    }

    /**
     * builds QuoteLabel with checking for non-null required values
     * @return QuoteLabel
     */
    public QuoteLabel build() {
        Objects.requireNonNull(key, QuoteLabel.class + ": key is missing");
        Objects.requireNonNull(customer, QuoteLabel.class + ": customer is missing");
        Objects.requireNonNull(stagedQuote, QuoteLabel.class + ": stagedQuote is missing");
        Objects.requireNonNull(quoteRequest, QuoteLabel.class + ": quoteRequest is missing");
        return new QuoteLabelImpl(key, customer, stagedQuote, quoteRequest);
    }

    /**
     * builds QuoteLabel without checking for non-null required values
     * @return QuoteLabel
     */
    public QuoteLabel buildUnchecked() {
        return new QuoteLabelImpl(key, customer, stagedQuote, quoteRequest);
    }

    /**
     * factory method for an instance of QuoteLabelBuilder
     * @return builder
     */
    public static QuoteLabelBuilder of() {
        return new QuoteLabelBuilder();
    }

    /**
     * create builder for QuoteLabel instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static QuoteLabelBuilder of(final QuoteLabel template) {
        QuoteLabelBuilder builder = new QuoteLabelBuilder();
        builder.key = template.getKey();
        builder.customer = template.getCustomer();
        builder.stagedQuote = template.getStagedQuote();
        builder.quoteRequest = template.getQuoteRequest();
        return builder;
    }

}

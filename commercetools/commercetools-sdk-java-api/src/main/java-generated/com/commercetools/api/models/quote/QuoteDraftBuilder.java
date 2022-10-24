
package com.commercetools.api.models.quote;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * QuoteDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     QuoteDraft quoteDraft = QuoteDraft.builder()
 *             .stagedQuote(stagedQuoteBuilder -> stagedQuoteBuilder)
 *             .stagedQuoteVersion(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class QuoteDraftBuilder implements Builder<QuoteDraft> {

    private com.commercetools.api.models.staged_quote.StagedQuoteResourceIdentifier stagedQuote;

    private Long stagedQuoteVersion;

    @Nullable
    private Boolean stagedQuoteStateToSent;

    @Nullable
    private String key;

    @Nullable
    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    @Nullable
    private com.commercetools.api.models.state.StateReference state;

    /**
     *  <p>StagedQuote from which the Quote is created.</p>
     */

    public QuoteDraftBuilder stagedQuote(
            Function<com.commercetools.api.models.staged_quote.StagedQuoteResourceIdentifierBuilder, com.commercetools.api.models.staged_quote.StagedQuoteResourceIdentifierBuilder> builder) {
        this.stagedQuote = builder
                .apply(com.commercetools.api.models.staged_quote.StagedQuoteResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>StagedQuote from which the Quote is created.</p>
     */

    public QuoteDraftBuilder stagedQuote(
            final com.commercetools.api.models.staged_quote.StagedQuoteResourceIdentifier stagedQuote) {
        this.stagedQuote = stagedQuote;
        return this;
    }

    /**
     *  <p>Current version of the StagedQuote.</p>
     */

    public QuoteDraftBuilder stagedQuoteVersion(final Long stagedQuoteVersion) {
        this.stagedQuoteVersion = stagedQuoteVersion;
        return this;
    }

    /**
     *  <p>If <code>true</code>, the <code>stagedQuoteState</code> of the referenced StagedQuote will be set to <code>Sent</code>.</p>
     */

    public QuoteDraftBuilder stagedQuoteStateToSent(@Nullable final Boolean stagedQuoteStateToSent) {
        this.stagedQuoteStateToSent = stagedQuoteStateToSent;
        return this;
    }

    /**
     *  <p>User-defined unique identifier for the Quote.</p>
     */

    public QuoteDraftBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Custom Fields to be added to the Quote.</p>
     *  <ul>
     *   <li>If specified, the Custom Fields are merged with the Custom Fields on the referenced StagedQuote and added to the Quote.</li>
     *   <li>If empty, the Custom Fields on the referenced StagedQuote are added to the Quote automatically.</li>
     *  </ul>
     */

    public QuoteDraftBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields to be added to the Quote.</p>
     *  <ul>
     *   <li>If specified, the Custom Fields are merged with the Custom Fields on the referenced StagedQuote and added to the Quote.</li>
     *   <li>If empty, the Custom Fields on the referenced StagedQuote are added to the Quote automatically.</li>
     *  </ul>
     */

    public QuoteDraftBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>State of the Quote. This reference can point to a State in a custom workflow.</p>
     */

    public QuoteDraftBuilder state(
            Function<com.commercetools.api.models.state.StateReferenceBuilder, com.commercetools.api.models.state.StateReferenceBuilder> builder) {
        this.state = builder.apply(com.commercetools.api.models.state.StateReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>State of the Quote. This reference can point to a State in a custom workflow.</p>
     */

    public QuoteDraftBuilder state(@Nullable final com.commercetools.api.models.state.StateReference state) {
        this.state = state;
        return this;
    }

    public com.commercetools.api.models.staged_quote.StagedQuoteResourceIdentifier getStagedQuote() {
        return this.stagedQuote;
    }

    public Long getStagedQuoteVersion() {
        return this.stagedQuoteVersion;
    }

    @Nullable
    public Boolean getStagedQuoteStateToSent() {
        return this.stagedQuoteStateToSent;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    @Nullable
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    @Nullable
    public com.commercetools.api.models.state.StateReference getState() {
        return this.state;
    }

    public QuoteDraft build() {
        Objects.requireNonNull(stagedQuote, QuoteDraft.class + ": stagedQuote is missing");
        Objects.requireNonNull(stagedQuoteVersion, QuoteDraft.class + ": stagedQuoteVersion is missing");
        return new QuoteDraftImpl(stagedQuote, stagedQuoteVersion, stagedQuoteStateToSent, key, custom, state);
    }

    /**
     * builds QuoteDraft without checking for non null required values
     */
    public QuoteDraft buildUnchecked() {
        return new QuoteDraftImpl(stagedQuote, stagedQuoteVersion, stagedQuoteStateToSent, key, custom, state);
    }

    public static QuoteDraftBuilder of() {
        return new QuoteDraftBuilder();
    }

    public static QuoteDraftBuilder of(final QuoteDraft template) {
        QuoteDraftBuilder builder = new QuoteDraftBuilder();
        builder.stagedQuote = template.getStagedQuote();
        builder.stagedQuoteVersion = template.getStagedQuoteVersion();
        builder.stagedQuoteStateToSent = template.getStagedQuoteStateToSent();
        builder.key = template.getKey();
        builder.custom = template.getCustom();
        builder.state = template.getState();
        return builder;
    }

}

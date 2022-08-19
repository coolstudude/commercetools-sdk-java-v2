
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ReviewRatingSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ReviewRatingSetMessagePayload reviewRatingSetMessagePayload = ReviewRatingSetMessagePayload.builder()
 *             .includedInStatistics(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ReviewRatingSetMessagePayloadBuilder implements Builder<ReviewRatingSetMessagePayload> {

    @Nullable
    private Double oldRating;

    @Nullable
    private Double newRating;

    private Boolean includedInStatistics;

    @Nullable
    private com.commercetools.api.models.common.Reference target;

    /**
     *  <p>The <code>rating</code> of the Review before the Set Rating update action.</p>
     */

    public ReviewRatingSetMessagePayloadBuilder oldRating(@Nullable final Double oldRating) {
        this.oldRating = oldRating;
        return this;
    }

    /**
     *  <p>The <code>rating</code> of the Review after the Set Rating update action.</p>
     */

    public ReviewRatingSetMessagePayloadBuilder newRating(@Nullable final Double newRating) {
        this.newRating = newRating;
        return this;
    }

    /**
     *  <p>Whether the Review was taken into account in the ratings statistics of the target.</p>
     */

    public ReviewRatingSetMessagePayloadBuilder includedInStatistics(final Boolean includedInStatistics) {
        this.includedInStatistics = includedInStatistics;
        return this;
    }

    /**
     *  <p>Reference to the resource that the Review belongs to.</p>
     */

    public ReviewRatingSetMessagePayloadBuilder target(
            @Nullable final com.commercetools.api.models.common.Reference target) {
        this.target = target;
        return this;
    }

    /**
     *  <p>Reference to the resource that the Review belongs to.</p>
     */

    public ReviewRatingSetMessagePayloadBuilder target(
            Function<com.commercetools.api.models.common.ReferenceBuilder, Builder<? extends com.commercetools.api.models.common.Reference>> builder) {
        this.target = builder.apply(com.commercetools.api.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    @Nullable
    public Double getOldRating() {
        return this.oldRating;
    }

    @Nullable
    public Double getNewRating() {
        return this.newRating;
    }

    public Boolean getIncludedInStatistics() {
        return this.includedInStatistics;
    }

    @Nullable
    public com.commercetools.api.models.common.Reference getTarget() {
        return this.target;
    }

    public ReviewRatingSetMessagePayload build() {
        Objects.requireNonNull(includedInStatistics,
            ReviewRatingSetMessagePayload.class + ": includedInStatistics is missing");
        return new ReviewRatingSetMessagePayloadImpl(oldRating, newRating, includedInStatistics, target);
    }

    /**
     * builds ReviewRatingSetMessagePayload without checking for non null required values
     */
    public ReviewRatingSetMessagePayload buildUnchecked() {
        return new ReviewRatingSetMessagePayloadImpl(oldRating, newRating, includedInStatistics, target);
    }

    public static ReviewRatingSetMessagePayloadBuilder of() {
        return new ReviewRatingSetMessagePayloadBuilder();
    }

    public static ReviewRatingSetMessagePayloadBuilder of(final ReviewRatingSetMessagePayload template) {
        ReviewRatingSetMessagePayloadBuilder builder = new ReviewRatingSetMessagePayloadBuilder();
        builder.oldRating = template.getOldRating();
        builder.newRating = template.getNewRating();
        builder.includedInStatistics = template.getIncludedInStatistics();
        builder.target = template.getTarget();
        return builder;
    }

}

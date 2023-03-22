
package com.commercetools.api.models.cart;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ScoreShippingRateInputBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ScoreShippingRateInput scoreShippingRateInput = ScoreShippingRateInput.builder()
 *             .score(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ScoreShippingRateInputBuilder implements Builder<ScoreShippingRateInput> {

    private Long score;

    /**
     *  <p>Abstract value for categorizing a Cart.</p>
     * @param score
     * @return Builder
     */

    public ScoreShippingRateInputBuilder score(final Long score) {
        this.score = score;
        return this;
    }

    public Long getScore() {
        return this.score;
    }

    public ScoreShippingRateInput build() {
        Objects.requireNonNull(score, ScoreShippingRateInput.class + ": score is missing");
        return new ScoreShippingRateInputImpl(score);
    }

    /**
     * builds ScoreShippingRateInput without checking for non null required values
     */
    public ScoreShippingRateInput buildUnchecked() {
        return new ScoreShippingRateInputImpl(score);
    }

    public static ScoreShippingRateInputBuilder of() {
        return new ScoreShippingRateInputBuilder();
    }

    public static ScoreShippingRateInputBuilder of(final ScoreShippingRateInput template) {
        ScoreShippingRateInputBuilder builder = new ScoreShippingRateInputBuilder();
        builder.score = template.getScore();
        return builder;
    }

}

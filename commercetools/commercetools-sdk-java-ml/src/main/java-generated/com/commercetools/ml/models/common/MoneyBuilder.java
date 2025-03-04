
package com.commercetools.ml.models.common;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MoneyBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Money money = Money.builder()
 *             .centAmount(0.3)
 *             .currencyCode("{currencyCode}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MoneyBuilder implements Builder<Money> {

    private Long centAmount;

    private String currencyCode;

    /**
     * set the value to the centAmount
     * @param centAmount value to be set
     * @return Builder
     */

    public MoneyBuilder centAmount(final Long centAmount) {
        this.centAmount = centAmount;
        return this;
    }

    /**
     *  <p>The currency code compliant to ISO 4217.</p>
     * @param currencyCode value to be set
     * @return Builder
     */

    public MoneyBuilder currencyCode(final String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    /**
     * value of centAmount}
     * @return centAmount
     */

    public Long getCentAmount() {
        return this.centAmount;
    }

    /**
     *  <p>The currency code compliant to ISO 4217.</p>
     * @return currencyCode
     */

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    /**
     * builds Money with checking for non-null required values
     * @return Money
     */
    public Money build() {
        Objects.requireNonNull(centAmount, Money.class + ": centAmount is missing");
        Objects.requireNonNull(currencyCode, Money.class + ": currencyCode is missing");
        return new MoneyImpl(centAmount, currencyCode);
    }

    /**
     * builds Money without checking for non-null required values
     * @return Money
     */
    public Money buildUnchecked() {
        return new MoneyImpl(centAmount, currencyCode);
    }

    /**
     * factory method for an instance of MoneyBuilder
     * @return builder
     */
    public static MoneyBuilder of() {
        return new MoneyBuilder();
    }

    /**
     * create builder for Money instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MoneyBuilder of(final Money template) {
        MoneyBuilder builder = new MoneyBuilder();
        builder.centAmount = template.getCentAmount();
        builder.currencyCode = template.getCurrencyCode();
        return builder;
    }

}

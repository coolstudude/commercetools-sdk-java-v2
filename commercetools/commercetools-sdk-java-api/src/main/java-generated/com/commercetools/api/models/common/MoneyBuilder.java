
package com.commercetools.api.models.common;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class MoneyBuilder implements Builder<Money> {

    private Long centAmount;

    private String currencyCode;

    /**
    *  <p>Amount in the smallest indivisible unit of a currency, such as:</p>
    *  <ul>
    *   <li>Cents for EUR and USD, pence for GBP, or centime for CHF (5 CHF is specified as <code>500</code>).</li>
    *   <li>The value in the major unit for currencies without minor units, like JPY (5 JPY is specified as <code>5</code>).</li>
    *  </ul>
    */

    public MoneyBuilder centAmount(final Long centAmount) {
        this.centAmount = centAmount;
        return this;
    }

    /**
    *  <p>Currency code compliant to ISO 4217.</p>
    */

    public MoneyBuilder currencyCode(final String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    public Long getCentAmount() {
        return this.centAmount;
    }

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    public Money build() {
        Objects.requireNonNull(centAmount, Money.class + ": centAmount is missing");
        Objects.requireNonNull(currencyCode, Money.class + ": currencyCode is missing");
        return new MoneyImpl(centAmount, currencyCode);
    }

    /**
     * builds Money without checking for non null required values
     */
    public Money buildUnchecked() {
        return new MoneyImpl(centAmount, currencyCode);
    }

    public static MoneyBuilder of() {
        return new MoneyBuilder();
    }

    public static MoneyBuilder of(final Money template) {
        MoneyBuilder builder = new MoneyBuilder();
        builder.centAmount = template.getCentAmount();
        builder.currencyCode = template.getCurrencyCode();
        return builder;
    }

}

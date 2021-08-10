
package com.commercetools.importapi.models.common;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class HighPrecisionMoneyBuilder implements Builder<HighPrecisionMoney> {

    @Nullable
    private Integer fractionDigits;

    private Long centAmount;

    private String currencyCode;

    private Long preciseAmount;

    public HighPrecisionMoneyBuilder fractionDigits(@Nullable final Integer fractionDigits) {
        this.fractionDigits = fractionDigits;
        return this;
    }

    public HighPrecisionMoneyBuilder centAmount(final Long centAmount) {
        this.centAmount = centAmount;
        return this;
    }

    public HighPrecisionMoneyBuilder currencyCode(final String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    public HighPrecisionMoneyBuilder preciseAmount(final Long preciseAmount) {
        this.preciseAmount = preciseAmount;
        return this;
    }

    @Nullable
    public Integer getFractionDigits() {
        return this.fractionDigits;
    }

    public Long getCentAmount() {
        return this.centAmount;
    }

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    public Long getPreciseAmount() {
        return this.preciseAmount;
    }

    public HighPrecisionMoney build() {
        Objects.requireNonNull(centAmount);
        Objects.requireNonNull(currencyCode);
        Objects.requireNonNull(preciseAmount);
        return new HighPrecisionMoneyImpl(fractionDigits, centAmount, currencyCode, preciseAmount);
    }

    /**
     * builds HighPrecisionMoney without checking for non null required values
     */
    public HighPrecisionMoney buildUnchecked() {
        return new HighPrecisionMoneyImpl(fractionDigits, centAmount, currencyCode, preciseAmount);
    }

    public static HighPrecisionMoneyBuilder of() {
        return new HighPrecisionMoneyBuilder();
    }

    public static HighPrecisionMoneyBuilder of(final HighPrecisionMoney template) {
        HighPrecisionMoneyBuilder builder = new HighPrecisionMoneyBuilder();
        builder.fractionDigits = template.getFractionDigits();
        builder.centAmount = template.getCentAmount();
        builder.currencyCode = template.getCurrencyCode();
        builder.preciseAmount = template.getPreciseAmount();
        return builder;
    }

}

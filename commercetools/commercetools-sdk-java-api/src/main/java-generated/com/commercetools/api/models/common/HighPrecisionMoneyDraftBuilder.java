
package com.commercetools.api.models.common;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class HighPrecisionMoneyDraftBuilder implements Builder<HighPrecisionMoneyDraft> {

    @Nullable
    private Long centAmount;

    private String currencyCode;

    private Integer fractionDigits;

    private Long preciseAmount;

    public HighPrecisionMoneyDraftBuilder centAmount(@Nullable final Long centAmount) {
        this.centAmount = centAmount;
        return this;
    }

    public HighPrecisionMoneyDraftBuilder currencyCode(final String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    public HighPrecisionMoneyDraftBuilder fractionDigits(final Integer fractionDigits) {
        this.fractionDigits = fractionDigits;
        return this;
    }

    public HighPrecisionMoneyDraftBuilder preciseAmount(final Long preciseAmount) {
        this.preciseAmount = preciseAmount;
        return this;
    }

    @Nullable
    public Long getCentAmount() {
        return this.centAmount;
    }

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    public Integer getFractionDigits() {
        return this.fractionDigits;
    }

    public Long getPreciseAmount() {
        return this.preciseAmount;
    }

    public HighPrecisionMoneyDraft build() {
        Objects.requireNonNull(currencyCode, HighPrecisionMoneyDraft.class + ": currencyCode is missing");
        Objects.requireNonNull(fractionDigits, HighPrecisionMoneyDraft.class + ": fractionDigits is missing");
        Objects.requireNonNull(preciseAmount, HighPrecisionMoneyDraft.class + ": preciseAmount is missing");
        return new HighPrecisionMoneyDraftImpl(centAmount, currencyCode, fractionDigits, preciseAmount);
    }

    /**
     * builds HighPrecisionMoneyDraft without checking for non null required values
     */
    public HighPrecisionMoneyDraft buildUnchecked() {
        return new HighPrecisionMoneyDraftImpl(centAmount, currencyCode, fractionDigits, preciseAmount);
    }

    public static HighPrecisionMoneyDraftBuilder of() {
        return new HighPrecisionMoneyDraftBuilder();
    }

    public static HighPrecisionMoneyDraftBuilder of(final HighPrecisionMoneyDraft template) {
        HighPrecisionMoneyDraftBuilder builder = new HighPrecisionMoneyDraftBuilder();
        builder.centAmount = template.getCentAmount();
        builder.currencyCode = template.getCurrencyCode();
        builder.fractionDigits = template.getFractionDigits();
        builder.preciseAmount = template.getPreciseAmount();
        return builder;
    }

}

package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.cart.TaxPortionDraft;
import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.order_edit.StagedOrderSetOrderTotalTaxAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class StagedOrderSetOrderTotalTaxActionBuilder {

    
    private com.commercetools.api.models.common.Money externalTotalGross;
    
    @Nullable
    private java.util.List<com.commercetools.api.models.cart.TaxPortionDraft> externalTaxPortions;

    public StagedOrderSetOrderTotalTaxActionBuilder externalTotalGross( final com.commercetools.api.models.common.Money externalTotalGross) {
        this.externalTotalGross = externalTotalGross;
        return this;
    }
    
    public StagedOrderSetOrderTotalTaxActionBuilder externalTaxPortions(@Nullable final java.util.List<com.commercetools.api.models.cart.TaxPortionDraft> externalTaxPortions) {
        this.externalTaxPortions = externalTaxPortions;
        return this;
    }

    
    public com.commercetools.api.models.common.Money getExternalTotalGross(){
        return this.externalTotalGross;
    }
    
    @Nullable
    public java.util.List<com.commercetools.api.models.cart.TaxPortionDraft> getExternalTaxPortions(){
        return this.externalTaxPortions;
    }

    public StagedOrderSetOrderTotalTaxAction build() {
        return new StagedOrderSetOrderTotalTaxActionImpl(externalTotalGross, externalTaxPortions);
    }

    public static StagedOrderSetOrderTotalTaxActionBuilder of() {
        return new StagedOrderSetOrderTotalTaxActionBuilder();
    }

    public static StagedOrderSetOrderTotalTaxActionBuilder of(final StagedOrderSetOrderTotalTaxAction template) {
        StagedOrderSetOrderTotalTaxActionBuilder builder = new StagedOrderSetOrderTotalTaxActionBuilder();
        builder.externalTotalGross = template.getExternalTotalGross();
        builder.externalTaxPortions = template.getExternalTaxPortions();
        return builder;
    }

}

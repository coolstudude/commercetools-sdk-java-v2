package com.commercetools.importapi.models.orders;

import com.commercetools.importapi.models.common.TypedMoney;
import com.commercetools.importapi.models.orders.CustomLineItemTaxedPriceImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = CustomLineItemTaxedPriceImpl.class)
public interface CustomLineItemTaxedPrice  {

    
    @NotNull
    @Valid
    @JsonProperty("totalNet")
    public TypedMoney getTotalNet();
    
    @NotNull
    @Valid
    @JsonProperty("totalGross")
    public TypedMoney getTotalGross();

    public void setTotalNet(final TypedMoney totalNet);
    
    public void setTotalGross(final TypedMoney totalGross);

    public static CustomLineItemTaxedPriceImpl of(){
        return new CustomLineItemTaxedPriceImpl();
    }
    

    public static CustomLineItemTaxedPriceImpl of(final CustomLineItemTaxedPrice template) {
        CustomLineItemTaxedPriceImpl instance = new CustomLineItemTaxedPriceImpl();
        instance.setTotalNet(template.getTotalNet());
        instance.setTotalGross(template.getTotalGross());
        return instance;
    }

    default <T extends Accessor<CustomLineItemTaxedPrice>> T withCustomLineItemTaxedPrice(Function<CustomLineItemTaxedPrice, T> helper) {
        return helper.apply(this);
    }
}

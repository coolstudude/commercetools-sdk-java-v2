package com.commercetools.importapi.models.orders;

import com.commercetools.importapi.models.common.CartDiscountKeyReference;
import com.commercetools.importapi.models.common.Money;
import com.commercetools.importapi.models.orders.DiscountedLineItemPortionImpl;

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
@JsonDeserialize(as = DiscountedLineItemPortionImpl.class)
public interface DiscountedLineItemPortion  {

    /**
    *  <p>References a cart discount by its key.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("discount")
    public CartDiscountKeyReference getDiscount();
    
    @NotNull
    @Valid
    @JsonProperty("discountedAmount")
    public Money getDiscountedAmount();

    public void setDiscount(final CartDiscountKeyReference discount);
    
    public void setDiscountedAmount(final Money discountedAmount);

    public static DiscountedLineItemPortionImpl of(){
        return new DiscountedLineItemPortionImpl();
    }
    

    public static DiscountedLineItemPortionImpl of(final DiscountedLineItemPortion template) {
        DiscountedLineItemPortionImpl instance = new DiscountedLineItemPortionImpl();
        instance.setDiscount(template.getDiscount());
        instance.setDiscountedAmount(template.getDiscountedAmount());
        return instance;
    }

    default <T extends Accessor<DiscountedLineItemPortion>> T withDiscountedLineItemPortion(Function<DiscountedLineItemPortion, T> helper) {
        return helper.apply(this);
    }
}

package com.commercetools.api.models.cart_discount;

import com.commercetools.api.models.cart_discount.CartDiscountTarget;
import com.commercetools.api.models.cart_discount.SelectionMode;
import com.commercetools.api.models.cart_discount.MultiBuyLineItemsTarget;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MultiBuyLineItemsTargetBuilder {

    
    private String predicate;
    
    
    private Integer triggerQuantity;
    
    
    private Integer discountedQuantity;
    
    @Nullable
    private Integer maxOccurrence;
    
    
    private com.commercetools.api.models.cart_discount.SelectionMode selectionMode;

    public MultiBuyLineItemsTargetBuilder predicate( final String predicate) {
        this.predicate = predicate;
        return this;
    }
    
    public MultiBuyLineItemsTargetBuilder triggerQuantity( final Integer triggerQuantity) {
        this.triggerQuantity = triggerQuantity;
        return this;
    }
    
    public MultiBuyLineItemsTargetBuilder discountedQuantity( final Integer discountedQuantity) {
        this.discountedQuantity = discountedQuantity;
        return this;
    }
    
    public MultiBuyLineItemsTargetBuilder maxOccurrence(@Nullable final Integer maxOccurrence) {
        this.maxOccurrence = maxOccurrence;
        return this;
    }
    
    public MultiBuyLineItemsTargetBuilder selectionMode( final com.commercetools.api.models.cart_discount.SelectionMode selectionMode) {
        this.selectionMode = selectionMode;
        return this;
    }

    
    public String getPredicate(){
        return this.predicate;
    }
    
    
    public Integer getTriggerQuantity(){
        return this.triggerQuantity;
    }
    
    
    public Integer getDiscountedQuantity(){
        return this.discountedQuantity;
    }
    
    @Nullable
    public Integer getMaxOccurrence(){
        return this.maxOccurrence;
    }
    
    
    public com.commercetools.api.models.cart_discount.SelectionMode getSelectionMode(){
        return this.selectionMode;
    }

    public MultiBuyLineItemsTarget build() {
        return new MultiBuyLineItemsTargetImpl(predicate, triggerQuantity, discountedQuantity, maxOccurrence, selectionMode);
    }

    public static MultiBuyLineItemsTargetBuilder of() {
        return new MultiBuyLineItemsTargetBuilder();
    }

    public static MultiBuyLineItemsTargetBuilder of(final MultiBuyLineItemsTarget template) {
        MultiBuyLineItemsTargetBuilder builder = new MultiBuyLineItemsTargetBuilder();
        builder.predicate = template.getPredicate();
        builder.triggerQuantity = template.getTriggerQuantity();
        builder.discountedQuantity = template.getDiscountedQuantity();
        builder.maxOccurrence = template.getMaxOccurrence();
        builder.selectionMode = template.getSelectionMode();
        return builder;
    }

}

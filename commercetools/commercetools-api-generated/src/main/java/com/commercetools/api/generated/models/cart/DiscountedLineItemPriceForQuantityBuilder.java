package com.commercetools.api.generated.models.cart;

import com.commercetools.api.generated.models.cart.DiscountedLineItemPrice;
import com.commercetools.api.generated.models.cart.DiscountedLineItemPriceForQuantity;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class DiscountedLineItemPriceForQuantityBuilder {
   
   
   private Integer quantity;
   
   
   private com.commercetools.api.generated.models.cart.DiscountedLineItemPrice discountedPrice;
   
   public DiscountedLineItemPriceForQuantityBuilder quantity( final Integer quantity) {
      this.quantity = quantity;
      return this;
   }
   
   public DiscountedLineItemPriceForQuantityBuilder discountedPrice( final com.commercetools.api.generated.models.cart.DiscountedLineItemPrice discountedPrice) {
      this.discountedPrice = discountedPrice;
      return this;
   }
   
   
   public Integer getQuantity(){
      return this.quantity;
   }
   
   
   public com.commercetools.api.generated.models.cart.DiscountedLineItemPrice getDiscountedPrice(){
      return this.discountedPrice;
   }

   public DiscountedLineItemPriceForQuantity build() {
       return new DiscountedLineItemPriceForQuantityImpl(quantity, discountedPrice);
   }
   
   public static DiscountedLineItemPriceForQuantityBuilder of() {
      return new DiscountedLineItemPriceForQuantityBuilder();
   }
   
   public static DiscountedLineItemPriceForQuantityBuilder of(final DiscountedLineItemPriceForQuantity template) {
      DiscountedLineItemPriceForQuantityBuilder builder = new DiscountedLineItemPriceForQuantityBuilder();
      builder.quantity = template.getQuantity();
      builder.discountedPrice = template.getDiscountedPrice();
      return builder;
   }
   
}
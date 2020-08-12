package com.commercetools.api.models.shopping_list;

import com.commercetools.api.models.shopping_list.ShoppingListUpdateAction;
import com.commercetools.api.models.type.CustomFieldsDraft;
import java.time.ZonedDateTime;
import com.commercetools.api.models.shopping_list.ShoppingListAddLineItemAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ShoppingListAddLineItemActionBuilder {
   
   @Nullable
   private String sku;
   
   @Nullable
   private String productId;
   
   @Nullable
   private Long variantId;
   
   @Nullable
   private Long quantity;
   
   @Nullable
   private java.time.ZonedDateTime addedAt;
   
   @Nullable
   private com.commercetools.api.models.type.CustomFieldsDraft custom;
   
   public ShoppingListAddLineItemActionBuilder sku(@Nullable final String sku) {
      this.sku = sku;
      return this;
   }
   
   public ShoppingListAddLineItemActionBuilder productId(@Nullable final String productId) {
      this.productId = productId;
      return this;
   }
   
   public ShoppingListAddLineItemActionBuilder variantId(@Nullable final Long variantId) {
      this.variantId = variantId;
      return this;
   }
   
   public ShoppingListAddLineItemActionBuilder quantity(@Nullable final Long quantity) {
      this.quantity = quantity;
      return this;
   }
   
   public ShoppingListAddLineItemActionBuilder addedAt(@Nullable final java.time.ZonedDateTime addedAt) {
      this.addedAt = addedAt;
      return this;
   }
   
   public ShoppingListAddLineItemActionBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
      this.custom = custom;
      return this;
   }
   
   @Nullable
   public String getSku(){
      return this.sku;
   }
   
   @Nullable
   public String getProductId(){
      return this.productId;
   }
   
   @Nullable
   public Long getVariantId(){
      return this.variantId;
   }
   
   @Nullable
   public Long getQuantity(){
      return this.quantity;
   }
   
   @Nullable
   public java.time.ZonedDateTime getAddedAt(){
      return this.addedAt;
   }
   
   @Nullable
   public com.commercetools.api.models.type.CustomFieldsDraft getCustom(){
      return this.custom;
   }

   public ShoppingListAddLineItemAction build() {
       return new ShoppingListAddLineItemActionImpl(sku, productId, variantId, quantity, addedAt, custom);
   }
   
   public static ShoppingListAddLineItemActionBuilder of() {
      return new ShoppingListAddLineItemActionBuilder();
   }
   
   public static ShoppingListAddLineItemActionBuilder of(final ShoppingListAddLineItemAction template) {
      ShoppingListAddLineItemActionBuilder builder = new ShoppingListAddLineItemActionBuilder();
      builder.sku = template.getSku();
      builder.productId = template.getProductId();
      builder.variantId = template.getVariantId();
      builder.quantity = template.getQuantity();
      builder.addedAt = template.getAddedAt();
      builder.custom = template.getCustom();
      return builder;
   }
   
}

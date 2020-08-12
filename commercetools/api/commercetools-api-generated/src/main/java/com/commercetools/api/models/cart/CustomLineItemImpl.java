package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity;
import com.commercetools.api.models.cart.ItemShippingDetails;
import com.commercetools.api.models.cart.TaxedItemPrice;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.common.TypedMoney;
import com.commercetools.api.models.order.ItemState;
import com.commercetools.api.models.tax_category.TaxCategoryReference;
import com.commercetools.api.models.tax_category.TaxRate;
import com.commercetools.api.models.type.CustomFields;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CustomLineItemImpl implements CustomLineItem {

   private String id;
   
   private com.commercetools.api.models.common.LocalizedString name;
   
   private com.commercetools.api.models.common.TypedMoney money;
   
   private com.commercetools.api.models.cart.TaxedItemPrice taxedPrice;
   
   private com.commercetools.api.models.common.TypedMoney totalPrice;
   
   private String slug;
   
   private Double quantity;
   
   private java.util.List<com.commercetools.api.models.order.ItemState> state;
   
   private com.commercetools.api.models.tax_category.TaxCategoryReference taxCategory;
   
   private com.commercetools.api.models.tax_category.TaxRate taxRate;
   
   private java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity;
   
   private com.commercetools.api.models.type.CustomFields custom;
   
   private com.commercetools.api.models.cart.ItemShippingDetails shippingDetails;

   @JsonCreator
   CustomLineItemImpl(@JsonProperty("id") final String id, @JsonProperty("name") final com.commercetools.api.models.common.LocalizedString name, @JsonProperty("money") final com.commercetools.api.models.common.TypedMoney money, @JsonProperty("taxedPrice") final com.commercetools.api.models.cart.TaxedItemPrice taxedPrice, @JsonProperty("totalPrice") final com.commercetools.api.models.common.TypedMoney totalPrice, @JsonProperty("slug") final String slug, @JsonProperty("quantity") final Double quantity, @JsonProperty("state") final java.util.List<com.commercetools.api.models.order.ItemState> state, @JsonProperty("taxCategory") final com.commercetools.api.models.tax_category.TaxCategoryReference taxCategory, @JsonProperty("taxRate") final com.commercetools.api.models.tax_category.TaxRate taxRate, @JsonProperty("discountedPricePerQuantity") final java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity, @JsonProperty("custom") final com.commercetools.api.models.type.CustomFields custom, @JsonProperty("shippingDetails") final com.commercetools.api.models.cart.ItemShippingDetails shippingDetails) {
      this.id = id;
      this.name = name;
      this.money = money;
      this.taxedPrice = taxedPrice;
      this.totalPrice = totalPrice;
      this.slug = slug;
      this.quantity = quantity;
      this.state = state;
      this.taxCategory = taxCategory;
      this.taxRate = taxRate;
      this.discountedPricePerQuantity = discountedPricePerQuantity;
      this.custom = custom;
      this.shippingDetails = shippingDetails;
   }
   public CustomLineItemImpl() {
      
   }
   
   /**
   *  <p>The unique ID of this CustomLineItem.</p>
   */
   public String getId(){
      return this.id;
   }
   
   /**
   *  <p>The name of this CustomLineItem.</p>
   */
   public com.commercetools.api.models.common.LocalizedString getName(){
      return this.name;
   }
   
   /**
   *  <p>The cost to add to the cart.
   *  The amount can be negative.</p>
   */
   public com.commercetools.api.models.common.TypedMoney getMoney(){
      return this.money;
   }
   
   /**
   *  <p>Set once the <code>taxRate</code> is set.</p>
   */
   public com.commercetools.api.models.cart.TaxedItemPrice getTaxedPrice(){
      return this.taxedPrice;
   }
   
   /**
   *  <p>The total price of this custom line item.
   *  If custom line item is discounted, then the <code>totalPrice</code> would be the discounted custom line item price multiplied by <code>quantity</code>.
   *  Otherwise a total price is just a <code>money</code> multiplied by the <code>quantity</code>.
   *  <code>totalPrice</code> may or may not include the taxes: it depends on the taxRate.includedInPrice property.</p>
   */
   public com.commercetools.api.models.common.TypedMoney getTotalPrice(){
      return this.totalPrice;
   }
   
   /**
   *  <p>A unique String in the cart to identify this CustomLineItem.</p>
   */
   public String getSlug(){
      return this.slug;
   }
   
   /**
   *  <p>The amount of a CustomLineItem in the cart.
   *  Must be a positive integer.</p>
   */
   public Double getQuantity(){
      return this.quantity;
   }
   
   
   public java.util.List<com.commercetools.api.models.order.ItemState> getState(){
      return this.state;
   }
   
   
   public com.commercetools.api.models.tax_category.TaxCategoryReference getTaxCategory(){
      return this.taxCategory;
   }
   
   /**
   *  <p>Will be set automatically in the <code>Platform</code> TaxMode once the shipping address is set is set.
   *  For the <code>External</code> tax mode the tax rate has to be set explicitly with the ExternalTaxRateDraft.</p>
   */
   public com.commercetools.api.models.tax_category.TaxRate getTaxRate(){
      return this.taxRate;
   }
   
   
   public java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity> getDiscountedPricePerQuantity(){
      return this.discountedPricePerQuantity;
   }
   
   
   public com.commercetools.api.models.type.CustomFields getCustom(){
      return this.custom;
   }
   
   /**
   *  <p>Container for custom line item specific address(es).
   *  CustomLineItem fields that can be used in query predicates: <code>slug</code>, <code>name</code>, <code>quantity</code>,
   *  <code>money</code>, <code>state</code>, <code>discountedPricePerQuantity</code>.</p>
   */
   public com.commercetools.api.models.cart.ItemShippingDetails getShippingDetails(){
      return this.shippingDetails;
   }

   public void setId(final String id){
      this.id = id;
   }
   
   public void setName(final com.commercetools.api.models.common.LocalizedString name){
      this.name = name;
   }
   
   public void setMoney(final com.commercetools.api.models.common.TypedMoney money){
      this.money = money;
   }
   
   public void setTaxedPrice(final com.commercetools.api.models.cart.TaxedItemPrice taxedPrice){
      this.taxedPrice = taxedPrice;
   }
   
   public void setTotalPrice(final com.commercetools.api.models.common.TypedMoney totalPrice){
      this.totalPrice = totalPrice;
   }
   
   public void setSlug(final String slug){
      this.slug = slug;
   }
   
   public void setQuantity(final Double quantity){
      this.quantity = quantity;
   }
   
   public void setState(final java.util.List<com.commercetools.api.models.order.ItemState> state){
      this.state = state;
   }
   
   public void setTaxCategory(final com.commercetools.api.models.tax_category.TaxCategoryReference taxCategory){
      this.taxCategory = taxCategory;
   }
   
   public void setTaxRate(final com.commercetools.api.models.tax_category.TaxRate taxRate){
      this.taxRate = taxRate;
   }
   
   public void setDiscountedPricePerQuantity(final java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity){
      this.discountedPricePerQuantity = discountedPricePerQuantity;
   }
   
   public void setCustom(final com.commercetools.api.models.type.CustomFields custom){
      this.custom = custom;
   }
   
   public void setShippingDetails(final com.commercetools.api.models.cart.ItemShippingDetails shippingDetails){
      this.shippingDetails = shippingDetails;
   }

}

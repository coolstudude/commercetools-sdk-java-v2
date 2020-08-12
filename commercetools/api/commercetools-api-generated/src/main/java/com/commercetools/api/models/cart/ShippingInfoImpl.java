package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.DiscountedLineItemPrice;
import com.commercetools.api.models.cart.ShippingMethodState;
import com.commercetools.api.models.cart.TaxedItemPrice;
import com.commercetools.api.models.common.TypedMoney;
import com.commercetools.api.models.order.Delivery;
import com.commercetools.api.models.shipping_method.ShippingMethodReference;
import com.commercetools.api.models.shipping_method.ShippingRate;
import com.commercetools.api.models.tax_category.TaxCategoryReference;
import com.commercetools.api.models.tax_category.TaxRate;
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
public final class ShippingInfoImpl implements ShippingInfo {

   private String shippingMethodName;
   
   private com.commercetools.api.models.common.TypedMoney price;
   
   private com.commercetools.api.models.shipping_method.ShippingRate shippingRate;
   
   private com.commercetools.api.models.cart.TaxedItemPrice taxedPrice;
   
   private com.commercetools.api.models.tax_category.TaxRate taxRate;
   
   private com.commercetools.api.models.tax_category.TaxCategoryReference taxCategory;
   
   private com.commercetools.api.models.shipping_method.ShippingMethodReference shippingMethod;
   
   private java.util.List<com.commercetools.api.models.order.Delivery> deliveries;
   
   private com.commercetools.api.models.cart.DiscountedLineItemPrice discountedPrice;
   
   private com.commercetools.api.models.cart.ShippingMethodState shippingMethodState;

   @JsonCreator
   ShippingInfoImpl(@JsonProperty("shippingMethodName") final String shippingMethodName, @JsonProperty("price") final com.commercetools.api.models.common.TypedMoney price, @JsonProperty("shippingRate") final com.commercetools.api.models.shipping_method.ShippingRate shippingRate, @JsonProperty("taxedPrice") final com.commercetools.api.models.cart.TaxedItemPrice taxedPrice, @JsonProperty("taxRate") final com.commercetools.api.models.tax_category.TaxRate taxRate, @JsonProperty("taxCategory") final com.commercetools.api.models.tax_category.TaxCategoryReference taxCategory, @JsonProperty("shippingMethod") final com.commercetools.api.models.shipping_method.ShippingMethodReference shippingMethod, @JsonProperty("deliveries") final java.util.List<com.commercetools.api.models.order.Delivery> deliveries, @JsonProperty("discountedPrice") final com.commercetools.api.models.cart.DiscountedLineItemPrice discountedPrice, @JsonProperty("shippingMethodState") final com.commercetools.api.models.cart.ShippingMethodState shippingMethodState) {
      this.shippingMethodName = shippingMethodName;
      this.price = price;
      this.shippingRate = shippingRate;
      this.taxedPrice = taxedPrice;
      this.taxRate = taxRate;
      this.taxCategory = taxCategory;
      this.shippingMethod = shippingMethod;
      this.deliveries = deliveries;
      this.discountedPrice = discountedPrice;
      this.shippingMethodState = shippingMethodState;
   }
   public ShippingInfoImpl() {
      
   }
   
   
   public String getShippingMethodName(){
      return this.shippingMethodName;
   }
   
   /**
   *  <p>Determined based on the ShippingRate and its tiered prices, and either the sum of LineItem prices or the <code>shippingRateInput</code> field.</p>
   */
   public com.commercetools.api.models.common.TypedMoney getPrice(){
      return this.price;
   }
   
   /**
   *  <p>The shipping rate used to determine the price.</p>
   */
   public com.commercetools.api.models.shipping_method.ShippingRate getShippingRate(){
      return this.shippingRate;
   }
   
   /**
   *  <p>Set once the <code>taxRate</code> is set.</p>
   */
   public com.commercetools.api.models.cart.TaxedItemPrice getTaxedPrice(){
      return this.taxedPrice;
   }
   
   /**
   *  <p>Will be set automatically in the <code>Platform</code> TaxMode once the shipping address is set is set.
   *  For the <code>External</code> tax mode the tax rate has to be set explicitly with the ExternalTaxRateDraft.</p>
   */
   public com.commercetools.api.models.tax_category.TaxRate getTaxRate(){
      return this.taxRate;
   }
   
   
   public com.commercetools.api.models.tax_category.TaxCategoryReference getTaxCategory(){
      return this.taxCategory;
   }
   
   /**
   *  <p>Not set if custom shipping method is used.</p>
   */
   public com.commercetools.api.models.shipping_method.ShippingMethodReference getShippingMethod(){
      return this.shippingMethod;
   }
   
   /**
   *  <p>Deliveries are compilations of information on how the articles are being delivered to the customers.</p>
   */
   public java.util.List<com.commercetools.api.models.order.Delivery> getDeliveries(){
      return this.deliveries;
   }
   
   
   public com.commercetools.api.models.cart.DiscountedLineItemPrice getDiscountedPrice(){
      return this.discountedPrice;
   }
   
   /**
   *  <p>Indicates whether the ShippingMethod referenced in this ShippingInfo is allowed for the cart or not.</p>
   */
   public com.commercetools.api.models.cart.ShippingMethodState getShippingMethodState(){
      return this.shippingMethodState;
   }

   public void setShippingMethodName(final String shippingMethodName){
      this.shippingMethodName = shippingMethodName;
   }
   
   public void setPrice(final com.commercetools.api.models.common.TypedMoney price){
      this.price = price;
   }
   
   public void setShippingRate(final com.commercetools.api.models.shipping_method.ShippingRate shippingRate){
      this.shippingRate = shippingRate;
   }
   
   public void setTaxedPrice(final com.commercetools.api.models.cart.TaxedItemPrice taxedPrice){
      this.taxedPrice = taxedPrice;
   }
   
   public void setTaxRate(final com.commercetools.api.models.tax_category.TaxRate taxRate){
      this.taxRate = taxRate;
   }
   
   public void setTaxCategory(final com.commercetools.api.models.tax_category.TaxCategoryReference taxCategory){
      this.taxCategory = taxCategory;
   }
   
   public void setShippingMethod(final com.commercetools.api.models.shipping_method.ShippingMethodReference shippingMethod){
      this.shippingMethod = shippingMethod;
   }
   
   public void setDeliveries(final java.util.List<com.commercetools.api.models.order.Delivery> deliveries){
      this.deliveries = deliveries;
   }
   
   public void setDiscountedPrice(final com.commercetools.api.models.cart.DiscountedLineItemPrice discountedPrice){
      this.discountedPrice = discountedPrice;
   }
   
   public void setShippingMethodState(final com.commercetools.api.models.cart.ShippingMethodState shippingMethodState){
      this.shippingMethodState = shippingMethodState;
   }

}

package com.commercetools.api.models.me;

import com.commercetools.api.models.cart.CartOrigin;
import com.commercetools.api.models.cart.CartReference;
import com.commercetools.api.models.cart.CustomLineItem;
import com.commercetools.api.models.cart.DiscountCodeInfo;
import com.commercetools.api.models.cart.InventoryMode;
import com.commercetools.api.models.cart.LineItem;
import com.commercetools.api.models.cart.RoundingMode;
import com.commercetools.api.models.cart.ShippingInfo;
import com.commercetools.api.models.cart.ShippingRateInput;
import com.commercetools.api.models.cart.TaxCalculationMode;
import com.commercetools.api.models.cart.TaxMode;
import com.commercetools.api.models.cart.TaxedPrice;
import com.commercetools.api.models.cart_discount.CartDiscountReference;
import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.common.TypedMoney;
import com.commercetools.api.models.customer_group.CustomerGroupReference;
import com.commercetools.api.models.order.OrderState;
import com.commercetools.api.models.order.PaymentInfo;
import com.commercetools.api.models.order.PaymentState;
import com.commercetools.api.models.order.ReturnInfo;
import com.commercetools.api.models.order.ShipmentState;
import com.commercetools.api.models.order.SyncInfo;
import com.commercetools.api.models.state.StateReference;
import com.commercetools.api.models.store.StoreKeyReference;
import com.commercetools.api.models.type.CustomFields;
import java.time.ZonedDateTime;
import com.commercetools.api.models.me.MyOrder;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MyOrderBuilder {
   
   
   private String id;
   
   
   private Long version;
   
   
   private java.time.ZonedDateTime createdAt;
   
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   @Nullable
   private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;
   
   @Nullable
   private com.commercetools.api.models.common.CreatedBy createdBy;
   
   @Nullable
   private java.time.ZonedDateTime completedAt;
   
   @Nullable
   private String orderNumber;
   
   @Nullable
   private String customerId;
   
   @Nullable
   private String customerEmail;
   
   @Nullable
   private String anonymousId;
   
   @Nullable
   private com.commercetools.api.models.store.StoreKeyReference store;
   
   
   private java.util.List<com.commercetools.api.models.cart.LineItem> lineItems;
   
   
   private java.util.List<com.commercetools.api.models.cart.CustomLineItem> customLineItems;
   
   
   private com.commercetools.api.models.common.TypedMoney totalPrice;
   
   @Nullable
   private com.commercetools.api.models.cart.TaxedPrice taxedPrice;
   
   @Nullable
   private com.commercetools.api.models.common.Address shippingAddress;
   
   @Nullable
   private com.commercetools.api.models.common.Address billingAddress;
   
   @Nullable
   private com.commercetools.api.models.cart.TaxMode taxMode;
   
   @Nullable
   private com.commercetools.api.models.cart.RoundingMode taxRoundingMode;
   
   @Nullable
   private com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup;
   
   @Nullable
   private String country;
   
   
   private com.commercetools.api.models.order.OrderState orderState;
   
   @Nullable
   private com.commercetools.api.models.state.StateReference state;
   
   @Nullable
   private com.commercetools.api.models.order.ShipmentState shipmentState;
   
   @Nullable
   private com.commercetools.api.models.order.PaymentState paymentState;
   
   @Nullable
   private com.commercetools.api.models.cart.ShippingInfo shippingInfo;
   
   
   private java.util.List<com.commercetools.api.models.order.SyncInfo> syncInfo;
   
   @Nullable
   private java.util.List<com.commercetools.api.models.order.ReturnInfo> returnInfo;
   
   @Nullable
   private java.util.List<com.commercetools.api.models.cart.DiscountCodeInfo> discountCodes;
   
   
   private Long lastMessageSequenceNumber;
   
   @Nullable
   private com.commercetools.api.models.cart.CartReference cart;
   
   @Nullable
   private com.commercetools.api.models.type.CustomFields custom;
   
   @Nullable
   private com.commercetools.api.models.order.PaymentInfo paymentInfo;
   
   @Nullable
   private String locale;
   
   @Nullable
   private com.commercetools.api.models.cart.InventoryMode inventoryMode;
   
   
   private com.commercetools.api.models.cart.CartOrigin origin;
   
   @Nullable
   private com.commercetools.api.models.cart.TaxCalculationMode taxCalculationMode;
   
   @Nullable
   private com.commercetools.api.models.cart.ShippingRateInput shippingRateInput;
   
   @Nullable
   private java.util.List<com.commercetools.api.models.common.Address> itemShippingAddresses;
   
   
   private java.util.List<com.commercetools.api.models.cart_discount.CartDiscountReference> refusedGifts;
   
   public MyOrderBuilder id( final String id) {
      this.id = id;
      return this;
   }
   
   public MyOrderBuilder version( final Long version) {
      this.version = version;
      return this;
   }
   
   public MyOrderBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public MyOrderBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }
   
   public MyOrderBuilder lastModifiedBy(@Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
      this.lastModifiedBy = lastModifiedBy;
      return this;
   }
   
   public MyOrderBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
      this.createdBy = createdBy;
      return this;
   }
   
   public MyOrderBuilder completedAt(@Nullable final java.time.ZonedDateTime completedAt) {
      this.completedAt = completedAt;
      return this;
   }
   
   public MyOrderBuilder orderNumber(@Nullable final String orderNumber) {
      this.orderNumber = orderNumber;
      return this;
   }
   
   public MyOrderBuilder customerId(@Nullable final String customerId) {
      this.customerId = customerId;
      return this;
   }
   
   public MyOrderBuilder customerEmail(@Nullable final String customerEmail) {
      this.customerEmail = customerEmail;
      return this;
   }
   
   public MyOrderBuilder anonymousId(@Nullable final String anonymousId) {
      this.anonymousId = anonymousId;
      return this;
   }
   
   public MyOrderBuilder store(@Nullable final com.commercetools.api.models.store.StoreKeyReference store) {
      this.store = store;
      return this;
   }
   
   public MyOrderBuilder lineItems( final java.util.List<com.commercetools.api.models.cart.LineItem> lineItems) {
      this.lineItems = lineItems;
      return this;
   }
   
   public MyOrderBuilder customLineItems( final java.util.List<com.commercetools.api.models.cart.CustomLineItem> customLineItems) {
      this.customLineItems = customLineItems;
      return this;
   }
   
   public MyOrderBuilder totalPrice( final com.commercetools.api.models.common.TypedMoney totalPrice) {
      this.totalPrice = totalPrice;
      return this;
   }
   
   public MyOrderBuilder taxedPrice(@Nullable final com.commercetools.api.models.cart.TaxedPrice taxedPrice) {
      this.taxedPrice = taxedPrice;
      return this;
   }
   
   public MyOrderBuilder shippingAddress(@Nullable final com.commercetools.api.models.common.Address shippingAddress) {
      this.shippingAddress = shippingAddress;
      return this;
   }
   
   public MyOrderBuilder billingAddress(@Nullable final com.commercetools.api.models.common.Address billingAddress) {
      this.billingAddress = billingAddress;
      return this;
   }
   
   public MyOrderBuilder taxMode(@Nullable final com.commercetools.api.models.cart.TaxMode taxMode) {
      this.taxMode = taxMode;
      return this;
   }
   
   public MyOrderBuilder taxRoundingMode(@Nullable final com.commercetools.api.models.cart.RoundingMode taxRoundingMode) {
      this.taxRoundingMode = taxRoundingMode;
      return this;
   }
   
   public MyOrderBuilder customerGroup(@Nullable final com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup) {
      this.customerGroup = customerGroup;
      return this;
   }
   
   public MyOrderBuilder country(@Nullable final String country) {
      this.country = country;
      return this;
   }
   
   public MyOrderBuilder orderState( final com.commercetools.api.models.order.OrderState orderState) {
      this.orderState = orderState;
      return this;
   }
   
   public MyOrderBuilder state(@Nullable final com.commercetools.api.models.state.StateReference state) {
      this.state = state;
      return this;
   }
   
   public MyOrderBuilder shipmentState(@Nullable final com.commercetools.api.models.order.ShipmentState shipmentState) {
      this.shipmentState = shipmentState;
      return this;
   }
   
   public MyOrderBuilder paymentState(@Nullable final com.commercetools.api.models.order.PaymentState paymentState) {
      this.paymentState = paymentState;
      return this;
   }
   
   public MyOrderBuilder shippingInfo(@Nullable final com.commercetools.api.models.cart.ShippingInfo shippingInfo) {
      this.shippingInfo = shippingInfo;
      return this;
   }
   
   public MyOrderBuilder syncInfo( final java.util.List<com.commercetools.api.models.order.SyncInfo> syncInfo) {
      this.syncInfo = syncInfo;
      return this;
   }
   
   public MyOrderBuilder returnInfo(@Nullable final java.util.List<com.commercetools.api.models.order.ReturnInfo> returnInfo) {
      this.returnInfo = returnInfo;
      return this;
   }
   
   public MyOrderBuilder discountCodes(@Nullable final java.util.List<com.commercetools.api.models.cart.DiscountCodeInfo> discountCodes) {
      this.discountCodes = discountCodes;
      return this;
   }
   
   public MyOrderBuilder lastMessageSequenceNumber( final Long lastMessageSequenceNumber) {
      this.lastMessageSequenceNumber = lastMessageSequenceNumber;
      return this;
   }
   
   public MyOrderBuilder cart(@Nullable final com.commercetools.api.models.cart.CartReference cart) {
      this.cart = cart;
      return this;
   }
   
   public MyOrderBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFields custom) {
      this.custom = custom;
      return this;
   }
   
   public MyOrderBuilder paymentInfo(@Nullable final com.commercetools.api.models.order.PaymentInfo paymentInfo) {
      this.paymentInfo = paymentInfo;
      return this;
   }
   
   public MyOrderBuilder locale(@Nullable final String locale) {
      this.locale = locale;
      return this;
   }
   
   public MyOrderBuilder inventoryMode(@Nullable final com.commercetools.api.models.cart.InventoryMode inventoryMode) {
      this.inventoryMode = inventoryMode;
      return this;
   }
   
   public MyOrderBuilder origin( final com.commercetools.api.models.cart.CartOrigin origin) {
      this.origin = origin;
      return this;
   }
   
   public MyOrderBuilder taxCalculationMode(@Nullable final com.commercetools.api.models.cart.TaxCalculationMode taxCalculationMode) {
      this.taxCalculationMode = taxCalculationMode;
      return this;
   }
   
   public MyOrderBuilder shippingRateInput(@Nullable final com.commercetools.api.models.cart.ShippingRateInput shippingRateInput) {
      this.shippingRateInput = shippingRateInput;
      return this;
   }
   
   public MyOrderBuilder itemShippingAddresses(@Nullable final java.util.List<com.commercetools.api.models.common.Address> itemShippingAddresses) {
      this.itemShippingAddresses = itemShippingAddresses;
      return this;
   }
   
   public MyOrderBuilder refusedGifts( final java.util.List<com.commercetools.api.models.cart_discount.CartDiscountReference> refusedGifts) {
      this.refusedGifts = refusedGifts;
      return this;
   }
   
   
   public String getId(){
      return this.id;
   }
   
   
   public Long getVersion(){
      return this.version;
   }
   
   
   public java.time.ZonedDateTime getCreatedAt(){
      return this.createdAt;
   }
   
   
   public java.time.ZonedDateTime getLastModifiedAt(){
      return this.lastModifiedAt;
   }
   
   @Nullable
   public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy(){
      return this.lastModifiedBy;
   }
   
   @Nullable
   public com.commercetools.api.models.common.CreatedBy getCreatedBy(){
      return this.createdBy;
   }
   
   @Nullable
   public java.time.ZonedDateTime getCompletedAt(){
      return this.completedAt;
   }
   
   @Nullable
   public String getOrderNumber(){
      return this.orderNumber;
   }
   
   @Nullable
   public String getCustomerId(){
      return this.customerId;
   }
   
   @Nullable
   public String getCustomerEmail(){
      return this.customerEmail;
   }
   
   @Nullable
   public String getAnonymousId(){
      return this.anonymousId;
   }
   
   @Nullable
   public com.commercetools.api.models.store.StoreKeyReference getStore(){
      return this.store;
   }
   
   
   public java.util.List<com.commercetools.api.models.cart.LineItem> getLineItems(){
      return this.lineItems;
   }
   
   
   public java.util.List<com.commercetools.api.models.cart.CustomLineItem> getCustomLineItems(){
      return this.customLineItems;
   }
   
   
   public com.commercetools.api.models.common.TypedMoney getTotalPrice(){
      return this.totalPrice;
   }
   
   @Nullable
   public com.commercetools.api.models.cart.TaxedPrice getTaxedPrice(){
      return this.taxedPrice;
   }
   
   @Nullable
   public com.commercetools.api.models.common.Address getShippingAddress(){
      return this.shippingAddress;
   }
   
   @Nullable
   public com.commercetools.api.models.common.Address getBillingAddress(){
      return this.billingAddress;
   }
   
   @Nullable
   public com.commercetools.api.models.cart.TaxMode getTaxMode(){
      return this.taxMode;
   }
   
   @Nullable
   public com.commercetools.api.models.cart.RoundingMode getTaxRoundingMode(){
      return this.taxRoundingMode;
   }
   
   @Nullable
   public com.commercetools.api.models.customer_group.CustomerGroupReference getCustomerGroup(){
      return this.customerGroup;
   }
   
   @Nullable
   public String getCountry(){
      return this.country;
   }
   
   
   public com.commercetools.api.models.order.OrderState getOrderState(){
      return this.orderState;
   }
   
   @Nullable
   public com.commercetools.api.models.state.StateReference getState(){
      return this.state;
   }
   
   @Nullable
   public com.commercetools.api.models.order.ShipmentState getShipmentState(){
      return this.shipmentState;
   }
   
   @Nullable
   public com.commercetools.api.models.order.PaymentState getPaymentState(){
      return this.paymentState;
   }
   
   @Nullable
   public com.commercetools.api.models.cart.ShippingInfo getShippingInfo(){
      return this.shippingInfo;
   }
   
   
   public java.util.List<com.commercetools.api.models.order.SyncInfo> getSyncInfo(){
      return this.syncInfo;
   }
   
   @Nullable
   public java.util.List<com.commercetools.api.models.order.ReturnInfo> getReturnInfo(){
      return this.returnInfo;
   }
   
   @Nullable
   public java.util.List<com.commercetools.api.models.cart.DiscountCodeInfo> getDiscountCodes(){
      return this.discountCodes;
   }
   
   
   public Long getLastMessageSequenceNumber(){
      return this.lastMessageSequenceNumber;
   }
   
   @Nullable
   public com.commercetools.api.models.cart.CartReference getCart(){
      return this.cart;
   }
   
   @Nullable
   public com.commercetools.api.models.type.CustomFields getCustom(){
      return this.custom;
   }
   
   @Nullable
   public com.commercetools.api.models.order.PaymentInfo getPaymentInfo(){
      return this.paymentInfo;
   }
   
   @Nullable
   public String getLocale(){
      return this.locale;
   }
   
   @Nullable
   public com.commercetools.api.models.cart.InventoryMode getInventoryMode(){
      return this.inventoryMode;
   }
   
   
   public com.commercetools.api.models.cart.CartOrigin getOrigin(){
      return this.origin;
   }
   
   @Nullable
   public com.commercetools.api.models.cart.TaxCalculationMode getTaxCalculationMode(){
      return this.taxCalculationMode;
   }
   
   @Nullable
   public com.commercetools.api.models.cart.ShippingRateInput getShippingRateInput(){
      return this.shippingRateInput;
   }
   
   @Nullable
   public java.util.List<com.commercetools.api.models.common.Address> getItemShippingAddresses(){
      return this.itemShippingAddresses;
   }
   
   
   public java.util.List<com.commercetools.api.models.cart_discount.CartDiscountReference> getRefusedGifts(){
      return this.refusedGifts;
   }

   public MyOrder build() {
       return new MyOrderImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, completedAt, orderNumber, customerId, customerEmail, anonymousId, store, lineItems, customLineItems, totalPrice, taxedPrice, shippingAddress, billingAddress, taxMode, taxRoundingMode, customerGroup, country, orderState, state, shipmentState, paymentState, shippingInfo, syncInfo, returnInfo, discountCodes, lastMessageSequenceNumber, cart, custom, paymentInfo, locale, inventoryMode, origin, taxCalculationMode, shippingRateInput, itemShippingAddresses, refusedGifts);
   }
   
   public static MyOrderBuilder of() {
      return new MyOrderBuilder();
   }
   
   public static MyOrderBuilder of(final MyOrder template) {
      MyOrderBuilder builder = new MyOrderBuilder();
      builder.id = template.getId();
      builder.version = template.getVersion();
      builder.createdAt = template.getCreatedAt();
      builder.lastModifiedAt = template.getLastModifiedAt();
      builder.lastModifiedBy = template.getLastModifiedBy();
      builder.createdBy = template.getCreatedBy();
      builder.completedAt = template.getCompletedAt();
      builder.orderNumber = template.getOrderNumber();
      builder.customerId = template.getCustomerId();
      builder.customerEmail = template.getCustomerEmail();
      builder.anonymousId = template.getAnonymousId();
      builder.store = template.getStore();
      builder.lineItems = template.getLineItems();
      builder.customLineItems = template.getCustomLineItems();
      builder.totalPrice = template.getTotalPrice();
      builder.taxedPrice = template.getTaxedPrice();
      builder.shippingAddress = template.getShippingAddress();
      builder.billingAddress = template.getBillingAddress();
      builder.taxMode = template.getTaxMode();
      builder.taxRoundingMode = template.getTaxRoundingMode();
      builder.customerGroup = template.getCustomerGroup();
      builder.country = template.getCountry();
      builder.orderState = template.getOrderState();
      builder.state = template.getState();
      builder.shipmentState = template.getShipmentState();
      builder.paymentState = template.getPaymentState();
      builder.shippingInfo = template.getShippingInfo();
      builder.syncInfo = template.getSyncInfo();
      builder.returnInfo = template.getReturnInfo();
      builder.discountCodes = template.getDiscountCodes();
      builder.lastMessageSequenceNumber = template.getLastMessageSequenceNumber();
      builder.cart = template.getCart();
      builder.custom = template.getCustom();
      builder.paymentInfo = template.getPaymentInfo();
      builder.locale = template.getLocale();
      builder.inventoryMode = template.getInventoryMode();
      builder.origin = template.getOrigin();
      builder.taxCalculationMode = template.getTaxCalculationMode();
      builder.shippingRateInput = template.getShippingRateInput();
      builder.itemShippingAddresses = template.getItemShippingAddresses();
      builder.refusedGifts = template.getRefusedGifts();
      return builder;
   }
   
}

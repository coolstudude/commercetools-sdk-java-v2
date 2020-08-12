package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order.Order;
import com.commercetools.api.models.order_edit.StagedOrderImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = StagedOrderImpl.class)
public interface StagedOrder extends Order {


   
   public static StagedOrderImpl of(){
      return new StagedOrderImpl();
   }
   

   public static StagedOrderImpl of(final StagedOrder template) {
      StagedOrderImpl instance = new StagedOrderImpl();
      instance.setId(template.getId());
      instance.setVersion(template.getVersion());
      instance.setCreatedAt(template.getCreatedAt());
      instance.setLastModifiedAt(template.getLastModifiedAt());
      instance.setLastModifiedBy(template.getLastModifiedBy());
      instance.setCreatedBy(template.getCreatedBy());
      instance.setCompletedAt(template.getCompletedAt());
      instance.setOrderNumber(template.getOrderNumber());
      instance.setCustomerId(template.getCustomerId());
      instance.setCustomerEmail(template.getCustomerEmail());
      instance.setAnonymousId(template.getAnonymousId());
      instance.setStore(template.getStore());
      instance.setLineItems(template.getLineItems());
      instance.setCustomLineItems(template.getCustomLineItems());
      instance.setTotalPrice(template.getTotalPrice());
      instance.setTaxedPrice(template.getTaxedPrice());
      instance.setShippingAddress(template.getShippingAddress());
      instance.setBillingAddress(template.getBillingAddress());
      instance.setTaxMode(template.getTaxMode());
      instance.setTaxRoundingMode(template.getTaxRoundingMode());
      instance.setCustomerGroup(template.getCustomerGroup());
      instance.setCountry(template.getCountry());
      instance.setOrderState(template.getOrderState());
      instance.setState(template.getState());
      instance.setShipmentState(template.getShipmentState());
      instance.setPaymentState(template.getPaymentState());
      instance.setShippingInfo(template.getShippingInfo());
      instance.setSyncInfo(template.getSyncInfo());
      instance.setReturnInfo(template.getReturnInfo());
      instance.setDiscountCodes(template.getDiscountCodes());
      instance.setLastMessageSequenceNumber(template.getLastMessageSequenceNumber());
      instance.setCart(template.getCart());
      instance.setCustom(template.getCustom());
      instance.setPaymentInfo(template.getPaymentInfo());
      instance.setLocale(template.getLocale());
      instance.setInventoryMode(template.getInventoryMode());
      instance.setOrigin(template.getOrigin());
      instance.setTaxCalculationMode(template.getTaxCalculationMode());
      instance.setShippingRateInput(template.getShippingRateInput());
      instance.setItemShippingAddresses(template.getItemShippingAddresses());
      instance.setRefusedGifts(template.getRefusedGifts());
      return instance;
   }

}

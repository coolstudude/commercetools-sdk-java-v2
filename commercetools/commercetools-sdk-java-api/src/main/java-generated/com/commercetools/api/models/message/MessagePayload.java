
package com.commercetools.api.models.message;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.message.CategoryCreatedMessagePayload;
import com.commercetools.api.models.message.CategorySlugChangedMessagePayload;
import com.commercetools.api.models.message.CustomLineItemStateTransitionMessagePayload;
import com.commercetools.api.models.message.CustomerAddressAddedMessagePayload;
import com.commercetools.api.models.message.CustomerAddressChangedMessagePayload;
import com.commercetools.api.models.message.CustomerAddressRemovedMessagePayload;
import com.commercetools.api.models.message.CustomerCompanyNameSetMessagePayload;
import com.commercetools.api.models.message.CustomerCreatedMessagePayload;
import com.commercetools.api.models.message.CustomerDateOfBirthSetMessagePayload;
import com.commercetools.api.models.message.CustomerEmailChangedMessagePayload;
import com.commercetools.api.models.message.CustomerEmailVerifiedMessagePayload;
import com.commercetools.api.models.message.CustomerGroupSetMessagePayload;
import com.commercetools.api.models.message.CustomerPasswordUpdatedMessagePayload;
import com.commercetools.api.models.message.DeliveryAddedMessagePayload;
import com.commercetools.api.models.message.DeliveryAddressSetMessagePayload;
import com.commercetools.api.models.message.DeliveryItemsUpdatedMessagePayload;
import com.commercetools.api.models.message.DeliveryRemovedMessagePayload;
import com.commercetools.api.models.message.InventoryEntryCreatedMessagePayload;
import com.commercetools.api.models.message.InventoryEntryDeletedMessagePayload;
import com.commercetools.api.models.message.InventoryEntryQuantitySetMessagePayload;
import com.commercetools.api.models.message.LineItemStateTransitionMessagePayload;
import com.commercetools.api.models.message.OrderBillingAddressSetMessagePayload;
import com.commercetools.api.models.message.OrderCreatedMessagePayload;
import com.commercetools.api.models.message.OrderCustomLineItemDiscountSetMessagePayload;
import com.commercetools.api.models.message.OrderCustomerEmailSetMessagePayload;
import com.commercetools.api.models.message.OrderCustomerGroupSetMessagePayload;
import com.commercetools.api.models.message.OrderCustomerSetMessagePayload;
import com.commercetools.api.models.message.OrderDeletedMessagePayload;
import com.commercetools.api.models.message.OrderDiscountCodeAddedMessagePayload;
import com.commercetools.api.models.message.OrderDiscountCodeRemovedMessagePayload;
import com.commercetools.api.models.message.OrderDiscountCodeStateSetMessagePayload;
import com.commercetools.api.models.message.OrderEditAppliedMessagePayload;
import com.commercetools.api.models.message.OrderImportedMessagePayload;
import com.commercetools.api.models.message.OrderLineItemAddedMessagePayload;
import com.commercetools.api.models.message.OrderLineItemDiscountSetMessagePayload;
import com.commercetools.api.models.message.OrderPaymentStateChangedMessagePayload;
import com.commercetools.api.models.message.OrderReturnInfoAddedMessagePayload;
import com.commercetools.api.models.message.OrderReturnShipmentStateChangedMessagePayload;
import com.commercetools.api.models.message.OrderShipmentStateChangedMessagePayload;
import com.commercetools.api.models.message.OrderShippingAddressSetMessagePayload;
import com.commercetools.api.models.message.OrderShippingInfoSetMessagePayload;
import com.commercetools.api.models.message.OrderShippingRateInputSetMessagePayload;
import com.commercetools.api.models.message.OrderStateChangedMessagePayload;
import com.commercetools.api.models.message.OrderStateTransitionMessagePayload;
import com.commercetools.api.models.message.OrderStoreSetMessagePayload;
import com.commercetools.api.models.message.ParcelAddedToDeliveryMessagePayload;
import com.commercetools.api.models.message.ParcelItemsUpdatedMessagePayload;
import com.commercetools.api.models.message.ParcelMeasurementsUpdatedMessagePayload;
import com.commercetools.api.models.message.ParcelRemovedFromDeliveryMessagePayload;
import com.commercetools.api.models.message.ParcelTrackingDataUpdatedMessagePayload;
import com.commercetools.api.models.message.PaymentCreatedMessagePayload;
import com.commercetools.api.models.message.PaymentInteractionAddedMessagePayload;
import com.commercetools.api.models.message.PaymentStatusInterfaceCodeSetMessagePayload;
import com.commercetools.api.models.message.PaymentStatusStateTransitionMessagePayload;
import com.commercetools.api.models.message.PaymentTransactionAddedMessagePayload;
import com.commercetools.api.models.message.PaymentTransactionStateChangedMessagePayload;
import com.commercetools.api.models.message.ProductAddedToCategoryMessagePayload;
import com.commercetools.api.models.message.ProductCreatedMessagePayload;
import com.commercetools.api.models.message.ProductDeletedMessagePayload;
import com.commercetools.api.models.message.ProductImageAddedMessagePayload;
import com.commercetools.api.models.message.ProductPriceDiscountsSetMessagePayload;
import com.commercetools.api.models.message.ProductPriceExternalDiscountSetMessagePayload;
import com.commercetools.api.models.message.ProductPublishedMessagePayload;
import com.commercetools.api.models.message.ProductRemovedFromCategoryMessagePayload;
import com.commercetools.api.models.message.ProductRevertedStagedChangesMessagePayload;
import com.commercetools.api.models.message.ProductSlugChangedMessagePayload;
import com.commercetools.api.models.message.ProductStateTransitionMessagePayload;
import com.commercetools.api.models.message.ProductUnpublishedMessagePayload;
import com.commercetools.api.models.message.ProductVariantAddedMessagePayload;
import com.commercetools.api.models.message.ProductVariantDeletedMessagePayload;
import com.commercetools.api.models.message.ReviewCreatedMessagePayload;
import com.commercetools.api.models.message.ReviewRatingSetMessagePayload;
import com.commercetools.api.models.message.ReviewStateTransitionMessagePayload;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CategoryCreatedMessagePayloadImpl.class, name = CategoryCreatedMessagePayload.CATEGORY_CREATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CategorySlugChangedMessagePayloadImpl.class, name = CategorySlugChangedMessagePayload.CATEGORY_SLUG_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomLineItemStateTransitionMessagePayloadImpl.class, name = CustomLineItemStateTransitionMessagePayload.CUSTOM_LINE_ITEM_STATE_TRANSITION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerAddressAddedMessagePayloadImpl.class, name = CustomerAddressAddedMessagePayload.CUSTOMER_ADDRESS_ADDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerAddressChangedMessagePayloadImpl.class, name = CustomerAddressChangedMessagePayload.CUSTOMER_ADDRESS_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerAddressRemovedMessagePayloadImpl.class, name = CustomerAddressRemovedMessagePayload.CUSTOMER_ADDRESS_REMOVED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerCompanyNameSetMessagePayloadImpl.class, name = CustomerCompanyNameSetMessagePayload.CUSTOMER_COMPANY_NAME_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerCreatedMessagePayloadImpl.class, name = CustomerCreatedMessagePayload.CUSTOMER_CREATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerDateOfBirthSetMessagePayloadImpl.class, name = CustomerDateOfBirthSetMessagePayload.CUSTOMER_DATE_OF_BIRTH_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerEmailChangedMessagePayloadImpl.class, name = CustomerEmailChangedMessagePayload.CUSTOMER_EMAIL_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerEmailVerifiedMessagePayloadImpl.class, name = CustomerEmailVerifiedMessagePayload.CUSTOMER_EMAIL_VERIFIED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerGroupSetMessagePayloadImpl.class, name = CustomerGroupSetMessagePayload.CUSTOMER_GROUP_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerPasswordUpdatedMessagePayloadImpl.class, name = CustomerPasswordUpdatedMessagePayload.CUSTOMER_PASSWORD_UPDATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.DeliveryAddedMessagePayloadImpl.class, name = DeliveryAddedMessagePayload.DELIVERY_ADDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.DeliveryAddressSetMessagePayloadImpl.class, name = DeliveryAddressSetMessagePayload.DELIVERY_ADDRESS_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.DeliveryItemsUpdatedMessagePayloadImpl.class, name = DeliveryItemsUpdatedMessagePayload.DELIVERY_ITEMS_UPDATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.DeliveryRemovedMessagePayloadImpl.class, name = DeliveryRemovedMessagePayload.DELIVERY_REMOVED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.InventoryEntryCreatedMessagePayloadImpl.class, name = InventoryEntryCreatedMessagePayload.INVENTORY_ENTRY_CREATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.InventoryEntryDeletedMessagePayloadImpl.class, name = InventoryEntryDeletedMessagePayload.INVENTORY_ENTRY_DELETED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.InventoryEntryQuantitySetMessagePayloadImpl.class, name = InventoryEntryQuantitySetMessagePayload.INVENTORY_ENTRY_QUANTITY_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.LineItemStateTransitionMessagePayloadImpl.class, name = LineItemStateTransitionMessagePayload.LINE_ITEM_STATE_TRANSITION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderBillingAddressSetMessagePayloadImpl.class, name = OrderBillingAddressSetMessagePayload.ORDER_BILLING_ADDRESS_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderCreatedMessagePayloadImpl.class, name = OrderCreatedMessagePayload.ORDER_CREATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderCustomLineItemDiscountSetMessagePayloadImpl.class, name = OrderCustomLineItemDiscountSetMessagePayload.ORDER_CUSTOM_LINE_ITEM_DISCOUNT_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderCustomerEmailSetMessagePayloadImpl.class, name = OrderCustomerEmailSetMessagePayload.ORDER_CUSTOMER_EMAIL_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderCustomerGroupSetMessagePayloadImpl.class, name = OrderCustomerGroupSetMessagePayload.ORDER_CUSTOMER_GROUP_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderCustomerSetMessagePayloadImpl.class, name = OrderCustomerSetMessagePayload.ORDER_CUSTOMER_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderDeletedMessagePayloadImpl.class, name = OrderDeletedMessagePayload.ORDER_DELETED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderDiscountCodeAddedMessagePayloadImpl.class, name = OrderDiscountCodeAddedMessagePayload.ORDER_DISCOUNT_CODE_ADDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderDiscountCodeRemovedMessagePayloadImpl.class, name = OrderDiscountCodeRemovedMessagePayload.ORDER_DISCOUNT_CODE_REMOVED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderDiscountCodeStateSetMessagePayloadImpl.class, name = OrderDiscountCodeStateSetMessagePayload.ORDER_DISCOUNT_CODE_STATE_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderEditAppliedMessagePayloadImpl.class, name = OrderEditAppliedMessagePayload.ORDER_EDIT_APPLIED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderImportedMessagePayloadImpl.class, name = OrderImportedMessagePayload.ORDER_IMPORTED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderLineItemAddedMessagePayloadImpl.class, name = OrderLineItemAddedMessagePayload.ORDER_LINE_ITEM_ADDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderLineItemDiscountSetMessagePayloadImpl.class, name = OrderLineItemDiscountSetMessagePayload.ORDER_LINE_ITEM_DISCOUNT_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderPaymentStateChangedMessagePayloadImpl.class, name = OrderPaymentStateChangedMessagePayload.ORDER_PAYMENT_STATE_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderReturnInfoAddedMessagePayloadImpl.class, name = OrderReturnInfoAddedMessagePayload.RETURN_INFO_ADDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderReturnShipmentStateChangedMessagePayloadImpl.class, name = OrderReturnShipmentStateChangedMessagePayload.ORDER_RETURN_SHIPMENT_STATE_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderShipmentStateChangedMessagePayloadImpl.class, name = OrderShipmentStateChangedMessagePayload.ORDER_SHIPMENT_STATE_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderShippingAddressSetMessagePayloadImpl.class, name = OrderShippingAddressSetMessagePayload.ORDER_SHIPPING_ADDRESS_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderShippingInfoSetMessagePayloadImpl.class, name = OrderShippingInfoSetMessagePayload.ORDER_SHIPPING_INFO_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderShippingRateInputSetMessagePayloadImpl.class, name = OrderShippingRateInputSetMessagePayload.ORDER_SHIPPING_RATE_INPUT_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderStateChangedMessagePayloadImpl.class, name = OrderStateChangedMessagePayload.ORDER_STATE_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderStateTransitionMessagePayloadImpl.class, name = OrderStateTransitionMessagePayload.ORDER_STATE_TRANSITION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderStoreSetMessagePayloadImpl.class, name = OrderStoreSetMessagePayload.ORDER_STORE_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ParcelAddedToDeliveryMessagePayloadImpl.class, name = ParcelAddedToDeliveryMessagePayload.PARCEL_ADDED_TO_DELIVERY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ParcelItemsUpdatedMessagePayloadImpl.class, name = ParcelItemsUpdatedMessagePayload.PARCEL_ITEMS_UPDATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ParcelMeasurementsUpdatedMessagePayloadImpl.class, name = ParcelMeasurementsUpdatedMessagePayload.PARCEL_MEASUREMENTS_UPDATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ParcelRemovedFromDeliveryMessagePayloadImpl.class, name = ParcelRemovedFromDeliveryMessagePayload.PARCEL_REMOVED_FROM_DELIVERY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ParcelTrackingDataUpdatedMessagePayloadImpl.class, name = ParcelTrackingDataUpdatedMessagePayload.PARCEL_TRACKING_DATA_UPDATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.PaymentCreatedMessagePayloadImpl.class, name = PaymentCreatedMessagePayload.PAYMENT_CREATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.PaymentInteractionAddedMessagePayloadImpl.class, name = PaymentInteractionAddedMessagePayload.PAYMENT_INTERACTION_ADDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.PaymentStatusInterfaceCodeSetMessagePayloadImpl.class, name = PaymentStatusInterfaceCodeSetMessagePayload.PAYMENT_STATUS_INTERFACE_CODE_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.PaymentStatusStateTransitionMessagePayloadImpl.class, name = PaymentStatusStateTransitionMessagePayload.PAYMENT_STATUS_STATE_TRANSITION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.PaymentTransactionAddedMessagePayloadImpl.class, name = PaymentTransactionAddedMessagePayload.PAYMENT_TRANSACTION_ADDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.PaymentTransactionStateChangedMessagePayloadImpl.class, name = PaymentTransactionStateChangedMessagePayload.PAYMENT_TRANSACTION_STATE_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductAddedToCategoryMessagePayloadImpl.class, name = ProductAddedToCategoryMessagePayload.PRODUCT_ADDED_TO_CATEGORY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductCreatedMessagePayloadImpl.class, name = ProductCreatedMessagePayload.PRODUCT_CREATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductDeletedMessagePayloadImpl.class, name = ProductDeletedMessagePayload.PRODUCT_DELETED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductImageAddedMessagePayloadImpl.class, name = ProductImageAddedMessagePayload.PRODUCT_IMAGE_ADDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductPriceDiscountsSetMessagePayloadImpl.class, name = ProductPriceDiscountsSetMessagePayload.PRODUCT_PRICE_DISCOUNTS_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductPriceExternalDiscountSetMessagePayloadImpl.class, name = ProductPriceExternalDiscountSetMessagePayload.PRODUCT_PRICE_EXTERNAL_DISCOUNT_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductPublishedMessagePayloadImpl.class, name = ProductPublishedMessagePayload.PRODUCT_PUBLISHED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductRemovedFromCategoryMessagePayloadImpl.class, name = ProductRemovedFromCategoryMessagePayload.PRODUCT_REMOVED_FROM_CATEGORY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductRevertedStagedChangesMessagePayloadImpl.class, name = ProductRevertedStagedChangesMessagePayload.PRODUCT_REVERTED_STAGED_CHANGES),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductSlugChangedMessagePayloadImpl.class, name = ProductSlugChangedMessagePayload.PRODUCT_SLUG_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductStateTransitionMessagePayloadImpl.class, name = ProductStateTransitionMessagePayload.PRODUCT_STATE_TRANSITION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductUnpublishedMessagePayloadImpl.class, name = ProductUnpublishedMessagePayload.PRODUCT_UNPUBLISHED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductVariantAddedMessagePayloadImpl.class, name = ProductVariantAddedMessagePayload.PRODUCT_VARIANT_ADDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductVariantDeletedMessagePayloadImpl.class, name = ProductVariantDeletedMessagePayload.PRODUCT_VARIANT_DELETED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ReviewCreatedMessagePayloadImpl.class, name = ReviewCreatedMessagePayload.REVIEW_CREATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ReviewRatingSetMessagePayloadImpl.class, name = ReviewRatingSetMessagePayload.REVIEW_RATING_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ReviewStateTransitionMessagePayloadImpl.class, name = ReviewStateTransitionMessagePayload.REVIEW_STATE_TRANSITION) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", defaultImpl = MessagePayloadImpl.class, visible = true)
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface MessagePayload {

    @NotNull
    @JsonProperty("type")
    public String getType();

    default <T> T withMessagePayload(Function<MessagePayload, T> helper) {
        return helper.apply(this);
    }
}

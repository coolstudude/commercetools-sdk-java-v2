
package com.commercetools.api.models.message;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Base representation of a Message containing common fields to all Message Types.</p>
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Message message = Message.businessUnitAddressAddedBuilder()
 *             id("{id}")
 *             version(0.3)
 *             createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             sequenceNumber(0.3)
 *             resource(resourceBuilder -> resourceBuilder)
 *             resourceVersion(0.3)
 *             address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.BusinessUnitAddressAddedMessageImpl.class, name = BusinessUnitAddressAddedMessage.BUSINESS_UNIT_ADDRESS_ADDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.BusinessUnitAddressChangedMessageImpl.class, name = BusinessUnitAddressChangedMessage.BUSINESS_UNIT_ADDRESS_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.BusinessUnitAddressRemovedMessageImpl.class, name = BusinessUnitAddressRemovedMessage.BUSINESS_UNIT_ADDRESS_REMOVED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.BusinessUnitAssociateAddedMessageImpl.class, name = BusinessUnitAssociateAddedMessage.BUSINESS_UNIT_ASSOCIATE_ADDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.BusinessUnitAssociateChangedMessageImpl.class, name = BusinessUnitAssociateChangedMessage.BUSINESS_UNIT_ASSOCIATE_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.BusinessUnitAssociateRemovedMessageImpl.class, name = BusinessUnitAssociateRemovedMessage.BUSINESS_UNIT_ASSOCIATE_REMOVED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.BusinessUnitAssociatesSetMessageImpl.class, name = BusinessUnitAssociatesSetMessage.BUSINESS_UNIT_ASSOCIATES_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.BusinessUnitBillingAddressAddedMessageImpl.class, name = BusinessUnitBillingAddressAddedMessage.BUSINESS_UNIT_BILLING_ADDRESS_ADDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.BusinessUnitBillingAddressRemovedMessageImpl.class, name = BusinessUnitBillingAddressRemovedMessage.BUSINESS_UNIT_BILLING_ADDRESS_REMOVED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.BusinessUnitContactEmailSetMessageImpl.class, name = BusinessUnitContactEmailSetMessage.BUSINESS_UNIT_CONTACT_EMAIL_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.BusinessUnitCreatedMessageImpl.class, name = BusinessUnitCreatedMessage.BUSINESS_UNIT_CREATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.BusinessUnitDefaultBillingAddressSetMessageImpl.class, name = BusinessUnitDefaultBillingAddressSetMessage.BUSINESS_UNIT_DEFAULT_BILLING_ADDRESS_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.BusinessUnitDefaultShippingAddressSetMessageImpl.class, name = BusinessUnitDefaultShippingAddressSetMessage.BUSINESS_UNIT_DEFAULT_SHIPPING_ADDRESS_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.BusinessUnitDeletedMessageImpl.class, name = BusinessUnitDeletedMessage.BUSINESS_UNIT_DELETED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.BusinessUnitNameChangedMessageImpl.class, name = BusinessUnitNameChangedMessage.BUSINESS_UNIT_NAME_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.BusinessUnitParentUnitChangedMessageImpl.class, name = BusinessUnitParentUnitChangedMessage.BUSINESS_UNIT_PARENT_UNIT_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.BusinessUnitShippingAddressAddedMessageImpl.class, name = BusinessUnitShippingAddressAddedMessage.BUSINESS_UNIT_SHIPPING_ADDRESS_ADDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.BusinessUnitShippingAddressRemovedMessageImpl.class, name = BusinessUnitShippingAddressRemovedMessage.BUSINESS_UNIT_SHIPPING_ADDRESS_REMOVED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.BusinessUnitStatusChangedMessageImpl.class, name = BusinessUnitStatusChangedMessage.BUSINESS_UNIT_STATUS_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.BusinessUnitStoreAddedMessageImpl.class, name = BusinessUnitStoreAddedMessage.BUSINESS_UNIT_STORE_ADDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.BusinessUnitStoreModeChangedMessageImpl.class, name = BusinessUnitStoreModeChangedMessage.BUSINESS_UNIT_STORE_MODE_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.BusinessUnitStoreRemovedMessageImpl.class, name = BusinessUnitStoreRemovedMessage.BUSINESS_UNIT_STORE_REMOVED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.BusinessUnitStoresSetMessageImpl.class, name = BusinessUnitStoresSetMessage.BUSINESS_UNIT_STORES_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CategoryCreatedMessageImpl.class, name = CategoryCreatedMessage.CATEGORY_CREATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CategorySlugChangedMessageImpl.class, name = CategorySlugChangedMessage.CATEGORY_SLUG_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomLineItemStateTransitionMessageImpl.class, name = CustomLineItemStateTransitionMessage.CUSTOM_LINE_ITEM_STATE_TRANSITION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerAddressAddedMessageImpl.class, name = CustomerAddressAddedMessage.CUSTOMER_ADDRESS_ADDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerAddressChangedMessageImpl.class, name = CustomerAddressChangedMessage.CUSTOMER_ADDRESS_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerAddressRemovedMessageImpl.class, name = CustomerAddressRemovedMessage.CUSTOMER_ADDRESS_REMOVED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerCompanyNameSetMessageImpl.class, name = CustomerCompanyNameSetMessage.CUSTOMER_COMPANY_NAME_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerCreatedMessageImpl.class, name = CustomerCreatedMessage.CUSTOMER_CREATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerDateOfBirthSetMessageImpl.class, name = CustomerDateOfBirthSetMessage.CUSTOMER_DATE_OF_BIRTH_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerDeletedMessageImpl.class, name = CustomerDeletedMessage.CUSTOMER_DELETED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerEmailChangedMessageImpl.class, name = CustomerEmailChangedMessage.CUSTOMER_EMAIL_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerEmailVerifiedMessageImpl.class, name = CustomerEmailVerifiedMessage.CUSTOMER_EMAIL_VERIFIED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerFirstNameSetMessageImpl.class, name = CustomerFirstNameSetMessage.CUSTOMER_FIRST_NAME_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerGroupSetMessageImpl.class, name = CustomerGroupSetMessage.CUSTOMER_GROUP_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerLastNameSetMessageImpl.class, name = CustomerLastNameSetMessage.CUSTOMER_LAST_NAME_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerPasswordUpdatedMessageImpl.class, name = CustomerPasswordUpdatedMessage.CUSTOMER_PASSWORD_UPDATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerTitleSetMessageImpl.class, name = CustomerTitleSetMessage.CUSTOMER_TITLE_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.DeliveryAddedMessageImpl.class, name = DeliveryAddedMessage.DELIVERY_ADDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.DeliveryAddressSetMessageImpl.class, name = DeliveryAddressSetMessage.DELIVERY_ADDRESS_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.DeliveryItemsUpdatedMessageImpl.class, name = DeliveryItemsUpdatedMessage.DELIVERY_ITEMS_UPDATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.DeliveryRemovedMessageImpl.class, name = DeliveryRemovedMessage.DELIVERY_REMOVED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.InventoryEntryCreatedMessageImpl.class, name = InventoryEntryCreatedMessage.INVENTORY_ENTRY_CREATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.InventoryEntryDeletedMessageImpl.class, name = InventoryEntryDeletedMessage.INVENTORY_ENTRY_DELETED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.InventoryEntryQuantitySetMessageImpl.class, name = InventoryEntryQuantitySetMessage.INVENTORY_ENTRY_QUANTITY_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.LineItemStateTransitionMessageImpl.class, name = LineItemStateTransitionMessage.LINE_ITEM_STATE_TRANSITION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderBillingAddressSetMessageImpl.class, name = OrderBillingAddressSetMessage.ORDER_BILLING_ADDRESS_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderCreatedMessageImpl.class, name = OrderCreatedMessage.ORDER_CREATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderCustomLineItemAddedMessageImpl.class, name = OrderCustomLineItemAddedMessage.ORDER_CUSTOM_LINE_ITEM_ADDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderCustomLineItemDiscountSetMessageImpl.class, name = OrderCustomLineItemDiscountSetMessage.ORDER_CUSTOM_LINE_ITEM_DISCOUNT_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderCustomLineItemQuantityChangedMessageImpl.class, name = OrderCustomLineItemQuantityChangedMessage.ORDER_CUSTOM_LINE_ITEM_QUANTITY_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderCustomLineItemRemovedMessageImpl.class, name = OrderCustomLineItemRemovedMessage.ORDER_CUSTOM_LINE_ITEM_REMOVED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderCustomerEmailSetMessageImpl.class, name = OrderCustomerEmailSetMessage.ORDER_CUSTOMER_EMAIL_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderCustomerGroupSetMessageImpl.class, name = OrderCustomerGroupSetMessage.ORDER_CUSTOMER_GROUP_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderCustomerSetMessageImpl.class, name = OrderCustomerSetMessage.ORDER_CUSTOMER_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderDeletedMessageImpl.class, name = OrderDeletedMessage.ORDER_DELETED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderDiscountCodeAddedMessageImpl.class, name = OrderDiscountCodeAddedMessage.ORDER_DISCOUNT_CODE_ADDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderDiscountCodeRemovedMessageImpl.class, name = OrderDiscountCodeRemovedMessage.ORDER_DISCOUNT_CODE_REMOVED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderDiscountCodeStateSetMessageImpl.class, name = OrderDiscountCodeStateSetMessage.ORDER_DISCOUNT_CODE_STATE_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderEditAppliedMessageImpl.class, name = OrderEditAppliedMessage.ORDER_EDIT_APPLIED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderImportedMessageImpl.class, name = OrderImportedMessage.ORDER_IMPORTED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderLineItemAddedMessageImpl.class, name = OrderLineItemAddedMessage.ORDER_LINE_ITEM_ADDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderLineItemDiscountSetMessageImpl.class, name = OrderLineItemDiscountSetMessage.ORDER_LINE_ITEM_DISCOUNT_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderLineItemDistributionChannelSetMessageImpl.class, name = OrderLineItemDistributionChannelSetMessage.ORDER_LINE_ITEM_DISTRIBUTION_CHANNEL_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderLineItemRemovedMessageImpl.class, name = OrderLineItemRemovedMessage.ORDER_LINE_ITEM_REMOVED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderPaymentAddedMessageImpl.class, name = OrderPaymentAddedMessage.ORDER_PAYMENT_ADDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderPaymentStateChangedMessageImpl.class, name = OrderPaymentStateChangedMessage.ORDER_PAYMENT_STATE_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderPurchaseOrderNumberSetMessageImpl.class, name = OrderPurchaseOrderNumberSetMessage.ORDER_PURCHASE_ORDER_NUMBER_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderReturnShipmentStateChangedMessageImpl.class, name = OrderReturnShipmentStateChangedMessage.ORDER_RETURN_SHIPMENT_STATE_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderShipmentStateChangedMessageImpl.class, name = OrderShipmentStateChangedMessage.ORDER_SHIPMENT_STATE_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderShippingAddressSetMessageImpl.class, name = OrderShippingAddressSetMessage.ORDER_SHIPPING_ADDRESS_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderShippingInfoSetMessageImpl.class, name = OrderShippingInfoSetMessage.ORDER_SHIPPING_INFO_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderShippingRateInputSetMessageImpl.class, name = OrderShippingRateInputSetMessage.ORDER_SHIPPING_RATE_INPUT_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderStateChangedMessageImpl.class, name = OrderStateChangedMessage.ORDER_STATE_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderStateTransitionMessageImpl.class, name = OrderStateTransitionMessage.ORDER_STATE_TRANSITION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderStoreSetMessageImpl.class, name = OrderStoreSetMessage.ORDER_STORE_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ParcelAddedToDeliveryMessageImpl.class, name = ParcelAddedToDeliveryMessage.PARCEL_ADDED_TO_DELIVERY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ParcelItemsUpdatedMessageImpl.class, name = ParcelItemsUpdatedMessage.PARCEL_ITEMS_UPDATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ParcelMeasurementsUpdatedMessageImpl.class, name = ParcelMeasurementsUpdatedMessage.PARCEL_MEASUREMENTS_UPDATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ParcelRemovedFromDeliveryMessageImpl.class, name = ParcelRemovedFromDeliveryMessage.PARCEL_REMOVED_FROM_DELIVERY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ParcelTrackingDataUpdatedMessageImpl.class, name = ParcelTrackingDataUpdatedMessage.PARCEL_TRACKING_DATA_UPDATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.PaymentCreatedMessageImpl.class, name = PaymentCreatedMessage.PAYMENT_CREATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.PaymentInteractionAddedMessageImpl.class, name = PaymentInteractionAddedMessage.PAYMENT_INTERACTION_ADDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.PaymentStatusInterfaceCodeSetMessageImpl.class, name = PaymentStatusInterfaceCodeSetMessage.PAYMENT_STATUS_INTERFACE_CODE_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.PaymentStatusStateTransitionMessageImpl.class, name = PaymentStatusStateTransitionMessage.PAYMENT_STATUS_STATE_TRANSITION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.PaymentTransactionAddedMessageImpl.class, name = PaymentTransactionAddedMessage.PAYMENT_TRANSACTION_ADDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.PaymentTransactionStateChangedMessageImpl.class, name = PaymentTransactionStateChangedMessage.PAYMENT_TRANSACTION_STATE_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductAddedToCategoryMessageImpl.class, name = ProductAddedToCategoryMessage.PRODUCT_ADDED_TO_CATEGORY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductCreatedMessageImpl.class, name = ProductCreatedMessage.PRODUCT_CREATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductDeletedMessageImpl.class, name = ProductDeletedMessage.PRODUCT_DELETED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductImageAddedMessageImpl.class, name = ProductImageAddedMessage.PRODUCT_IMAGE_ADDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductPriceAddedMessageImpl.class, name = ProductPriceAddedMessage.PRODUCT_PRICE_ADDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductPriceChangedMessageImpl.class, name = ProductPriceChangedMessage.PRODUCT_PRICE_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductPriceDiscountsSetMessageImpl.class, name = ProductPriceDiscountsSetMessage.PRODUCT_PRICE_DISCOUNTS_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductPriceExternalDiscountSetMessageImpl.class, name = ProductPriceExternalDiscountSetMessage.PRODUCT_PRICE_EXTERNAL_DISCOUNT_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductPriceKeySetMessageImpl.class, name = ProductPriceKeySetMessage.PRODUCT_PRICE_KEY_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductPriceModeSetMessageImpl.class, name = ProductPriceModeSetMessage.PRODUCT_PRICE_MODE_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductPriceRemovedMessageImpl.class, name = ProductPriceRemovedMessage.PRODUCT_PRICE_REMOVED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductPricesSetMessageImpl.class, name = ProductPricesSetMessage.PRODUCT_PRICES_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductPublishedMessageImpl.class, name = ProductPublishedMessage.PRODUCT_PUBLISHED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductRemovedFromCategoryMessageImpl.class, name = ProductRemovedFromCategoryMessage.PRODUCT_REMOVED_FROM_CATEGORY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductRevertedStagedChangesMessageImpl.class, name = ProductRevertedStagedChangesMessage.PRODUCT_REVERTED_STAGED_CHANGES),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductSelectionCreatedMessageImpl.class, name = ProductSelectionCreatedMessage.PRODUCT_SELECTION_CREATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductSelectionDeletedMessageImpl.class, name = ProductSelectionDeletedMessage.PRODUCT_SELECTION_DELETED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductSelectionProductAddedMessageImpl.class, name = ProductSelectionProductAddedMessage.PRODUCT_SELECTION_PRODUCT_ADDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductSelectionProductExcludedMessageImpl.class, name = ProductSelectionProductExcludedMessage.PRODUCT_SELECTION_PRODUCT_EXCLUDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductSelectionProductRemovedMessageImpl.class, name = ProductSelectionProductRemovedMessage.PRODUCT_SELECTION_PRODUCT_REMOVED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductSelectionVariantExclusionChangedMessageImpl.class, name = ProductSelectionVariantExclusionChangedMessage.PRODUCT_SELECTION_VARIANT_EXCLUSION_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductSelectionVariantSelectionChangedMessageImpl.class, name = ProductSelectionVariantSelectionChangedMessage.PRODUCT_SELECTION_VARIANT_SELECTION_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductSlugChangedMessageImpl.class, name = ProductSlugChangedMessage.PRODUCT_SLUG_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductStateTransitionMessageImpl.class, name = ProductStateTransitionMessage.PRODUCT_STATE_TRANSITION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductUnpublishedMessageImpl.class, name = ProductUnpublishedMessage.PRODUCT_UNPUBLISHED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductVariantAddedMessageImpl.class, name = ProductVariantAddedMessage.PRODUCT_VARIANT_ADDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductVariantDeletedMessageImpl.class, name = ProductVariantDeletedMessage.PRODUCT_VARIANT_DELETED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.QuoteCreatedMessageImpl.class, name = QuoteCreatedMessage.QUOTE_CREATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.QuoteDeletedMessageImpl.class, name = QuoteDeletedMessage.QUOTE_DELETED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.QuoteRequestCreatedMessageImpl.class, name = QuoteRequestCreatedMessage.QUOTE_REQUEST_CREATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.QuoteRequestDeletedMessageImpl.class, name = QuoteRequestDeletedMessage.QUOTE_REQUEST_DELETED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.QuoteRequestStateChangedMessageImpl.class, name = QuoteRequestStateChangedMessage.QUOTE_REQUEST_STATE_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.QuoteRequestStateTransitionMessageImpl.class, name = QuoteRequestStateTransitionMessage.QUOTE_REQUEST_STATE_TRANSITION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.QuoteStateChangedMessageImpl.class, name = QuoteStateChangedMessage.QUOTE_STATE_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.QuoteStateTransitionMessageImpl.class, name = QuoteStateTransitionMessage.QUOTE_STATE_TRANSITION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ReturnInfoAddedMessageImpl.class, name = ReturnInfoAddedMessage.RETURN_INFO_ADDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ReturnInfoSetMessageImpl.class, name = ReturnInfoSetMessage.RETURN_INFO_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ReviewCreatedMessageImpl.class, name = ReviewCreatedMessage.REVIEW_CREATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ReviewRatingSetMessageImpl.class, name = ReviewRatingSetMessage.REVIEW_RATING_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ReviewStateTransitionMessageImpl.class, name = ReviewStateTransitionMessage.REVIEW_STATE_TRANSITION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.StagedQuoteCreatedMessageImpl.class, name = StagedQuoteCreatedMessage.STAGED_QUOTE_CREATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.StagedQuoteDeletedMessageImpl.class, name = StagedQuoteDeletedMessage.STAGED_QUOTE_DELETED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.StagedQuoteSellerCommentSetMessageImpl.class, name = StagedQuoteSellerCommentSetMessage.STAGED_QUOTE_SELLER_COMMENT_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.StagedQuoteStateChangedMessageImpl.class, name = StagedQuoteStateChangedMessage.STAGED_QUOTE_STATE_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.StagedQuoteStateTransitionMessageImpl.class, name = StagedQuoteStateTransitionMessage.STAGED_QUOTE_STATE_TRANSITION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.StagedQuoteValidToSetMessageImpl.class, name = StagedQuoteValidToSetMessage.STAGED_QUOTE_VALID_TO_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.StandalonePriceActiveChangedMessageImpl.class, name = StandalonePriceActiveChangedMessage.STANDALONE_PRICE_ACTIVE_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.StandalonePriceCreatedMessageImpl.class, name = StandalonePriceCreatedMessage.STANDALONE_PRICE_CREATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.StandalonePriceDeletedMessageImpl.class, name = StandalonePriceDeletedMessage.STANDALONE_PRICE_DELETED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.StandalonePriceDiscountSetMessageImpl.class, name = StandalonePriceDiscountSetMessage.STANDALONE_PRICE_DISCOUNT_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.StandalonePriceExternalDiscountSetMessageImpl.class, name = StandalonePriceExternalDiscountSetMessage.STANDALONE_PRICE_EXTERNAL_DISCOUNT_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.StandalonePriceKeySetMessageImpl.class, name = StandalonePriceKeySetMessage.STANDALONE_PRICE_KEY_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.StandalonePriceStagedChangesAppliedMessageImpl.class, name = StandalonePriceStagedChangesAppliedMessage.STANDALONE_PRICE_STAGED_CHANGES_APPLIED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.StandalonePriceValueChangedMessageImpl.class, name = StandalonePriceValueChangedMessage.STANDALONE_PRICE_VALUE_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.StoreCountriesChangedMessageImpl.class, name = StoreCountriesChangedMessage.STORE_COUNTRIES_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.StoreCreatedMessageImpl.class, name = StoreCreatedMessage.STORE_CREATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.StoreDeletedMessageImpl.class, name = StoreDeletedMessage.STORE_DELETED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.StoreDistributionChannelsChangedMessageImpl.class, name = StoreDistributionChannelsChangedMessage.STORE_DISTRIBUTION_CHANNELS_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.StoreLanguagesChangedMessageImpl.class, name = StoreLanguagesChangedMessage.STORE_LANGUAGES_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.StoreNameSetMessageImpl.class, name = StoreNameSetMessage.STORE_NAME_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.StoreProductSelectionsChangedMessageImpl.class, name = StoreProductSelectionsChangedMessage.STORE_PRODUCT_SELECTIONS_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.StoreSupplyChannelsChangedMessageImpl.class, name = StoreSupplyChannelsChangedMessage.STORE_SUPPLY_CHANNELS_CHANGED) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", defaultImpl = MessageImpl.class, visible = true)
@JsonDeserialize(as = MessageImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface Message extends BaseResource, com.commercetools.api.models.DomainResource<Message> {

    /**
     *  <p>Unique identifier of the Message. Can be used to track which Messages have been processed.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Version of a resource. In case of Messages, this is always <code>1</code>.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Date and time (UTC) the Message was generated.</p>
     * @return createdAt
     */
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    /**
     *  <p>Value of <code>createdAt</code>.</p>
     * @return lastModifiedAt
     */
    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    /**
     *  <p>Value of <code>createdBy</code>.</p>
     * @return lastModifiedBy
     */
    @Valid
    @JsonProperty("lastModifiedBy")
    public LastModifiedBy getLastModifiedBy();

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @return createdBy
     */
    @Valid
    @JsonProperty("createdBy")
    public CreatedBy getCreatedBy();

    /**
     *  <p>Message number in relation to other Messages for a given resource. The <code>sequenceNumber</code> of the next Message for the resource is the successor of the <code>sequenceNumber</code> of the current Message. Meaning, the <code>sequenceNumber</code> of the next Message equals the <code>sequenceNumber</code> of the current Message + 1. <code>sequenceNumber</code> can be used to ensure that Messages are processed in the correct order for a particular resource.</p>
     * @return sequenceNumber
     */
    @NotNull
    @JsonProperty("sequenceNumber")
    public Long getSequenceNumber();

    /**
     *  <p>Reference to the resource on which the change or action was performed.</p>
     * @return resource
     */
    @NotNull
    @Valid
    @JsonProperty("resource")
    public Reference getResource();

    /**
     *  <p>Version of the resource on which the change or action was performed.</p>
     * @return resourceVersion
     */
    @NotNull
    @JsonProperty("resourceVersion")
    public Long getResourceVersion();

    /**
     *  <p>Message Type of the Message.</p>
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>User-provided identifiers of the resource, such as <code>key</code> or <code>externalId</code>. Only present if the resource has such identifiers.</p>
     * @return resourceUserProvidedIdentifiers
     */
    @Valid
    @JsonProperty("resourceUserProvidedIdentifiers")
    public UserProvidedIdentifiers getResourceUserProvidedIdentifiers();

    /**
     *  <p>Unique identifier of the Message. Can be used to track which Messages have been processed.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>Version of a resource. In case of Messages, this is always <code>1</code>.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>Date and time (UTC) the Message was generated.</p>
     * @param createdAt value to be set
     */

    public void setCreatedAt(final ZonedDateTime createdAt);

    /**
     *  <p>Value of <code>createdAt</code>.</p>
     * @param lastModifiedAt value to be set
     */

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    /**
     *  <p>Value of <code>createdBy</code>.</p>
     * @param lastModifiedBy value to be set
     */

    public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param createdBy value to be set
     */

    public void setCreatedBy(final CreatedBy createdBy);

    /**
     *  <p>Message number in relation to other Messages for a given resource. The <code>sequenceNumber</code> of the next Message for the resource is the successor of the <code>sequenceNumber</code> of the current Message. Meaning, the <code>sequenceNumber</code> of the next Message equals the <code>sequenceNumber</code> of the current Message + 1. <code>sequenceNumber</code> can be used to ensure that Messages are processed in the correct order for a particular resource.</p>
     * @param sequenceNumber value to be set
     */

    public void setSequenceNumber(final Long sequenceNumber);

    /**
     *  <p>Reference to the resource on which the change or action was performed.</p>
     * @param resource value to be set
     */

    public void setResource(final Reference resource);

    /**
     *  <p>Version of the resource on which the change or action was performed.</p>
     * @param resourceVersion value to be set
     */

    public void setResourceVersion(final Long resourceVersion);

    /**
     *  <p>User-provided identifiers of the resource, such as <code>key</code> or <code>externalId</code>. Only present if the resource has such identifiers.</p>
     * @param resourceUserProvidedIdentifiers value to be set
     */

    public void setResourceUserProvidedIdentifiers(final UserProvidedIdentifiers resourceUserProvidedIdentifiers);

    /**
     * builder for businessUnitAddressAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitAddressAddedMessageBuilder businessUnitAddressAddedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitAddressAddedMessageBuilder.of();
    }

    /**
     * builder for businessUnitAddressChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitAddressChangedMessageBuilder businessUnitAddressChangedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitAddressChangedMessageBuilder.of();
    }

    /**
     * builder for businessUnitAddressRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitAddressRemovedMessageBuilder businessUnitAddressRemovedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitAddressRemovedMessageBuilder.of();
    }

    /**
     * builder for businessUnitAssociateAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitAssociateAddedMessageBuilder businessUnitAssociateAddedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitAssociateAddedMessageBuilder.of();
    }

    /**
     * builder for businessUnitAssociateChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitAssociateChangedMessageBuilder businessUnitAssociateChangedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitAssociateChangedMessageBuilder.of();
    }

    /**
     * builder for businessUnitAssociateRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitAssociateRemovedMessageBuilder businessUnitAssociateRemovedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitAssociateRemovedMessageBuilder.of();
    }

    /**
     * builder for businessUnitAssociatesSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitAssociatesSetMessageBuilder businessUnitAssociatesSetBuilder() {
        return com.commercetools.api.models.message.BusinessUnitAssociatesSetMessageBuilder.of();
    }

    /**
     * builder for businessUnitBillingAddressAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitBillingAddressAddedMessageBuilder businessUnitBillingAddressAddedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitBillingAddressAddedMessageBuilder.of();
    }

    /**
     * builder for businessUnitBillingAddressRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitBillingAddressRemovedMessageBuilder businessUnitBillingAddressRemovedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitBillingAddressRemovedMessageBuilder.of();
    }

    /**
     * builder for businessUnitContactEmailSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitContactEmailSetMessageBuilder businessUnitContactEmailSetBuilder() {
        return com.commercetools.api.models.message.BusinessUnitContactEmailSetMessageBuilder.of();
    }

    /**
     * builder for businessUnitCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitCreatedMessageBuilder businessUnitCreatedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitCreatedMessageBuilder.of();
    }

    /**
     * builder for businessUnitDefaultBillingAddressSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitDefaultBillingAddressSetMessageBuilder businessUnitDefaultBillingAddressSetBuilder() {
        return com.commercetools.api.models.message.BusinessUnitDefaultBillingAddressSetMessageBuilder.of();
    }

    /**
     * builder for businessUnitDefaultShippingAddressSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitDefaultShippingAddressSetMessageBuilder businessUnitDefaultShippingAddressSetBuilder() {
        return com.commercetools.api.models.message.BusinessUnitDefaultShippingAddressSetMessageBuilder.of();
    }

    /**
     * builder for businessUnitDeleted subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitDeletedMessageBuilder businessUnitDeletedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitDeletedMessageBuilder.of();
    }

    /**
     * builder for businessUnitNameChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitNameChangedMessageBuilder businessUnitNameChangedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitNameChangedMessageBuilder.of();
    }

    /**
     * builder for businessUnitParentUnitChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitParentUnitChangedMessageBuilder businessUnitParentUnitChangedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitParentUnitChangedMessageBuilder.of();
    }

    /**
     * builder for businessUnitShippingAddressAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitShippingAddressAddedMessageBuilder businessUnitShippingAddressAddedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitShippingAddressAddedMessageBuilder.of();
    }

    /**
     * builder for businessUnitShippingAddressRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitShippingAddressRemovedMessageBuilder businessUnitShippingAddressRemovedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitShippingAddressRemovedMessageBuilder.of();
    }

    /**
     * builder for businessUnitStatusChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitStatusChangedMessageBuilder businessUnitStatusChangedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitStatusChangedMessageBuilder.of();
    }

    /**
     * builder for businessUnitStoreAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitStoreAddedMessageBuilder businessUnitStoreAddedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitStoreAddedMessageBuilder.of();
    }

    /**
     * builder for businessUnitStoreModeChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitStoreModeChangedMessageBuilder businessUnitStoreModeChangedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitStoreModeChangedMessageBuilder.of();
    }

    /**
     * builder for businessUnitStoreRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitStoreRemovedMessageBuilder businessUnitStoreRemovedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitStoreRemovedMessageBuilder.of();
    }

    /**
     * builder for businessUnitStoresSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitStoresSetMessageBuilder businessUnitStoresSetBuilder() {
        return com.commercetools.api.models.message.BusinessUnitStoresSetMessageBuilder.of();
    }

    /**
     * builder for categoryCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CategoryCreatedMessageBuilder categoryCreatedBuilder() {
        return com.commercetools.api.models.message.CategoryCreatedMessageBuilder.of();
    }

    /**
     * builder for categorySlugChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CategorySlugChangedMessageBuilder categorySlugChangedBuilder() {
        return com.commercetools.api.models.message.CategorySlugChangedMessageBuilder.of();
    }

    /**
     * builder for customLineItemStateTransition subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomLineItemStateTransitionMessageBuilder customLineItemStateTransitionBuilder() {
        return com.commercetools.api.models.message.CustomLineItemStateTransitionMessageBuilder.of();
    }

    /**
     * builder for customerAddressAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerAddressAddedMessageBuilder customerAddressAddedBuilder() {
        return com.commercetools.api.models.message.CustomerAddressAddedMessageBuilder.of();
    }

    /**
     * builder for customerAddressChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerAddressChangedMessageBuilder customerAddressChangedBuilder() {
        return com.commercetools.api.models.message.CustomerAddressChangedMessageBuilder.of();
    }

    /**
     * builder for customerAddressRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerAddressRemovedMessageBuilder customerAddressRemovedBuilder() {
        return com.commercetools.api.models.message.CustomerAddressRemovedMessageBuilder.of();
    }

    /**
     * builder for customerCompanyNameSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerCompanyNameSetMessageBuilder customerCompanyNameSetBuilder() {
        return com.commercetools.api.models.message.CustomerCompanyNameSetMessageBuilder.of();
    }

    /**
     * builder for customerCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerCreatedMessageBuilder customerCreatedBuilder() {
        return com.commercetools.api.models.message.CustomerCreatedMessageBuilder.of();
    }

    /**
     * builder for customerDateOfBirthSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerDateOfBirthSetMessageBuilder customerDateOfBirthSetBuilder() {
        return com.commercetools.api.models.message.CustomerDateOfBirthSetMessageBuilder.of();
    }

    /**
     * builder for customerDeleted subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerDeletedMessageBuilder customerDeletedBuilder() {
        return com.commercetools.api.models.message.CustomerDeletedMessageBuilder.of();
    }

    /**
     * builder for customerEmailChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerEmailChangedMessageBuilder customerEmailChangedBuilder() {
        return com.commercetools.api.models.message.CustomerEmailChangedMessageBuilder.of();
    }

    /**
     * builder for customerEmailVerified subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerEmailVerifiedMessageBuilder customerEmailVerifiedBuilder() {
        return com.commercetools.api.models.message.CustomerEmailVerifiedMessageBuilder.of();
    }

    /**
     * builder for customerFirstNameSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerFirstNameSetMessageBuilder customerFirstNameSetBuilder() {
        return com.commercetools.api.models.message.CustomerFirstNameSetMessageBuilder.of();
    }

    /**
     * builder for customerGroupSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerGroupSetMessageBuilder customerGroupSetBuilder() {
        return com.commercetools.api.models.message.CustomerGroupSetMessageBuilder.of();
    }

    /**
     * builder for customerLastNameSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerLastNameSetMessageBuilder customerLastNameSetBuilder() {
        return com.commercetools.api.models.message.CustomerLastNameSetMessageBuilder.of();
    }

    /**
     * builder for customerPasswordUpdated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerPasswordUpdatedMessageBuilder customerPasswordUpdatedBuilder() {
        return com.commercetools.api.models.message.CustomerPasswordUpdatedMessageBuilder.of();
    }

    /**
     * builder for customerTitleSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerTitleSetMessageBuilder customerTitleSetBuilder() {
        return com.commercetools.api.models.message.CustomerTitleSetMessageBuilder.of();
    }

    /**
     * builder for deliveryAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.DeliveryAddedMessageBuilder deliveryAddedBuilder() {
        return com.commercetools.api.models.message.DeliveryAddedMessageBuilder.of();
    }

    /**
     * builder for deliveryAddressSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.DeliveryAddressSetMessageBuilder deliveryAddressSetBuilder() {
        return com.commercetools.api.models.message.DeliveryAddressSetMessageBuilder.of();
    }

    /**
     * builder for deliveryItemsUpdated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.DeliveryItemsUpdatedMessageBuilder deliveryItemsUpdatedBuilder() {
        return com.commercetools.api.models.message.DeliveryItemsUpdatedMessageBuilder.of();
    }

    /**
     * builder for deliveryRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.DeliveryRemovedMessageBuilder deliveryRemovedBuilder() {
        return com.commercetools.api.models.message.DeliveryRemovedMessageBuilder.of();
    }

    /**
     * builder for inventoryEntryCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.InventoryEntryCreatedMessageBuilder inventoryEntryCreatedBuilder() {
        return com.commercetools.api.models.message.InventoryEntryCreatedMessageBuilder.of();
    }

    /**
     * builder for inventoryEntryDeleted subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.InventoryEntryDeletedMessageBuilder inventoryEntryDeletedBuilder() {
        return com.commercetools.api.models.message.InventoryEntryDeletedMessageBuilder.of();
    }

    /**
     * builder for inventoryEntryQuantitySet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.InventoryEntryQuantitySetMessageBuilder inventoryEntryQuantitySetBuilder() {
        return com.commercetools.api.models.message.InventoryEntryQuantitySetMessageBuilder.of();
    }

    /**
     * builder for lineItemStateTransition subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.LineItemStateTransitionMessageBuilder lineItemStateTransitionBuilder() {
        return com.commercetools.api.models.message.LineItemStateTransitionMessageBuilder.of();
    }

    /**
     * builder for orderBillingAddressSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderBillingAddressSetMessageBuilder orderBillingAddressSetBuilder() {
        return com.commercetools.api.models.message.OrderBillingAddressSetMessageBuilder.of();
    }

    /**
     * builder for orderCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderCreatedMessageBuilder orderCreatedBuilder() {
        return com.commercetools.api.models.message.OrderCreatedMessageBuilder.of();
    }

    /**
     * builder for orderCustomLineItemAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderCustomLineItemAddedMessageBuilder orderCustomLineItemAddedBuilder() {
        return com.commercetools.api.models.message.OrderCustomLineItemAddedMessageBuilder.of();
    }

    /**
     * builder for orderCustomLineItemDiscountSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderCustomLineItemDiscountSetMessageBuilder orderCustomLineItemDiscountSetBuilder() {
        return com.commercetools.api.models.message.OrderCustomLineItemDiscountSetMessageBuilder.of();
    }

    /**
     * builder for orderCustomLineItemQuantityChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderCustomLineItemQuantityChangedMessageBuilder orderCustomLineItemQuantityChangedBuilder() {
        return com.commercetools.api.models.message.OrderCustomLineItemQuantityChangedMessageBuilder.of();
    }

    /**
     * builder for orderCustomLineItemRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderCustomLineItemRemovedMessageBuilder orderCustomLineItemRemovedBuilder() {
        return com.commercetools.api.models.message.OrderCustomLineItemRemovedMessageBuilder.of();
    }

    /**
     * builder for orderCustomerEmailSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderCustomerEmailSetMessageBuilder orderCustomerEmailSetBuilder() {
        return com.commercetools.api.models.message.OrderCustomerEmailSetMessageBuilder.of();
    }

    /**
     * builder for orderCustomerGroupSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderCustomerGroupSetMessageBuilder orderCustomerGroupSetBuilder() {
        return com.commercetools.api.models.message.OrderCustomerGroupSetMessageBuilder.of();
    }

    /**
     * builder for orderCustomerSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderCustomerSetMessageBuilder orderCustomerSetBuilder() {
        return com.commercetools.api.models.message.OrderCustomerSetMessageBuilder.of();
    }

    /**
     * builder for orderDeleted subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderDeletedMessageBuilder orderDeletedBuilder() {
        return com.commercetools.api.models.message.OrderDeletedMessageBuilder.of();
    }

    /**
     * builder for orderDiscountCodeAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderDiscountCodeAddedMessageBuilder orderDiscountCodeAddedBuilder() {
        return com.commercetools.api.models.message.OrderDiscountCodeAddedMessageBuilder.of();
    }

    /**
     * builder for orderDiscountCodeRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderDiscountCodeRemovedMessageBuilder orderDiscountCodeRemovedBuilder() {
        return com.commercetools.api.models.message.OrderDiscountCodeRemovedMessageBuilder.of();
    }

    /**
     * builder for orderDiscountCodeStateSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderDiscountCodeStateSetMessageBuilder orderDiscountCodeStateSetBuilder() {
        return com.commercetools.api.models.message.OrderDiscountCodeStateSetMessageBuilder.of();
    }

    /**
     * builder for orderEditApplied subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderEditAppliedMessageBuilder orderEditAppliedBuilder() {
        return com.commercetools.api.models.message.OrderEditAppliedMessageBuilder.of();
    }

    /**
     * builder for orderImported subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderImportedMessageBuilder orderImportedBuilder() {
        return com.commercetools.api.models.message.OrderImportedMessageBuilder.of();
    }

    /**
     * builder for orderLineItemAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderLineItemAddedMessageBuilder orderLineItemAddedBuilder() {
        return com.commercetools.api.models.message.OrderLineItemAddedMessageBuilder.of();
    }

    /**
     * builder for orderLineItemDiscountSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderLineItemDiscountSetMessageBuilder orderLineItemDiscountSetBuilder() {
        return com.commercetools.api.models.message.OrderLineItemDiscountSetMessageBuilder.of();
    }

    /**
     * builder for orderLineItemDistributionChannelSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderLineItemDistributionChannelSetMessageBuilder orderLineItemDistributionChannelSetBuilder() {
        return com.commercetools.api.models.message.OrderLineItemDistributionChannelSetMessageBuilder.of();
    }

    /**
     * builder for orderLineItemRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderLineItemRemovedMessageBuilder orderLineItemRemovedBuilder() {
        return com.commercetools.api.models.message.OrderLineItemRemovedMessageBuilder.of();
    }

    /**
     * builder for orderPaymentAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderPaymentAddedMessageBuilder orderPaymentAddedBuilder() {
        return com.commercetools.api.models.message.OrderPaymentAddedMessageBuilder.of();
    }

    /**
     * builder for orderPaymentStateChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderPaymentStateChangedMessageBuilder orderPaymentStateChangedBuilder() {
        return com.commercetools.api.models.message.OrderPaymentStateChangedMessageBuilder.of();
    }

    /**
     * builder for orderPurchaseOrderNumberSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderPurchaseOrderNumberSetMessageBuilder orderPurchaseOrderNumberSetBuilder() {
        return com.commercetools.api.models.message.OrderPurchaseOrderNumberSetMessageBuilder.of();
    }

    /**
     * builder for orderReturnShipmentStateChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderReturnShipmentStateChangedMessageBuilder orderReturnShipmentStateChangedBuilder() {
        return com.commercetools.api.models.message.OrderReturnShipmentStateChangedMessageBuilder.of();
    }

    /**
     * builder for orderShipmentStateChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderShipmentStateChangedMessageBuilder orderShipmentStateChangedBuilder() {
        return com.commercetools.api.models.message.OrderShipmentStateChangedMessageBuilder.of();
    }

    /**
     * builder for orderShippingAddressSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderShippingAddressSetMessageBuilder orderShippingAddressSetBuilder() {
        return com.commercetools.api.models.message.OrderShippingAddressSetMessageBuilder.of();
    }

    /**
     * builder for orderShippingInfoSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderShippingInfoSetMessageBuilder orderShippingInfoSetBuilder() {
        return com.commercetools.api.models.message.OrderShippingInfoSetMessageBuilder.of();
    }

    /**
     * builder for orderShippingRateInputSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderShippingRateInputSetMessageBuilder orderShippingRateInputSetBuilder() {
        return com.commercetools.api.models.message.OrderShippingRateInputSetMessageBuilder.of();
    }

    /**
     * builder for orderStateChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderStateChangedMessageBuilder orderStateChangedBuilder() {
        return com.commercetools.api.models.message.OrderStateChangedMessageBuilder.of();
    }

    /**
     * builder for orderStateTransition subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderStateTransitionMessageBuilder orderStateTransitionBuilder() {
        return com.commercetools.api.models.message.OrderStateTransitionMessageBuilder.of();
    }

    /**
     * builder for orderStoreSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderStoreSetMessageBuilder orderStoreSetBuilder() {
        return com.commercetools.api.models.message.OrderStoreSetMessageBuilder.of();
    }

    /**
     * builder for parcelAddedToDelivery subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ParcelAddedToDeliveryMessageBuilder parcelAddedToDeliveryBuilder() {
        return com.commercetools.api.models.message.ParcelAddedToDeliveryMessageBuilder.of();
    }

    /**
     * builder for parcelItemsUpdated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ParcelItemsUpdatedMessageBuilder parcelItemsUpdatedBuilder() {
        return com.commercetools.api.models.message.ParcelItemsUpdatedMessageBuilder.of();
    }

    /**
     * builder for parcelMeasurementsUpdated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ParcelMeasurementsUpdatedMessageBuilder parcelMeasurementsUpdatedBuilder() {
        return com.commercetools.api.models.message.ParcelMeasurementsUpdatedMessageBuilder.of();
    }

    /**
     * builder for parcelRemovedFromDelivery subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ParcelRemovedFromDeliveryMessageBuilder parcelRemovedFromDeliveryBuilder() {
        return com.commercetools.api.models.message.ParcelRemovedFromDeliveryMessageBuilder.of();
    }

    /**
     * builder for parcelTrackingDataUpdated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ParcelTrackingDataUpdatedMessageBuilder parcelTrackingDataUpdatedBuilder() {
        return com.commercetools.api.models.message.ParcelTrackingDataUpdatedMessageBuilder.of();
    }

    /**
     * builder for paymentCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.PaymentCreatedMessageBuilder paymentCreatedBuilder() {
        return com.commercetools.api.models.message.PaymentCreatedMessageBuilder.of();
    }

    /**
     * builder for paymentInteractionAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.PaymentInteractionAddedMessageBuilder paymentInteractionAddedBuilder() {
        return com.commercetools.api.models.message.PaymentInteractionAddedMessageBuilder.of();
    }

    /**
     * builder for paymentStatusInterfaceCodeSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.PaymentStatusInterfaceCodeSetMessageBuilder paymentStatusInterfaceCodeSetBuilder() {
        return com.commercetools.api.models.message.PaymentStatusInterfaceCodeSetMessageBuilder.of();
    }

    /**
     * builder for paymentStatusStateTransition subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.PaymentStatusStateTransitionMessageBuilder paymentStatusStateTransitionBuilder() {
        return com.commercetools.api.models.message.PaymentStatusStateTransitionMessageBuilder.of();
    }

    /**
     * builder for paymentTransactionAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.PaymentTransactionAddedMessageBuilder paymentTransactionAddedBuilder() {
        return com.commercetools.api.models.message.PaymentTransactionAddedMessageBuilder.of();
    }

    /**
     * builder for paymentTransactionStateChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.PaymentTransactionStateChangedMessageBuilder paymentTransactionStateChangedBuilder() {
        return com.commercetools.api.models.message.PaymentTransactionStateChangedMessageBuilder.of();
    }

    /**
     * builder for productAddedToCategory subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductAddedToCategoryMessageBuilder productAddedToCategoryBuilder() {
        return com.commercetools.api.models.message.ProductAddedToCategoryMessageBuilder.of();
    }

    /**
     * builder for productCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductCreatedMessageBuilder productCreatedBuilder() {
        return com.commercetools.api.models.message.ProductCreatedMessageBuilder.of();
    }

    /**
     * builder for productDeleted subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductDeletedMessageBuilder productDeletedBuilder() {
        return com.commercetools.api.models.message.ProductDeletedMessageBuilder.of();
    }

    /**
     * builder for productImageAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductImageAddedMessageBuilder productImageAddedBuilder() {
        return com.commercetools.api.models.message.ProductImageAddedMessageBuilder.of();
    }

    /**
     * builder for productPriceAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductPriceAddedMessageBuilder productPriceAddedBuilder() {
        return com.commercetools.api.models.message.ProductPriceAddedMessageBuilder.of();
    }

    /**
     * builder for productPriceChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductPriceChangedMessageBuilder productPriceChangedBuilder() {
        return com.commercetools.api.models.message.ProductPriceChangedMessageBuilder.of();
    }

    /**
     * builder for productPriceDiscountsSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductPriceDiscountsSetMessageBuilder productPriceDiscountsSetBuilder() {
        return com.commercetools.api.models.message.ProductPriceDiscountsSetMessageBuilder.of();
    }

    /**
     * builder for productPriceExternalDiscountSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductPriceExternalDiscountSetMessageBuilder productPriceExternalDiscountSetBuilder() {
        return com.commercetools.api.models.message.ProductPriceExternalDiscountSetMessageBuilder.of();
    }

    /**
     * builder for productPriceKeySet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductPriceKeySetMessageBuilder productPriceKeySetBuilder() {
        return com.commercetools.api.models.message.ProductPriceKeySetMessageBuilder.of();
    }

    /**
     * builder for productPriceModeSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductPriceModeSetMessageBuilder productPriceModeSetBuilder() {
        return com.commercetools.api.models.message.ProductPriceModeSetMessageBuilder.of();
    }

    /**
     * builder for productPriceRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductPriceRemovedMessageBuilder productPriceRemovedBuilder() {
        return com.commercetools.api.models.message.ProductPriceRemovedMessageBuilder.of();
    }

    /**
     * builder for productPricesSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductPricesSetMessageBuilder productPricesSetBuilder() {
        return com.commercetools.api.models.message.ProductPricesSetMessageBuilder.of();
    }

    /**
     * builder for productPublished subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductPublishedMessageBuilder productPublishedBuilder() {
        return com.commercetools.api.models.message.ProductPublishedMessageBuilder.of();
    }

    /**
     * builder for productRemovedFromCategory subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductRemovedFromCategoryMessageBuilder productRemovedFromCategoryBuilder() {
        return com.commercetools.api.models.message.ProductRemovedFromCategoryMessageBuilder.of();
    }

    /**
     * builder for productRevertedStagedChanges subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductRevertedStagedChangesMessageBuilder productRevertedStagedChangesBuilder() {
        return com.commercetools.api.models.message.ProductRevertedStagedChangesMessageBuilder.of();
    }

    /**
     * builder for productSelectionCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductSelectionCreatedMessageBuilder productSelectionCreatedBuilder() {
        return com.commercetools.api.models.message.ProductSelectionCreatedMessageBuilder.of();
    }

    /**
     * builder for productSelectionDeleted subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductSelectionDeletedMessageBuilder productSelectionDeletedBuilder() {
        return com.commercetools.api.models.message.ProductSelectionDeletedMessageBuilder.of();
    }

    /**
     * builder for productSelectionProductAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductSelectionProductAddedMessageBuilder productSelectionProductAddedBuilder() {
        return com.commercetools.api.models.message.ProductSelectionProductAddedMessageBuilder.of();
    }

    /**
     * builder for productSelectionProductExcluded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductSelectionProductExcludedMessageBuilder productSelectionProductExcludedBuilder() {
        return com.commercetools.api.models.message.ProductSelectionProductExcludedMessageBuilder.of();
    }

    /**
     * builder for productSelectionProductRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductSelectionProductRemovedMessageBuilder productSelectionProductRemovedBuilder() {
        return com.commercetools.api.models.message.ProductSelectionProductRemovedMessageBuilder.of();
    }

    /**
     * builder for productSelectionVariantExclusionChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductSelectionVariantExclusionChangedMessageBuilder productSelectionVariantExclusionChangedBuilder() {
        return com.commercetools.api.models.message.ProductSelectionVariantExclusionChangedMessageBuilder.of();
    }

    /**
     * builder for productSelectionVariantSelectionChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductSelectionVariantSelectionChangedMessageBuilder productSelectionVariantSelectionChangedBuilder() {
        return com.commercetools.api.models.message.ProductSelectionVariantSelectionChangedMessageBuilder.of();
    }

    /**
     * builder for productSlugChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductSlugChangedMessageBuilder productSlugChangedBuilder() {
        return com.commercetools.api.models.message.ProductSlugChangedMessageBuilder.of();
    }

    /**
     * builder for productStateTransition subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductStateTransitionMessageBuilder productStateTransitionBuilder() {
        return com.commercetools.api.models.message.ProductStateTransitionMessageBuilder.of();
    }

    /**
     * builder for productUnpublished subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductUnpublishedMessageBuilder productUnpublishedBuilder() {
        return com.commercetools.api.models.message.ProductUnpublishedMessageBuilder.of();
    }

    /**
     * builder for productVariantAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductVariantAddedMessageBuilder productVariantAddedBuilder() {
        return com.commercetools.api.models.message.ProductVariantAddedMessageBuilder.of();
    }

    /**
     * builder for productVariantDeleted subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductVariantDeletedMessageBuilder productVariantDeletedBuilder() {
        return com.commercetools.api.models.message.ProductVariantDeletedMessageBuilder.of();
    }

    /**
     * builder for quoteCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.QuoteCreatedMessageBuilder quoteCreatedBuilder() {
        return com.commercetools.api.models.message.QuoteCreatedMessageBuilder.of();
    }

    /**
     * builder for quoteDeleted subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.QuoteDeletedMessageBuilder quoteDeletedBuilder() {
        return com.commercetools.api.models.message.QuoteDeletedMessageBuilder.of();
    }

    /**
     * builder for quoteRequestCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.QuoteRequestCreatedMessageBuilder quoteRequestCreatedBuilder() {
        return com.commercetools.api.models.message.QuoteRequestCreatedMessageBuilder.of();
    }

    /**
     * builder for quoteRequestDeleted subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.QuoteRequestDeletedMessageBuilder quoteRequestDeletedBuilder() {
        return com.commercetools.api.models.message.QuoteRequestDeletedMessageBuilder.of();
    }

    /**
     * builder for quoteRequestStateChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.QuoteRequestStateChangedMessageBuilder quoteRequestStateChangedBuilder() {
        return com.commercetools.api.models.message.QuoteRequestStateChangedMessageBuilder.of();
    }

    /**
     * builder for quoteRequestStateTransition subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.QuoteRequestStateTransitionMessageBuilder quoteRequestStateTransitionBuilder() {
        return com.commercetools.api.models.message.QuoteRequestStateTransitionMessageBuilder.of();
    }

    /**
     * builder for quoteStateChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.QuoteStateChangedMessageBuilder quoteStateChangedBuilder() {
        return com.commercetools.api.models.message.QuoteStateChangedMessageBuilder.of();
    }

    /**
     * builder for quoteStateTransition subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.QuoteStateTransitionMessageBuilder quoteStateTransitionBuilder() {
        return com.commercetools.api.models.message.QuoteStateTransitionMessageBuilder.of();
    }

    /**
     * builder for returnInfoAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ReturnInfoAddedMessageBuilder returnInfoAddedBuilder() {
        return com.commercetools.api.models.message.ReturnInfoAddedMessageBuilder.of();
    }

    /**
     * builder for returnInfoSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ReturnInfoSetMessageBuilder returnInfoSetBuilder() {
        return com.commercetools.api.models.message.ReturnInfoSetMessageBuilder.of();
    }

    /**
     * builder for reviewCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ReviewCreatedMessageBuilder reviewCreatedBuilder() {
        return com.commercetools.api.models.message.ReviewCreatedMessageBuilder.of();
    }

    /**
     * builder for reviewRatingSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ReviewRatingSetMessageBuilder reviewRatingSetBuilder() {
        return com.commercetools.api.models.message.ReviewRatingSetMessageBuilder.of();
    }

    /**
     * builder for reviewStateTransition subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ReviewStateTransitionMessageBuilder reviewStateTransitionBuilder() {
        return com.commercetools.api.models.message.ReviewStateTransitionMessageBuilder.of();
    }

    /**
     * builder for stagedQuoteCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StagedQuoteCreatedMessageBuilder stagedQuoteCreatedBuilder() {
        return com.commercetools.api.models.message.StagedQuoteCreatedMessageBuilder.of();
    }

    /**
     * builder for stagedQuoteDeleted subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StagedQuoteDeletedMessageBuilder stagedQuoteDeletedBuilder() {
        return com.commercetools.api.models.message.StagedQuoteDeletedMessageBuilder.of();
    }

    /**
     * builder for stagedQuoteSellerCommentSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StagedQuoteSellerCommentSetMessageBuilder stagedQuoteSellerCommentSetBuilder() {
        return com.commercetools.api.models.message.StagedQuoteSellerCommentSetMessageBuilder.of();
    }

    /**
     * builder for stagedQuoteStateChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StagedQuoteStateChangedMessageBuilder stagedQuoteStateChangedBuilder() {
        return com.commercetools.api.models.message.StagedQuoteStateChangedMessageBuilder.of();
    }

    /**
     * builder for stagedQuoteStateTransition subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StagedQuoteStateTransitionMessageBuilder stagedQuoteStateTransitionBuilder() {
        return com.commercetools.api.models.message.StagedQuoteStateTransitionMessageBuilder.of();
    }

    /**
     * builder for stagedQuoteValidToSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StagedQuoteValidToSetMessageBuilder stagedQuoteValidToSetBuilder() {
        return com.commercetools.api.models.message.StagedQuoteValidToSetMessageBuilder.of();
    }

    /**
     * builder for standalonePriceActiveChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StandalonePriceActiveChangedMessageBuilder standalonePriceActiveChangedBuilder() {
        return com.commercetools.api.models.message.StandalonePriceActiveChangedMessageBuilder.of();
    }

    /**
     * builder for standalonePriceCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StandalonePriceCreatedMessageBuilder standalonePriceCreatedBuilder() {
        return com.commercetools.api.models.message.StandalonePriceCreatedMessageBuilder.of();
    }

    /**
     * builder for standalonePriceDeleted subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StandalonePriceDeletedMessageBuilder standalonePriceDeletedBuilder() {
        return com.commercetools.api.models.message.StandalonePriceDeletedMessageBuilder.of();
    }

    /**
     * builder for standalonePriceDiscountSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StandalonePriceDiscountSetMessageBuilder standalonePriceDiscountSetBuilder() {
        return com.commercetools.api.models.message.StandalonePriceDiscountSetMessageBuilder.of();
    }

    /**
     * builder for standalonePriceExternalDiscountSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StandalonePriceExternalDiscountSetMessageBuilder standalonePriceExternalDiscountSetBuilder() {
        return com.commercetools.api.models.message.StandalonePriceExternalDiscountSetMessageBuilder.of();
    }

    /**
     * builder for standalonePriceKeySet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StandalonePriceKeySetMessageBuilder standalonePriceKeySetBuilder() {
        return com.commercetools.api.models.message.StandalonePriceKeySetMessageBuilder.of();
    }

    /**
     * builder for standalonePriceStagedChangesApplied subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StandalonePriceStagedChangesAppliedMessageBuilder standalonePriceStagedChangesAppliedBuilder() {
        return com.commercetools.api.models.message.StandalonePriceStagedChangesAppliedMessageBuilder.of();
    }

    /**
     * builder for standalonePriceValueChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StandalonePriceValueChangedMessageBuilder standalonePriceValueChangedBuilder() {
        return com.commercetools.api.models.message.StandalonePriceValueChangedMessageBuilder.of();
    }

    /**
     * builder for storeCountriesChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StoreCountriesChangedMessageBuilder storeCountriesChangedBuilder() {
        return com.commercetools.api.models.message.StoreCountriesChangedMessageBuilder.of();
    }

    /**
     * builder for storeCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StoreCreatedMessageBuilder storeCreatedBuilder() {
        return com.commercetools.api.models.message.StoreCreatedMessageBuilder.of();
    }

    /**
     * builder for storeDeleted subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StoreDeletedMessageBuilder storeDeletedBuilder() {
        return com.commercetools.api.models.message.StoreDeletedMessageBuilder.of();
    }

    /**
     * builder for storeDistributionChannelsChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StoreDistributionChannelsChangedMessageBuilder storeDistributionChannelsChangedBuilder() {
        return com.commercetools.api.models.message.StoreDistributionChannelsChangedMessageBuilder.of();
    }

    /**
     * builder for storeLanguagesChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StoreLanguagesChangedMessageBuilder storeLanguagesChangedBuilder() {
        return com.commercetools.api.models.message.StoreLanguagesChangedMessageBuilder.of();
    }

    /**
     * builder for storeNameSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StoreNameSetMessageBuilder storeNameSetBuilder() {
        return com.commercetools.api.models.message.StoreNameSetMessageBuilder.of();
    }

    /**
     * builder for storeProductSelectionsChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StoreProductSelectionsChangedMessageBuilder storeProductSelectionsChangedBuilder() {
        return com.commercetools.api.models.message.StoreProductSelectionsChangedMessageBuilder.of();
    }

    /**
     * builder for storeSupplyChannelsChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StoreSupplyChannelsChangedMessageBuilder storeSupplyChannelsChangedBuilder() {
        return com.commercetools.api.models.message.StoreSupplyChannelsChangedMessageBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMessage(Function<Message, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<Message> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Message>() {
            @Override
            public String toString() {
                return "TypeReference<Message>";
            }
        };
    }
}

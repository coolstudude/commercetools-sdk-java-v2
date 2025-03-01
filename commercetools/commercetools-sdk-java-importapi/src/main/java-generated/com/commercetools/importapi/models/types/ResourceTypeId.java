
package com.commercetools.importapi.models.types;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>IDs indicating the customizable resources and data types. Maps to <code>Type.resourceTypeId</code>.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ResourceTypeId extends JsonEnum {

    /**
    	<p><a href="/../api/types#address">Address</a> on <a href="/../api/projects/business-units#businessunit">BusinessUnit</a>, <a href="/../api/projects/carts#cart">Cart</a>, <a href="/../api/projects/orders#order">Order</a>, <a href="/../api/projects/order-edits#orderedit">OrderEdit</a>, <a href="/../api/projects/customers#customer">Customer</a>, and <a href="/../api/projects/channels#channel">Channel</a></p>

    */
    ResourceTypeId ADDRESS = ResourceTypeIdEnum.ADDRESS;
    /**
    	<p><a href="/../api/types#asset">Asset</a> on <a href="/../api/projects/categories#category">Category</a> and <a href="/../api/projects/products#productvariant">ProductVariant</a></p>

    */
    ResourceTypeId ASSET = ResourceTypeIdEnum.ASSET;
    /**
    	<p><a href="/../api/projects/business-units#businessunit">BusinessUnit</a></p>

    */
    ResourceTypeId BUSINESS_UNIT = ResourceTypeIdEnum.BUSINESS_UNIT;
    /**
    	<p><a href="/../api/projects/cartDiscounts#cartdiscount">CartDiscount</a></p>

    */
    ResourceTypeId CART_DISCOUNT = ResourceTypeIdEnum.CART_DISCOUNT;
    /**
    	<p><a href="/../api/projects/categories#category">Category</a></p>

    */
    ResourceTypeId CATEGORY = ResourceTypeIdEnum.CATEGORY;
    /**
    	<p><a href="/../api/projects/channels#channel">Channel</a></p>

    */
    ResourceTypeId CHANNEL = ResourceTypeIdEnum.CHANNEL;
    /**
    	<p><a href="/../api/projects/customers#customer">Customer</a></p>

    */
    ResourceTypeId CUSTOMER = ResourceTypeIdEnum.CUSTOMER;
    /**
    	<p><a href="/../api/projects/customerGroups#customergroup">CustomerGroup</a></p>

    */
    ResourceTypeId CUSTOMER_GROUP = ResourceTypeIdEnum.CUSTOMER_GROUP;
    /**
    	<p><a href="/../api/projects/carts#customlineitem">CustomLineItem</a> on <a href="/../api/projects/carts#cart">Cart</a> and <a href="/../api/projects/orders#order">Order</a></p>

    */
    ResourceTypeId CUSTOM_LINE_ITEM = ResourceTypeIdEnum.CUSTOM_LINE_ITEM;
    /**
    	<p><a href="/../api/projects/discountCodes#discountcode">DiscountCode</a></p>

    */
    ResourceTypeId DISCOUNT_CODE = ResourceTypeIdEnum.DISCOUNT_CODE;
    /**
    	<p><a href="/../api/projects/inventory#inventoryentry">InventoryEntry</a></p>

    */
    ResourceTypeId INVENTORY_ENTRY = ResourceTypeIdEnum.INVENTORY_ENTRY;
    /**
    	<p><a href="/../api/projects/carts#lineitem">LineItem</a> on <a href="/../api/projects/carts#cart">Cart</a> and <a href="/../api/projects/orders#order">Order</a>, and <a href="/../api/projects/carts#lineitem">LineItem</a> on <a href="/../api/projects/shoppingLists#shoppinglist">ShoppingList</a></p>

    */
    ResourceTypeId LINE_ITEM = ResourceTypeIdEnum.LINE_ITEM;
    /**
    	<p><a href="/../api/projects/carts#cart">Cart</a> and <a href="/../api/projects/orders#order">Order</a>.
    	When a <a href="/../api/projects/carts#cart">Cart</a> is ordered, the <a href="/../api/projects/custom-fields#customfields">CustomFields</a> need to be copied to the <a href="/../api/projects/orders#order">Order</a>.
    	For this reason, the Types for Carts are also valid for Orders, and hence both have the same identifier: <code>order</code>.</p>

    */
    ResourceTypeId ORDER = ResourceTypeIdEnum.ORDER;
    /**
    	<p><a href="/../api/projects/order-edits#orderedit">OrderEdit</a></p>

    */
    ResourceTypeId ORDER_EDIT = ResourceTypeIdEnum.ORDER_EDIT;
    /**
    	<p><a href="/../api/projects/orders#delivery">Delivery</a></p>

    */
    ResourceTypeId ORDER_DELIVERY = ResourceTypeIdEnum.ORDER_DELIVERY;
    /**
    	<p><a href="/../api/projects/orders#parcel">Parcel</a></p>

    */
    ResourceTypeId ORDER_PARCEL = ResourceTypeIdEnum.ORDER_PARCEL;
    /**
    	<p><a href="/../api/projects/orders#returnitem">ReturnItem</a></p>

    */
    ResourceTypeId ORDER_RETURN_ITEM = ResourceTypeIdEnum.ORDER_RETURN_ITEM;
    /**
    	<p><a href="/../api/projects/payments#payment">Payment</a></p>

    */
    ResourceTypeId PAYMENT = ResourceTypeIdEnum.PAYMENT;
    /**
    	<p><a href="/../api/projects/payments#add-interfaceinteraction">InterfaceInteraction</a> on <a href="/../api/projects/payments#payment">Payment</a></p>

    */
    ResourceTypeId PAYMENT_INTERFACE_INTERACTION = ResourceTypeIdEnum.PAYMENT_INTERFACE_INTERACTION;
    /**
    	<p><a href="/../api/projects/products#embedded-price">Embedded Price</a> on <a href="/../api/projects/products#productvariant">ProductVariant</a></p>

    */
    ResourceTypeId PRODUCT_PRICE = ResourceTypeIdEnum.PRODUCT_PRICE;
    /**
    	<p><a href="/../api/projects/product-selections#productselection">ProductSelection</a></p>

    */
    ResourceTypeId PRODUCT_SELECTION = ResourceTypeIdEnum.PRODUCT_SELECTION;
    /**
    	<p><a href="/../api/projects/quotes#quote">Quote</a>, <a href="/../api/projects/quote-requests#quoterequest">QuoteRequest</a> and <a href="/../api/projects/staged-quotes#stagedquote">StagedQuote</a>.
    	When a <a href="/../api/projects/staged-quotes#stagedquote">StagedQuote</a> is created, the <a href="/../api/projects/custom-fields#customfields">CustomFields</a> will be copied from the <a href="/../api/projects/quote-requests#quoterequest">QuoteRequest</a> and when a <a href="/../api/projects/quotes#quote">Quote</a> is created, the <a href="/../api/projects/custom-fields#customfields">CustomFields</a> will be copied from the <a href="/../api/projects/staged-quotes#stagedquote">StagedQuote</a>.
    	For this reason, the Types for Quotes are also valid for QuoteRequests and StagedQuotes, and hence all have the same identifier: <code>quote</code>.</p>

    */
    ResourceTypeId QUOTE = ResourceTypeIdEnum.QUOTE;
    /**
    	<p><a href="/../api/projects/reviews#review">Review</a></p>

    */
    ResourceTypeId REVIEW = ResourceTypeIdEnum.REVIEW;
    /**
    	<p><a href="/../api/projects/carts#shipping">Shipping</a></p>

    */
    ResourceTypeId SHIPPING = ResourceTypeIdEnum.SHIPPING;
    /**
    	<p><a href="/../api/projects/shippingMethods#shippingmethod">ShippingMethod</a></p>

    */
    ResourceTypeId SHIPPING_METHOD = ResourceTypeIdEnum.SHIPPING_METHOD;
    /**
    	<p><a href="/../api/projects/shoppingLists#shoppinglist">ShoppingList</a></p>

    */
    ResourceTypeId SHOPPING_LIST = ResourceTypeIdEnum.SHOPPING_LIST;
    /**
    	<p><a href="/../api/projects/shoppingLists#textlineitem">TextLineItem</a> on <a href="/../api/projects/shoppingLists#shoppinglist">ShoppingList</a></p>

    */
    ResourceTypeId SHOPPING_LIST_TEXT_LINE_ITEM = ResourceTypeIdEnum.SHOPPING_LIST_TEXT_LINE_ITEM;
    /**
    	<p><a href="/../api/projects/standalone-prices#standaloneprice">StandalonePrice</a></p>

    */
    ResourceTypeId STANDALONE_PRICE = ResourceTypeIdEnum.STANDALONE_PRICE;
    /**
    	<p><a href="/../api/projects/stores#store">Store</a></p>

    */
    ResourceTypeId STORE = ResourceTypeIdEnum.STORE;
    /**
    	<p><a href="/../api/projects/payments#transaction">Transaction</a> on <a href="/../api/projects/payments#payment">Payment</a></p>

    */
    ResourceTypeId TRANSACTION = ResourceTypeIdEnum.TRANSACTION;

    /**
     * possible values of ResourceTypeId
     */
    enum ResourceTypeIdEnum implements ResourceTypeId {
        /**
         * address
         */
        ADDRESS("address"),

        /**
         * asset
         */
        ASSET("asset"),

        /**
         * business-unit
         */
        BUSINESS_UNIT("business-unit"),

        /**
         * cart-discount
         */
        CART_DISCOUNT("cart-discount"),

        /**
         * category
         */
        CATEGORY("category"),

        /**
         * channel
         */
        CHANNEL("channel"),

        /**
         * customer
         */
        CUSTOMER("customer"),

        /**
         * customer-group
         */
        CUSTOMER_GROUP("customer-group"),

        /**
         * custom-line-item
         */
        CUSTOM_LINE_ITEM("custom-line-item"),

        /**
         * discount-code
         */
        DISCOUNT_CODE("discount-code"),

        /**
         * inventory-entry
         */
        INVENTORY_ENTRY("inventory-entry"),

        /**
         * line-item
         */
        LINE_ITEM("line-item"),

        /**
         * order
         */
        ORDER("order"),

        /**
         * order-edit
         */
        ORDER_EDIT("order-edit"),

        /**
         * order-delivery
         */
        ORDER_DELIVERY("order-delivery"),

        /**
         * order-parcel
         */
        ORDER_PARCEL("order-parcel"),

        /**
         * order-return-item
         */
        ORDER_RETURN_ITEM("order-return-item"),

        /**
         * payment
         */
        PAYMENT("payment"),

        /**
         * payment-interface-interaction
         */
        PAYMENT_INTERFACE_INTERACTION("payment-interface-interaction"),

        /**
         * product-price
         */
        PRODUCT_PRICE("product-price"),

        /**
         * product-selection
         */
        PRODUCT_SELECTION("product-selection"),

        /**
         * quote
         */
        QUOTE("quote"),

        /**
         * review
         */
        REVIEW("review"),

        /**
         * shipping
         */
        SHIPPING("shipping"),

        /**
         * shipping-method
         */
        SHIPPING_METHOD("shipping-method"),

        /**
         * shopping-list
         */
        SHOPPING_LIST("shopping-list"),

        /**
         * shopping-list-text-line-item
         */
        SHOPPING_LIST_TEXT_LINE_ITEM("shopping-list-text-line-item"),

        /**
         * standalone-price
         */
        STANDALONE_PRICE("standalone-price"),

        /**
         * store
         */
        STORE("store"),

        /**
         * transaction
         */
        TRANSACTION("transaction");
        private final String jsonName;

        private ResourceTypeIdEnum(final String jsonName) {
            this.jsonName = jsonName;
        }

        public String getJsonName() {
            return jsonName;
        }

        public String toString() {
            return jsonName;
        }
    }

    /**
     * the JSON value
     * @return json value
     */
    @JsonValue
    String getJsonName();

    /**
     * the enum value
     * @return name
     */
    String name();

    /**
     * convert value to string
     * @return string representation
     */
    String toString();

    /**
     * factory method for a enum value of ResourceTypeId
     * if no enum has been found an anonymous instance will be created
     * @param value the enum value to be wrapped
     * @return enum instance
     */
    @JsonCreator
    public static ResourceTypeId findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new ResourceTypeId() {
            @Override
            public String getJsonName() {
                return value;
            }

            @Override
            public String name() {
                return value.toUpperCase();
            }

            public String toString() {
                return value;
            }
        });
    }

    /**
     * method to find enum using the JSON value
     * @param jsonName the json value to be wrapped
     * @return optional of enum instance
     */
    public static Optional<ResourceTypeId> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static ResourceTypeId[] values() {
        return ResourceTypeIdEnum.values();
    }

}

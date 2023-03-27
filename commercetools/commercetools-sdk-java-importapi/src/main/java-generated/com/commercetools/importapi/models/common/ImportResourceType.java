
package com.commercetools.importapi.models.common;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>The type of the import resource.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ImportResourceType {

    /**
    	<p>The category import resource type.</p>

    */
    ImportResourceType CATEGORY = ImportResourceTypeEnum.CATEGORY;
    /**
    	<p>The order import resource type.</p>

    */
    ImportResourceType ORDER = ImportResourceTypeEnum.ORDER;
    /**
    	<p>The order patch import resource type.</p>

    */
    ImportResourceType ORDER_PATCH = ImportResourceTypeEnum.ORDER_PATCH;
    /**
    	<p>The price import resource type.</p>

    */
    ImportResourceType PRICE = ImportResourceTypeEnum.PRICE;
    /**
    	<p>The product import resource type.</p>

    */
    ImportResourceType PRODUCT = ImportResourceTypeEnum.PRODUCT;

    ImportResourceType PRODUCT_DRAFT = ImportResourceTypeEnum.PRODUCT_DRAFT;
    /**
    	<p>The product type import resource type.</p>

    */
    ImportResourceType PRODUCT_TYPE = ImportResourceTypeEnum.PRODUCT_TYPE;
    /**
    	<p>The product variant import resource type.</p>

    */
    ImportResourceType PRODUCT_VARIANT = ImportResourceTypeEnum.PRODUCT_VARIANT;
    /**
    	<p>The product variant patch import resource type.</p>

    */
    ImportResourceType PRODUCT_VARIANT_PATCH = ImportResourceTypeEnum.PRODUCT_VARIANT_PATCH;
    /**
    	<p>The customer import resource type.</p>

    */
    ImportResourceType CUSTOMER = ImportResourceTypeEnum.CUSTOMER;
    /**
    	<p>The inventory import resource type.</p>

    */
    ImportResourceType INVENTORY = ImportResourceTypeEnum.INVENTORY;
    /**
    	<p>The Standalone Price import resource type.</p>

    */
    ImportResourceType STANDALONE_PRICE = ImportResourceTypeEnum.STANDALONE_PRICE;

    /**
     * possible values of ImportResourceType
     */
    enum ImportResourceTypeEnum implements ImportResourceType {
        /**
         * category
         */
        CATEGORY("category"),

        /**
         * order
         */
        ORDER("order"),

        /**
         * order-patch
         */
        ORDER_PATCH("order-patch"),

        /**
         * price
         */
        PRICE("price"),

        /**
         * product
         */
        PRODUCT("product"),

        /**
         * product-draft
         */
        PRODUCT_DRAFT("product-draft"),

        /**
         * product-type
         */
        PRODUCT_TYPE("product-type"),

        /**
         * product-variant
         */
        PRODUCT_VARIANT("product-variant"),

        /**
         * product-variant-patch
         */
        PRODUCT_VARIANT_PATCH("product-variant-patch"),

        /**
         * customer
         */
        CUSTOMER("customer"),

        /**
         * inventory
         */
        INVENTORY("inventory"),

        /**
         * standalone-price
         */
        STANDALONE_PRICE("standalone-price");
        private final String jsonName;

        private ImportResourceTypeEnum(final String jsonName) {
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
     * factory method for a enum value of ImportResourceType
     * if no enum has been found an anonymous instance will be created
     * @return enum instance
     */
    @JsonCreator
    public static ImportResourceType findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new ImportResourceType() {
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
     * @return optional of enum instance
     */
    public static Optional<ImportResourceType> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static ImportResourceType[] values() {
        return ImportResourceTypeEnum.values();
    }

}

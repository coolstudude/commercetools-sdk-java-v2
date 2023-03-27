
package com.commercetools.api.models.product_type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Umbrella type for specific attribute types discriminated by property <code>name</code>.</p>
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeType attributeType = AttributeType.booleanBuilder()
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_type.AttributeBooleanTypeImpl.class, name = AttributeBooleanType.BOOLEAN),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_type.AttributeDateTimeTypeImpl.class, name = AttributeDateTimeType.DATETIME),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_type.AttributeDateTypeImpl.class, name = AttributeDateType.DATE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_type.AttributeEnumTypeImpl.class, name = AttributeEnumType.ENUM),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_type.AttributeLocalizableTextTypeImpl.class, name = AttributeLocalizableTextType.LTEXT),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_type.AttributeLocalizedEnumTypeImpl.class, name = AttributeLocalizedEnumType.LENUM),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_type.AttributeMoneyTypeImpl.class, name = AttributeMoneyType.MONEY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_type.AttributeNestedTypeImpl.class, name = AttributeNestedType.NESTED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_type.AttributeNumberTypeImpl.class, name = AttributeNumberType.NUMBER),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_type.AttributeReferenceTypeImpl.class, name = AttributeReferenceType.REFERENCE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_type.AttributeSetTypeImpl.class, name = AttributeSetType.SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_type.AttributeTextTypeImpl.class, name = AttributeTextType.TEXT),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_type.AttributeTimeTypeImpl.class, name = AttributeTimeType.TIME) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "name", defaultImpl = AttributeTypeImpl.class, visible = true)
@JsonDeserialize(as = AttributeTypeImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface AttributeType {

    /**
     *
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     * builder for boolean subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_type.AttributeBooleanTypeBuilder booleanBuilder() {
        return com.commercetools.api.models.product_type.AttributeBooleanTypeBuilder.of();
    }

    /**
     * builder for datetime subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_type.AttributeDateTimeTypeBuilder datetimeBuilder() {
        return com.commercetools.api.models.product_type.AttributeDateTimeTypeBuilder.of();
    }

    /**
     * builder for date subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_type.AttributeDateTypeBuilder dateBuilder() {
        return com.commercetools.api.models.product_type.AttributeDateTypeBuilder.of();
    }

    /**
     * builder for enum subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_type.AttributeEnumTypeBuilder enumBuilder() {
        return com.commercetools.api.models.product_type.AttributeEnumTypeBuilder.of();
    }

    /**
     * builder for ltext subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_type.AttributeLocalizableTextTypeBuilder ltextBuilder() {
        return com.commercetools.api.models.product_type.AttributeLocalizableTextTypeBuilder.of();
    }

    /**
     * builder for lenum subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_type.AttributeLocalizedEnumTypeBuilder lenumBuilder() {
        return com.commercetools.api.models.product_type.AttributeLocalizedEnumTypeBuilder.of();
    }

    /**
     * builder for money subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_type.AttributeMoneyTypeBuilder moneyBuilder() {
        return com.commercetools.api.models.product_type.AttributeMoneyTypeBuilder.of();
    }

    /**
     * builder for nested subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_type.AttributeNestedTypeBuilder nestedBuilder() {
        return com.commercetools.api.models.product_type.AttributeNestedTypeBuilder.of();
    }

    /**
     * builder for number subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_type.AttributeNumberTypeBuilder numberBuilder() {
        return com.commercetools.api.models.product_type.AttributeNumberTypeBuilder.of();
    }

    /**
     * builder for reference subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_type.AttributeReferenceTypeBuilder referenceBuilder() {
        return com.commercetools.api.models.product_type.AttributeReferenceTypeBuilder.of();
    }

    /**
     * builder for set subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_type.AttributeSetTypeBuilder setBuilder() {
        return com.commercetools.api.models.product_type.AttributeSetTypeBuilder.of();
    }

    /**
     * builder for text subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_type.AttributeTextTypeBuilder textBuilder() {
        return com.commercetools.api.models.product_type.AttributeTextTypeBuilder.of();
    }

    /**
     * builder for time subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_type.AttributeTimeTypeBuilder timeBuilder() {
        return com.commercetools.api.models.product_type.AttributeTimeTypeBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAttributeType(Function<AttributeType, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AttributeType> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AttributeType>() {
            @Override
            public String toString() {
                return "TypeReference<AttributeType>";
            }
        };
    }
}

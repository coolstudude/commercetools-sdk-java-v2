
package com.commercetools.api.models.product_type;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductTypeAddPlainEnumValueActionBuilder implements Builder<ProductTypeAddPlainEnumValueAction> {

    private String attributeName;

    private com.commercetools.api.models.product_type.AttributePlainEnumValue value;

    public ProductTypeAddPlainEnumValueActionBuilder attributeName(final String attributeName) {
        this.attributeName = attributeName;
        return this;
    }

    public ProductTypeAddPlainEnumValueActionBuilder value(
            final com.commercetools.api.models.product_type.AttributePlainEnumValue value) {
        this.value = value;
        return this;
    }

    public String getAttributeName() {
        return this.attributeName;
    }

    public com.commercetools.api.models.product_type.AttributePlainEnumValue getValue() {
        return this.value;
    }

    public ProductTypeAddPlainEnumValueAction build() {
        Objects.requireNonNull(attributeName);
        Objects.requireNonNull(value);
        return new ProductTypeAddPlainEnumValueActionImpl(attributeName, value);
    }

    /**
     * builds ProductTypeAddPlainEnumValueAction without checking for non null required values
     */
    public ProductTypeAddPlainEnumValueAction buildUnchecked() {
        return new ProductTypeAddPlainEnumValueActionImpl(attributeName, value);
    }

    public static ProductTypeAddPlainEnumValueActionBuilder of() {
        return new ProductTypeAddPlainEnumValueActionBuilder();
    }

    public static ProductTypeAddPlainEnumValueActionBuilder of(final ProductTypeAddPlainEnumValueAction template) {
        ProductTypeAddPlainEnumValueActionBuilder builder = new ProductTypeAddPlainEnumValueActionBuilder();
        builder.attributeName = template.getAttributeName();
        builder.value = template.getValue();
        return builder;
    }

}

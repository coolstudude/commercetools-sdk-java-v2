
package com.commercetools.importapi.models.common;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.common.KeyReference;
import com.commercetools.importapi.models.common.ProductKeyReferenceImpl;
import com.commercetools.importapi.models.common.ReferenceType;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>References a product by its key.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductKeyReferenceImpl.class)
public interface ProductKeyReference extends KeyReference {

    String PRODUCT = "product";

    public static ProductKeyReference of() {
        return new ProductKeyReferenceImpl();
    }

    public static ProductKeyReference of(final ProductKeyReference template) {
        ProductKeyReferenceImpl instance = new ProductKeyReferenceImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public static ProductKeyReferenceBuilder builder() {
        return ProductKeyReferenceBuilder.of();
    }

    public static ProductKeyReferenceBuilder builder(final ProductKeyReference template) {
        return ProductKeyReferenceBuilder.of(template);
    }

    default <T> T withProductKeyReference(Function<ProductKeyReference, T> helper) {
        return helper.apply(this);
    }
}

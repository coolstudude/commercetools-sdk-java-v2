package com.commercetools.importapi.models.common;

import com.commercetools.importapi.models.common.KeyReference;
import com.commercetools.importapi.models.common.ReferenceType;
import com.commercetools.importapi.models.common.ProductDiscountKeyReference;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductDiscountKeyReferenceBuilder {


    private String key;

    public ProductDiscountKeyReferenceBuilder key( final String key) {
        this.key = key;
        return this;
    }


    public String getKey(){
        return this.key;
    }

    public ProductDiscountKeyReference build() {
        return new ProductDiscountKeyReferenceImpl(key);
    }

    public static ProductDiscountKeyReferenceBuilder of() {
        return new ProductDiscountKeyReferenceBuilder();
    }

    public static ProductDiscountKeyReferenceBuilder of(final ProductDiscountKeyReference template) {
        ProductDiscountKeyReferenceBuilder builder = new ProductDiscountKeyReferenceBuilder();
        builder.key = template.getKey();
        return builder;
    }

}

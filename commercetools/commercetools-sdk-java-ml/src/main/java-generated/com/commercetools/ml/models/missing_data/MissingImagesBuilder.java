
package com.commercetools.ml.models.missing_data;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MissingImagesBuilder implements Builder<MissingImages> {

    private com.commercetools.ml.models.common.ProductReference product;

    private Long variantId;

    private Long imageCount;

    public MissingImagesBuilder product(final com.commercetools.ml.models.common.ProductReference product) {
        this.product = product;
        return this;
    }

    public MissingImagesBuilder variantId(final Long variantId) {
        this.variantId = variantId;
        return this;
    }

    public MissingImagesBuilder imageCount(final Long imageCount) {
        this.imageCount = imageCount;
        return this;
    }

    public com.commercetools.ml.models.common.ProductReference getProduct() {
        return this.product;
    }

    public Long getVariantId() {
        return this.variantId;
    }

    public Long getImageCount() {
        return this.imageCount;
    }

    public MissingImages build() {
        Objects.requireNonNull(product);
        Objects.requireNonNull(variantId);
        Objects.requireNonNull(imageCount);
        return new MissingImagesImpl(product, variantId, imageCount);
    }

    /**
     * builds MissingImages without checking for non null required values
     */
    public MissingImages buildUnchecked() {
        return new MissingImagesImpl(product, variantId, imageCount);
    }

    public static MissingImagesBuilder of() {
        return new MissingImagesBuilder();
    }

    public static MissingImagesBuilder of(final MissingImages template) {
        MissingImagesBuilder builder = new MissingImagesBuilder();
        builder.product = template.getProduct();
        builder.variantId = template.getVariantId();
        builder.imageCount = template.getImageCount();
        return builder;
    }

}

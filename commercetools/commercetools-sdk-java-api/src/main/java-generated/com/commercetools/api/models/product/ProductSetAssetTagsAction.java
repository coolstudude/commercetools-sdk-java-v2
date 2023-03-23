
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Either <code>variantId</code> or <code>sku</code> is required. The Asset to update must be specified using either <code>assetId</code> or <code>assetKey</code>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSetAssetTagsAction productSetAssetTagsAction = ProductSetAssetTagsAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSetAssetTagsActionImpl.class)
public interface ProductSetAssetTagsAction extends ProductUpdateAction {

    String SET_ASSET_TAGS = "setAssetTags";

    /**
     *  <p>The <code>id</code> of the ProductVariant to update.</p>
     * @return variantId
     */

    @JsonProperty("variantId")
    public Long getVariantId();

    /**
     *  <p>The <code>sku</code> of the ProductVariant to update.</p>
     * @return sku
     */

    @JsonProperty("sku")
    public String getSku();

    /**
     *  <p>If <code>true</code>, only the staged Asset is updated. If <code>false</code>, both the current and staged Asset is updated.</p>
     * @return staged
     */

    @JsonProperty("staged")
    public Boolean getStaged();

    /**
     *  <p>The <code>id</code> of the Asset to update.</p>
     * @return assetId
     */

    @JsonProperty("assetId")
    public String getAssetId();

    /**
     *  <p>The <code>key</code> of the Asset to update.</p>
     * @return assetKey
     */

    @JsonProperty("assetKey")
    public String getAssetKey();

    /**
     *  <p>Keywords for categorizing and organizing Assets.</p>
     * @return tags
     */

    @JsonProperty("tags")
    public List<String> getTags();

    public void setVariantId(final Long variantId);

    public void setSku(final String sku);

    public void setStaged(final Boolean staged);

    public void setAssetId(final String assetId);

    public void setAssetKey(final String assetKey);

    @JsonIgnore
    public void setTags(final String... tags);

    public void setTags(final List<String> tags);

    public static ProductSetAssetTagsAction of() {
        return new ProductSetAssetTagsActionImpl();
    }

    public static ProductSetAssetTagsAction of(final ProductSetAssetTagsAction template) {
        ProductSetAssetTagsActionImpl instance = new ProductSetAssetTagsActionImpl();
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setStaged(template.getStaged());
        instance.setAssetId(template.getAssetId());
        instance.setAssetKey(template.getAssetKey());
        instance.setTags(template.getTags());
        return instance;
    }

    public static ProductSetAssetTagsActionBuilder builder() {
        return ProductSetAssetTagsActionBuilder.of();
    }

    public static ProductSetAssetTagsActionBuilder builder(final ProductSetAssetTagsAction template) {
        return ProductSetAssetTagsActionBuilder.of(template);
    }

    default <T> T withProductSetAssetTagsAction(Function<ProductSetAssetTagsAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductSetAssetTagsAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSetAssetTagsAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSetAssetTagsAction>";
            }
        };
    }
}

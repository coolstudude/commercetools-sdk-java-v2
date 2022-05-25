
package com.commercetools.api.models.common;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AssetSourceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AssetSource assetSource = AssetSource.builder()
 *             .uri("{uri}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AssetSourceBuilder implements Builder<AssetSource> {

    private String uri;

    @Nullable
    private String key;

    @Nullable
    private com.commercetools.api.models.common.AssetDimensions dimensions;

    @Nullable
    private String contentType;

    /**
     *  <p>URI of the AssetSource.</p>
     */

    public AssetSourceBuilder uri(final String uri) {
        this.uri = uri;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the AssetSource.</p>
     */

    public AssetSourceBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Width and height of the AssetSource.</p>
     */

    public AssetSourceBuilder dimensions(
            Function<com.commercetools.api.models.common.AssetDimensionsBuilder, com.commercetools.api.models.common.AssetDimensionsBuilder> builder) {
        this.dimensions = builder.apply(com.commercetools.api.models.common.AssetDimensionsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Width and height of the AssetSource.</p>
     */

    public AssetSourceBuilder dimensions(
            @Nullable final com.commercetools.api.models.common.AssetDimensions dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    /**
     *  <p>Indicates the type of content, for example <code>application/pdf</code>.</p>
     */

    public AssetSourceBuilder contentType(@Nullable final String contentType) {
        this.contentType = contentType;
        return this;
    }

    public String getUri() {
        return this.uri;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    @Nullable
    public com.commercetools.api.models.common.AssetDimensions getDimensions() {
        return this.dimensions;
    }

    @Nullable
    public String getContentType() {
        return this.contentType;
    }

    public AssetSource build() {
        Objects.requireNonNull(uri, AssetSource.class + ": uri is missing");
        return new AssetSourceImpl(uri, key, dimensions, contentType);
    }

    /**
     * builds AssetSource without checking for non null required values
     */
    public AssetSource buildUnchecked() {
        return new AssetSourceImpl(uri, key, dimensions, contentType);
    }

    public static AssetSourceBuilder of() {
        return new AssetSourceBuilder();
    }

    public static AssetSourceBuilder of(final AssetSource template) {
        AssetSourceBuilder builder = new AssetSourceBuilder();
        builder.uri = template.getUri();
        builder.key = template.getKey();
        builder.dimensions = template.getDimensions();
        builder.contentType = template.getContentType();
        return builder;
    }

}

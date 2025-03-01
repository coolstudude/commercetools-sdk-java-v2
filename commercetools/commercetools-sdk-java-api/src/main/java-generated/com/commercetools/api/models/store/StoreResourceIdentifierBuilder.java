
package com.commercetools.api.models.store;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StoreResourceIdentifierBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreResourceIdentifier storeResourceIdentifier = StoreResourceIdentifier.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreResourceIdentifierBuilder implements Builder<StoreResourceIdentifier> {

    @Nullable
    private String id;

    @Nullable
    private String key;

    /**
     *  <p>Unique ID of the referenced Store. Either <code>id</code> or <code>key</code> is required.</p>
     * @param id value to be set
     * @return Builder
     */

    public StoreResourceIdentifierBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Unique key of the referenced Store. Either <code>id</code> or <code>key</code> is required.</p>
     * @param key value to be set
     * @return Builder
     */

    public StoreResourceIdentifierBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Unique ID of the referenced Store. Either <code>id</code> or <code>key</code> is required.</p>
     * @return id
     */

    @Nullable
    public String getId() {
        return this.id;
    }

    /**
     *  <p>Unique key of the referenced Store. Either <code>id</code> or <code>key</code> is required.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     * builds StoreResourceIdentifier with checking for non-null required values
     * @return StoreResourceIdentifier
     */
    public StoreResourceIdentifier build() {
        return new StoreResourceIdentifierImpl(id, key);
    }

    /**
     * builds StoreResourceIdentifier without checking for non-null required values
     * @return StoreResourceIdentifier
     */
    public StoreResourceIdentifier buildUnchecked() {
        return new StoreResourceIdentifierImpl(id, key);
    }

    /**
     * factory method for an instance of StoreResourceIdentifierBuilder
     * @return builder
     */
    public static StoreResourceIdentifierBuilder of() {
        return new StoreResourceIdentifierBuilder();
    }

    /**
     * create builder for StoreResourceIdentifier instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreResourceIdentifierBuilder of(final StoreResourceIdentifier template) {
        StoreResourceIdentifierBuilder builder = new StoreResourceIdentifierBuilder();
        builder.id = template.getId();
        builder.key = template.getKey();
        return builder;
    }

}

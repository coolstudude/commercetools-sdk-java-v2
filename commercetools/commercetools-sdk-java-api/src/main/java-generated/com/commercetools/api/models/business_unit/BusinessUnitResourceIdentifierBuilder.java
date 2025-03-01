
package com.commercetools.api.models.business_unit;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitResourceIdentifierBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitResourceIdentifier businessUnitResourceIdentifier = BusinessUnitResourceIdentifier.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitResourceIdentifierBuilder implements Builder<BusinessUnitResourceIdentifier> {

    @Nullable
    private String id;

    @Nullable
    private String key;

    /**
     *  <p>Unique identifier of the referenced BusinessUnit. Either <code>id</code> or <code>key</code> is required.</p>
     * @param id value to be set
     * @return Builder
     */

    public BusinessUnitResourceIdentifierBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Unique key of the referenced BusinessUnit. Either <code>id</code> or <code>key</code> is required.</p>
     * @param key value to be set
     * @return Builder
     */

    public BusinessUnitResourceIdentifierBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Unique identifier of the referenced BusinessUnit. Either <code>id</code> or <code>key</code> is required.</p>
     * @return id
     */

    @Nullable
    public String getId() {
        return this.id;
    }

    /**
     *  <p>Unique key of the referenced BusinessUnit. Either <code>id</code> or <code>key</code> is required.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     * builds BusinessUnitResourceIdentifier with checking for non-null required values
     * @return BusinessUnitResourceIdentifier
     */
    public BusinessUnitResourceIdentifier build() {
        return new BusinessUnitResourceIdentifierImpl(id, key);
    }

    /**
     * builds BusinessUnitResourceIdentifier without checking for non-null required values
     * @return BusinessUnitResourceIdentifier
     */
    public BusinessUnitResourceIdentifier buildUnchecked() {
        return new BusinessUnitResourceIdentifierImpl(id, key);
    }

    /**
     * factory method for an instance of BusinessUnitResourceIdentifierBuilder
     * @return builder
     */
    public static BusinessUnitResourceIdentifierBuilder of() {
        return new BusinessUnitResourceIdentifierBuilder();
    }

    /**
     * create builder for BusinessUnitResourceIdentifier instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitResourceIdentifierBuilder of(final BusinessUnitResourceIdentifier template) {
        BusinessUnitResourceIdentifierBuilder builder = new BusinessUnitResourceIdentifierBuilder();
        builder.id = template.getId();
        builder.key = template.getKey();
        return builder;
    }

}

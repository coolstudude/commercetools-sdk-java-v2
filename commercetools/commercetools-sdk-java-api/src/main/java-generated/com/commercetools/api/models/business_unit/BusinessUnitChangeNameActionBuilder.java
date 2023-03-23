
package com.commercetools.api.models.business_unit;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitChangeNameActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitChangeNameAction businessUnitChangeNameAction = BusinessUnitChangeNameAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitChangeNameActionBuilder implements Builder<BusinessUnitChangeNameAction> {

    private String name;

    /**
     *  <p>New name to set.</p>
     * @param name
     * @return Builder
     */

    public BusinessUnitChangeNameActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public BusinessUnitChangeNameAction build() {
        Objects.requireNonNull(name, BusinessUnitChangeNameAction.class + ": name is missing");
        return new BusinessUnitChangeNameActionImpl(name);
    }

    /**
     * builds BusinessUnitChangeNameAction without checking for non null required values
     */
    public BusinessUnitChangeNameAction buildUnchecked() {
        return new BusinessUnitChangeNameActionImpl(name);
    }

    public static BusinessUnitChangeNameActionBuilder of() {
        return new BusinessUnitChangeNameActionBuilder();
    }

    public static BusinessUnitChangeNameActionBuilder of(final BusinessUnitChangeNameAction template) {
        BusinessUnitChangeNameActionBuilder builder = new BusinessUnitChangeNameActionBuilder();
        builder.name = template.getName();
        return builder;
    }

}


package com.commercetools.api.models.product_selection;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * IndividualExclusionProductSelectionTypeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     IndividualExclusionProductSelectionType individualExclusionProductSelectionType = IndividualExclusionProductSelectionType.builder()
 *             .name(nameBuilder -> nameBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@Deprecated
public class IndividualExclusionProductSelectionTypeBuilder
        implements Builder<IndividualExclusionProductSelectionType> {

    private com.commercetools.api.models.common.LocalizedString name;

    /**
     *  <p>The name of the ProductSelection which is recommended to be unique.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public IndividualExclusionProductSelectionTypeBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The name of the ProductSelection which is recommended to be unique.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public IndividualExclusionProductSelectionTypeBuilder withName(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>The name of the ProductSelection which is recommended to be unique.</p>
     * @param name value to be set
     * @return Builder
     */

    public IndividualExclusionProductSelectionTypeBuilder name(
            final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>The name of the ProductSelection which is recommended to be unique.</p>
     * @return name
     */

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     * builds IndividualExclusionProductSelectionType with checking for non-null required values
     * @return IndividualExclusionProductSelectionType
     */
    public IndividualExclusionProductSelectionType build() {
        Objects.requireNonNull(name, IndividualExclusionProductSelectionType.class + ": name is missing");
        return new IndividualExclusionProductSelectionTypeImpl(name);
    }

    /**
     * builds IndividualExclusionProductSelectionType without checking for non-null required values
     * @return IndividualExclusionProductSelectionType
     */
    public IndividualExclusionProductSelectionType buildUnchecked() {
        return new IndividualExclusionProductSelectionTypeImpl(name);
    }

    /**
     * factory method for an instance of IndividualExclusionProductSelectionTypeBuilder
     * @return builder
     */
    public static IndividualExclusionProductSelectionTypeBuilder of() {
        return new IndividualExclusionProductSelectionTypeBuilder();
    }

    /**
     * create builder for IndividualExclusionProductSelectionType instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static IndividualExclusionProductSelectionTypeBuilder of(
            final IndividualExclusionProductSelectionType template) {
        IndividualExclusionProductSelectionTypeBuilder builder = new IndividualExclusionProductSelectionTypeBuilder();
        builder.name = template.getName();
        return builder;
    }

}


package com.commercetools.api.models.order_edit;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderSetCountryActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetCountryAction stagedOrderSetCountryAction = StagedOrderSetCountryAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderSetCountryActionBuilder implements Builder<StagedOrderSetCountryAction> {

    @Nullable
    private String country;

    /**
     * set the value to the country
     * @param country value to be set
     * @return Builder
     */

    public StagedOrderSetCountryActionBuilder country(@Nullable final String country) {
        this.country = country;
        return this;
    }

    /**
     * value of country}
     * @return country
     */

    @Nullable
    public String getCountry() {
        return this.country;
    }

    /**
     * builds StagedOrderSetCountryAction with checking for non-null required values
     * @return StagedOrderSetCountryAction
     */
    public StagedOrderSetCountryAction build() {
        return new StagedOrderSetCountryActionImpl(country);
    }

    /**
     * builds StagedOrderSetCountryAction without checking for non-null required values
     * @return StagedOrderSetCountryAction
     */
    public StagedOrderSetCountryAction buildUnchecked() {
        return new StagedOrderSetCountryActionImpl(country);
    }

    /**
     * factory method for an instance of StagedOrderSetCountryActionBuilder
     * @return builder
     */
    public static StagedOrderSetCountryActionBuilder of() {
        return new StagedOrderSetCountryActionBuilder();
    }

    /**
     * create builder for StagedOrderSetCountryAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetCountryActionBuilder of(final StagedOrderSetCountryAction template) {
        StagedOrderSetCountryActionBuilder builder = new StagedOrderSetCountryActionBuilder();
        builder.country = template.getCountry();
        return builder;
    }

}

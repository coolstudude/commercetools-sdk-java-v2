
package com.commercetools.api.models.shipping_method;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PriceFunctionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PriceFunction priceFunction = PriceFunction.builder()
 *             .currencyCode("{currencyCode}")
 *             .function("{function}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PriceFunctionBuilder implements Builder<PriceFunction> {

    private String currencyCode;

    private String function;

    /**
     <*  <p>Currency code compliant to ISO 4217.</p>>
     */

    public PriceFunctionBuilder currencyCode(final String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    /**
     <>
     */

    public PriceFunctionBuilder function(final String function) {
        this.function = function;
        return this;
    }

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    public String getFunction() {
        return this.function;
    }

    public PriceFunction build() {
        Objects.requireNonNull(currencyCode, PriceFunction.class + ": currencyCode is missing");
        Objects.requireNonNull(function, PriceFunction.class + ": function is missing");
        return new PriceFunctionImpl(currencyCode, function);
    }

    /**
     * builds PriceFunction without checking for non null required values
     */
    public PriceFunction buildUnchecked() {
        return new PriceFunctionImpl(currencyCode, function);
    }

    public static PriceFunctionBuilder of() {
        return new PriceFunctionBuilder();
    }

    public static PriceFunctionBuilder of(final PriceFunction template) {
        PriceFunctionBuilder builder = new PriceFunctionBuilder();
        builder.currencyCode = template.getCurrencyCode();
        builder.function = template.getFunction();
        return builder;
    }

}


package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>Returned when a Product is not assigned to the Product Selection.</p>
 *  <p>The error is returned as a failed response either to the Set Variant Selection or to the Set Variant Exclusion update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductAssignmentMissingErrorImpl implements ProductAssignmentMissingError, ModelBase {

    private String code;

    private String message;

    private Map<String, java.lang.Object> values;

    private com.commercetools.api.models.product.ProductReference product;

    @JsonCreator
    ProductAssignmentMissingErrorImpl(@JsonProperty("message") final String message,
            @JsonProperty("values") final Map<String, java.lang.Object> values,
            @JsonProperty("product") final com.commercetools.api.models.product.ProductReference product) {
        this.message = message;
        this.values = values;
        this.product = product;
        this.code = PRODUCT_ASSIGNMENT_MISSING;
    }

    public ProductAssignmentMissingErrorImpl() {
        this.code = PRODUCT_ASSIGNMENT_MISSING;
    }

    /**
     *
     */

    public String getCode() {
        return this.code;
    }

    /**
     *  <p>For Product Selection of type Individual, the message is:</p>
     *  <p><code>"A Product Variant Selection can only be set for a Product that has previously been added to the Product Selection."</code></p>
     *  <p>For Product Selection of type Individual Exclusion, the message is:</p>
     *  <p><code>"A Variant Exclusion can only be set for a Product that has previously been added to the Product Selection of type Individual Exclusion."</code></p>
     */

    public String getMessage() {
        return this.message;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     */

    public Map<String, java.lang.Object> values() {
        return values;
    }

    /**
     *  <p>Reference to the Product for which the error was returned.</p>
     */

    public com.commercetools.api.models.product.ProductReference getProduct() {
        return this.product;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public void setValue(String key, java.lang.Object value) {
        if (values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
    }

    public void setProduct(final com.commercetools.api.models.product.ProductReference product) {
        this.product = product;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductAssignmentMissingErrorImpl that = (ProductAssignmentMissingErrorImpl) o;

        return new EqualsBuilder().append(code, that.code)
                .append(message, that.message)
                .append(values, that.values)
                .append(product, that.product)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code).append(message).append(values).append(product).toHashCode();
    }

}

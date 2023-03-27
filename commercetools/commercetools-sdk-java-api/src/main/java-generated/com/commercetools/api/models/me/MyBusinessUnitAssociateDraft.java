
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyBusinessUnitAssociateDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyBusinessUnitAssociateDraft myBusinessUnitAssociateDraft = MyBusinessUnitAssociateDraft.builder()
 *             .version(0.3)
 *             .customer(customerBuilder -> customerBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyBusinessUnitAssociateDraftImpl.class)
public interface MyBusinessUnitAssociateDraft extends io.vrap.rmf.base.client.Draft<MyBusinessUnitAssociateDraft> {

    /**
     *  <p>Expected version of the BusinessUnit on which the changes should be applied. If the expected version does not match the actual version, a 409 Conflict error will be returned.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Customer to create and assign to the Business Unit.</p>
     * @return customer
     */
    @NotNull
    @Valid
    @JsonProperty("customer")
    public MyCustomerDraft getCustomer();

    /**
     *  <p>Expected version of the BusinessUnit on which the changes should be applied. If the expected version does not match the actual version, a 409 Conflict error will be returned.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>Customer to create and assign to the Business Unit.</p>
     * @param customer value to be set
     */

    public void setCustomer(final MyCustomerDraft customer);

    /**
     * factory method
     * @return instance of MyBusinessUnitAssociateDraft
     */
    public static MyBusinessUnitAssociateDraft of() {
        return new MyBusinessUnitAssociateDraftImpl();
    }

    /**
     * factory method to copy an instance of MyBusinessUnitAssociateDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyBusinessUnitAssociateDraft of(final MyBusinessUnitAssociateDraft template) {
        MyBusinessUnitAssociateDraftImpl instance = new MyBusinessUnitAssociateDraftImpl();
        instance.setVersion(template.getVersion());
        instance.setCustomer(template.getCustomer());
        return instance;
    }

    /**
     * builder factory method for MyBusinessUnitAssociateDraft
     * @return builder
     */
    public static MyBusinessUnitAssociateDraftBuilder builder() {
        return MyBusinessUnitAssociateDraftBuilder.of();
    }

    /**
     * create builder for MyBusinessUnitAssociateDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyBusinessUnitAssociateDraftBuilder builder(final MyBusinessUnitAssociateDraft template) {
        return MyBusinessUnitAssociateDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyBusinessUnitAssociateDraft(Function<MyBusinessUnitAssociateDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyBusinessUnitAssociateDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyBusinessUnitAssociateDraft>() {
            @Override
            public String toString() {
                return "TypeReference<MyBusinessUnitAssociateDraft>";
            }
        };
    }
}

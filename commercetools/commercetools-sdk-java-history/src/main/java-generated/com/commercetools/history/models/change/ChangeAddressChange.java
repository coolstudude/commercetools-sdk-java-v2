
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.Address;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeAddressChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeAddressChange changeAddressChange = ChangeAddressChange.builder()
 *             .change("{change}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChangeAddressChangeImpl.class)
public interface ChangeAddressChange extends Change {

    /**
     * discriminator value for ChangeAddressChange
     */
    String CHANGE_ADDRESS_CHANGE = "ChangeAddressChange";

    /**
     *  <p>Update action <code>changeAddress</code> action.</p>
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public Address getNextValue();

    /**
     *
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public Address getPreviousValue();

    /**
     *  <p>Update action <code>changeAddress</code> action.</p>
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     * set nextValue
     * @param nextValue value to be set
     */

    public void setNextValue(final Address nextValue);

    /**
     * set previousValue
     * @param previousValue value to be set
     */

    public void setPreviousValue(final Address previousValue);

    /**
     * factory method
     * @return instance of ChangeAddressChange
     */
    public static ChangeAddressChange of() {
        return new ChangeAddressChangeImpl();
    }

    /**
     * factory method to copy an instance of ChangeAddressChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeAddressChange of(final ChangeAddressChange template) {
        ChangeAddressChangeImpl instance = new ChangeAddressChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    /**
     * builder factory method for ChangeAddressChange
     * @return builder
     */
    public static ChangeAddressChangeBuilder builder() {
        return ChangeAddressChangeBuilder.of();
    }

    /**
     * create builder for ChangeAddressChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeAddressChangeBuilder builder(final ChangeAddressChange template) {
        return ChangeAddressChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangeAddressChange(Function<ChangeAddressChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangeAddressChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeAddressChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeAddressChange>";
            }
        };
    }
}

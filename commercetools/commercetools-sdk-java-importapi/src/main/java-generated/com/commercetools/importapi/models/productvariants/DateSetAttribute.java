
package com.commercetools.importapi.models.productvariants;

import java.time.*;
import java.time.LocalDate;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>This type represents an attribute whose value is a set of dates.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DateSetAttribute dateSetAttribute = DateSetAttribute.builder()
 *             .plusValue(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DateSetAttributeImpl.class)
public interface DateSetAttribute extends Attribute {

    /**
     * discriminator value for DateSetAttribute
     */
    String DATE_SET = "date-set";

    /**
     *
     * @return value
     */
    @NotNull
    @JsonProperty("value")
    public List<LocalDate> getValue();

    /**
     * set value
     * @param value values to be set
     */

    @JsonIgnore
    public void setValue(final LocalDate... value);

    /**
     * set value
     * @param value values to be set
     */

    public void setValue(final List<LocalDate> value);

    /**
     * factory method
     * @return instance of DateSetAttribute
     */
    public static DateSetAttribute of() {
        return new DateSetAttributeImpl();
    }

    /**
     * factory method to copy an instance of DateSetAttribute
     * @param template instance to be copied
     * @return copy instance
     */
    public static DateSetAttribute of(final DateSetAttribute template) {
        DateSetAttributeImpl instance = new DateSetAttributeImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for DateSetAttribute
     * @return builder
     */
    public static DateSetAttributeBuilder builder() {
        return DateSetAttributeBuilder.of();
    }

    /**
     * create builder for DateSetAttribute instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DateSetAttributeBuilder builder(final DateSetAttribute template) {
        return DateSetAttributeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDateSetAttribute(Function<DateSetAttribute, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DateSetAttribute> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DateSetAttribute>() {
            @Override
            public String toString() {
                return "TypeReference<DateSetAttribute>";
            }
        };
    }
}

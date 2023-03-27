
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.ChannelRole;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * AddChannelRolesChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AddChannelRolesChange addChannelRolesChange = AddChannelRolesChange.builder()
 *             .change("{change}")
 *             .plusPreviousValue(previousValueBuilder -> previousValueBuilder)
 *             .plusNextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AddChannelRolesChangeImpl.class)
public interface AddChannelRolesChange extends Change {

    /**
     * discriminator value for AddChannelRolesChange
     */
    String ADD_CHANNEL_ROLES_CHANGE = "AddChannelRolesChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *
     * @return previousValue
     */
    @NotNull
    @JsonProperty("previousValue")
    public List<ChannelRole> getPreviousValue();

    /**
     *
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public List<ChannelRole> getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     * set previousValue
     * @param previousValue values to be set
     */

    @JsonIgnore
    public void setPreviousValue(final ChannelRole... previousValue);

    /**
     * set previousValue
     * @param previousValue values to be set
     */

    public void setPreviousValue(final List<ChannelRole> previousValue);

    /**
     * set nextValue
     * @param nextValue values to be set
     */

    @JsonIgnore
    public void setNextValue(final ChannelRole... nextValue);

    /**
     * set nextValue
     * @param nextValue values to be set
     */

    public void setNextValue(final List<ChannelRole> nextValue);

    /**
     * factory method
     * @return instance of AddChannelRolesChange
     */
    public static AddChannelRolesChange of() {
        return new AddChannelRolesChangeImpl();
    }

    /**
     * factory method to copy an instance of AddChannelRolesChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static AddChannelRolesChange of(final AddChannelRolesChange template) {
        AddChannelRolesChangeImpl instance = new AddChannelRolesChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for AddChannelRolesChange
     * @return builder
     */
    public static AddChannelRolesChangeBuilder builder() {
        return AddChannelRolesChangeBuilder.of();
    }

    /**
     * create builder for AddChannelRolesChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AddChannelRolesChangeBuilder builder(final AddChannelRolesChange template) {
        return AddChannelRolesChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAddChannelRolesChange(Function<AddChannelRolesChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AddChannelRolesChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AddChannelRolesChange>() {
            @Override
            public String toString() {
                return "TypeReference<AddChannelRolesChange>";
            }
        };
    }
}

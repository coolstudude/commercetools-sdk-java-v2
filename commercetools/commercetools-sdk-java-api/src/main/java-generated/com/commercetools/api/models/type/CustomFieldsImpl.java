
package com.commercetools.api.models.type;

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
 *  <p>Serves as value of the <code>custom</code> field on a resource or data type customized with a Type.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomFieldsImpl implements CustomFields, ModelBase {

    private com.commercetools.api.models.type.TypeReference type;

    private com.commercetools.api.models.type.FieldContainer fields;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CustomFieldsImpl(@JsonProperty("type") final com.commercetools.api.models.type.TypeReference type,
            @JsonProperty("fields") final com.commercetools.api.models.type.FieldContainer fields) {
        this.type = type;
        this.fields = fields;
    }

    /**
     * create empty instance
     */
    public CustomFieldsImpl() {
    }

    /**
     *  <p>Reference to the Type that holds the FieldDefinitions for the Custom Fields.</p>
     */

    public com.commercetools.api.models.type.TypeReference getType() {
        return this.type;
    }

    /**
     *  <p>Object containing the Custom Fields for the customized resource or data type.</p>
     */

    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    public void setType(final com.commercetools.api.models.type.TypeReference type) {
        this.type = type;
    }

    public void setFields(final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CustomFieldsImpl that = (CustomFieldsImpl) o;

        return new EqualsBuilder().append(type, that.type).append(fields, that.fields).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(fields).toHashCode();
    }

}

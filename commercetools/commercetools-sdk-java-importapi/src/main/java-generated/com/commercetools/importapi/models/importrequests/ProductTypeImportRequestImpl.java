
package com.commercetools.importapi.models.importrequests;

import java.time.*;
import java.util.*;

import com.commercetools.importapi.models.common.ImportResourceType;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>The request body to import ProductTypes. Contains data for ProductTypes to be created or updated in a Project.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductTypeImportRequestImpl implements ProductTypeImportRequest, ModelBase {

    private com.commercetools.importapi.models.common.ImportResourceType type;

    private java.util.List<com.commercetools.importapi.models.producttypes.ProductTypeImport> resources;

    @JsonCreator
    ProductTypeImportRequestImpl(
            @JsonProperty("resources") final java.util.List<com.commercetools.importapi.models.producttypes.ProductTypeImport> resources) {
        this.resources = resources;
        this.type = ImportResourceType.findEnum("product-type");
    }

    public ProductTypeImportRequestImpl() {
        this.type = ImportResourceType.findEnum("product-type");
    }

    /**
     *  <p>The type of the import resource.</p>
     */

    public com.commercetools.importapi.models.common.ImportResourceType getType() {
        return this.type;
    }

    /**
     *  <p>The product type import resources of this request.</p>
     */

    public java.util.List<com.commercetools.importapi.models.producttypes.ProductTypeImport> getResources() {
        return this.resources;
    }

    public void setResources(final com.commercetools.importapi.models.producttypes.ProductTypeImport... resources) {
        this.resources = new ArrayList<>(Arrays.asList(resources));
    }

    public void setResources(
            final java.util.List<com.commercetools.importapi.models.producttypes.ProductTypeImport> resources) {
        this.resources = resources;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductTypeImportRequestImpl that = (ProductTypeImportRequestImpl) o;

        return new EqualsBuilder().append(type, that.type).append(resources, that.resources).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(resources).toHashCode();
    }

}

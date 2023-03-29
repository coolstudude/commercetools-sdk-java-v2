
package com.commercetools.importapi.models.products;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.common.CategoryKeyReference;
import com.commercetools.importapi.models.common.ImportResource;
import com.commercetools.importapi.models.common.LocalizedString;
import com.commercetools.importapi.models.common.ProductPriceModeEnum;
import com.commercetools.importapi.models.common.ProductTypeKeyReference;
import com.commercetools.importapi.models.common.StateKeyReference;
import com.commercetools.importapi.models.common.TaxCategoryKeyReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>The data representation for a Product to be imported that is persisted as a Product in the Project.</p>
 *  <p>This is the minimal representation required for creating a Product in commercetools.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductImport productImport = ProductImport.builder()
 *             .key("{key}")
 *             .name(nameBuilder -> nameBuilder)
 *             .productType(productTypeBuilder -> productTypeBuilder)
 *             .slug(slugBuilder -> slugBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductImportImpl.class)
public interface ProductImport extends ImportResource {

    /**
     *  <p>Maps to <code>Product.name</code>.</p>
     * @return name
     */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p>The <code>productType</code> of a Product. Maps to <code>Product.productType</code>. The Reference to the ProductType with which the Product is associated. If referenced ProductType does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the necessary ProductType is created.</p>
     * @return productType
     */
    @NotNull
    @Valid
    @JsonProperty("productType")
    public ProductTypeKeyReference getProductType();

    /**
     *  <p>Human-readable identifiers usually used as deep-link URL to the related product. Each slug must be unique across a Project, but a product can have the same slug for different languages. Allowed are alphabetic, numeric, underscore (_) and hyphen (-) characters.</p>
     * @return slug
     */
    @NotNull
    @Valid
    @JsonProperty("slug")
    public LocalizedString getSlug();

    /**
     *  <p>Maps to <code>Product.description</code>.</p>
     * @return description
     */
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    /**
     *  <p>Maps to <code>Product.categories</code>. The References to the Categories with which the Product is associated. If referenced Categories do not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the necessary Categories are created.</p>
     * @return categories
     */
    @Valid
    @JsonProperty("categories")
    public List<CategoryKeyReference> getCategories();

    /**
     *  <p>A localized string is a JSON object where the keys are of IETF language tag, and the values the corresponding strings used for that language.</p>
     *  <pre><code>{
     *    "de": "Hundefutter",
     *    "en": "dog food"
     *  }
     *  </code></pre>
     * @return metaTitle
     */
    @Valid
    @JsonProperty("metaTitle")
    public LocalizedString getMetaTitle();

    /**
     *  <p>A localized string is a JSON object where the keys are of IETF language tag, and the values the corresponding strings used for that language.</p>
     *  <pre><code>{
     *    "de": "Hundefutter",
     *    "en": "dog food"
     *  }
     *  </code></pre>
     * @return metaDescription
     */
    @Valid
    @JsonProperty("metaDescription")
    public LocalizedString getMetaDescription();

    /**
     *  <p>A localized string is a JSON object where the keys are of IETF language tag, and the values the corresponding strings used for that language.</p>
     *  <pre><code>{
     *    "de": "Hundefutter",
     *    "en": "dog food"
     *  }
     *  </code></pre>
     * @return metaKeywords
     */
    @Valid
    @JsonProperty("metaKeywords")
    public LocalizedString getMetaKeywords();

    /**
     *  <p>The Reference to the TaxCategory with which the Product is associated. If referenced TaxCategory does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the necessary TaxCategory is created.</p>
     * @return taxCategory
     */
    @Valid
    @JsonProperty("taxCategory")
    public TaxCategoryKeyReference getTaxCategory();

    /**
     *  <p>Search keywords are primarily used by the suggester but are also considered for the full-text search. SearchKeywords is a JSON object where the keys are of IETF language tag. The value to a language tag key is an array of SearchKeyword for the specific language.</p>
     *  <pre><code>{
     *    "en": [
     *      { "text": "Multi tool" },
     *      { "text": "Swiss Army Knife", "suggestTokenizer": { "type": "whitespace" } }
     *    ],
     *    "de": [
     *      {
     *        "text": "Schweizer Messer",
     *        "suggestTokenizer": {
     *          "type": "custom",
     *          "inputs": ["schweizer messer", "offiziersmesser", "sackmesser"]
     *        }
     *      }
     *    ]
     *  }
     *  </code></pre>
     * @return searchKeywords
     */
    @Valid
    @JsonProperty("searchKeywords")
    public SearchKeywords getSearchKeywords();

    /**
     *  <p>The Reference to the State with which the Product is associated. If referenced State does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the necessary State is created.</p>
     * @return state
     */
    @Valid
    @JsonProperty("state")
    public StateKeyReference getState();

    /**
     *  <p>If <code>publish</code> is set to either <code>true</code> or <code>false</code>, both staged and current projections are set to the same value provided by the import data. If <code>publish</code> is not set, the staged projection is set to the provided import data, but the current projection stays unchanged. However, if the import data contains no update, that is, if it matches the staged projection of the existing Product, the import induces no change in the existing Product whether <code>publish</code> is set or not.</p>
     * @return publish
     */

    @JsonProperty("publish")
    public Boolean getPublish();

    /**
     *  <p>Determines the type of Prices the API uses. See ProductPriceMode for more details. If not provided, the existing <code>Product.priceMode</code> is not changed.</p>
     * @return priceMode
     */

    @JsonProperty("priceMode")
    public ProductPriceModeEnum getPriceMode();

    /**
     *  <p>Maps to <code>Product.name</code>.</p>
     * @param name value to be set
     */

    public void setName(final LocalizedString name);

    /**
     *  <p>The <code>productType</code> of a Product. Maps to <code>Product.productType</code>. The Reference to the ProductType with which the Product is associated. If referenced ProductType does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the necessary ProductType is created.</p>
     * @param productType value to be set
     */

    public void setProductType(final ProductTypeKeyReference productType);

    /**
     *  <p>Human-readable identifiers usually used as deep-link URL to the related product. Each slug must be unique across a Project, but a product can have the same slug for different languages. Allowed are alphabetic, numeric, underscore (_) and hyphen (-) characters.</p>
     * @param slug value to be set
     */

    public void setSlug(final LocalizedString slug);

    /**
     *  <p>Maps to <code>Product.description</code>.</p>
     * @param description value to be set
     */

    public void setDescription(final LocalizedString description);

    /**
     *  <p>Maps to <code>Product.categories</code>. The References to the Categories with which the Product is associated. If referenced Categories do not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the necessary Categories are created.</p>
     * @param categories values to be set
     */

    @JsonIgnore
    public void setCategories(final CategoryKeyReference... categories);

    /**
     *  <p>Maps to <code>Product.categories</code>. The References to the Categories with which the Product is associated. If referenced Categories do not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the necessary Categories are created.</p>
     * @param categories values to be set
     */

    public void setCategories(final List<CategoryKeyReference> categories);

    /**
     *  <p>A localized string is a JSON object where the keys are of IETF language tag, and the values the corresponding strings used for that language.</p>
     *  <pre><code>{
     *    "de": "Hundefutter",
     *    "en": "dog food"
     *  }
     *  </code></pre>
     * @param metaTitle value to be set
     */

    public void setMetaTitle(final LocalizedString metaTitle);

    /**
     *  <p>A localized string is a JSON object where the keys are of IETF language tag, and the values the corresponding strings used for that language.</p>
     *  <pre><code>{
     *    "de": "Hundefutter",
     *    "en": "dog food"
     *  }
     *  </code></pre>
     * @param metaDescription value to be set
     */

    public void setMetaDescription(final LocalizedString metaDescription);

    /**
     *  <p>A localized string is a JSON object where the keys are of IETF language tag, and the values the corresponding strings used for that language.</p>
     *  <pre><code>{
     *    "de": "Hundefutter",
     *    "en": "dog food"
     *  }
     *  </code></pre>
     * @param metaKeywords value to be set
     */

    public void setMetaKeywords(final LocalizedString metaKeywords);

    /**
     *  <p>The Reference to the TaxCategory with which the Product is associated. If referenced TaxCategory does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the necessary TaxCategory is created.</p>
     * @param taxCategory value to be set
     */

    public void setTaxCategory(final TaxCategoryKeyReference taxCategory);

    /**
     *  <p>Search keywords are primarily used by the suggester but are also considered for the full-text search. SearchKeywords is a JSON object where the keys are of IETF language tag. The value to a language tag key is an array of SearchKeyword for the specific language.</p>
     *  <pre><code>{
     *    "en": [
     *      { "text": "Multi tool" },
     *      { "text": "Swiss Army Knife", "suggestTokenizer": { "type": "whitespace" } }
     *    ],
     *    "de": [
     *      {
     *        "text": "Schweizer Messer",
     *        "suggestTokenizer": {
     *          "type": "custom",
     *          "inputs": ["schweizer messer", "offiziersmesser", "sackmesser"]
     *        }
     *      }
     *    ]
     *  }
     *  </code></pre>
     * @param searchKeywords value to be set
     */

    public void setSearchKeywords(final SearchKeywords searchKeywords);

    /**
     *  <p>The Reference to the State with which the Product is associated. If referenced State does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the necessary State is created.</p>
     * @param state value to be set
     */

    public void setState(final StateKeyReference state);

    /**
     *  <p>If <code>publish</code> is set to either <code>true</code> or <code>false</code>, both staged and current projections are set to the same value provided by the import data. If <code>publish</code> is not set, the staged projection is set to the provided import data, but the current projection stays unchanged. However, if the import data contains no update, that is, if it matches the staged projection of the existing Product, the import induces no change in the existing Product whether <code>publish</code> is set or not.</p>
     * @param publish value to be set
     */

    public void setPublish(final Boolean publish);

    /**
     *  <p>Determines the type of Prices the API uses. See ProductPriceMode for more details. If not provided, the existing <code>Product.priceMode</code> is not changed.</p>
     * @param priceMode value to be set
     */

    public void setPriceMode(final ProductPriceModeEnum priceMode);

    /**
     * factory method
     * @return instance of ProductImport
     */
    public static ProductImport of() {
        return new ProductImportImpl();
    }

    /**
     * factory method to create a shallow copy ProductImport
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductImport of(final ProductImport template) {
        ProductImportImpl instance = new ProductImportImpl();
        instance.setKey(template.getKey());
        instance.setName(template.getName());
        instance.setProductType(template.getProductType());
        instance.setSlug(template.getSlug());
        instance.setDescription(template.getDescription());
        instance.setCategories(template.getCategories());
        instance.setMetaTitle(template.getMetaTitle());
        instance.setMetaDescription(template.getMetaDescription());
        instance.setMetaKeywords(template.getMetaKeywords());
        instance.setTaxCategory(template.getTaxCategory());
        instance.setSearchKeywords(template.getSearchKeywords());
        instance.setState(template.getState());
        instance.setPublish(template.getPublish());
        instance.setPriceMode(template.getPriceMode());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductImport
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductImport deepCopy(@Nullable final ProductImport template) {
        if (template == null) {
            return null;
        }
        ProductImportImpl instance = new ProductImportImpl();
        instance.setKey(template.getKey());
        instance.setName(Optional.ofNullable(template.getName())
                .map(com.commercetools.importapi.models.common.LocalizedString::deepCopy)
                .orElse(null));
        instance.setProductType(Optional.ofNullable(template.getProductType())
                .map(com.commercetools.importapi.models.common.ProductTypeKeyReference::deepCopy)
                .orElse(null));
        instance.setSlug(Optional.ofNullable(template.getSlug())
                .map(com.commercetools.importapi.models.common.LocalizedString::deepCopy)
                .orElse(null));
        instance.setDescription(Optional.ofNullable(template.getDescription())
                .map(com.commercetools.importapi.models.common.LocalizedString::deepCopy)
                .orElse(null));
        instance.setCategories(Optional.ofNullable(template.getCategories())
                .map(t -> t.stream()
                        .map(com.commercetools.importapi.models.common.CategoryKeyReference::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setMetaTitle(Optional.ofNullable(template.getMetaTitle())
                .map(com.commercetools.importapi.models.common.LocalizedString::deepCopy)
                .orElse(null));
        instance.setMetaDescription(Optional.ofNullable(template.getMetaDescription())
                .map(com.commercetools.importapi.models.common.LocalizedString::deepCopy)
                .orElse(null));
        instance.setMetaKeywords(Optional.ofNullable(template.getMetaKeywords())
                .map(com.commercetools.importapi.models.common.LocalizedString::deepCopy)
                .orElse(null));
        instance.setTaxCategory(Optional.ofNullable(template.getTaxCategory())
                .map(com.commercetools.importapi.models.common.TaxCategoryKeyReference::deepCopy)
                .orElse(null));
        instance.setSearchKeywords(Optional.ofNullable(template.getSearchKeywords())
                .map(com.commercetools.importapi.models.products.SearchKeywords::deepCopy)
                .orElse(null));
        instance.setState(Optional.ofNullable(template.getState())
                .map(com.commercetools.importapi.models.common.StateKeyReference::deepCopy)
                .orElse(null));
        instance.setPublish(template.getPublish());
        instance.setPriceMode(template.getPriceMode());
        return instance;
    }

    /**
     * builder factory method for ProductImport
     * @return builder
     */
    public static ProductImportBuilder builder() {
        return ProductImportBuilder.of();
    }

    /**
     * create builder for ProductImport instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductImportBuilder builder(final ProductImport template) {
        return ProductImportBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductImport(Function<ProductImport, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductImport> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductImport>() {
            @Override
            public String toString() {
                return "TypeReference<ProductImport>";
            }
        };
    }
}

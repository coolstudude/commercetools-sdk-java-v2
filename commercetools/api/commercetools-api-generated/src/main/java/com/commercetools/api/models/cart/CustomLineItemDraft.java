package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.ExternalTaxRateDraft;
import com.commercetools.api.models.cart.ItemShippingDetailsDraft;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier;
import com.commercetools.api.models.type.CustomFields;
import com.commercetools.api.models.cart.CustomLineItemDraftImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = CustomLineItemDraftImpl.class)
public interface CustomLineItemDraft  {

   
   @NotNull
   @Valid
   @JsonProperty("name")
   public LocalizedString getName();
   /**
   *  <p>The amount of a CustomLineItemin the cart.
   *  Must be a positive integer.</p>
   */
   @NotNull
   @JsonProperty("quantity")
   public Double getQuantity();
   
   @NotNull
   @Valid
   @JsonProperty("money")
   public Money getMoney();
   
   @NotNull
   @JsonProperty("slug")
   public String getSlug();
   /**
   *  <p>The given tax category will be used to select a tax rate when a cart has the TaxMode <code>Platform</code>.</p>
   */
   @Valid
   @JsonProperty("taxCategory")
   public TaxCategoryResourceIdentifier getTaxCategory();
   /**
   *  <p>An external tax rate can be set if the cart has the <code>External</code> TaxMode.</p>
   */
   @Valid
   @JsonProperty("externalTaxRate")
   public ExternalTaxRateDraft getExternalTaxRate();
   /**
   *  <p>The custom fields.</p>
   */
   @Valid
   @JsonProperty("custom")
   public CustomFields getCustom();
   /**
   *  <p>Container for custom line item specific address(es).</p>
   */
   @Valid
   @JsonProperty("shippingDetails")
   public ItemShippingDetailsDraft getShippingDetails();

   public void setName(final LocalizedString name);
   
   public void setQuantity(final Double quantity);
   
   public void setMoney(final Money money);
   
   public void setSlug(final String slug);
   
   public void setTaxCategory(final TaxCategoryResourceIdentifier taxCategory);
   
   public void setExternalTaxRate(final ExternalTaxRateDraft externalTaxRate);
   
   public void setCustom(final CustomFields custom);
   
   public void setShippingDetails(final ItemShippingDetailsDraft shippingDetails);
   
   public static CustomLineItemDraftImpl of(){
      return new CustomLineItemDraftImpl();
   }
   

   public static CustomLineItemDraftImpl of(final CustomLineItemDraft template) {
      CustomLineItemDraftImpl instance = new CustomLineItemDraftImpl();
      instance.setName(template.getName());
      instance.setQuantity(template.getQuantity());
      instance.setMoney(template.getMoney());
      instance.setSlug(template.getSlug());
      instance.setTaxCategory(template.getTaxCategory());
      instance.setExternalTaxRate(template.getExternalTaxRate());
      instance.setCustom(template.getCustom());
      instance.setShippingDetails(template.getShippingDetails());
      return instance;
   }

}

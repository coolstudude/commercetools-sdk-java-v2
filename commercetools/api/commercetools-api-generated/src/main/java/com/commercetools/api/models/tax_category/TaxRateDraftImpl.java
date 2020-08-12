package com.commercetools.api.models.tax_category;

import com.commercetools.api.models.tax_category.SubRate;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class TaxRateDraftImpl implements TaxRateDraft {

   private String name;
   
   private Double amount;
   
   private Boolean includedInPrice;
   
   private String country;
   
   private String state;
   
   private java.util.List<com.commercetools.api.models.tax_category.SubRate> subRates;

   @JsonCreator
   TaxRateDraftImpl(@JsonProperty("name") final String name, @JsonProperty("amount") final Double amount, @JsonProperty("includedInPrice") final Boolean includedInPrice, @JsonProperty("country") final String country, @JsonProperty("state") final String state, @JsonProperty("subRates") final java.util.List<com.commercetools.api.models.tax_category.SubRate> subRates) {
      this.name = name;
      this.amount = amount;
      this.includedInPrice = includedInPrice;
      this.country = country;
      this.state = state;
      this.subRates = subRates;
   }
   public TaxRateDraftImpl() {
      
   }
   
   
   public String getName(){
      return this.name;
   }
   
   /**
   *  <p>Percentage in the range of [0..1].
   *  Must be supplied if no <code>subRates</code> are specified.
   *  If <code>subRates</code> are specified
   *  then the <code>amount</code> can be omitted or it must be the sum of the amounts of all <code>subRates</code>.</p>
   */
   public Double getAmount(){
      return this.amount;
   }
   
   
   public Boolean getIncludedInPrice(){
      return this.includedInPrice;
   }
   
   /**
   *  <p>A two-digit country code as per <a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>.</p>
   */
   public String getCountry(){
      return this.country;
   }
   
   /**
   *  <p>The state in the country</p>
   */
   public String getState(){
      return this.state;
   }
   
   /**
   *  <p>For countries (e.g.
   *  the US) where the total tax is a combination of multiple taxes (e.g.
   *  state and local taxes).</p>
   */
   public java.util.List<com.commercetools.api.models.tax_category.SubRate> getSubRates(){
      return this.subRates;
   }

   public void setName(final String name){
      this.name = name;
   }
   
   public void setAmount(final Double amount){
      this.amount = amount;
   }
   
   public void setIncludedInPrice(final Boolean includedInPrice){
      this.includedInPrice = includedInPrice;
   }
   
   public void setCountry(final String country){
      this.country = country;
   }
   
   public void setState(final String state){
      this.state = state;
   }
   
   public void setSubRates(final java.util.List<com.commercetools.api.models.tax_category.SubRate> subRates){
      this.subRates = subRates;
   }

}

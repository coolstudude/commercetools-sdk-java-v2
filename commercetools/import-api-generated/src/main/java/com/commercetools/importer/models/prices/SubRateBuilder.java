package com.commercetools.importer.models.prices;


import com.commercetools.importer.models.prices.SubRate;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class SubRateBuilder {
   
   
   private String name;
   
   
   private Integer amount;
   
   public SubRateBuilder name( final String name) {
      this.name = name;
      return this;
   }
   
   public SubRateBuilder amount( final Integer amount) {
      this.amount = amount;
      return this;
   }
   
   
   public String getName(){
      return this.name;
   }
   
   
   public Integer getAmount(){
      return this.amount;
   }

   public SubRate build() {
       return new SubRateImpl(name, amount);
   }
   
   public static SubRateBuilder of() {
      return new SubRateBuilder();
   }
   
   public static SubRateBuilder of(final SubRate template) {
      SubRateBuilder builder = new SubRateBuilder();
      builder.name = template.getName();
      builder.amount = template.getAmount();
      return builder;
   }
   
}
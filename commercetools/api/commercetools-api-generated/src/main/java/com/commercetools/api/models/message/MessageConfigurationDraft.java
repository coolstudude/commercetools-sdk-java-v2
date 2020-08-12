package com.commercetools.api.models.message;


import com.commercetools.api.models.message.MessageConfigurationDraftImpl;

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
@JsonDeserialize(as = MessageConfigurationDraftImpl.class)
public interface MessageConfigurationDraft  {

   
   @NotNull
   @JsonProperty("enabled")
   public Boolean getEnabled();
   
   @NotNull
   @JsonProperty("deleteDaysAfterCreation")
   public Integer getDeleteDaysAfterCreation();

   public void setEnabled(final Boolean enabled);
   
   public void setDeleteDaysAfterCreation(final Integer deleteDaysAfterCreation);
   
   public static MessageConfigurationDraftImpl of(){
      return new MessageConfigurationDraftImpl();
   }
   

   public static MessageConfigurationDraftImpl of(final MessageConfigurationDraft template) {
      MessageConfigurationDraftImpl instance = new MessageConfigurationDraftImpl();
      instance.setEnabled(template.getEnabled());
      instance.setDeleteDaysAfterCreation(template.getDeleteDaysAfterCreation());
      return instance;
   }

}

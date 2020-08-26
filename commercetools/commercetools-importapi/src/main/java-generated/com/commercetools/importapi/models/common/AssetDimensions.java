package com.commercetools.importapi.models.common;


import com.commercetools.importapi.models.common.AssetDimensionsImpl;

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
@JsonDeserialize(as = AssetDimensionsImpl.class)
public interface AssetDimensions  {

    
    @NotNull
    @JsonProperty("w")
    public Double getW();
    
    @NotNull
    @JsonProperty("h")
    public Double getH();

    public void setW(final Double w);
    
    public void setH(final Double h);

    public static AssetDimensionsImpl of(){
        return new AssetDimensionsImpl();
    }
    

    public static AssetDimensionsImpl of(final AssetDimensions template) {
        AssetDimensionsImpl instance = new AssetDimensionsImpl();
        instance.setW(template.getW());
        instance.setH(template.getH());
        return instance;
    }

}

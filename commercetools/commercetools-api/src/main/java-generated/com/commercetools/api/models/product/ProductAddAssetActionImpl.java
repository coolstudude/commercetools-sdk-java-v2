package com.commercetools.api.models.product;

import com.commercetools.api.models.common.AssetDraft;
import com.commercetools.api.models.product.ProductUpdateAction;
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
public final class ProductAddAssetActionImpl implements ProductAddAssetAction {

    private String action;
    
    private Long variantId;
    
    private String sku;
    
    private Boolean staged;
    
    private com.commercetools.api.models.common.AssetDraft asset;
    
    private Integer position;

    @JsonCreator
    ProductAddAssetActionImpl(@JsonProperty("variantId") final Long variantId, @JsonProperty("sku") final String sku, @JsonProperty("staged") final Boolean staged, @JsonProperty("asset") final com.commercetools.api.models.common.AssetDraft asset, @JsonProperty("position") final Integer position) {
        this.variantId = variantId;
        this.sku = sku;
        this.staged = staged;
        this.asset = asset;
        this.position = position;
        this.action = "addAsset";
    }
    public ProductAddAssetActionImpl() {
       
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public Long getVariantId(){
        return this.variantId;
    }
    
    
    public String getSku(){
        return this.sku;
    }
    
    
    public Boolean getStaged(){
        return this.staged;
    }
    
    
    public com.commercetools.api.models.common.AssetDraft getAsset(){
        return this.asset;
    }
    
    /**
    *  <p>Position of the new asset inside the existing list (from <code>0</code> to the size of the list)</p>
    */
    public Integer getPosition(){
        return this.position;
    }

    public void setVariantId(final Long variantId){
        this.variantId = variantId;
    }
    
    public void setSku(final String sku){
        this.sku = sku;
    }
    
    public void setStaged(final Boolean staged){
        this.staged = staged;
    }
    
    public void setAsset(final com.commercetools.api.models.common.AssetDraft asset){
        this.asset = asset;
    }
    
    public void setPosition(final Integer position){
        this.position = position;
    }

}

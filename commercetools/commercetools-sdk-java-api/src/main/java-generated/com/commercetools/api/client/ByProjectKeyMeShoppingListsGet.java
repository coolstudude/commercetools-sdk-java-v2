package com.commercetools.api.client;

import io.vrap.rmf.base.client.utils.Utils;
import io.vrap.rmf.base.client.utils.json.VrapJsonUtils;

import java.io.InputStream;
import java.io.IOException;

import java.nio.file.Files;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.concurrent.CompletableFuture;
import io.vrap.rmf.base.client.utils.Generated;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import io.vrap.rmf.base.client.*;


/**
*  <p>Query shopping-lists</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyMeShoppingListsGet extends ApiMethod<ByProjectKeyMeShoppingListsGet> {

    
    private String projectKey;
    

    public ByProjectKeyMeShoppingListsGet(final ApiHttpClient apiHttpClient, String projectKey) {
        super(apiHttpClient);
        this.projectKey = projectKey;
    }

    public ByProjectKeyMeShoppingListsGet(ByProjectKeyMeShoppingListsGet t) {
        super(t);
        this.projectKey = t.projectKey;
    }

    public ApiHttpRequest createHttpRequest() {
        ApiHttpRequest httpRequest = new ApiHttpRequest();
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/me/shopping-lists", this.projectKey);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        httpRequest.setUri(httpRequestPath); 
        httpRequest.setMethod(ApiHttpMethod.GET);
        httpRequest.setHeaders(getHeaders());
        
        return httpRequest;
    }

    public ApiHttpResponse<com.commercetools.api.models.shopping_list.ShoppingListPagedQueryResponse> executeBlocking(){
        try {
            return execute().get();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.shopping_list.ShoppingListPagedQueryResponse>> execute(){
        return apiHttpClient().execute(this.createHttpRequest())
                .thenApply(response -> {
                    if(response.getStatusCode() >= 400){
                        throw new ApiHttpException(response.getStatusCode(), new String(response.getBody()), response.getHeaders());
                    }
                    return Utils.convertResponse(response,com.commercetools.api.models.shopping_list.ShoppingListPagedQueryResponse.class);
                });
    }

    public String getProjectKey() {return this.projectKey;}

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }
    
    public List<String> getSort() {
        return this.getQueryParam("sort");
    }
    
    public List<String> getLimit() {
        return this.getQueryParam("limit");
    }
    
    public List<String> getOffset() {
        return this.getQueryParam("offset");
    }
    
    public List<String> getWithTotal() {
        return this.getQueryParam("withTotal");
    }
    
    public List<String> getWhere() {
        return this.getQueryParam("where");
    }

    public void setProjectKey(final String projectKey) { this.projectKey = projectKey; }

    public ByProjectKeyMeShoppingListsGet withExpand(final String expand){
        return new ByProjectKeyMeShoppingListsGet(this).addQueryParam("expand", expand);
    }
    
    public ByProjectKeyMeShoppingListsGet withSort(final String sort){
        return new ByProjectKeyMeShoppingListsGet(this).addQueryParam("sort", sort);
    }
    
    public ByProjectKeyMeShoppingListsGet withLimit(final Integer limit){
        return new ByProjectKeyMeShoppingListsGet(this).addQueryParam("limit", limit);
    }
    
    public ByProjectKeyMeShoppingListsGet withOffset(final Integer offset){
        return new ByProjectKeyMeShoppingListsGet(this).addQueryParam("offset", offset);
    }
    
    public ByProjectKeyMeShoppingListsGet withWithTotal(final Boolean withTotal){
        return new ByProjectKeyMeShoppingListsGet(this).addQueryParam("withTotal", withTotal);
    }
    
    public ByProjectKeyMeShoppingListsGet withWhere(final String where){
        return new ByProjectKeyMeShoppingListsGet(this).addQueryParam("where", where);
    }
}

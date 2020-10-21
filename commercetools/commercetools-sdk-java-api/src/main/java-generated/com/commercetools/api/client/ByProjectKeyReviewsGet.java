package com.commercetools.api.client;

import io.vrap.rmf.base.client.utils.Utils;
import io.vrap.rmf.base.client.utils.json.VrapJsonUtils;

import java.io.InputStream;
import java.io.IOException;

import java.nio.file.Files;

import java.time.Duration;
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


import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

/**
*  <p>Query reviews</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyReviewsGet extends ApiMethod<ByProjectKeyReviewsGet> {

    
    private String projectKey;
    

    public ByProjectKeyReviewsGet(final ApiHttpClient apiHttpClient, String projectKey) {
        super(apiHttpClient);
        this.projectKey = projectKey;
    }

    public ByProjectKeyReviewsGet(ByProjectKeyReviewsGet t) {
        super(t);
        this.projectKey = t.projectKey;
    }

    public ApiHttpRequest createHttpRequest() {
        ApiHttpRequest httpRequest = new ApiHttpRequest();
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/reviews", this.projectKey);
        if(!params.isEmpty()){
            httpRequestPath += "?" + String.join("&", params);
        }
        httpRequest.setUri(httpRequestPath); 
        httpRequest.setMethod(ApiHttpMethod.GET);
        httpRequest.setHeaders(getHeaders());
        
        return httpRequest;
    }

    public ApiHttpResponse<com.commercetools.api.models.review.ReviewPagedQueryResponse> executeBlocking(){
        return executeBlocking(Duration.ofSeconds(60));
    }
    
    public ApiHttpResponse<com.commercetools.api.models.review.ReviewPagedQueryResponse> executeBlocking(Duration timeout){
        return blockingWait(execute(), timeout);
    }

    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.review.ReviewPagedQueryResponse>> execute(){
        return apiHttpClient().execute(this.createHttpRequest())
                .thenApply(response -> Utils.convertResponse(response,com.commercetools.api.models.review.ReviewPagedQueryResponse.class));
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

    public ByProjectKeyReviewsGet withExpand(final String expand){
        return new ByProjectKeyReviewsGet(this).addQueryParam("expand", expand);
    }
    
    public ByProjectKeyReviewsGet withSort(final String sort){
        return new ByProjectKeyReviewsGet(this).addQueryParam("sort", sort);
    }
    
    public ByProjectKeyReviewsGet withLimit(final Integer limit){
        return new ByProjectKeyReviewsGet(this).addQueryParam("limit", limit);
    }
    
    public ByProjectKeyReviewsGet withOffset(final Integer offset){
        return new ByProjectKeyReviewsGet(this).addQueryParam("offset", offset);
    }
    
    public ByProjectKeyReviewsGet withWithTotal(final Boolean withTotal){
        return new ByProjectKeyReviewsGet(this).addQueryParam("withTotal", withTotal);
    }
    
    public ByProjectKeyReviewsGet withWhere(final String where){
        return new ByProjectKeyReviewsGet(this).addQueryParam("where", where);
    }
}

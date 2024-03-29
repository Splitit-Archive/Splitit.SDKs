/*
 * splitit-web-api-public-sdk
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.splitit.sdk.api;

import com.splitit.ApiCallback;
import com.splitit.ApiClient;
import com.splitit.ApiException;
import com.splitit.ApiResponse;
import com.splitit.Configuration;
import com.splitit.Pair;
import com.splitit.ProgressRequestBody;
import com.splitit.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.splitit.sdk.model.LoginRequest;
import com.splitit.sdk.model.LoginResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LoginApi {
    protected ApiClient apiClient;

    public LoginApi() {
        this(Configuration.getDefaultApiClient());
    }

    public LoginApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for loginPost
     * @param request  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call loginPostCall(LoginRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request;

        // create path and map variables
        String localVarPath = "/api/Login";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json-patch+json", "application/json", "application/_*+json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call loginPostValidateBeforeCall(LoginRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new ApiException("Missing the required parameter 'request' when calling loginPost(Async)");
        }
        

        com.squareup.okhttp.Call call = loginPostCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * 
     * @param request  (required)
     * @return LoginResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LoginResponse loginPost(LoginRequest request) throws ApiException {
        ApiResponse<LoginResponse> resp = loginPostWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * 
     * 
     * @param request  (required)
     * @return ApiResponse&lt;LoginResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LoginResponse> loginPostWithHttpInfo(LoginRequest request) throws ApiException {
        if ("loginPost" != "loginPost") {
            apiClient.performAutologin(false);
        }

        com.squareup.okhttp.Call call = loginPostValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<LoginResponse>(){}.getType();
        try{
            return apiClient.execute(call, localVarReturnType);
        } catch (ApiException e) {
            if (("loginPost" != "loginPost") && (e.getCode() == 704)){
                // Stale session, force-relogin
                apiClient.performAutologin(true);
                // Re-generate the request (to include updated sessionID)
                call = loginPostValidateBeforeCall(request, null, null);
                localVarReturnType = new TypeToken<LoginResponse>(){}.getType();
                return apiClient.execute(call, localVarReturnType);
            } else {
                throw e;
            }
        }
    }

    /**
     *  (asynchronously)
     * 
     * @param request  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call loginPostAsync(LoginRequest request, final ApiCallback<LoginResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = loginPostValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<LoginResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

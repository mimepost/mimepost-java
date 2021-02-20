/*
 * MimePost API Reference (Beta)
 * MimePost API for sending email.  You can find out more about MimePost at [https://mimepost.com](http://mimepost.com). For this sample, you can use the api key `special-key` to test the authorization     filters.
 *
 * OpenAPI spec version: 0.1.0
 * Contact: support@mimepost.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import com.mimepost.ApiCallback;
import com.mimepost.ApiClient;
import com.mimepost.ApiException;
import com.mimepost.ApiResponse;
import com.mimepost.Configuration;
import com.mimepost.Pair;
import com.mimepost.ProgressRequestBody;
import com.mimepost.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.mimepost.model.ApiResponseAllWebhooks;
import com.mimepost.model.ApiResponseSingleWebhooks;
import com.mimepost.model.ApiResponseWebhooks;
import com.mimepost.model.ModelApiResponse;
import com.mimepost.model.Webhook;
import com.mimepost.model.Webhook1;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WebhooksApi {
    private ApiClient apiClient;

    public WebhooksApi() {
        this(Configuration.getDefaultApiClient());
    }

    public WebhooksApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for webhooksGet
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call webhooksGetCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/webhooks/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
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

        String[] localVarAuthNames = new String[] { "api_key" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call webhooksGetValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = webhooksGetCall(progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get the list of all the webhooks
     * 
     * @return ApiResponseAllWebhooks
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponseAllWebhooks webhooksGet() throws ApiException {
        ApiResponse<ApiResponseAllWebhooks> resp = webhooksGetWithHttpInfo();
        return resp.getData();
    }

    /**
     * Get the list of all the webhooks
     * 
     * @return ApiResponse&lt;ApiResponseAllWebhooks&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseAllWebhooks> webhooksGetWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = webhooksGetValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<ApiResponseAllWebhooks>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get the list of all the webhooks (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call webhooksGetAsync(final ApiCallback<ApiResponseAllWebhooks> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = webhooksGetValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseAllWebhooks>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for webhooksIdDelete
     * @param id  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call webhooksIdDeleteCall(Integer id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/webhooks/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
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

        String[] localVarAuthNames = new String[] { "api_key" };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call webhooksIdDeleteValidateBeforeCall(Integer id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling webhooksIdDelete(Async)");
        }
        

        com.squareup.okhttp.Call call = webhooksIdDeleteCall(id, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Remove a single webhook
     * 
     * @param id  (required)
     * @return ModelApiResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ModelApiResponse webhooksIdDelete(Integer id) throws ApiException {
        ApiResponse<ModelApiResponse> resp = webhooksIdDeleteWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * Remove a single webhook
     * 
     * @param id  (required)
     * @return ApiResponse&lt;ModelApiResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ModelApiResponse> webhooksIdDeleteWithHttpInfo(Integer id) throws ApiException {
        com.squareup.okhttp.Call call = webhooksIdDeleteValidateBeforeCall(id, null, null);
        Type localVarReturnType = new TypeToken<ModelApiResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Remove a single webhook (asynchronously)
     * 
     * @param id  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call webhooksIdDeleteAsync(Integer id, final ApiCallback<ModelApiResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = webhooksIdDeleteValidateBeforeCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ModelApiResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for webhooksIdGet
     * @param id  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call webhooksIdGetCall(Integer id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/webhooks/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
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

        String[] localVarAuthNames = new String[] { "api_key" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call webhooksIdGetValidateBeforeCall(Integer id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling webhooksIdGet(Async)");
        }
        

        com.squareup.okhttp.Call call = webhooksIdGetCall(id, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get the details of a single webhook
     * 
     * @param id  (required)
     * @return ApiResponseSingleWebhooks
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponseSingleWebhooks webhooksIdGet(Integer id) throws ApiException {
        ApiResponse<ApiResponseSingleWebhooks> resp = webhooksIdGetWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * Get the details of a single webhook
     * 
     * @param id  (required)
     * @return ApiResponse&lt;ApiResponseSingleWebhooks&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseSingleWebhooks> webhooksIdGetWithHttpInfo(Integer id) throws ApiException {
        com.squareup.okhttp.Call call = webhooksIdGetValidateBeforeCall(id, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseSingleWebhooks>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get the details of a single webhook (asynchronously)
     * 
     * @param id  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call webhooksIdGetAsync(Integer id, final ApiCallback<ApiResponseSingleWebhooks> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = webhooksIdGetValidateBeforeCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseSingleWebhooks>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for webhooksIdPut
     * @param id  (required)
     * @param webhook  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call webhooksIdPutCall(Integer id, Webhook1 webhook, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = webhook;

        // create path and map variables
        String localVarPath = "/webhooks/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
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

        String[] localVarAuthNames = new String[] { "api_key" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call webhooksIdPutValidateBeforeCall(Integer id, Webhook1 webhook, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling webhooksIdPut(Async)");
        }
        

        com.squareup.okhttp.Call call = webhooksIdPutCall(id, webhook, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Update the details of a single webhook
     * 
     * @param id  (required)
     * @param webhook  (optional)
     * @return ApiResponseSingleWebhooks
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponseSingleWebhooks webhooksIdPut(Integer id, Webhook1 webhook) throws ApiException {
        ApiResponse<ApiResponseSingleWebhooks> resp = webhooksIdPutWithHttpInfo(id, webhook);
        return resp.getData();
    }

    /**
     * Update the details of a single webhook
     * 
     * @param id  (required)
     * @param webhook  (optional)
     * @return ApiResponse&lt;ApiResponseSingleWebhooks&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseSingleWebhooks> webhooksIdPutWithHttpInfo(Integer id, Webhook1 webhook) throws ApiException {
        com.squareup.okhttp.Call call = webhooksIdPutValidateBeforeCall(id, webhook, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseSingleWebhooks>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update the details of a single webhook (asynchronously)
     * 
     * @param id  (required)
     * @param webhook  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call webhooksIdPutAsync(Integer id, Webhook1 webhook, final ApiCallback<ApiResponseSingleWebhooks> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = webhooksIdPutValidateBeforeCall(id, webhook, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseSingleWebhooks>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for webhooksPost
     * @param webhook  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call webhooksPostCall(Webhook webhook, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = webhook;

        // create path and map variables
        String localVarPath = "/webhooks/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
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

        String[] localVarAuthNames = new String[] { "api_key" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call webhooksPostValidateBeforeCall(Webhook webhook, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = webhooksPostCall(webhook, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Add single webhook
     * 
     * @param webhook  (optional)
     * @return ApiResponseWebhooks
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponseWebhooks webhooksPost(Webhook webhook) throws ApiException {
        ApiResponse<ApiResponseWebhooks> resp = webhooksPostWithHttpInfo(webhook);
        return resp.getData();
    }

    /**
     * Add single webhook
     * 
     * @param webhook  (optional)
     * @return ApiResponse&lt;ApiResponseWebhooks&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseWebhooks> webhooksPostWithHttpInfo(Webhook webhook) throws ApiException {
        com.squareup.okhttp.Call call = webhooksPostValidateBeforeCall(webhook, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseWebhooks>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Add single webhook (asynchronously)
     * 
     * @param webhook  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call webhooksPostAsync(Webhook webhook, final ApiCallback<ApiResponseWebhooks> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = webhooksPostValidateBeforeCall(webhook, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseWebhooks>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

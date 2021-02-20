# WebhooksApi

All URIs are relative to *https://api.mimepost.com/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**webhooksGet**](WebhooksApi.md#webhooksGet) | **GET** /webhooks/ | Get the list of all the webhooks
[**webhooksIdDelete**](WebhooksApi.md#webhooksIdDelete) | **DELETE** /webhooks/{id} | Remove a single webhook
[**webhooksIdGet**](WebhooksApi.md#webhooksIdGet) | **GET** /webhooks/{id} | Get the details of a single webhook
[**webhooksIdPut**](WebhooksApi.md#webhooksIdPut) | **PUT** /webhooks/{id} | Update the details of a single webhook
[**webhooksPost**](WebhooksApi.md#webhooksPost) | **POST** /webhooks/ | Add single webhook


<a name="webhooksGet"></a>
# **webhooksGet**
> ApiResponseAllWebhooks webhooksGet()

Get the list of all the webhooks

### Example
```java
// Import classes:
//import com.mimepost.ApiClient;
//import com.mimepost.ApiException;
//import com.mimepost.Configuration;
//import com.mimepost.auth.*;
//import io.swagger.client.api.WebhooksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

WebhooksApi apiInstance = new WebhooksApi();
try {
    ApiResponseAllWebhooks result = apiInstance.webhooksGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#webhooksGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ApiResponseAllWebhooks**](ApiResponseAllWebhooks.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="webhooksIdDelete"></a>
# **webhooksIdDelete**
> ModelApiResponse webhooksIdDelete(id)

Remove a single webhook

### Example
```java
// Import classes:
//import com.mimepost.ApiClient;
//import com.mimepost.ApiException;
//import com.mimepost.Configuration;
//import com.mimepost.auth.*;
//import io.swagger.client.api.WebhooksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

WebhooksApi apiInstance = new WebhooksApi();
Integer id = 56; // Integer | 
try {
    ModelApiResponse result = apiInstance.webhooksIdDelete(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#webhooksIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="webhooksIdGet"></a>
# **webhooksIdGet**
> ApiResponseSingleWebhooks webhooksIdGet(id)

Get the details of a single webhook

### Example
```java
// Import classes:
//import com.mimepost.ApiClient;
//import com.mimepost.ApiException;
//import com.mimepost.Configuration;
//import com.mimepost.auth.*;
//import io.swagger.client.api.WebhooksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

WebhooksApi apiInstance = new WebhooksApi();
Integer id = 56; // Integer | 
try {
    ApiResponseSingleWebhooks result = apiInstance.webhooksIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#webhooksIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |

### Return type

[**ApiResponseSingleWebhooks**](ApiResponseSingleWebhooks.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="webhooksIdPut"></a>
# **webhooksIdPut**
> ApiResponseSingleWebhooks webhooksIdPut(id, webhook)

Update the details of a single webhook

### Example
```java
// Import classes:
//import com.mimepost.ApiClient;
//import com.mimepost.ApiException;
//import com.mimepost.Configuration;
//import com.mimepost.auth.*;
//import io.swagger.client.api.WebhooksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

WebhooksApi apiInstance = new WebhooksApi();
Integer id = 56; // Integer | 
Webhook1 webhook = new Webhook1(); // Webhook1 | 
try {
    ApiResponseSingleWebhooks result = apiInstance.webhooksIdPut(id, webhook);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#webhooksIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |
 **webhook** | [**Webhook1**](Webhook1.md)|  | [optional]

### Return type

[**ApiResponseSingleWebhooks**](ApiResponseSingleWebhooks.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="webhooksPost"></a>
# **webhooksPost**
> ApiResponseWebhooks webhooksPost(webhook)

Add single webhook

### Example
```java
// Import classes:
//import com.mimepost.ApiClient;
//import com.mimepost.ApiException;
//import com.mimepost.Configuration;
//import com.mimepost.auth.*;
//import io.swagger.client.api.WebhooksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

WebhooksApi apiInstance = new WebhooksApi();
Webhook webhook = new Webhook(); // Webhook | 
try {
    ApiResponseWebhooks result = apiInstance.webhooksPost(webhook);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#webhooksPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhook** | [**Webhook**](Webhook.md)|  | [optional]

### Return type

[**ApiResponseWebhooks**](ApiResponseWebhooks.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


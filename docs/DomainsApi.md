# DomainsApi

All URIs are relative to *https://api.mimepost.com/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**domainsGet**](DomainsApi.md#domainsGet) | **GET** /domains/ | Get a list of all the domains
[**domainsIdApprovePost**](DomainsApi.md#domainsIdApprovePost) | **POST** /domains/{id}/approve/ | Submit request for the approval of a verified domain
[**domainsIdDelete**](DomainsApi.md#domainsIdDelete) | **DELETE** /domains/{id} | Remove a single domain
[**domainsIdGet**](DomainsApi.md#domainsIdGet) | **GET** /domains/{id} | Get the details of a single domain
[**domainsIdVerifyDkimPost**](DomainsApi.md#domainsIdVerifyDkimPost) | **POST** /domains/{id}/verify_dkim/ | Request for the verification of DKIM record for a single domain
[**domainsIdVerifySpfPost**](DomainsApi.md#domainsIdVerifySpfPost) | **POST** /domains/{id}/verify_spf/ | Request for the verification of SPF record for a single domain
[**domainsIdVerifyTrackingPost**](DomainsApi.md#domainsIdVerifyTrackingPost) | **POST** /domains/{id}/verify_tracking/ | Request for the verification of tracking record for a single domain
[**domainsPost**](DomainsApi.md#domainsPost) | **POST** /domains/ | Add single domain


<a name="domainsGet"></a>
# **domainsGet**
> ApiResponseDomainsList domainsGet()

Get a list of all the domains

### Example
```java
// Import classes:
//import com.mimepost.ApiClient;
//import com.mimepost.ApiException;
//import com.mimepost.Configuration;
//import com.mimepost.auth.*;
//import io.swagger.client.api.DomainsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DomainsApi apiInstance = new DomainsApi();
try {
    ApiResponseDomainsList result = apiInstance.domainsGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DomainsApi#domainsGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ApiResponseDomainsList**](ApiResponseDomainsList.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="domainsIdApprovePost"></a>
# **domainsIdApprovePost**
> ModelApiResponse domainsIdApprovePost(id)

Submit request for the approval of a verified domain

### Example
```java
// Import classes:
//import com.mimepost.ApiClient;
//import com.mimepost.ApiException;
//import com.mimepost.Configuration;
//import com.mimepost.auth.*;
//import io.swagger.client.api.DomainsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DomainsApi apiInstance = new DomainsApi();
Integer id = 56; // Integer | 
try {
    ModelApiResponse result = apiInstance.domainsIdApprovePost(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DomainsApi#domainsIdApprovePost");
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

<a name="domainsIdDelete"></a>
# **domainsIdDelete**
> ModelApiResponse domainsIdDelete(id)

Remove a single domain

### Example
```java
// Import classes:
//import com.mimepost.ApiClient;
//import com.mimepost.ApiException;
//import com.mimepost.Configuration;
//import com.mimepost.auth.*;
//import io.swagger.client.api.DomainsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DomainsApi apiInstance = new DomainsApi();
Integer id = 56; // Integer | 
try {
    ModelApiResponse result = apiInstance.domainsIdDelete(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DomainsApi#domainsIdDelete");
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

<a name="domainsIdGet"></a>
# **domainsIdGet**
> ApiResponseDomainsList domainsIdGet(id)

Get the details of a single domain

### Example
```java
// Import classes:
//import com.mimepost.ApiClient;
//import com.mimepost.ApiException;
//import com.mimepost.Configuration;
//import com.mimepost.auth.*;
//import io.swagger.client.api.DomainsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DomainsApi apiInstance = new DomainsApi();
Integer id = 56; // Integer | 
try {
    ApiResponseDomainsList result = apiInstance.domainsIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DomainsApi#domainsIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |

### Return type

[**ApiResponseDomainsList**](ApiResponseDomainsList.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="domainsIdVerifyDkimPost"></a>
# **domainsIdVerifyDkimPost**
> ModelApiResponse domainsIdVerifyDkimPost(id)

Request for the verification of DKIM record for a single domain

### Example
```java
// Import classes:
//import com.mimepost.ApiClient;
//import com.mimepost.ApiException;
//import com.mimepost.Configuration;
//import com.mimepost.auth.*;
//import io.swagger.client.api.DomainsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DomainsApi apiInstance = new DomainsApi();
Integer id = 56; // Integer | 
try {
    ModelApiResponse result = apiInstance.domainsIdVerifyDkimPost(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DomainsApi#domainsIdVerifyDkimPost");
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

<a name="domainsIdVerifySpfPost"></a>
# **domainsIdVerifySpfPost**
> ModelApiResponse domainsIdVerifySpfPost(id)

Request for the verification of SPF record for a single domain

### Example
```java
// Import classes:
//import com.mimepost.ApiClient;
//import com.mimepost.ApiException;
//import com.mimepost.Configuration;
//import com.mimepost.auth.*;
//import io.swagger.client.api.DomainsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DomainsApi apiInstance = new DomainsApi();
Integer id = 56; // Integer | 
try {
    ModelApiResponse result = apiInstance.domainsIdVerifySpfPost(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DomainsApi#domainsIdVerifySpfPost");
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

<a name="domainsIdVerifyTrackingPost"></a>
# **domainsIdVerifyTrackingPost**
> ModelApiResponse domainsIdVerifyTrackingPost(id)

Request for the verification of tracking record for a single domain

### Example
```java
// Import classes:
//import com.mimepost.ApiClient;
//import com.mimepost.ApiException;
//import com.mimepost.Configuration;
//import com.mimepost.auth.*;
//import io.swagger.client.api.DomainsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DomainsApi apiInstance = new DomainsApi();
Integer id = 56; // Integer | 
try {
    ModelApiResponse result = apiInstance.domainsIdVerifyTrackingPost(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DomainsApi#domainsIdVerifyTrackingPost");
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

<a name="domainsPost"></a>
# **domainsPost**
> ModelApiResponse domainsPost(domain)

Add single domain

### Example
```java
// Import classes:
//import com.mimepost.ApiClient;
//import com.mimepost.ApiException;
//import com.mimepost.Configuration;
//import com.mimepost.auth.*;
//import io.swagger.client.api.DomainsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DomainsApi apiInstance = new DomainsApi();
Domain domain = new Domain(); // Domain | The name of the domain name
try {
    ModelApiResponse result = apiInstance.domainsPost(domain);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DomainsApi#domainsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **domain** | [**Domain**](Domain.md)| The name of the domain name | [optional]

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


# AccountsApi

All URIs are relative to *https://api.mimepost.com/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accountProfileGet**](AccountsApi.md#accountProfileGet) | **GET** /account/profile/ | Get account profile details
[**accountProfilePost**](AccountsApi.md#accountProfilePost) | **POST** /account/profile/ | Update account profile details
[**settingsGet**](AccountsApi.md#settingsGet) | **GET** /settings/ | Get all the settings
[**settingsPost**](AccountsApi.md#settingsPost) | **POST** /settings/ | Set a setting


<a name="accountProfileGet"></a>
# **accountProfileGet**
> AccountProfileResponse accountProfileGet()

Get account profile details



### Example
```java
// Import classes:
//import com.mimepost.ApiClient;
//import com.mimepost.ApiException;
//import com.mimepost.Configuration;
//import com.mimepost.auth.*;
//import io.swagger.client.api.AccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AccountsApi apiInstance = new AccountsApi();
try {
    AccountProfileResponse result = apiInstance.accountProfileGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#accountProfileGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AccountProfileResponse**](AccountProfileResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accountProfilePost"></a>
# **accountProfilePost**
> ModelApiResponse accountProfilePost(body)

Update account profile details



### Example
```java
// Import classes:
//import com.mimepost.ApiClient;
//import com.mimepost.ApiException;
//import com.mimepost.Configuration;
//import com.mimepost.auth.*;
//import io.swagger.client.api.AccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AccountsApi apiInstance = new AccountsApi();
AccountProfile body = new AccountProfile(); // AccountProfile | 
try {
    ModelApiResponse result = apiInstance.accountProfilePost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#accountProfilePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AccountProfile**](AccountProfile.md)|  |

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="settingsGet"></a>
# **settingsGet**
> AccountSettings settingsGet()

Get all the settings



### Example
```java
// Import classes:
//import com.mimepost.ApiClient;
//import com.mimepost.ApiException;
//import com.mimepost.Configuration;
//import com.mimepost.auth.*;
//import io.swagger.client.api.AccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AccountsApi apiInstance = new AccountsApi();
try {
    AccountSettings result = apiInstance.settingsGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#settingsGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AccountSettings**](AccountSettings.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="settingsPost"></a>
# **settingsPost**
> ModelApiResponse settingsPost(body)

Set a setting



### Example
```java
// Import classes:
//import com.mimepost.ApiClient;
//import com.mimepost.ApiException;
//import com.mimepost.Configuration;
//import com.mimepost.auth.*;
//import io.swagger.client.api.AccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AccountsApi apiInstance = new AccountsApi();
AccountSettings body = new AccountSettings(); // AccountSettings | 
try {
    ModelApiResponse result = apiInstance.settingsPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#settingsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AccountSettings**](AccountSettings.md)|  |

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


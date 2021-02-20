# EmailsApi

All URIs are relative to *https://api.mimepost.com/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**sendEmail**](EmailsApi.md#sendEmail) | **POST** /emails/ | Send email


<a name="sendEmail"></a>
# **sendEmail**
> ModelApiResponse sendEmail(body)

Send email



### Example
```java
// Import classes:
//import com.mimepost.ApiClient;
//import com.mimepost.ApiException;
//import com.mimepost.Configuration;
//import com.mimepost.auth.*;
//import io.swagger.client.api.EmailsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

EmailsApi apiInstance = new EmailsApi();
Email body = new Email(); // Email | Single Email object 
try {
    ModelApiResponse result = apiInstance.sendEmail(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailsApi#sendEmail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Email**](Email.md)| Single Email object  |

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


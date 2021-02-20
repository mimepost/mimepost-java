# StatsApi

All URIs are relative to *https://api.mimepost.com/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**emaillogsGet**](StatsApi.md#emaillogsGet) | **GET** /emaillogs/ | Get the logs of a particular date
[**statsGet**](StatsApi.md#statsGet) | **GET** /stats/ | Get the summary of stats for a range of dates


<a name="emaillogsGet"></a>
# **emaillogsGet**
> ApiResponseEmaillogs emaillogsGet(startDate, endDate, status, to, page, limit)

Get the logs of a particular date

### Example
```java
// Import classes:
//import com.mimepost.ApiClient;
//import com.mimepost.ApiException;
//import com.mimepost.Configuration;
//import com.mimepost.auth.*;
//import io.swagger.client.api.StatsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

StatsApi apiInstance = new StatsApi();
String startDate = "startDate_example"; // String | Start Date in yyyymmdd format example 20190801
String endDate = "endDate_example"; // String | End Date in yyyymmdd format example 20190803
String status = "status_example"; // String | 
String to = "to_example"; // String | 
Integer page = 56; // Integer | 
Integer limit = 56; // Integer | 
try {
    ApiResponseEmaillogs result = apiInstance.emaillogsGet(startDate, endDate, status, to, page, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StatsApi#emaillogsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **String**| Start Date in yyyymmdd format example 20190801 |
 **endDate** | **String**| End Date in yyyymmdd format example 20190803 |
 **status** | **String**|  | [optional] [enum: request, delivered, open, click, unsubscribe, bounce_soft, bounce_hard, block_soft, block_hard, spam]
 **to** | **String**|  | [optional]
 **page** | **Integer**|  | [optional]
 **limit** | **Integer**|  | [optional]

### Return type

[**ApiResponseEmaillogs**](ApiResponseEmaillogs.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="statsGet"></a>
# **statsGet**
> ApiResponseStats statsGet(startDate, endDate)

Get the summary of stats for a range of dates

### Example
```java
// Import classes:
//import com.mimepost.ApiClient;
//import com.mimepost.ApiException;
//import com.mimepost.Configuration;
//import com.mimepost.auth.*;
//import io.swagger.client.api.StatsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

StatsApi apiInstance = new StatsApi();
String startDate = "startDate_example"; // String | Start Date in yyyymmdd format example 20190801
String endDate = "endDate_example"; // String | End Date in yyyymmdd format example 20190803
try {
    ApiResponseStats result = apiInstance.statsGet(startDate, endDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StatsApi#statsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **String**| Start Date in yyyymmdd format example 20190801 |
 **endDate** | **String**| End Date in yyyymmdd format example 20190803 |

### Return type

[**ApiResponseStats**](ApiResponseStats.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


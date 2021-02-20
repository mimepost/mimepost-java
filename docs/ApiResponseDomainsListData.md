
# ApiResponseDomainsListData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** |  |  [optional]
**domain** | **String** |  |  [optional]
**selector** | **String** |  |  [optional]
**instanceName** | **String** |  |  [optional]
**spfVerified** | **Integer** |  |  [optional]
**dkimVerified** | **Integer** |  |  [optional]
**trackingVerified** | **Integer** |  |  [optional]
**verified** | **Integer** |  |  [optional]
**approved** | **Integer** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**statusDesc** | **String** |  |  [optional]
**entered** | **String** |  |  [optional]
**active** | **Integer** |  |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
WAITING_APPROVA | &quot;WAITING_APPROVA&quot;
NOT_VERIFIED | &quot;NOT_VERIFIED&quot;
APPROVED | &quot;APPROVED&quot;




# Splitit.SDK.Client.Portable.Api.InstallmentPlanApi

All URIs are relative to *https://webapi.splitit.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**InstallmentPlanApprove**](InstallmentPlanApi.md#installmentplanapprove) | **POST** /api/InstallmentPlan/Approve | 
[**InstallmentPlanCancel**](InstallmentPlanApi.md#installmentplancancel) | **POST** /api/InstallmentPlan/Cancel | 
[**InstallmentPlanCreate**](InstallmentPlanApi.md#installmentplancreate) | **POST** /api/InstallmentPlan/Create | 
[**InstallmentPlanGet**](InstallmentPlanApi.md#installmentplanget) | **POST** /api/InstallmentPlan/Get | 
[**InstallmentPlanInitiate**](InstallmentPlanApi.md#installmentplaninitiate) | **POST** /api/InstallmentPlan/Initiate | 
[**InstallmentPlanRefund**](InstallmentPlanApi.md#installmentplanrefund) | **POST** /api/InstallmentPlan/Refund | 
[**InstallmentPlanStartInstallments**](InstallmentPlanApi.md#installmentplanstartinstallments) | **POST** /api/InstallmentPlan/StartInstallments | 
[**InstallmentPlanUpdate**](InstallmentPlanApi.md#installmentplanupdate) | **POST** /api/InstallmentPlan/Update | 
[**InstallmentPlanVerifyPayment**](InstallmentPlanApi.md#installmentplanverifypayment) | **POST** /api/InstallmentPlan/Get/VerifyPayment | 


<a name="installmentplanapprove"></a>
# **InstallmentPlanApprove**
> InstallmentPlanResponse InstallmentPlanApprove (ApproveInstallmentPlanRequest request)



### Example
```csharp
using System;
using System.Diagnostics;
using Splitit.SDK.Client.Portable.Api;
using Splitit.SDK.Client.Portable.Client;
using Splitit.SDK.Client.Portable.Model;

namespace Example
{
    public class InstallmentPlanApproveExample
    {
        public void main()
        {
            var apiInstance = new InstallmentPlanApi();
            var request = new ApproveInstallmentPlanRequest(); // ApproveInstallmentPlanRequest | 

            try
            {
                InstallmentPlanResponse result = apiInstance.InstallmentPlanApprove(request);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling InstallmentPlanApi.InstallmentPlanApprove: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**ApproveInstallmentPlanRequest**](ApproveInstallmentPlanRequest.md)|  | 

### Return type

[**InstallmentPlanResponse**](InstallmentPlanResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="installmentplancancel"></a>
# **InstallmentPlanCancel**
> InstallmentPlanResponse InstallmentPlanCancel (CancelInstallmentPlanRequest request)



### Example
```csharp
using System;
using System.Diagnostics;
using Splitit.SDK.Client.Portable.Api;
using Splitit.SDK.Client.Portable.Client;
using Splitit.SDK.Client.Portable.Model;

namespace Example
{
    public class InstallmentPlanCancelExample
    {
        public void main()
        {
            var apiInstance = new InstallmentPlanApi();
            var request = new CancelInstallmentPlanRequest(); // CancelInstallmentPlanRequest | 

            try
            {
                InstallmentPlanResponse result = apiInstance.InstallmentPlanCancel(request);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling InstallmentPlanApi.InstallmentPlanCancel: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**CancelInstallmentPlanRequest**](CancelInstallmentPlanRequest.md)|  | 

### Return type

[**InstallmentPlanResponse**](InstallmentPlanResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="installmentplancreate"></a>
# **InstallmentPlanCreate**
> CreateInstallmentsPlanResponse InstallmentPlanCreate (CreateInstallmentPlanRequest request)



### Example
```csharp
using System;
using System.Diagnostics;
using Splitit.SDK.Client.Portable.Api;
using Splitit.SDK.Client.Portable.Client;
using Splitit.SDK.Client.Portable.Model;

namespace Example
{
    public class InstallmentPlanCreateExample
    {
        public void main()
        {
            var apiInstance = new InstallmentPlanApi();
            var request = new CreateInstallmentPlanRequest(); // CreateInstallmentPlanRequest | 

            try
            {
                CreateInstallmentsPlanResponse result = apiInstance.InstallmentPlanCreate(request);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling InstallmentPlanApi.InstallmentPlanCreate: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**CreateInstallmentPlanRequest**](CreateInstallmentPlanRequest.md)|  | 

### Return type

[**CreateInstallmentsPlanResponse**](CreateInstallmentsPlanResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="installmentplanget"></a>
# **InstallmentPlanGet**
> GetInstallmentsPlanResponse InstallmentPlanGet (GetInstallmentsPlanSearchCriteriaRequest request)



### Example
```csharp
using System;
using System.Diagnostics;
using Splitit.SDK.Client.Portable.Api;
using Splitit.SDK.Client.Portable.Client;
using Splitit.SDK.Client.Portable.Model;

namespace Example
{
    public class InstallmentPlanGetExample
    {
        public void main()
        {
            var apiInstance = new InstallmentPlanApi();
            var request = new GetInstallmentsPlanSearchCriteriaRequest(); // GetInstallmentsPlanSearchCriteriaRequest | 

            try
            {
                GetInstallmentsPlanResponse result = apiInstance.InstallmentPlanGet(request);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling InstallmentPlanApi.InstallmentPlanGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**GetInstallmentsPlanSearchCriteriaRequest**](GetInstallmentsPlanSearchCriteriaRequest.md)|  | 

### Return type

[**GetInstallmentsPlanResponse**](GetInstallmentsPlanResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="installmentplaninitiate"></a>
# **InstallmentPlanInitiate**
> InitiateInstallmentsPlanResponse InstallmentPlanInitiate (InitiateInstallmentPlanRequest request)



### Example
```csharp
using System;
using System.Diagnostics;
using Splitit.SDK.Client.Portable.Api;
using Splitit.SDK.Client.Portable.Client;
using Splitit.SDK.Client.Portable.Model;

namespace Example
{
    public class InstallmentPlanInitiateExample
    {
        public void main()
        {
            var apiInstance = new InstallmentPlanApi();
            var request = new InitiateInstallmentPlanRequest(); // InitiateInstallmentPlanRequest | 

            try
            {
                InitiateInstallmentsPlanResponse result = apiInstance.InstallmentPlanInitiate(request);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling InstallmentPlanApi.InstallmentPlanInitiate: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**InitiateInstallmentPlanRequest**](InitiateInstallmentPlanRequest.md)|  | 

### Return type

[**InitiateInstallmentsPlanResponse**](InitiateInstallmentsPlanResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="installmentplanrefund"></a>
# **InstallmentPlanRefund**
> RefundInstallmentPlanResponse InstallmentPlanRefund (RefundPlanRequest request)



### Example
```csharp
using System;
using System.Diagnostics;
using Splitit.SDK.Client.Portable.Api;
using Splitit.SDK.Client.Portable.Client;
using Splitit.SDK.Client.Portable.Model;

namespace Example
{
    public class InstallmentPlanRefundExample
    {
        public void main()
        {
            var apiInstance = new InstallmentPlanApi();
            var request = new RefundPlanRequest(); // RefundPlanRequest | 

            try
            {
                RefundInstallmentPlanResponse result = apiInstance.InstallmentPlanRefund(request);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling InstallmentPlanApi.InstallmentPlanRefund: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**RefundPlanRequest**](RefundPlanRequest.md)|  | 

### Return type

[**RefundInstallmentPlanResponse**](RefundInstallmentPlanResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="installmentplanstartinstallments"></a>
# **InstallmentPlanStartInstallments**
> InstallmentPlanResponse InstallmentPlanStartInstallments (StartInstallmentsRequest request)



### Example
```csharp
using System;
using System.Diagnostics;
using Splitit.SDK.Client.Portable.Api;
using Splitit.SDK.Client.Portable.Client;
using Splitit.SDK.Client.Portable.Model;

namespace Example
{
    public class InstallmentPlanStartInstallmentsExample
    {
        public void main()
        {
            var apiInstance = new InstallmentPlanApi();
            var request = new StartInstallmentsRequest(); // StartInstallmentsRequest | 

            try
            {
                InstallmentPlanResponse result = apiInstance.InstallmentPlanStartInstallments(request);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling InstallmentPlanApi.InstallmentPlanStartInstallments: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**StartInstallmentsRequest**](StartInstallmentsRequest.md)|  | 

### Return type

[**InstallmentPlanResponse**](InstallmentPlanResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="installmentplanupdate"></a>
# **InstallmentPlanUpdate**
> UpdateInstallmentsPlanResponse InstallmentPlanUpdate (UpdateInstallmentPlanRequest request)



### Example
```csharp
using System;
using System.Diagnostics;
using Splitit.SDK.Client.Portable.Api;
using Splitit.SDK.Client.Portable.Client;
using Splitit.SDK.Client.Portable.Model;

namespace Example
{
    public class InstallmentPlanUpdateExample
    {
        public void main()
        {
            var apiInstance = new InstallmentPlanApi();
            var request = new UpdateInstallmentPlanRequest(); // UpdateInstallmentPlanRequest | 

            try
            {
                UpdateInstallmentsPlanResponse result = apiInstance.InstallmentPlanUpdate(request);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling InstallmentPlanApi.InstallmentPlanUpdate: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**UpdateInstallmentPlanRequest**](UpdateInstallmentPlanRequest.md)|  | 

### Return type

[**UpdateInstallmentsPlanResponse**](UpdateInstallmentsPlanResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="installmentplanverifypayment"></a>
# **InstallmentPlanVerifyPayment**
> VerifyPaymentResponse InstallmentPlanVerifyPayment (VerifyPaymentRequest request)



### Example
```csharp
using System;
using System.Diagnostics;
using Splitit.SDK.Client.Portable.Api;
using Splitit.SDK.Client.Portable.Client;
using Splitit.SDK.Client.Portable.Model;

namespace Example
{
    public class InstallmentPlanVerifyPaymentExample
    {
        public void main()
        {
            var apiInstance = new InstallmentPlanApi();
            var request = new VerifyPaymentRequest(); // VerifyPaymentRequest | 

            try
            {
                VerifyPaymentResponse result = apiInstance.InstallmentPlanVerifyPayment(request);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling InstallmentPlanApi.InstallmentPlanVerifyPayment: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**VerifyPaymentRequest**](VerifyPaymentRequest.md)|  | 

### Return type

[**VerifyPaymentResponse**](VerifyPaymentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

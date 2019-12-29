# SplititSdkClient\InstallmentPlanApi

All URIs are relative to *https://webapi.splitit.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**installmentPlanApprove**](InstallmentPlanApi.md#installmentPlanApprove) | **POST** /api/InstallmentPlan/Approve | 
[**installmentPlanCancel**](InstallmentPlanApi.md#installmentPlanCancel) | **POST** /api/InstallmentPlan/Cancel | 
[**installmentPlanCreate**](InstallmentPlanApi.md#installmentPlanCreate) | **POST** /api/InstallmentPlan/Create | 
[**installmentPlanGet**](InstallmentPlanApi.md#installmentPlanGet) | **POST** /api/InstallmentPlan/Get | 
[**installmentPlanInitiate**](InstallmentPlanApi.md#installmentPlanInitiate) | **POST** /api/InstallmentPlan/Initiate | 
[**installmentPlanRefund**](InstallmentPlanApi.md#installmentPlanRefund) | **POST** /api/InstallmentPlan/Refund | 
[**installmentPlanStartInstallments**](InstallmentPlanApi.md#installmentPlanStartInstallments) | **POST** /api/InstallmentPlan/StartInstallments | 
[**installmentPlanUpdate**](InstallmentPlanApi.md#installmentPlanUpdate) | **POST** /api/InstallmentPlan/Update | 
[**installmentPlanVerifyPayment**](InstallmentPlanApi.md#installmentPlanVerifyPayment) | **POST** /api/InstallmentPlan/Get/VerifyPayment | 


# **installmentPlanApprove**
> \SplititSdkClient\Model\InstallmentPlanResponse installmentPlanApprove($request)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new SplititSdkClient\Api\InstallmentPlanApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$request = new \SplititSdkClient\Model\ApproveInstallmentPlanRequest(); // \SplititSdkClient\Model\ApproveInstallmentPlanRequest | 

try {
    $result = $apiInstance->installmentPlanApprove($request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling InstallmentPlanApi->installmentPlanApprove: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**\SplititSdkClient\Model\ApproveInstallmentPlanRequest**](../Model/ApproveInstallmentPlanRequest.md)|  |

### Return type

[**\SplititSdkClient\Model\InstallmentPlanResponse**](../Model/InstallmentPlanResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **installmentPlanCancel**
> \SplititSdkClient\Model\InstallmentPlanResponse installmentPlanCancel($request)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new SplititSdkClient\Api\InstallmentPlanApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$request = new \SplititSdkClient\Model\CancelInstallmentPlanRequest(); // \SplititSdkClient\Model\CancelInstallmentPlanRequest | 

try {
    $result = $apiInstance->installmentPlanCancel($request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling InstallmentPlanApi->installmentPlanCancel: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**\SplititSdkClient\Model\CancelInstallmentPlanRequest**](../Model/CancelInstallmentPlanRequest.md)|  |

### Return type

[**\SplititSdkClient\Model\InstallmentPlanResponse**](../Model/InstallmentPlanResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **installmentPlanCreate**
> \SplititSdkClient\Model\CreateInstallmentsPlanResponse installmentPlanCreate($request)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new SplititSdkClient\Api\InstallmentPlanApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$request = new \SplititSdkClient\Model\CreateInstallmentPlanRequest(); // \SplititSdkClient\Model\CreateInstallmentPlanRequest | 

try {
    $result = $apiInstance->installmentPlanCreate($request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling InstallmentPlanApi->installmentPlanCreate: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**\SplititSdkClient\Model\CreateInstallmentPlanRequest**](../Model/CreateInstallmentPlanRequest.md)|  |

### Return type

[**\SplititSdkClient\Model\CreateInstallmentsPlanResponse**](../Model/CreateInstallmentsPlanResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **installmentPlanGet**
> \SplititSdkClient\Model\GetInstallmentsPlanResponse installmentPlanGet($request)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new SplititSdkClient\Api\InstallmentPlanApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$request = new \SplititSdkClient\Model\GetInstallmentsPlanSearchCriteriaRequest(); // \SplititSdkClient\Model\GetInstallmentsPlanSearchCriteriaRequest | 

try {
    $result = $apiInstance->installmentPlanGet($request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling InstallmentPlanApi->installmentPlanGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**\SplititSdkClient\Model\GetInstallmentsPlanSearchCriteriaRequest**](../Model/GetInstallmentsPlanSearchCriteriaRequest.md)|  |

### Return type

[**\SplititSdkClient\Model\GetInstallmentsPlanResponse**](../Model/GetInstallmentsPlanResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **installmentPlanInitiate**
> \SplititSdkClient\Model\InitiateInstallmentsPlanResponse installmentPlanInitiate($request)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new SplititSdkClient\Api\InstallmentPlanApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$request = new \SplititSdkClient\Model\InitiateInstallmentPlanRequest(); // \SplititSdkClient\Model\InitiateInstallmentPlanRequest | 

try {
    $result = $apiInstance->installmentPlanInitiate($request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling InstallmentPlanApi->installmentPlanInitiate: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**\SplititSdkClient\Model\InitiateInstallmentPlanRequest**](../Model/InitiateInstallmentPlanRequest.md)|  |

### Return type

[**\SplititSdkClient\Model\InitiateInstallmentsPlanResponse**](../Model/InitiateInstallmentsPlanResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **installmentPlanRefund**
> \SplititSdkClient\Model\RefundInstallmentPlanResponse installmentPlanRefund($request)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new SplititSdkClient\Api\InstallmentPlanApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$request = new \SplititSdkClient\Model\RefundPlanRequest(); // \SplititSdkClient\Model\RefundPlanRequest | 

try {
    $result = $apiInstance->installmentPlanRefund($request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling InstallmentPlanApi->installmentPlanRefund: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**\SplititSdkClient\Model\RefundPlanRequest**](../Model/RefundPlanRequest.md)|  |

### Return type

[**\SplititSdkClient\Model\RefundInstallmentPlanResponse**](../Model/RefundInstallmentPlanResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **installmentPlanStartInstallments**
> \SplititSdkClient\Model\InstallmentPlanResponse installmentPlanStartInstallments($request)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new SplititSdkClient\Api\InstallmentPlanApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$request = new \SplititSdkClient\Model\StartInstallmentsRequest(); // \SplititSdkClient\Model\StartInstallmentsRequest | 

try {
    $result = $apiInstance->installmentPlanStartInstallments($request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling InstallmentPlanApi->installmentPlanStartInstallments: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**\SplititSdkClient\Model\StartInstallmentsRequest**](../Model/StartInstallmentsRequest.md)|  |

### Return type

[**\SplititSdkClient\Model\InstallmentPlanResponse**](../Model/InstallmentPlanResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **installmentPlanUpdate**
> \SplititSdkClient\Model\UpdateInstallmentsPlanResponse installmentPlanUpdate($request)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new SplititSdkClient\Api\InstallmentPlanApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$request = new \SplititSdkClient\Model\UpdateInstallmentPlanRequest(); // \SplititSdkClient\Model\UpdateInstallmentPlanRequest | 

try {
    $result = $apiInstance->installmentPlanUpdate($request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling InstallmentPlanApi->installmentPlanUpdate: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**\SplititSdkClient\Model\UpdateInstallmentPlanRequest**](../Model/UpdateInstallmentPlanRequest.md)|  |

### Return type

[**\SplititSdkClient\Model\UpdateInstallmentsPlanResponse**](../Model/UpdateInstallmentsPlanResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **installmentPlanVerifyPayment**
> \SplititSdkClient\Model\VerifyPaymentResponse installmentPlanVerifyPayment($request)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new SplititSdkClient\Api\InstallmentPlanApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$request = new \SplititSdkClient\Model\VerifyPaymentRequest(); // \SplititSdkClient\Model\VerifyPaymentRequest | 

try {
    $result = $apiInstance->installmentPlanVerifyPayment($request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling InstallmentPlanApi->installmentPlanVerifyPayment: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**\SplititSdkClient\Model\VerifyPaymentRequest**](../Model/VerifyPaymentRequest.md)|  |

### Return type

[**\SplititSdkClient\Model\VerifyPaymentResponse**](../Model/VerifyPaymentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)


# TransactionResult

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**gateway_transaction_id** | **str** |  | [optional] 
**splitit_transaction_id** | **int** |  | 
**gateway_result_code** | **str** |  | [optional] 
**gateway_result_message** | **str** |  | [optional] 
**operation_type** | [**ReferenceEntityBase**](ReferenceEntityBase.md) |  | [optional] 
**gateway_result** | **bool** |  | 
**gateway_transaction_date** | **datetime** |  | 
**is_chargeback** | **bool** |  | 
**avs_result** | [**CardResult**](CardResult.md) |  | [optional] 
**cvc_result** | [**CardResult**](CardResult.md) |  | [optional] 
**is_in_dispute** | **bool** |  | [optional] 
**dispute_status** | [**DisputeStatus**](DisputeStatus.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



# PaymentWizardDataResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requested_number_of_installments** | **str** |  | [optional] 
**success_exit_url** | **str** |  | [optional] 
**error_exit_url** | **str** |  | [optional] 
**cancel_exit_url** | **str** |  | [optional] 
**success_async_url** | **str** |  | [optional] 
**view_name** | **str** |  | [optional] 
**is_opened_in_iframe** | **bool** |  | 
**is3d_secure_in_popup** | **bool** |  | [optional] 
**payment_form_message** | **str** |  | [optional] 
**set_short_url** | **bool** |  | 
**show_address_elements** | **str** |  | [optional] 
**currency_display** | [**ExtendedCurrency**](ExtendedCurrency.md) |  | [optional] 
**force_display_important_notes** | **bool** |  | 
**show_shopper_details_expended_on_start** | **bool** |  | 
**show_payment_schedule_required_credit** | **bool** |  | 
**is_shopper_email_mandatory** | **bool** |  | 
**is_shopper_phone_mandatory** | **bool** |  | 
**number_of_installments_selections_option** | **str** |  | [optional] 
**is3ds2_supported** | **bool** |  | 
**processor_name** | **str** |  | [optional] 
**address_is_readonly** | **bool** |  | 
**phone_is_read_only** | **bool** |  | 
**email_is_read_only** | **bool** |  | 
**show_learn_more** | **bool** |  | 
**show_mobile_phone** | **bool** |  | 
**show_close_dialog_before_abandon** | **bool** |  | 
**logo_url** | **str** |  | [optional] 
**default_num_of_installments** | **int** |  | 
**privacy_policy_url** | **str** |  | [optional] 
**terms_and_conditions_url** | **str** |  | [optional] 
**learn_more_url** | **str** |  | [optional] 
**potential_card_types** | [**list[CardType]**](CardType.md) |  | [optional] 
**potential_card_brands** | [**list[CardBrand]**](CardBrand.md) |  | [optional] 
**payment_form_messages** | [**list[PaymentFormMessage]**](PaymentFormMessage.md) |  | [optional] 
**display_properties** | **dict(str, str)** |  | [optional] 
**terms_and_conditions** | [**TermsAndConditions**](TermsAndConditions.md) |  | [optional] 
**payment_methods** | [**list[PaymentMethods]**](PaymentMethods.md) |  | [optional] 
**status** | [**InstallmentPlanStatus**](InstallmentPlanStatus.md) |  | 
**is_attempt3_dsecure** | **bool** |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



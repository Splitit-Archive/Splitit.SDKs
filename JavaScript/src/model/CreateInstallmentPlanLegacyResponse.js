/**
 * splitit-web-api-public
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import ResponseHeader from './ResponseHeader';

/**
 * The CreateInstallmentPlanLegacyResponse model module.
 * @module model/CreateInstallmentPlanLegacyResponse
 * @version 1.0.0
 */
class CreateInstallmentPlanLegacyResponse {
    /**
     * Constructs a new <code>CreateInstallmentPlanLegacyResponse</code>.
     * @alias module:model/CreateInstallmentPlanLegacyResponse
     * @param installmentPlanStatus {Number} 
     * @param result {Number} 
     * @param installmentNumber {Number} 
     * @param amount {Number} 
     */
    constructor(installmentPlanStatus, result, installmentNumber, amount) { 
        
        CreateInstallmentPlanLegacyResponse.initialize(this, installmentPlanStatus, result, installmentNumber, amount);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, installmentPlanStatus, result, installmentNumber, amount) { 
        obj['InstallmentPlanStatus'] = installmentPlanStatus;
        obj['Result'] = result;
        obj['InstallmentNumber'] = installmentNumber;
        obj['Amount'] = amount;
    }

    /**
     * Constructs a <code>CreateInstallmentPlanLegacyResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CreateInstallmentPlanLegacyResponse} obj Optional instance to populate.
     * @return {module:model/CreateInstallmentPlanLegacyResponse} The populated <code>CreateInstallmentPlanLegacyResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CreateInstallmentPlanLegacyResponse();

            if (data.hasOwnProperty('ApiKey')) {
                obj['ApiKey'] = ApiClient.convertToType(data['ApiKey'], 'String');
            }
            if (data.hasOwnProperty('InstallmentPlanStatus')) {
                obj['InstallmentPlanStatus'] = ApiClient.convertToType(data['InstallmentPlanStatus'], 'Number');
            }
            if (data.hasOwnProperty('Result')) {
                obj['Result'] = ApiClient.convertToType(data['Result'], 'Number');
            }
            if (data.hasOwnProperty('PaymentGateway')) {
                obj['PaymentGateway'] = ApiClient.convertToType(data['PaymentGateway'], 'String');
            }
            if (data.hasOwnProperty('Email')) {
                obj['Email'] = ApiClient.convertToType(data['Email'], 'String');
            }
            if (data.hasOwnProperty('ConsumerFullName')) {
                obj['ConsumerFullName'] = ApiClient.convertToType(data['ConsumerFullName'], 'String');
            }
            if (data.hasOwnProperty('ParamX')) {
                obj['ParamX'] = ApiClient.convertToType(data['ParamX'], 'String');
            }
            if (data.hasOwnProperty('InstallmentNumber')) {
                obj['InstallmentNumber'] = ApiClient.convertToType(data['InstallmentNumber'], 'Number');
            }
            if (data.hasOwnProperty('Amount')) {
                obj['Amount'] = ApiClient.convertToType(data['Amount'], 'Number');
            }
            if (data.hasOwnProperty('CurrencyName')) {
                obj['CurrencyName'] = ApiClient.convertToType(data['CurrencyName'], 'String');
            }
            if (data.hasOwnProperty('CurrencySymbol')) {
                obj['CurrencySymbol'] = ApiClient.convertToType(data['CurrencySymbol'], 'String');
            }
            if (data.hasOwnProperty('InstallmentPlanNumber')) {
                obj['InstallmentPlanNumber'] = ApiClient.convertToType(data['InstallmentPlanNumber'], 'String');
            }
            if (data.hasOwnProperty('ResponseHeader')) {
                obj['ResponseHeader'] = ResponseHeader.constructFromObject(data['ResponseHeader']);
            }
        }
        return obj;
    }


}

/**
 * @member {String} ApiKey
 */
CreateInstallmentPlanLegacyResponse.prototype['ApiKey'] = undefined;

/**
 * @member {Number} InstallmentPlanStatus
 */
CreateInstallmentPlanLegacyResponse.prototype['InstallmentPlanStatus'] = undefined;

/**
 * @member {Number} Result
 */
CreateInstallmentPlanLegacyResponse.prototype['Result'] = undefined;

/**
 * @member {String} PaymentGateway
 */
CreateInstallmentPlanLegacyResponse.prototype['PaymentGateway'] = undefined;

/**
 * @member {String} Email
 */
CreateInstallmentPlanLegacyResponse.prototype['Email'] = undefined;

/**
 * @member {String} ConsumerFullName
 */
CreateInstallmentPlanLegacyResponse.prototype['ConsumerFullName'] = undefined;

/**
 * @member {String} ParamX
 */
CreateInstallmentPlanLegacyResponse.prototype['ParamX'] = undefined;

/**
 * @member {Number} InstallmentNumber
 */
CreateInstallmentPlanLegacyResponse.prototype['InstallmentNumber'] = undefined;

/**
 * @member {Number} Amount
 */
CreateInstallmentPlanLegacyResponse.prototype['Amount'] = undefined;

/**
 * @member {String} CurrencyName
 */
CreateInstallmentPlanLegacyResponse.prototype['CurrencyName'] = undefined;

/**
 * @member {String} CurrencySymbol
 */
CreateInstallmentPlanLegacyResponse.prototype['CurrencySymbol'] = undefined;

/**
 * @member {String} InstallmentPlanNumber
 */
CreateInstallmentPlanLegacyResponse.prototype['InstallmentPlanNumber'] = undefined;

/**
 * @member {module:model/ResponseHeader} ResponseHeader
 */
CreateInstallmentPlanLegacyResponse.prototype['ResponseHeader'] = undefined;






export default CreateInstallmentPlanLegacyResponse;

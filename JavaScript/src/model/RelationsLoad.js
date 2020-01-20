/**
 * splitit-web-api-public-sdk
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
import InstallmentPlanActivityStatus from './InstallmentPlanActivityStatus';

/**
 * The RelationsLoad model module.
 * @module model/RelationsLoad
 * @version 1.3.11
 */
class RelationsLoad {
    /**
     * Constructs a new <code>RelationsLoad</code>.
     * @alias module:model/RelationsLoad
     * @param installments {module:model/InstallmentPlanActivityStatus} 
     * @param secureAuthorizations {module:model/InstallmentPlanActivityStatus} 
     */
    constructor(installments, secureAuthorizations) { 
        
        RelationsLoad.initialize(this, installments, secureAuthorizations);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, installments, secureAuthorizations) { 
        obj['Installments'] = installments;
        obj['SecureAuthorizations'] = secureAuthorizations;
    }

    /**
     * Constructs a <code>RelationsLoad</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/RelationsLoad} obj Optional instance to populate.
     * @return {module:model/RelationsLoad} The populated <code>RelationsLoad</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new RelationsLoad();

            if (data.hasOwnProperty('Installments')) {
                obj['Installments'] = InstallmentPlanActivityStatus.constructFromObject(data['Installments']);
            }
            if (data.hasOwnProperty('SecureAuthorizations')) {
                obj['SecureAuthorizations'] = InstallmentPlanActivityStatus.constructFromObject(data['SecureAuthorizations']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/InstallmentPlanActivityStatus} Installments
 */
RelationsLoad.prototype['Installments'] = undefined;

/**
 * @member {module:model/InstallmentPlanActivityStatus} SecureAuthorizations
 */
RelationsLoad.prototype['SecureAuthorizations'] = undefined;






export default RelationsLoad;


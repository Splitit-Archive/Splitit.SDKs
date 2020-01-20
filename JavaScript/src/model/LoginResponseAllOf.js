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
import ResponseStatus from './ResponseStatus';

/**
 * The LoginResponseAllOf model module.
 * @module model/LoginResponseAllOf
 * @version 1.3.11
 */
class LoginResponseAllOf {
    /**
     * Constructs a new <code>LoginResponseAllOf</code>.
     * @alias module:model/LoginResponseAllOf
     * @param result {Number} 
     */
    constructor(result) { 
        
        LoginResponseAllOf.initialize(this, result);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, result) { 
        obj['Result'] = result;
    }

    /**
     * Constructs a <code>LoginResponseAllOf</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/LoginResponseAllOf} obj Optional instance to populate.
     * @return {module:model/LoginResponseAllOf} The populated <code>LoginResponseAllOf</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new LoginResponseAllOf();

            if (data.hasOwnProperty('Result')) {
                obj['Result'] = ApiClient.convertToType(data['Result'], 'Number');
            }
            if (data.hasOwnProperty('ResponseStatus')) {
                obj['ResponseStatus'] = ResponseStatus.constructFromObject(data['ResponseStatus']);
            }
        }
        return obj;
    }


}

/**
 * @member {Number} Result
 */
LoginResponseAllOf.prototype['Result'] = undefined;

/**
 * @member {module:model/ResponseStatus} ResponseStatus
 */
LoginResponseAllOf.prototype['ResponseStatus'] = undefined;






export default LoginResponseAllOf;


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
import ResponseHeader from './ResponseHeader';

/**
 * The LoginResponse2 model module.
 * @module model/LoginResponse2
 * @version 1.3.11
 */
class LoginResponse2 {
    /**
     * Constructs a new <code>LoginResponse2</code>.
     * @alias module:model/LoginResponse2
     */
    constructor() { 
        
        LoginResponse2.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>LoginResponse2</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/LoginResponse2} obj Optional instance to populate.
     * @return {module:model/LoginResponse2} The populated <code>LoginResponse2</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new LoginResponse2();

            if (data.hasOwnProperty('ResponseHeader')) {
                obj['ResponseHeader'] = ResponseHeader.constructFromObject(data['ResponseHeader']);
            }
            if (data.hasOwnProperty('SessionId')) {
                obj['SessionId'] = ApiClient.convertToType(data['SessionId'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ResponseHeader} ResponseHeader
 */
LoginResponse2.prototype['ResponseHeader'] = undefined;

/**
 * @member {String} SessionId
 */
LoginResponse2.prototype['SessionId'] = undefined;






export default LoginResponse2;


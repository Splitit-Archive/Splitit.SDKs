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

/**
 * The ReferenceEntityBase model module.
 * @module model/ReferenceEntityBase
 * @version 1.0.0
 */
class ReferenceEntityBase {
    /**
     * Constructs a new <code>ReferenceEntityBase</code>.
     * @alias module:model/ReferenceEntityBase
     * @param id {Number} 
     */
    constructor(id) { 
        
        ReferenceEntityBase.initialize(this, id);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, id) { 
        obj['Id'] = id;
    }

    /**
     * Constructs a <code>ReferenceEntityBase</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ReferenceEntityBase} obj Optional instance to populate.
     * @return {module:model/ReferenceEntityBase} The populated <code>ReferenceEntityBase</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ReferenceEntityBase();

            if (data.hasOwnProperty('Id')) {
                obj['Id'] = ApiClient.convertToType(data['Id'], 'Number');
            }
            if (data.hasOwnProperty('Code')) {
                obj['Code'] = ApiClient.convertToType(data['Code'], 'String');
            }
            if (data.hasOwnProperty('Description')) {
                obj['Description'] = ApiClient.convertToType(data['Description'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {Number} Id
 */
ReferenceEntityBase.prototype['Id'] = undefined;

/**
 * @member {String} Code
 */
ReferenceEntityBase.prototype['Code'] = undefined;

/**
 * @member {String} Description
 */
ReferenceEntityBase.prototype['Description'] = undefined;






export default ReferenceEntityBase;

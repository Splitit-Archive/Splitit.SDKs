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

/**
 * The PagingResponseHeader model module.
 * @module model/PagingResponseHeader
 * @version 1.3.11
 */
class PagingResponseHeader {
    /**
     * Constructs a new <code>PagingResponseHeader</code>.
     * @alias module:model/PagingResponseHeader
     * @param totalNumber {Number} 
     */
    constructor(totalNumber) { 
        
        PagingResponseHeader.initialize(this, totalNumber);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, totalNumber) { 
        obj['TotalNumber'] = totalNumber;
    }

    /**
     * Constructs a <code>PagingResponseHeader</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/PagingResponseHeader} obj Optional instance to populate.
     * @return {module:model/PagingResponseHeader} The populated <code>PagingResponseHeader</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PagingResponseHeader();

            if (data.hasOwnProperty('TotalNumber')) {
                obj['TotalNumber'] = ApiClient.convertToType(data['TotalNumber'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * @member {Number} TotalNumber
 */
PagingResponseHeader.prototype['TotalNumber'] = undefined;






export default PagingResponseHeader;


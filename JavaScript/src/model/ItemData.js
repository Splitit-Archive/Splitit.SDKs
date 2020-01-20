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
import MoneyWithCurrencyCode from './MoneyWithCurrencyCode';

/**
 * The ItemData model module.
 * @module model/ItemData
 * @version 1.3.11
 */
class ItemData {
    /**
     * Constructs a new <code>ItemData</code>.
     * @alias module:model/ItemData
     * @param quantity {Number} 
     */
    constructor(quantity) { 
        
        ItemData.initialize(this, quantity);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, quantity) { 
        obj['Quantity'] = quantity;
    }

    /**
     * Constructs a <code>ItemData</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ItemData} obj Optional instance to populate.
     * @return {module:model/ItemData} The populated <code>ItemData</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ItemData();

            if (data.hasOwnProperty('Name')) {
                obj['Name'] = ApiClient.convertToType(data['Name'], 'String');
            }
            if (data.hasOwnProperty('Sku')) {
                obj['Sku'] = ApiClient.convertToType(data['Sku'], 'String');
            }
            if (data.hasOwnProperty('Price')) {
                obj['Price'] = MoneyWithCurrencyCode.constructFromObject(data['Price']);
            }
            if (data.hasOwnProperty('Quantity')) {
                obj['Quantity'] = ApiClient.convertToType(data['Quantity'], 'Number');
            }
            if (data.hasOwnProperty('Description')) {
                obj['Description'] = ApiClient.convertToType(data['Description'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {String} Name
 */
ItemData.prototype['Name'] = undefined;

/**
 * @member {String} Sku
 */
ItemData.prototype['Sku'] = undefined;

/**
 * @member {module:model/MoneyWithCurrencyCode} Price
 */
ItemData.prototype['Price'] = undefined;

/**
 * @member {Number} Quantity
 */
ItemData.prototype['Quantity'] = undefined;

/**
 * @member {String} Description
 */
ItemData.prototype['Description'] = undefined;






export default ItemData;


/* tslint:disable */
/* eslint-disable */
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
 */

import { exists, mapValues } from '../runtime';
import {
    PgtlDto,
    PgtlDtoFromJSON,
    PgtlDtoFromJSONTyped,
    PgtlDtoToJSON,
    ResponseHeader,
    ResponseHeaderFromJSON,
    ResponseHeaderFromJSONTyped,
    ResponseHeaderToJSON,
} from './';

/**
 * 
 * @export
 * @interface GetPGTLResponse
 */
export interface GetPGTLResponse {
    /**
     * 
     * @type {ResponseHeader}
     * @memberof GetPGTLResponse
     */
    responseHeader?: ResponseHeader;
    /**
     * 
     * @type {{ [key: string]: Array<PgtlDto>; }}
     * @memberof GetPGTLResponse
     */
    paymentGatewaytransactionResponses?: { [key: string]: Array<PgtlDto>; };
}

export function GetPGTLResponseFromJSON(json: any): GetPGTLResponse {
    return GetPGTLResponseFromJSONTyped(json, false);
}

export function GetPGTLResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): GetPGTLResponse {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'responseHeader': !exists(json, 'ResponseHeader') ? undefined : ResponseHeaderFromJSON(json['ResponseHeader']),
        'paymentGatewaytransactionResponses': !exists(json, 'paymentGatewaytransactionResponses') ? undefined : json['paymentGatewaytransactionResponses'],
    };
}

export function GetPGTLResponseToJSON(value?: GetPGTLResponse | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'ResponseHeader': ResponseHeaderToJSON(value.responseHeader),
        'paymentGatewaytransactionResponses': value.paymentGatewaytransactionResponses,
    };
}



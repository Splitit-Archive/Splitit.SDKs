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
import { ResponseHeader } from './';
/**
 *
 * @export
 * @interface LogoutResponse
 */
export interface LogoutResponse {
    /**
     *
     * @type {ResponseHeader}
     * @memberof LogoutResponse
     */
    responseHeader?: ResponseHeader;
}
export declare function LogoutResponseFromJSON(json: any): LogoutResponse;
export declare function LogoutResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): LogoutResponse;
export declare function LogoutResponseToJSON(value?: LogoutResponse | null): any;

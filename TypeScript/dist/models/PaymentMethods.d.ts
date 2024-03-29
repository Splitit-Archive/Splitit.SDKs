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
/**
 *
 * @export
 * @enum {string}
 */
export declare enum PaymentMethods {
    ApplePay = "ApplePay",
    GooglePay = "GooglePay",
    CreditCard = "CreditCard",
    PaysafeIssuedCardID = "PaysafeIssuedCardID"
}
export declare function PaymentMethodsFromJSON(json: any): PaymentMethods;
export declare function PaymentMethodsFromJSONTyped(json: any, ignoreDiscriminator: boolean): PaymentMethods;
export declare function PaymentMethodsToJSON(value?: PaymentMethods | null): any;

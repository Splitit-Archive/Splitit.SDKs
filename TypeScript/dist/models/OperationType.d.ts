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
export declare enum OperationType {
    None = "None",
    Authorize = "Authorize",
    Capture = "Capture",
    Void = "Void",
    Refund = "Refund",
    Cancel = "Cancel",
    CheckCaptureAsyncResponse = "CheckCaptureAsyncResponse",
    VerifyCard = "VerifyCard"
}
export declare function OperationTypeFromJSON(json: any): OperationType;
export declare function OperationTypeFromJSONTyped(json: any, ignoreDiscriminator: boolean): OperationType;
export declare function OperationTypeToJSON(value?: OperationType | null): any;

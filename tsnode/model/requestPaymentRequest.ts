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

import { RequestFile } from '../api';

export class RequestPaymentRequest {
    'installmentPlanNumber'?: string;
    'paymentApprovalPhone'?: string;
    'paymentApprovalEmail'?: string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "installmentPlanNumber",
            "baseName": "InstallmentPlanNumber",
            "type": "string"
        },
        {
            "name": "paymentApprovalPhone",
            "baseName": "PaymentApprovalPhone",
            "type": "string"
        },
        {
            "name": "paymentApprovalEmail",
            "baseName": "PaymentApprovalEmail",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return RequestPaymentRequest.attributeTypeMap;
    }
}


"use strict";
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
Object.defineProperty(exports, "__esModule", { value: true });
var runtime_1 = require("../runtime");
var _1 = require("./");
function PgtlDtoFromJSON(json) {
    return PgtlDtoFromJSONTyped(json, false);
}
exports.PgtlDtoFromJSON = PgtlDtoFromJSON;
function PgtlDtoFromJSONTyped(json, ignoreDiscriminator) {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        'id': json['Id'],
        'result': json['Result'],
        'traceId': !runtime_1.exists(json, 'TraceId') ? undefined : json['TraceId'],
        'captureId': !runtime_1.exists(json, 'CaptureId') ? undefined : json['CaptureId'],
        'isChargeback': json['IsChargeback'],
        'createdDate': !runtime_1.exists(json, 'CreatedDate') ? undefined : json['CreatedDate'],
        'transactionId': !runtime_1.exists(json, 'TransactionId') ? undefined : json['TransactionId'],
        'installmentPlanId': !runtime_1.exists(json, 'InstallmentPlanId') ? undefined : json['InstallmentPlanId'],
        'completeResponseXml': !runtime_1.exists(json, 'CompleteResponseXml') ? undefined : json['CompleteResponseXml'],
        'terminalGatewayDataId': json['TerminalGatewayDataId'],
        'avsMessageMessageCode': !runtime_1.exists(json, 'AvsMessageMessageCode') ? undefined : json['AvsMessageMessageCode'],
        'avsMessageMessageText': !runtime_1.exists(json, 'AvsMessageMessageText') ? undefined : json['AvsMessageMessageText'],
        'cvvMessageMessageCode': !runtime_1.exists(json, 'CvvMessageMessageCode') ? undefined : json['CvvMessageMessageCode'],
        'cvvMessageMessageText': !runtime_1.exists(json, 'CvvMessageMessageText') ? undefined : json['CvvMessageMessageText'],
        'requestedCurrencyCode': !runtime_1.exists(json, 'RequestedCurrencyCode') ? undefined : json['RequestedCurrencyCode'],
        'processedAmountAmount': json['ProcessedAmountAmount'],
        'requestedAmountAmount': json['RequestedAmountAmount'],
        'resultMessageMessageCode': !runtime_1.exists(json, 'ResultMessageMessageCode') ? undefined : json['ResultMessageMessageCode'],
        'resultMessageMessageText': !runtime_1.exists(json, 'ResultMessageMessageText') ? undefined : json['ResultMessageMessageText'],
        'type': _1.OperationTypeFromJSON(json['Type']),
        'referencePaymentGatewayTransactionLogId': !runtime_1.exists(json, 'ReferencePaymentGatewayTransactionLogId') ? undefined : json['ReferencePaymentGatewayTransactionLogId'],
    };
}
exports.PgtlDtoFromJSONTyped = PgtlDtoFromJSONTyped;
function PgtlDtoToJSON(value) {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        'Id': value.id,
        'Result': value.result,
        'TraceId': value.traceId,
        'CaptureId': value.captureId,
        'IsChargeback': value.isChargeback,
        'CreatedDate': value.createdDate,
        'TransactionId': value.transactionId,
        'InstallmentPlanId': value.installmentPlanId,
        'CompleteResponseXml': value.completeResponseXml,
        'TerminalGatewayDataId': value.terminalGatewayDataId,
        'AvsMessageMessageCode': value.avsMessageMessageCode,
        'AvsMessageMessageText': value.avsMessageMessageText,
        'CvvMessageMessageCode': value.cvvMessageMessageCode,
        'CvvMessageMessageText': value.cvvMessageMessageText,
        'RequestedCurrencyCode': value.requestedCurrencyCode,
        'ProcessedAmountAmount': value.processedAmountAmount,
        'RequestedAmountAmount': value.requestedAmountAmount,
        'ResultMessageMessageCode': value.resultMessageMessageCode,
        'ResultMessageMessageText': value.resultMessageMessageText,
        'Type': _1.OperationTypeToJSON(value.type),
        'ReferencePaymentGatewayTransactionLogId': value.referencePaymentGatewayTransactionLogId,
    };
}
exports.PgtlDtoToJSON = PgtlDtoToJSON;

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
    CardResult,
    CardResultFromJSON,
    CardResultFromJSONTyped,
    CardResultToJSON,
    DisputeStatus,
    DisputeStatusFromJSON,
    DisputeStatusFromJSONTyped,
    DisputeStatusToJSON,
    ReferenceEntityBase,
    ReferenceEntityBaseFromJSON,
    ReferenceEntityBaseFromJSONTyped,
    ReferenceEntityBaseToJSON,
} from './';

/**
 * 
 * @export
 * @interface TransactionResult
 */
export interface TransactionResult {
    /**
     * 
     * @type {string}
     * @memberof TransactionResult
     */
    gatewayTransactionId?: string;
    /**
     * 
     * @type {number}
     * @memberof TransactionResult
     */
    splititTransactionId: number;
    /**
     * 
     * @type {string}
     * @memberof TransactionResult
     */
    gatewayResultCode?: string;
    /**
     * 
     * @type {string}
     * @memberof TransactionResult
     */
    gatewayResultMessage?: string;
    /**
     * 
     * @type {ReferenceEntityBase}
     * @memberof TransactionResult
     */
    operationType?: ReferenceEntityBase;
    /**
     * 
     * @type {boolean}
     * @memberof TransactionResult
     */
    gatewayResult: boolean;
    /**
     * 
     * @type {Date}
     * @memberof TransactionResult
     */
    gatewayTransactionDate: Date;
    /**
     * 
     * @type {boolean}
     * @memberof TransactionResult
     */
    isChargeback: boolean;
    /**
     * 
     * @type {CardResult}
     * @memberof TransactionResult
     */
    aVSResult?: CardResult;
    /**
     * 
     * @type {CardResult}
     * @memberof TransactionResult
     */
    cVCResult?: CardResult;
    /**
     * 
     * @type {boolean}
     * @memberof TransactionResult
     */
    isInDispute?: boolean;
    /**
     * 
     * @type {DisputeStatus}
     * @memberof TransactionResult
     */
    disputeStatus?: DisputeStatus;
}

export function TransactionResultFromJSON(json: any): TransactionResult {
    return TransactionResultFromJSONTyped(json, false);
}

export function TransactionResultFromJSONTyped(json: any, ignoreDiscriminator: boolean): TransactionResult {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'gatewayTransactionId': !exists(json, 'GatewayTransactionId') ? undefined : json['GatewayTransactionId'],
        'splititTransactionId': json['SplititTransactionId'],
        'gatewayResultCode': !exists(json, 'GatewayResultCode') ? undefined : json['GatewayResultCode'],
        'gatewayResultMessage': !exists(json, 'GatewayResultMessage') ? undefined : json['GatewayResultMessage'],
        'operationType': !exists(json, 'OperationType') ? undefined : ReferenceEntityBaseFromJSON(json['OperationType']),
        'gatewayResult': json['GatewayResult'],
        'gatewayTransactionDate': (new Date(json['GatewayTransactionDate'])),
        'isChargeback': json['IsChargeback'],
        'aVSResult': !exists(json, 'AVSResult') ? undefined : CardResultFromJSON(json['AVSResult']),
        'cVCResult': !exists(json, 'CVCResult') ? undefined : CardResultFromJSON(json['CVCResult']),
        'isInDispute': !exists(json, 'IsInDispute') ? undefined : json['IsInDispute'],
        'disputeStatus': !exists(json, 'DisputeStatus') ? undefined : DisputeStatusFromJSON(json['DisputeStatus']),
    };
}

export function TransactionResultToJSON(value?: TransactionResult | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'GatewayTransactionId': value.gatewayTransactionId,
        'SplititTransactionId': value.splititTransactionId,
        'GatewayResultCode': value.gatewayResultCode,
        'GatewayResultMessage': value.gatewayResultMessage,
        'OperationType': ReferenceEntityBaseToJSON(value.operationType),
        'GatewayResult': value.gatewayResult,
        'GatewayTransactionDate': (value.gatewayTransactionDate.toISOString()),
        'IsChargeback': value.isChargeback,
        'AVSResult': CardResultToJSON(value.aVSResult),
        'CVCResult': CardResultToJSON(value.cVCResult),
        'IsInDispute': value.isInDispute,
        'DisputeStatus': DisputeStatusToJSON(value.disputeStatus),
    };
}



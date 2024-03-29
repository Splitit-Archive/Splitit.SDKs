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
import { CardResult, DisputeStatus, ReferenceEntityBase } from './';
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
export declare function TransactionResultFromJSON(json: any): TransactionResult;
export declare function TransactionResultFromJSONTyped(json: any, ignoreDiscriminator: boolean): TransactionResult;
export declare function TransactionResultToJSON(value?: TransactionResult | null): any;

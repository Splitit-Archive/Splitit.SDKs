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
import { OperationType } from './';
/**
 *
 * @export
 * @interface PgtlDto
 */
export interface PgtlDto {
    /**
     *
     * @type {number}
     * @memberof PgtlDto
     */
    id: number;
    /**
     *
     * @type {boolean}
     * @memberof PgtlDto
     */
    result: boolean;
    /**
     *
     * @type {string}
     * @memberof PgtlDto
     */
    traceId?: string;
    /**
     *
     * @type {string}
     * @memberof PgtlDto
     */
    captureId?: string;
    /**
     *
     * @type {boolean}
     * @memberof PgtlDto
     */
    isChargeback: boolean;
    /**
     *
     * @type {string}
     * @memberof PgtlDto
     */
    createdDate?: string;
    /**
     *
     * @type {string}
     * @memberof PgtlDto
     */
    transactionId?: string;
    /**
     *
     * @type {number}
     * @memberof PgtlDto
     */
    installmentPlanId?: number;
    /**
     *
     * @type {string}
     * @memberof PgtlDto
     */
    completeResponseXml?: string;
    /**
     *
     * @type {number}
     * @memberof PgtlDto
     */
    terminalGatewayDataId: number;
    /**
     *
     * @type {string}
     * @memberof PgtlDto
     */
    avsMessageMessageCode?: string;
    /**
     *
     * @type {string}
     * @memberof PgtlDto
     */
    avsMessageMessageText?: string;
    /**
     *
     * @type {string}
     * @memberof PgtlDto
     */
    cvvMessageMessageCode?: string;
    /**
     *
     * @type {string}
     * @memberof PgtlDto
     */
    cvvMessageMessageText?: string;
    /**
     *
     * @type {string}
     * @memberof PgtlDto
     */
    requestedCurrencyCode?: string;
    /**
     *
     * @type {number}
     * @memberof PgtlDto
     */
    processedAmountAmount: number;
    /**
     *
     * @type {number}
     * @memberof PgtlDto
     */
    requestedAmountAmount: number;
    /**
     *
     * @type {string}
     * @memberof PgtlDto
     */
    resultMessageMessageCode?: string;
    /**
     *
     * @type {string}
     * @memberof PgtlDto
     */
    resultMessageMessageText?: string;
    /**
     *
     * @type {OperationType}
     * @memberof PgtlDto
     */
    type: OperationType;
    /**
     *
     * @type {number}
     * @memberof PgtlDto
     */
    referencePaymentGatewayTransactionLogId?: number;
}
export declare function PgtlDtoFromJSON(json: any): PgtlDto;
export declare function PgtlDtoFromJSONTyped(json: any, ignoreDiscriminator: boolean): PgtlDto;
export declare function PgtlDtoToJSON(value?: PgtlDto | null): any;

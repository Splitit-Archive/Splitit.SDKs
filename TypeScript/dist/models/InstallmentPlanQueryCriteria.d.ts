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
import { DelayResolution, FraudCheckResult, InstallmentPlanDateInfo, InstallmentPlanInitiatedStatuses, InstallmentPlanStatus, PlanStrategy, TestModes, TransactionInfo } from './';
/**
 *
 * @export
 * @interface InstallmentPlanQueryCriteria
 */
export interface InstallmentPlanQueryCriteria {
    /**
     *
     * @type {number}
     * @memberof InstallmentPlanQueryCriteria
     */
    merchantId: number;
    /**
     *
     * @type {number}
     * @memberof InstallmentPlanQueryCriteria
     */
    currencyId: number;
    /**
     *
     * @type {number}
     * @memberof InstallmentPlanQueryCriteria
     */
    installmentPlanId: number;
    /**
     *
     * @type {string}
     * @memberof InstallmentPlanQueryCriteria
     */
    installmentPlanNumber?: string;
    /**
     *
     * @type {string}
     * @memberof InstallmentPlanQueryCriteria
     */
    refOrderNumber?: string;
    /**
     *
     * @type {number}
     * @memberof InstallmentPlanQueryCriteria
     */
    installmentPlanAmount: number;
    /**
     *
     * @type {string}
     * @memberof InstallmentPlanQueryCriteria
     */
    cardNumber?: string;
    /**
     *
     * @type {string}
     * @memberof InstallmentPlanQueryCriteria
     */
    consumerName?: string;
    /**
     *
     * @type {string}
     * @memberof InstallmentPlanQueryCriteria
     */
    consumerEmail?: string;
    /**
     *
     * @type {string}
     * @memberof InstallmentPlanQueryCriteria
     */
    cardHolder?: string;
    /**
     *
     * @type {number}
     * @memberof InstallmentPlanQueryCriteria
     */
    pisMemberId: number;
    /**
     *
     * @type {string}
     * @memberof InstallmentPlanQueryCriteria
     */
    anyFilter?: string;
    /**
     *
     * @type {boolean}
     * @memberof InstallmentPlanQueryCriteria
     */
    eula: boolean;
    /**
     *
     * @type {boolean}
     * @memberof InstallmentPlanQueryCriteria
     */
    showChargebackPlans: boolean;
    /**
     *
     * @type {boolean}
     * @memberof InstallmentPlanQueryCriteria
     */
    isInAutoRetry?: boolean;
    /**
     *
     * @type {PlanStrategy}
     * @memberof InstallmentPlanQueryCriteria
     */
    strategy?: PlanStrategy;
    /**
     *
     * @type {InstallmentPlanInitiatedStatuses}
     * @memberof InstallmentPlanQueryCriteria
     */
    initiatedStatuses?: InstallmentPlanInitiatedStatuses;
    /**
     *
     * @type {FraudCheckResult}
     * @memberof InstallmentPlanQueryCriteria
     */
    fraudCheckResult?: FraudCheckResult;
    /**
     *
     * @type {Array<InstallmentPlanStatus>}
     * @memberof InstallmentPlanQueryCriteria
     */
    installmentsPlanStatuses?: Array<InstallmentPlanStatus>;
    /**
     *
     * @type {Array<TestModes>}
     * @memberof InstallmentPlanQueryCriteria
     */
    testModes?: Array<TestModes>;
    /**
     *
     * @type {Array<DelayResolution>}
     * @memberof InstallmentPlanQueryCriteria
     */
    delayResolutions?: Array<DelayResolution>;
    /**
     *
     * @type {TransactionInfo}
     * @memberof InstallmentPlanQueryCriteria
     */
    transactionInformation?: TransactionInfo;
    /**
     *
     * @type {InstallmentPlanDateInfo}
     * @memberof InstallmentPlanQueryCriteria
     */
    dateInfo?: InstallmentPlanDateInfo;
}
export declare function InstallmentPlanQueryCriteriaFromJSON(json: any): InstallmentPlanQueryCriteria;
export declare function InstallmentPlanQueryCriteriaFromJSONTyped(json: any, ignoreDiscriminator: boolean): InstallmentPlanQueryCriteria;
export declare function InstallmentPlanQueryCriteriaToJSON(value?: InstallmentPlanQueryCriteria | null): any;

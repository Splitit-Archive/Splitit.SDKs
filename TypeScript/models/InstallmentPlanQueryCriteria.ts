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
    DelayResolution,
    DelayResolutionFromJSON,
    DelayResolutionFromJSONTyped,
    DelayResolutionToJSON,
    FraudCheckResult,
    FraudCheckResultFromJSON,
    FraudCheckResultFromJSONTyped,
    FraudCheckResultToJSON,
    InstallmentPlanDateInfo,
    InstallmentPlanDateInfoFromJSON,
    InstallmentPlanDateInfoFromJSONTyped,
    InstallmentPlanDateInfoToJSON,
    InstallmentPlanInitiatedStatuses,
    InstallmentPlanInitiatedStatusesFromJSON,
    InstallmentPlanInitiatedStatusesFromJSONTyped,
    InstallmentPlanInitiatedStatusesToJSON,
    InstallmentPlanStatus,
    InstallmentPlanStatusFromJSON,
    InstallmentPlanStatusFromJSONTyped,
    InstallmentPlanStatusToJSON,
    PlanStrategy,
    PlanStrategyFromJSON,
    PlanStrategyFromJSONTyped,
    PlanStrategyToJSON,
    TestModes,
    TestModesFromJSON,
    TestModesFromJSONTyped,
    TestModesToJSON,
    TransactionInfo,
    TransactionInfoFromJSON,
    TransactionInfoFromJSONTyped,
    TransactionInfoToJSON,
} from './';

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

export function InstallmentPlanQueryCriteriaFromJSON(json: any): InstallmentPlanQueryCriteria {
    return InstallmentPlanQueryCriteriaFromJSONTyped(json, false);
}

export function InstallmentPlanQueryCriteriaFromJSONTyped(json: any, ignoreDiscriminator: boolean): InstallmentPlanQueryCriteria {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'merchantId': json['MerchantId'],
        'currencyId': json['CurrencyId'],
        'installmentPlanId': json['InstallmentPlanId'],
        'installmentPlanNumber': !exists(json, 'InstallmentPlanNumber') ? undefined : json['InstallmentPlanNumber'],
        'refOrderNumber': !exists(json, 'RefOrderNumber') ? undefined : json['RefOrderNumber'],
        'installmentPlanAmount': json['InstallmentPlanAmount'],
        'cardNumber': !exists(json, 'CardNumber') ? undefined : json['CardNumber'],
        'consumerName': !exists(json, 'ConsumerName') ? undefined : json['ConsumerName'],
        'consumerEmail': !exists(json, 'ConsumerEmail') ? undefined : json['ConsumerEmail'],
        'cardHolder': !exists(json, 'CardHolder') ? undefined : json['CardHolder'],
        'pisMemberId': json['PisMemberId'],
        'anyFilter': !exists(json, 'AnyFilter') ? undefined : json['AnyFilter'],
        'eula': json['Eula'],
        'showChargebackPlans': json['ShowChargebackPlans'],
        'isInAutoRetry': !exists(json, 'IsInAutoRetry') ? undefined : json['IsInAutoRetry'],
        'strategy': !exists(json, 'Strategy') ? undefined : PlanStrategyFromJSON(json['Strategy']),
        'initiatedStatuses': !exists(json, 'InitiatedStatuses') ? undefined : InstallmentPlanInitiatedStatusesFromJSON(json['InitiatedStatuses']),
        'fraudCheckResult': !exists(json, 'FraudCheckResult') ? undefined : FraudCheckResultFromJSON(json['FraudCheckResult']),
        'installmentsPlanStatuses': !exists(json, 'InstallmentsPlanStatuses') ? undefined : ((json['InstallmentsPlanStatuses'] as Array<any>).map(InstallmentPlanStatusFromJSON)),
        'testModes': !exists(json, 'TestModes') ? undefined : ((json['TestModes'] as Array<any>).map(TestModesFromJSON)),
        'delayResolutions': !exists(json, 'DelayResolutions') ? undefined : ((json['DelayResolutions'] as Array<any>).map(DelayResolutionFromJSON)),
        'transactionInformation': !exists(json, 'TransactionInformation') ? undefined : TransactionInfoFromJSON(json['TransactionInformation']),
        'dateInfo': !exists(json, 'DateInfo') ? undefined : InstallmentPlanDateInfoFromJSON(json['DateInfo']),
    };
}

export function InstallmentPlanQueryCriteriaToJSON(value?: InstallmentPlanQueryCriteria | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'MerchantId': value.merchantId,
        'CurrencyId': value.currencyId,
        'InstallmentPlanId': value.installmentPlanId,
        'InstallmentPlanNumber': value.installmentPlanNumber,
        'RefOrderNumber': value.refOrderNumber,
        'InstallmentPlanAmount': value.installmentPlanAmount,
        'CardNumber': value.cardNumber,
        'ConsumerName': value.consumerName,
        'ConsumerEmail': value.consumerEmail,
        'CardHolder': value.cardHolder,
        'PisMemberId': value.pisMemberId,
        'AnyFilter': value.anyFilter,
        'Eula': value.eula,
        'ShowChargebackPlans': value.showChargebackPlans,
        'IsInAutoRetry': value.isInAutoRetry,
        'Strategy': PlanStrategyToJSON(value.strategy),
        'InitiatedStatuses': InstallmentPlanInitiatedStatusesToJSON(value.initiatedStatuses),
        'FraudCheckResult': FraudCheckResultToJSON(value.fraudCheckResult),
        'InstallmentsPlanStatuses': value.installmentsPlanStatuses === undefined ? undefined : ((value.installmentsPlanStatuses as Array<any>).map(InstallmentPlanStatusToJSON)),
        'TestModes': value.testModes === undefined ? undefined : ((value.testModes as Array<any>).map(TestModesToJSON)),
        'DelayResolutions': value.delayResolutions === undefined ? undefined : ((value.delayResolutions as Array<any>).map(DelayResolutionToJSON)),
        'TransactionInformation': TransactionInfoToJSON(value.transactionInformation),
        'DateInfo': InstallmentPlanDateInfoToJSON(value.dateInfo),
    };
}



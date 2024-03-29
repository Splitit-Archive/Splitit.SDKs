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
import { DelayResolution } from './delayResolution';
import { FraudCheckResult } from './fraudCheckResult';
import { InstallmentPlanDateInfo } from './installmentPlanDateInfo';
import { InstallmentPlanInitiatedStatuses } from './installmentPlanInitiatedStatuses';
import { InstallmentPlanStatus } from './installmentPlanStatus';
import { PlanStrategy } from './planStrategy';
import { TestModes } from './testModes';
import { TransactionInfo } from './transactionInfo';

export class InstallmentPlanQueryCriteria {
    'merchantId': number;
    'currencyId': number;
    'installmentPlanId': number;
    'installmentPlanNumber'?: string;
    'refOrderNumber'?: string;
    'installmentPlanAmount': number;
    'cardNumber'?: string;
    'consumerName'?: string;
    'consumerEmail'?: string;
    'cardHolder'?: string;
    'pisMemberId': number;
    'anyFilter'?: string;
    'eula': boolean;
    'showChargebackPlans': boolean;
    'isInAutoRetry'?: boolean;
    'strategy'?: PlanStrategy;
    'initiatedStatuses'?: InstallmentPlanInitiatedStatuses;
    'fraudCheckResult'?: FraudCheckResult;
    'installmentsPlanStatuses'?: Array<InstallmentPlanStatus>;
    'testModes'?: Array<TestModes>;
    'delayResolutions'?: Array<DelayResolution>;
    'transactionInformation'?: TransactionInfo;
    'dateInfo'?: InstallmentPlanDateInfo;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "merchantId",
            "baseName": "MerchantId",
            "type": "number"
        },
        {
            "name": "currencyId",
            "baseName": "CurrencyId",
            "type": "number"
        },
        {
            "name": "installmentPlanId",
            "baseName": "InstallmentPlanId",
            "type": "number"
        },
        {
            "name": "installmentPlanNumber",
            "baseName": "InstallmentPlanNumber",
            "type": "string"
        },
        {
            "name": "refOrderNumber",
            "baseName": "RefOrderNumber",
            "type": "string"
        },
        {
            "name": "installmentPlanAmount",
            "baseName": "InstallmentPlanAmount",
            "type": "number"
        },
        {
            "name": "cardNumber",
            "baseName": "CardNumber",
            "type": "string"
        },
        {
            "name": "consumerName",
            "baseName": "ConsumerName",
            "type": "string"
        },
        {
            "name": "consumerEmail",
            "baseName": "ConsumerEmail",
            "type": "string"
        },
        {
            "name": "cardHolder",
            "baseName": "CardHolder",
            "type": "string"
        },
        {
            "name": "pisMemberId",
            "baseName": "PisMemberId",
            "type": "number"
        },
        {
            "name": "anyFilter",
            "baseName": "AnyFilter",
            "type": "string"
        },
        {
            "name": "eula",
            "baseName": "Eula",
            "type": "boolean"
        },
        {
            "name": "showChargebackPlans",
            "baseName": "ShowChargebackPlans",
            "type": "boolean"
        },
        {
            "name": "isInAutoRetry",
            "baseName": "IsInAutoRetry",
            "type": "boolean"
        },
        {
            "name": "strategy",
            "baseName": "Strategy",
            "type": "PlanStrategy"
        },
        {
            "name": "initiatedStatuses",
            "baseName": "InitiatedStatuses",
            "type": "InstallmentPlanInitiatedStatuses"
        },
        {
            "name": "fraudCheckResult",
            "baseName": "FraudCheckResult",
            "type": "FraudCheckResult"
        },
        {
            "name": "installmentsPlanStatuses",
            "baseName": "InstallmentsPlanStatuses",
            "type": "Array<InstallmentPlanStatus>"
        },
        {
            "name": "testModes",
            "baseName": "TestModes",
            "type": "Array<TestModes>"
        },
        {
            "name": "delayResolutions",
            "baseName": "DelayResolutions",
            "type": "Array<DelayResolution>"
        },
        {
            "name": "transactionInformation",
            "baseName": "TransactionInformation",
            "type": "TransactionInfo"
        },
        {
            "name": "dateInfo",
            "baseName": "DateInfo",
            "type": "InstallmentPlanDateInfo"
        }    ];

    static getAttributeTypeMap() {
        return InstallmentPlanQueryCriteria.attributeTypeMap;
    }
}


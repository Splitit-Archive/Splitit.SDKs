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
import { Currency } from './';
/**
 *
 * @export
 * @interface PaymentWizardDataResponseAllOf
 */
export interface PaymentWizardDataResponseAllOf {
    /**
     *
     * @type {string}
     * @memberof PaymentWizardDataResponseAllOf
     */
    showAddressElements?: string;
    /**
     *
     * @type {Currency}
     * @memberof PaymentWizardDataResponseAllOf
     */
    currencyDisplay?: Currency;
    /**
     *
     * @type {boolean}
     * @memberof PaymentWizardDataResponseAllOf
     */
    forceDisplayImportantNotes: boolean;
    /**
     *
     * @type {boolean}
     * @memberof PaymentWizardDataResponseAllOf
     */
    showShopperDetailsExpendedOnStart: boolean;
    /**
     *
     * @type {boolean}
     * @memberof PaymentWizardDataResponseAllOf
     */
    showPaymentScheduleRequiredCredit: boolean;
    /**
     *
     * @type {boolean}
     * @memberof PaymentWizardDataResponseAllOf
     */
    isShopperEmailMandatory: boolean;
    /**
     *
     * @type {boolean}
     * @memberof PaymentWizardDataResponseAllOf
     */
    isShopperPhoneMandatory: boolean;
    /**
     *
     * @type {string}
     * @memberof PaymentWizardDataResponseAllOf
     */
    numberOfInstallmentsSelectionsOption?: string;
    /**
     *
     * @type {boolean}
     * @memberof PaymentWizardDataResponseAllOf
     */
    addressIsReadonly: boolean;
    /**
     *
     * @type {string}
     * @memberof PaymentWizardDataResponseAllOf
     */
    logoURL?: string;
    /**
     *
     * @type {string}
     * @memberof PaymentWizardDataResponseAllOf
     */
    privacyPolicyUrl?: string;
    /**
     *
     * @type {string}
     * @memberof PaymentWizardDataResponseAllOf
     */
    termsAndConditionsUrl?: string;
    /**
     *
     * @type {string}
     * @memberof PaymentWizardDataResponseAllOf
     */
    learnMoreUrl?: string;
    /**
     *
     * @type {Array<string>}
     * @memberof PaymentWizardDataResponseAllOf
     */
    paymentFormMessages?: Array<string>;
}
export declare function PaymentWizardDataResponseAllOfFromJSON(json: any): PaymentWizardDataResponseAllOf;
export declare function PaymentWizardDataResponseAllOfFromJSONTyped(json: any, ignoreDiscriminator: boolean): PaymentWizardDataResponseAllOf;
export declare function PaymentWizardDataResponseAllOfToJSON(value?: PaymentWizardDataResponseAllOf | null): any;

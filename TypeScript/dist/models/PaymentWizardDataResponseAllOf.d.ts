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
import { CardBrand, CardType, ExtendedCurrency, InstallmentPlanStatus, PaymentFormMessage, PaymentMethods, TermsAndConditions } from './';
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
     * @type {ExtendedCurrency}
     * @memberof PaymentWizardDataResponseAllOf
     */
    currencyDisplay?: ExtendedCurrency;
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
    is3ds2Supported: boolean;
    /**
     *
     * @type {string}
     * @memberof PaymentWizardDataResponseAllOf
     */
    processorName?: string;
    /**
     *
     * @type {boolean}
     * @memberof PaymentWizardDataResponseAllOf
     */
    addressIsReadonly: boolean;
    /**
     *
     * @type {boolean}
     * @memberof PaymentWizardDataResponseAllOf
     */
    phoneIsReadOnly: boolean;
    /**
     *
     * @type {boolean}
     * @memberof PaymentWizardDataResponseAllOf
     */
    emailIsReadOnly: boolean;
    /**
     *
     * @type {boolean}
     * @memberof PaymentWizardDataResponseAllOf
     */
    showLearnMore: boolean;
    /**
     *
     * @type {boolean}
     * @memberof PaymentWizardDataResponseAllOf
     */
    showMobilePhone: boolean;
    /**
     *
     * @type {boolean}
     * @memberof PaymentWizardDataResponseAllOf
     */
    showCloseDialogBeforeAbandon: boolean;
    /**
     *
     * @type {string}
     * @memberof PaymentWizardDataResponseAllOf
     */
    logoURL?: string;
    /**
     *
     * @type {number}
     * @memberof PaymentWizardDataResponseAllOf
     */
    defaultNumOfInstallments: number;
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
     * @type {Array<CardType>}
     * @memberof PaymentWizardDataResponseAllOf
     */
    potentialCardTypes?: Array<CardType>;
    /**
     *
     * @type {Array<CardBrand>}
     * @memberof PaymentWizardDataResponseAllOf
     */
    potentialCardBrands?: Array<CardBrand>;
    /**
     *
     * @type {Array<PaymentFormMessage>}
     * @memberof PaymentWizardDataResponseAllOf
     */
    paymentFormMessages?: Array<PaymentFormMessage>;
    /**
     *
     * @type {{ [key: string]: string; }}
     * @memberof PaymentWizardDataResponseAllOf
     */
    displayProperties?: {
        [key: string]: string;
    };
    /**
     *
     * @type {TermsAndConditions}
     * @memberof PaymentWizardDataResponseAllOf
     */
    termsAndConditions?: TermsAndConditions;
    /**
     *
     * @type {Array<PaymentMethods>}
     * @memberof PaymentWizardDataResponseAllOf
     */
    paymentMethods?: Array<PaymentMethods>;
    /**
     *
     * @type {InstallmentPlanStatus}
     * @memberof PaymentWizardDataResponseAllOf
     */
    status: InstallmentPlanStatus;
    /**
     *
     * @type {boolean}
     * @memberof PaymentWizardDataResponseAllOf
     */
    isAttempt3Dsecure: boolean;
}
export declare function PaymentWizardDataResponseAllOfFromJSON(json: any): PaymentWizardDataResponseAllOf;
export declare function PaymentWizardDataResponseAllOfFromJSONTyped(json: any, ignoreDiscriminator: boolean): PaymentWizardDataResponseAllOf;
export declare function PaymentWizardDataResponseAllOfToJSON(value?: PaymentWizardDataResponseAllOf | null): any;

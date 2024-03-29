# coding: utf-8

"""
    splitit-web-api-public-sdk

    No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)  # noqa: E501

    OpenAPI spec version: 1.0.0
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


import pprint
import re  # noqa: F401

import six


class GetInitiatedUpdatePaymentDataResponse(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    """
    Attributes:
      swagger_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    swagger_types = {
        'response_header': 'ResponseHeader',
        'card_data': 'CardData',
        'merchant': 'MerchantRef',
        'redirect_urls': 'RedirectUrls',
        'outstanding_amount': 'MoneyWithCurrencyCode',
        'terms_and_conditions': 'TermsAndConditions',
        'processor_name': 'str',
        'is3_ds_required': 'bool',
        'last_error': 'Error',
        'logo': 'str',
        'installment_plan_number': 'str'
    }

    attribute_map = {
        'response_header': 'ResponseHeader',
        'card_data': 'CardData',
        'merchant': 'Merchant',
        'redirect_urls': 'RedirectUrls',
        'outstanding_amount': 'OutstandingAmount',
        'terms_and_conditions': 'TermsAndConditions',
        'processor_name': 'ProcessorName',
        'is3_ds_required': 'Is3DSRequired',
        'last_error': 'LastError',
        'logo': 'Logo',
        'installment_plan_number': 'InstallmentPlanNumber'
    }

    def __init__(self, response_header=None, card_data=None, merchant=None, redirect_urls=None, outstanding_amount=None, terms_and_conditions=None, processor_name=None, is3_ds_required=None, last_error=None, logo=None, installment_plan_number=None):  # noqa: E501
        """GetInitiatedUpdatePaymentDataResponse - a model defined in Swagger"""  # noqa: E501

        self._response_header = None
        self._card_data = None
        self._merchant = None
        self._redirect_urls = None
        self._outstanding_amount = None
        self._terms_and_conditions = None
        self._processor_name = None
        self._is3_ds_required = None
        self._last_error = None
        self._logo = None
        self._installment_plan_number = None
        self.discriminator = None

        if response_header is not None:
            self._response_header = response_header
        if card_data is not None:
            self._card_data = card_data
        if merchant is not None:
            self._merchant = merchant
        if redirect_urls is not None:
            self._redirect_urls = redirect_urls
        if outstanding_amount is not None:
            self._outstanding_amount = outstanding_amount
        if terms_and_conditions is not None:
            self._terms_and_conditions = terms_and_conditions
        if processor_name is not None:
            self._processor_name = processor_name
        self._is3_ds_required = is3_ds_required
        if last_error is not None:
            self._last_error = last_error
        if logo is not None:
            self._logo = logo
        if installment_plan_number is not None:
            self._installment_plan_number = installment_plan_number

    @property
    def response_header(self):
        """Gets the response_header of this GetInitiatedUpdatePaymentDataResponse.  # noqa: E501


        :return: The response_header of this GetInitiatedUpdatePaymentDataResponse.  # noqa: E501
        :rtype: ResponseHeader
        """
        return self._response_header

    @response_header.setter
    def response_header(self, response_header):
        """Sets the response_header of this GetInitiatedUpdatePaymentDataResponse.


        :param response_header: The response_header of this GetInitiatedUpdatePaymentDataResponse.  # noqa: E501
        :type: ResponseHeader
        """

        self._response_header = response_header

    @property
    def card_data(self):
        """Gets the card_data of this GetInitiatedUpdatePaymentDataResponse.  # noqa: E501


        :return: The card_data of this GetInitiatedUpdatePaymentDataResponse.  # noqa: E501
        :rtype: CardData
        """
        return self._card_data

    @card_data.setter
    def card_data(self, card_data):
        """Sets the card_data of this GetInitiatedUpdatePaymentDataResponse.


        :param card_data: The card_data of this GetInitiatedUpdatePaymentDataResponse.  # noqa: E501
        :type: CardData
        """

        self._card_data = card_data

    @property
    def merchant(self):
        """Gets the merchant of this GetInitiatedUpdatePaymentDataResponse.  # noqa: E501


        :return: The merchant of this GetInitiatedUpdatePaymentDataResponse.  # noqa: E501
        :rtype: MerchantRef
        """
        return self._merchant

    @merchant.setter
    def merchant(self, merchant):
        """Sets the merchant of this GetInitiatedUpdatePaymentDataResponse.


        :param merchant: The merchant of this GetInitiatedUpdatePaymentDataResponse.  # noqa: E501
        :type: MerchantRef
        """

        self._merchant = merchant

    @property
    def redirect_urls(self):
        """Gets the redirect_urls of this GetInitiatedUpdatePaymentDataResponse.  # noqa: E501


        :return: The redirect_urls of this GetInitiatedUpdatePaymentDataResponse.  # noqa: E501
        :rtype: RedirectUrls
        """
        return self._redirect_urls

    @redirect_urls.setter
    def redirect_urls(self, redirect_urls):
        """Sets the redirect_urls of this GetInitiatedUpdatePaymentDataResponse.


        :param redirect_urls: The redirect_urls of this GetInitiatedUpdatePaymentDataResponse.  # noqa: E501
        :type: RedirectUrls
        """

        self._redirect_urls = redirect_urls

    @property
    def outstanding_amount(self):
        """Gets the outstanding_amount of this GetInitiatedUpdatePaymentDataResponse.  # noqa: E501


        :return: The outstanding_amount of this GetInitiatedUpdatePaymentDataResponse.  # noqa: E501
        :rtype: MoneyWithCurrencyCode
        """
        return self._outstanding_amount

    @outstanding_amount.setter
    def outstanding_amount(self, outstanding_amount):
        """Sets the outstanding_amount of this GetInitiatedUpdatePaymentDataResponse.


        :param outstanding_amount: The outstanding_amount of this GetInitiatedUpdatePaymentDataResponse.  # noqa: E501
        :type: MoneyWithCurrencyCode
        """

        self._outstanding_amount = outstanding_amount

    @property
    def terms_and_conditions(self):
        """Gets the terms_and_conditions of this GetInitiatedUpdatePaymentDataResponse.  # noqa: E501


        :return: The terms_and_conditions of this GetInitiatedUpdatePaymentDataResponse.  # noqa: E501
        :rtype: TermsAndConditions
        """
        return self._terms_and_conditions

    @terms_and_conditions.setter
    def terms_and_conditions(self, terms_and_conditions):
        """Sets the terms_and_conditions of this GetInitiatedUpdatePaymentDataResponse.


        :param terms_and_conditions: The terms_and_conditions of this GetInitiatedUpdatePaymentDataResponse.  # noqa: E501
        :type: TermsAndConditions
        """

        self._terms_and_conditions = terms_and_conditions

    @property
    def processor_name(self):
        """Gets the processor_name of this GetInitiatedUpdatePaymentDataResponse.  # noqa: E501


        :return: The processor_name of this GetInitiatedUpdatePaymentDataResponse.  # noqa: E501
        :rtype: str
        """
        return self._processor_name

    @processor_name.setter
    def processor_name(self, processor_name):
        """Sets the processor_name of this GetInitiatedUpdatePaymentDataResponse.


        :param processor_name: The processor_name of this GetInitiatedUpdatePaymentDataResponse.  # noqa: E501
        :type: str
        """

        self._processor_name = processor_name

    @property
    def is3_ds_required(self):
        """Gets the is3_ds_required of this GetInitiatedUpdatePaymentDataResponse.  # noqa: E501


        :return: The is3_ds_required of this GetInitiatedUpdatePaymentDataResponse.  # noqa: E501
        :rtype: bool
        """
        return self._is3_ds_required

    @is3_ds_required.setter
    def is3_ds_required(self, is3_ds_required):
        """Sets the is3_ds_required of this GetInitiatedUpdatePaymentDataResponse.


        :param is3_ds_required: The is3_ds_required of this GetInitiatedUpdatePaymentDataResponse.  # noqa: E501
        :type: bool
        """
        is3_ds_required = bool(is3_ds_required)
        if is3_ds_required is None:
            raise ValueError("Invalid value for `is3_ds_required`, must not be `None`")  # noqa: E501

        self._is3_ds_required = is3_ds_required

    @property
    def last_error(self):
        """Gets the last_error of this GetInitiatedUpdatePaymentDataResponse.  # noqa: E501


        :return: The last_error of this GetInitiatedUpdatePaymentDataResponse.  # noqa: E501
        :rtype: Error
        """
        return self._last_error

    @last_error.setter
    def last_error(self, last_error):
        """Sets the last_error of this GetInitiatedUpdatePaymentDataResponse.


        :param last_error: The last_error of this GetInitiatedUpdatePaymentDataResponse.  # noqa: E501
        :type: Error
        """

        self._last_error = last_error

    @property
    def logo(self):
        """Gets the logo of this GetInitiatedUpdatePaymentDataResponse.  # noqa: E501


        :return: The logo of this GetInitiatedUpdatePaymentDataResponse.  # noqa: E501
        :rtype: str
        """
        return self._logo

    @logo.setter
    def logo(self, logo):
        """Sets the logo of this GetInitiatedUpdatePaymentDataResponse.


        :param logo: The logo of this GetInitiatedUpdatePaymentDataResponse.  # noqa: E501
        :type: str
        """

        self._logo = logo

    @property
    def installment_plan_number(self):
        """Gets the installment_plan_number of this GetInitiatedUpdatePaymentDataResponse.  # noqa: E501


        :return: The installment_plan_number of this GetInitiatedUpdatePaymentDataResponse.  # noqa: E501
        :rtype: str
        """
        return self._installment_plan_number

    @installment_plan_number.setter
    def installment_plan_number(self, installment_plan_number):
        """Sets the installment_plan_number of this GetInitiatedUpdatePaymentDataResponse.


        :param installment_plan_number: The installment_plan_number of this GetInitiatedUpdatePaymentDataResponse.  # noqa: E501
        :type: str
        """

        self._installment_plan_number = installment_plan_number

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.swagger_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value
        if issubclass(GetInitiatedUpdatePaymentDataResponse, dict):
            for key, value in self.items():
                result[key] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, GetInitiatedUpdatePaymentDataResponse):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other

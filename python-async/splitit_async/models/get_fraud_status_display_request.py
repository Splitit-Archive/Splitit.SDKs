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


class GetFraudStatusDisplayRequest(object):
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
        'provider_reference_id': 'str',
        'merchant_id': 'int',
        'installment_plan_number': 'str'
    }

    attribute_map = {
        'provider_reference_id': 'ProviderReferenceId',
        'merchant_id': 'MerchantId',
        'installment_plan_number': 'InstallmentPlanNumber'
    }

    def __init__(self, provider_reference_id=None, merchant_id=None, installment_plan_number=None):  # noqa: E501
        """GetFraudStatusDisplayRequest - a model defined in Swagger"""  # noqa: E501

        self._provider_reference_id = None
        self._merchant_id = None
        self._installment_plan_number = None
        self.discriminator = None

        if provider_reference_id is not None:
            self._provider_reference_id = provider_reference_id
        if merchant_id is not None:
            self._merchant_id = merchant_id
        if installment_plan_number is not None:
            self._installment_plan_number = installment_plan_number

    @property
    def provider_reference_id(self):
        """Gets the provider_reference_id of this GetFraudStatusDisplayRequest.  # noqa: E501


        :return: The provider_reference_id of this GetFraudStatusDisplayRequest.  # noqa: E501
        :rtype: str
        """
        return self._provider_reference_id

    @provider_reference_id.setter
    def provider_reference_id(self, provider_reference_id):
        """Sets the provider_reference_id of this GetFraudStatusDisplayRequest.


        :param provider_reference_id: The provider_reference_id of this GetFraudStatusDisplayRequest.  # noqa: E501
        :type: str
        """

        self._provider_reference_id = provider_reference_id

    @property
    def merchant_id(self):
        """Gets the merchant_id of this GetFraudStatusDisplayRequest.  # noqa: E501


        :return: The merchant_id of this GetFraudStatusDisplayRequest.  # noqa: E501
        :rtype: int
        """
        return self._merchant_id

    @merchant_id.setter
    def merchant_id(self, merchant_id):
        """Sets the merchant_id of this GetFraudStatusDisplayRequest.


        :param merchant_id: The merchant_id of this GetFraudStatusDisplayRequest.  # noqa: E501
        :type: int
        """

        self._merchant_id = merchant_id

    @property
    def installment_plan_number(self):
        """Gets the installment_plan_number of this GetFraudStatusDisplayRequest.  # noqa: E501


        :return: The installment_plan_number of this GetFraudStatusDisplayRequest.  # noqa: E501
        :rtype: str
        """
        return self._installment_plan_number

    @installment_plan_number.setter
    def installment_plan_number(self, installment_plan_number):
        """Sets the installment_plan_number of this GetFraudStatusDisplayRequest.


        :param installment_plan_number: The installment_plan_number of this GetFraudStatusDisplayRequest.  # noqa: E501
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
        if issubclass(GetFraudStatusDisplayRequest, dict):
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
        if not isinstance(other, GetFraudStatusDisplayRequest):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other

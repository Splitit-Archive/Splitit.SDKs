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


class MoneyWithCurrencyCode(object):
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
        'value': 'float',
        'currency_code': 'str'
    }

    attribute_map = {
        'value': 'Value',
        'currency_code': 'CurrencyCode'
    }

    def __init__(self, value=None, currency_code=None):  # noqa: E501
        """MoneyWithCurrencyCode - a model defined in Swagger"""  # noqa: E501

        self._value = None
        self._currency_code = None
        self.discriminator = None

        self._value = value
        if currency_code is not None:
            self._currency_code = currency_code

    @property
    def value(self):
        """Gets the value of this MoneyWithCurrencyCode.  # noqa: E501


        :return: The value of this MoneyWithCurrencyCode.  # noqa: E501
        :rtype: float
        """
        return self._value

    @value.setter
    def value(self, value):
        """Sets the value of this MoneyWithCurrencyCode.


        :param value: The value of this MoneyWithCurrencyCode.  # noqa: E501
        :type: float
        """
        
        if value is None:
            raise ValueError("Invalid value for `value`, must not be `None`")  # noqa: E501

        self._value = value

    @property
    def currency_code(self):
        """Gets the currency_code of this MoneyWithCurrencyCode.  # noqa: E501


        :return: The currency_code of this MoneyWithCurrencyCode.  # noqa: E501
        :rtype: str
        """
        return self._currency_code

    @currency_code.setter
    def currency_code(self, currency_code):
        """Sets the currency_code of this MoneyWithCurrencyCode.


        :param currency_code: The currency_code of this MoneyWithCurrencyCode.  # noqa: E501
        :type: str
        """

        self._currency_code = currency_code

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
        if issubclass(MoneyWithCurrencyCode, dict):
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
        if not isinstance(other, MoneyWithCurrencyCode):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other

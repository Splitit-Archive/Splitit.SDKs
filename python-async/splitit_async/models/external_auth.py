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


class ExternalAuth(object):
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
        'unique_gateway_auth_id': 'str',
        '_date': 'datetime',
        'amount': 'MoneyWithCurrencyCode',
        'transaction_full_log': 'str'
    }

    attribute_map = {
        'unique_gateway_auth_id': 'UniqueGatewayAuthID',
        '_date': 'Date',
        'amount': 'Amount',
        'transaction_full_log': 'TransactionFullLog'
    }

    def __init__(self, unique_gateway_auth_id=None, _date=None, amount=None, transaction_full_log=None):  # noqa: E501
        """ExternalAuth - a model defined in Swagger"""  # noqa: E501

        self._unique_gateway_auth_id = None
        self.__date = None
        self._amount = None
        self._transaction_full_log = None
        self.discriminator = None

        if unique_gateway_auth_id is not None:
            self._unique_gateway_auth_id = unique_gateway_auth_id
        self.__date = _date
        if amount is not None:
            self._amount = amount
        if transaction_full_log is not None:
            self._transaction_full_log = transaction_full_log

    @property
    def unique_gateway_auth_id(self):
        """Gets the unique_gateway_auth_id of this ExternalAuth.  # noqa: E501


        :return: The unique_gateway_auth_id of this ExternalAuth.  # noqa: E501
        :rtype: str
        """
        return self._unique_gateway_auth_id

    @unique_gateway_auth_id.setter
    def unique_gateway_auth_id(self, unique_gateway_auth_id):
        """Sets the unique_gateway_auth_id of this ExternalAuth.


        :param unique_gateway_auth_id: The unique_gateway_auth_id of this ExternalAuth.  # noqa: E501
        :type: str
        """

        self._unique_gateway_auth_id = unique_gateway_auth_id

    @property
    def _date(self):
        """Gets the _date of this ExternalAuth.  # noqa: E501


        :return: The _date of this ExternalAuth.  # noqa: E501
        :rtype: datetime
        """
        return self.__date

    @_date.setter
    def _date(self, _date):
        """Sets the _date of this ExternalAuth.


        :param _date: The _date of this ExternalAuth.  # noqa: E501
        :type: datetime
        """
        
        if _date is None:
            raise ValueError("Invalid value for `_date`, must not be `None`")  # noqa: E501

        self.__date = _date

    @property
    def amount(self):
        """Gets the amount of this ExternalAuth.  # noqa: E501


        :return: The amount of this ExternalAuth.  # noqa: E501
        :rtype: MoneyWithCurrencyCode
        """
        return self._amount

    @amount.setter
    def amount(self, amount):
        """Sets the amount of this ExternalAuth.


        :param amount: The amount of this ExternalAuth.  # noqa: E501
        :type: MoneyWithCurrencyCode
        """

        self._amount = amount

    @property
    def transaction_full_log(self):
        """Gets the transaction_full_log of this ExternalAuth.  # noqa: E501


        :return: The transaction_full_log of this ExternalAuth.  # noqa: E501
        :rtype: str
        """
        return self._transaction_full_log

    @transaction_full_log.setter
    def transaction_full_log(self, transaction_full_log):
        """Sets the transaction_full_log of this ExternalAuth.


        :param transaction_full_log: The transaction_full_log of this ExternalAuth.  # noqa: E501
        :type: str
        """

        self._transaction_full_log = transaction_full_log

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
        if issubclass(ExternalAuth, dict):
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
        if not isinstance(other, ExternalAuth):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other

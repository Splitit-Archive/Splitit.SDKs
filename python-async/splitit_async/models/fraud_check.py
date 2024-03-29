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


class FraudCheck(object):
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
        'fraud_check_result': 'ReferenceEntityBase',
        'provider_result_code': 'str',
        'provider_result_desc': 'str',
        'provider_reference_id': 'str'
    }

    attribute_map = {
        'fraud_check_result': 'FraudCheckResult',
        'provider_result_code': 'ProviderResultCode',
        'provider_result_desc': 'ProviderResultDesc',
        'provider_reference_id': 'ProviderReferenceId'
    }

    def __init__(self, fraud_check_result=None, provider_result_code=None, provider_result_desc=None, provider_reference_id=None):  # noqa: E501
        """FraudCheck - a model defined in Swagger"""  # noqa: E501

        self._fraud_check_result = None
        self._provider_result_code = None
        self._provider_result_desc = None
        self._provider_reference_id = None
        self.discriminator = None

        if fraud_check_result is not None:
            self._fraud_check_result = fraud_check_result
        if provider_result_code is not None:
            self._provider_result_code = provider_result_code
        if provider_result_desc is not None:
            self._provider_result_desc = provider_result_desc
        if provider_reference_id is not None:
            self._provider_reference_id = provider_reference_id

    @property
    def fraud_check_result(self):
        """Gets the fraud_check_result of this FraudCheck.  # noqa: E501


        :return: The fraud_check_result of this FraudCheck.  # noqa: E501
        :rtype: ReferenceEntityBase
        """
        return self._fraud_check_result

    @fraud_check_result.setter
    def fraud_check_result(self, fraud_check_result):
        """Sets the fraud_check_result of this FraudCheck.


        :param fraud_check_result: The fraud_check_result of this FraudCheck.  # noqa: E501
        :type: ReferenceEntityBase
        """

        self._fraud_check_result = fraud_check_result

    @property
    def provider_result_code(self):
        """Gets the provider_result_code of this FraudCheck.  # noqa: E501


        :return: The provider_result_code of this FraudCheck.  # noqa: E501
        :rtype: str
        """
        return self._provider_result_code

    @provider_result_code.setter
    def provider_result_code(self, provider_result_code):
        """Sets the provider_result_code of this FraudCheck.


        :param provider_result_code: The provider_result_code of this FraudCheck.  # noqa: E501
        :type: str
        """

        self._provider_result_code = provider_result_code

    @property
    def provider_result_desc(self):
        """Gets the provider_result_desc of this FraudCheck.  # noqa: E501


        :return: The provider_result_desc of this FraudCheck.  # noqa: E501
        :rtype: str
        """
        return self._provider_result_desc

    @provider_result_desc.setter
    def provider_result_desc(self, provider_result_desc):
        """Sets the provider_result_desc of this FraudCheck.


        :param provider_result_desc: The provider_result_desc of this FraudCheck.  # noqa: E501
        :type: str
        """

        self._provider_result_desc = provider_result_desc

    @property
    def provider_reference_id(self):
        """Gets the provider_reference_id of this FraudCheck.  # noqa: E501


        :return: The provider_reference_id of this FraudCheck.  # noqa: E501
        :rtype: str
        """
        return self._provider_reference_id

    @provider_reference_id.setter
    def provider_reference_id(self, provider_reference_id):
        """Sets the provider_reference_id of this FraudCheck.


        :param provider_reference_id: The provider_reference_id of this FraudCheck.  # noqa: E501
        :type: str
        """

        self._provider_reference_id = provider_reference_id

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
        if issubclass(FraudCheck, dict):
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
        if not isinstance(other, FraudCheck):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other

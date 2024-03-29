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


class PlanApprovalEvidence(object):
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
        'customer_signature_png_as_base64': 'str',
        'are_terms_and_conditions_approved': 'bool',
        'shopper_approval_date_time': 'datetime'
    }

    attribute_map = {
        'customer_signature_png_as_base64': 'CustomerSignaturePngAsBase64',
        'are_terms_and_conditions_approved': 'AreTermsAndConditionsApproved',
        'shopper_approval_date_time': 'ShopperApprovalDateTime'
    }

    def __init__(self, customer_signature_png_as_base64=None, are_terms_and_conditions_approved=None, shopper_approval_date_time=None):  # noqa: E501
        """PlanApprovalEvidence - a model defined in Swagger"""  # noqa: E501

        self._customer_signature_png_as_base64 = None
        self._are_terms_and_conditions_approved = None
        self._shopper_approval_date_time = None
        self.discriminator = None

        if customer_signature_png_as_base64 is not None:
            self._customer_signature_png_as_base64 = customer_signature_png_as_base64
        self._are_terms_and_conditions_approved = are_terms_and_conditions_approved
        if shopper_approval_date_time is not None:
            self._shopper_approval_date_time = shopper_approval_date_time

    @property
    def customer_signature_png_as_base64(self):
        """Gets the customer_signature_png_as_base64 of this PlanApprovalEvidence.  # noqa: E501


        :return: The customer_signature_png_as_base64 of this PlanApprovalEvidence.  # noqa: E501
        :rtype: str
        """
        return self._customer_signature_png_as_base64

    @customer_signature_png_as_base64.setter
    def customer_signature_png_as_base64(self, customer_signature_png_as_base64):
        """Sets the customer_signature_png_as_base64 of this PlanApprovalEvidence.


        :param customer_signature_png_as_base64: The customer_signature_png_as_base64 of this PlanApprovalEvidence.  # noqa: E501
        :type: str
        """

        self._customer_signature_png_as_base64 = customer_signature_png_as_base64

    @property
    def are_terms_and_conditions_approved(self):
        """Gets the are_terms_and_conditions_approved of this PlanApprovalEvidence.  # noqa: E501


        :return: The are_terms_and_conditions_approved of this PlanApprovalEvidence.  # noqa: E501
        :rtype: bool
        """
        return self._are_terms_and_conditions_approved

    @are_terms_and_conditions_approved.setter
    def are_terms_and_conditions_approved(self, are_terms_and_conditions_approved):
        """Sets the are_terms_and_conditions_approved of this PlanApprovalEvidence.


        :param are_terms_and_conditions_approved: The are_terms_and_conditions_approved of this PlanApprovalEvidence.  # noqa: E501
        :type: bool
        """
        are_terms_and_conditions_approved = bool(are_terms_and_conditions_approved)
        if are_terms_and_conditions_approved is None:
            raise ValueError("Invalid value for `are_terms_and_conditions_approved`, must not be `None`")  # noqa: E501

        self._are_terms_and_conditions_approved = are_terms_and_conditions_approved

    @property
    def shopper_approval_date_time(self):
        """Gets the shopper_approval_date_time of this PlanApprovalEvidence.  # noqa: E501


        :return: The shopper_approval_date_time of this PlanApprovalEvidence.  # noqa: E501
        :rtype: datetime
        """
        return self._shopper_approval_date_time

    @shopper_approval_date_time.setter
    def shopper_approval_date_time(self, shopper_approval_date_time):
        """Sets the shopper_approval_date_time of this PlanApprovalEvidence.


        :param shopper_approval_date_time: The shopper_approval_date_time of this PlanApprovalEvidence.  # noqa: E501
        :type: datetime
        """

        self._shopper_approval_date_time = shopper_approval_date_time

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
        if issubclass(PlanApprovalEvidence, dict):
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
        if not isinstance(other, PlanApprovalEvidence):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other

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


class TermsAndConditions2(object):
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
        'agreement': 'str',
        'important_note': 'str',
        'full_content': 'str',
        'privacy_policy': 'str',
        'what_you_need_to_know_auth_hold_define': 'str',
        'what_you_need_to_know_budget_management': 'str',
        'what_you_need_to_know_card_type_details': 'str'
    }

    attribute_map = {
        'agreement': 'Agreement',
        'important_note': 'ImportantNote',
        'full_content': 'FullContent',
        'privacy_policy': 'PrivacyPolicy',
        'what_you_need_to_know_auth_hold_define': 'WhatYouNeedToKnow_AuthHoldDefine',
        'what_you_need_to_know_budget_management': 'WhatYouNeedToKnow_BudgetManagement',
        'what_you_need_to_know_card_type_details': 'WhatYouNeedToKnow_CardTypeDetails'
    }

    def __init__(self, agreement=None, important_note=None, full_content=None, privacy_policy=None, what_you_need_to_know_auth_hold_define=None, what_you_need_to_know_budget_management=None, what_you_need_to_know_card_type_details=None):  # noqa: E501
        """TermsAndConditions2 - a model defined in Swagger"""  # noqa: E501

        self._agreement = None
        self._important_note = None
        self._full_content = None
        self._privacy_policy = None
        self._what_you_need_to_know_auth_hold_define = None
        self._what_you_need_to_know_budget_management = None
        self._what_you_need_to_know_card_type_details = None
        self.discriminator = None

        if agreement is not None:
            self.agreement = agreement
        if important_note is not None:
            self.important_note = important_note
        if full_content is not None:
            self.full_content = full_content
        if privacy_policy is not None:
            self.privacy_policy = privacy_policy
        if what_you_need_to_know_auth_hold_define is not None:
            self.what_you_need_to_know_auth_hold_define = what_you_need_to_know_auth_hold_define
        if what_you_need_to_know_budget_management is not None:
            self.what_you_need_to_know_budget_management = what_you_need_to_know_budget_management
        if what_you_need_to_know_card_type_details is not None:
            self.what_you_need_to_know_card_type_details = what_you_need_to_know_card_type_details

    @property
    def agreement(self):
        """Gets the agreement of this TermsAndConditions2.  # noqa: E501


        :return: The agreement of this TermsAndConditions2.  # noqa: E501
        :rtype: str
        """
        return self._agreement

    @agreement.setter
    def agreement(self, agreement):
        """Sets the agreement of this TermsAndConditions2.


        :param agreement: The agreement of this TermsAndConditions2.  # noqa: E501
        :type: str
        """

        self._agreement = agreement

    @property
    def important_note(self):
        """Gets the important_note of this TermsAndConditions2.  # noqa: E501


        :return: The important_note of this TermsAndConditions2.  # noqa: E501
        :rtype: str
        """
        return self._important_note

    @important_note.setter
    def important_note(self, important_note):
        """Sets the important_note of this TermsAndConditions2.


        :param important_note: The important_note of this TermsAndConditions2.  # noqa: E501
        :type: str
        """

        self._important_note = important_note

    @property
    def full_content(self):
        """Gets the full_content of this TermsAndConditions2.  # noqa: E501


        :return: The full_content of this TermsAndConditions2.  # noqa: E501
        :rtype: str
        """
        return self._full_content

    @full_content.setter
    def full_content(self, full_content):
        """Sets the full_content of this TermsAndConditions2.


        :param full_content: The full_content of this TermsAndConditions2.  # noqa: E501
        :type: str
        """

        self._full_content = full_content

    @property
    def privacy_policy(self):
        """Gets the privacy_policy of this TermsAndConditions2.  # noqa: E501


        :return: The privacy_policy of this TermsAndConditions2.  # noqa: E501
        :rtype: str
        """
        return self._privacy_policy

    @privacy_policy.setter
    def privacy_policy(self, privacy_policy):
        """Sets the privacy_policy of this TermsAndConditions2.


        :param privacy_policy: The privacy_policy of this TermsAndConditions2.  # noqa: E501
        :type: str
        """

        self._privacy_policy = privacy_policy

    @property
    def what_you_need_to_know_auth_hold_define(self):
        """Gets the what_you_need_to_know_auth_hold_define of this TermsAndConditions2.  # noqa: E501


        :return: The what_you_need_to_know_auth_hold_define of this TermsAndConditions2.  # noqa: E501
        :rtype: str
        """
        return self._what_you_need_to_know_auth_hold_define

    @what_you_need_to_know_auth_hold_define.setter
    def what_you_need_to_know_auth_hold_define(self, what_you_need_to_know_auth_hold_define):
        """Sets the what_you_need_to_know_auth_hold_define of this TermsAndConditions2.


        :param what_you_need_to_know_auth_hold_define: The what_you_need_to_know_auth_hold_define of this TermsAndConditions2.  # noqa: E501
        :type: str
        """

        self._what_you_need_to_know_auth_hold_define = what_you_need_to_know_auth_hold_define

    @property
    def what_you_need_to_know_budget_management(self):
        """Gets the what_you_need_to_know_budget_management of this TermsAndConditions2.  # noqa: E501


        :return: The what_you_need_to_know_budget_management of this TermsAndConditions2.  # noqa: E501
        :rtype: str
        """
        return self._what_you_need_to_know_budget_management

    @what_you_need_to_know_budget_management.setter
    def what_you_need_to_know_budget_management(self, what_you_need_to_know_budget_management):
        """Sets the what_you_need_to_know_budget_management of this TermsAndConditions2.


        :param what_you_need_to_know_budget_management: The what_you_need_to_know_budget_management of this TermsAndConditions2.  # noqa: E501
        :type: str
        """

        self._what_you_need_to_know_budget_management = what_you_need_to_know_budget_management

    @property
    def what_you_need_to_know_card_type_details(self):
        """Gets the what_you_need_to_know_card_type_details of this TermsAndConditions2.  # noqa: E501


        :return: The what_you_need_to_know_card_type_details of this TermsAndConditions2.  # noqa: E501
        :rtype: str
        """
        return self._what_you_need_to_know_card_type_details

    @what_you_need_to_know_card_type_details.setter
    def what_you_need_to_know_card_type_details(self, what_you_need_to_know_card_type_details):
        """Sets the what_you_need_to_know_card_type_details of this TermsAndConditions2.


        :param what_you_need_to_know_card_type_details: The what_you_need_to_know_card_type_details of this TermsAndConditions2.  # noqa: E501
        :type: str
        """

        self._what_you_need_to_know_card_type_details = what_you_need_to_know_card_type_details

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
        if issubclass(TermsAndConditions2, dict):
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
        if not isinstance(other, TermsAndConditions2):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other

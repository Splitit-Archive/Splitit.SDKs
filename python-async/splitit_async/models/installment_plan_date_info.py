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


class InstallmentPlanDateInfo(object):
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
        'installments_plan_date_type': 'InstallmentsPlanDateType',
        'start_date': 'str',
        'end_date': 'str',
        'all_dates': 'bool'
    }

    attribute_map = {
        'installments_plan_date_type': 'InstallmentsPlanDateType',
        'start_date': 'StartDate',
        'end_date': 'EndDate',
        'all_dates': 'AllDates'
    }

    def __init__(self, installments_plan_date_type=None, start_date=None, end_date=None, all_dates=None):  # noqa: E501
        """InstallmentPlanDateInfo - a model defined in Swagger"""  # noqa: E501

        self._installments_plan_date_type = None
        self._start_date = None
        self._end_date = None
        self._all_dates = None
        self.discriminator = None

        self._installments_plan_date_type = installments_plan_date_type
        if start_date is not None:
            self._start_date = start_date
        if end_date is not None:
            self._end_date = end_date
        self._all_dates = all_dates

    @property
    def installments_plan_date_type(self):
        """Gets the installments_plan_date_type of this InstallmentPlanDateInfo.  # noqa: E501


        :return: The installments_plan_date_type of this InstallmentPlanDateInfo.  # noqa: E501
        :rtype: InstallmentsPlanDateType
        """
        return self._installments_plan_date_type

    @installments_plan_date_type.setter
    def installments_plan_date_type(self, installments_plan_date_type):
        """Sets the installments_plan_date_type of this InstallmentPlanDateInfo.


        :param installments_plan_date_type: The installments_plan_date_type of this InstallmentPlanDateInfo.  # noqa: E501
        :type: InstallmentsPlanDateType
        """
        
        if installments_plan_date_type is None:
            raise ValueError("Invalid value for `installments_plan_date_type`, must not be `None`")  # noqa: E501

        self._installments_plan_date_type = installments_plan_date_type

    @property
    def start_date(self):
        """Gets the start_date of this InstallmentPlanDateInfo.  # noqa: E501


        :return: The start_date of this InstallmentPlanDateInfo.  # noqa: E501
        :rtype: str
        """
        return self._start_date

    @start_date.setter
    def start_date(self, start_date):
        """Sets the start_date of this InstallmentPlanDateInfo.


        :param start_date: The start_date of this InstallmentPlanDateInfo.  # noqa: E501
        :type: str
        """

        self._start_date = start_date

    @property
    def end_date(self):
        """Gets the end_date of this InstallmentPlanDateInfo.  # noqa: E501


        :return: The end_date of this InstallmentPlanDateInfo.  # noqa: E501
        :rtype: str
        """
        return self._end_date

    @end_date.setter
    def end_date(self, end_date):
        """Sets the end_date of this InstallmentPlanDateInfo.


        :param end_date: The end_date of this InstallmentPlanDateInfo.  # noqa: E501
        :type: str
        """

        self._end_date = end_date

    @property
    def all_dates(self):
        """Gets the all_dates of this InstallmentPlanDateInfo.  # noqa: E501


        :return: The all_dates of this InstallmentPlanDateInfo.  # noqa: E501
        :rtype: bool
        """
        return self._all_dates

    @all_dates.setter
    def all_dates(self, all_dates):
        """Sets the all_dates of this InstallmentPlanDateInfo.


        :param all_dates: The all_dates of this InstallmentPlanDateInfo.  # noqa: E501
        :type: bool
        """
        all_dates = bool(all_dates)
        if all_dates is None:
            raise ValueError("Invalid value for `all_dates`, must not be `None`")  # noqa: E501

        self._all_dates = all_dates

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
        if issubclass(InstallmentPlanDateInfo, dict):
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
        if not isinstance(other, InstallmentPlanDateInfo):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other

/**
 * splitit-web-api-public
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD.
    define(['expect.js', process.cwd()+'/src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require(process.cwd()+'/src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.SplititWebApiPublic);
  }
}(this, function(expect, SplititWebApiPublic) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new SplititWebApiPublic.GetInstallmentsPlanSearchCriteriaRequest();
  });

  var getProperty = function(object, getter, property) {
    // Use getter method if present; otherwise, get the property directly.
    if (typeof object[getter] === 'function')
      return object[getter]();
    else
      return object[property];
  }

  var setProperty = function(object, setter, property, value) {
    // Use setter method if present; otherwise, set the property directly.
    if (typeof object[setter] === 'function')
      object[setter](value);
    else
      object[property] = value;
  }

  describe('GetInstallmentsPlanSearchCriteriaRequest', function() {
    it('should create an instance of GetInstallmentsPlanSearchCriteriaRequest', function() {
      // uncomment below and update the code to test GetInstallmentsPlanSearchCriteriaRequest
      //var instane = new SplititWebApiPublic.GetInstallmentsPlanSearchCriteriaRequest();
      //expect(instance).to.be.a(SplititWebApiPublic.GetInstallmentsPlanSearchCriteriaRequest);
    });

    it('should have the property queryCriteria (base name: "QueryCriteria")', function() {
      // uncomment below and update the code to test the property queryCriteria
      //var instane = new SplititWebApiPublic.GetInstallmentsPlanSearchCriteriaRequest();
      //expect(instance).to.be();
    });

    it('should have the property loadRelated (base name: "LoadRelated")', function() {
      // uncomment below and update the code to test the property loadRelated
      //var instane = new SplititWebApiPublic.GetInstallmentsPlanSearchCriteriaRequest();
      //expect(instance).to.be();
    });

    it('should have the property pagingRequest (base name: "PagingRequest")', function() {
      // uncomment below and update the code to test the property pagingRequest
      //var instane = new SplititWebApiPublic.GetInstallmentsPlanSearchCriteriaRequest();
      //expect(instance).to.be();
    });

    it('should have the property requestHeader (base name: "RequestHeader")', function() {
      // uncomment below and update the code to test the property requestHeader
      //var instane = new SplititWebApiPublic.GetInstallmentsPlanSearchCriteriaRequest();
      //expect(instance).to.be();
    });

  });

}));
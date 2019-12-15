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
    instance = new SplititWebApiPublic.UpdateInstallmentPlanRequest();
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

  describe('UpdateInstallmentPlanRequest', function() {
    it('should create an instance of UpdateInstallmentPlanRequest', function() {
      // uncomment below and update the code to test UpdateInstallmentPlanRequest
      //var instane = new SplititWebApiPublic.UpdateInstallmentPlanRequest();
      //expect(instance).to.be.a(SplititWebApiPublic.UpdateInstallmentPlanRequest);
    });

    it('should have the property requestHeader (base name: "RequestHeader")', function() {
      // uncomment below and update the code to test the property requestHeader
      //var instane = new SplititWebApiPublic.UpdateInstallmentPlanRequest();
      //expect(instance).to.be();
    });

    it('should have the property installmentPlanNumber (base name: "InstallmentPlanNumber")', function() {
      // uncomment below and update the code to test the property installmentPlanNumber
      //var instane = new SplititWebApiPublic.UpdateInstallmentPlanRequest();
      //expect(instance).to.be();
    });

    it('should have the property planData (base name: "PlanData")', function() {
      // uncomment below and update the code to test the property planData
      //var instane = new SplititWebApiPublic.UpdateInstallmentPlanRequest();
      //expect(instance).to.be();
    });

    it('should have the property cartData (base name: "CartData")', function() {
      // uncomment below and update the code to test the property cartData
      //var instane = new SplititWebApiPublic.UpdateInstallmentPlanRequest();
      //expect(instance).to.be();
    });

    it('should have the property consumerData (base name: "ConsumerData")', function() {
      // uncomment below and update the code to test the property consumerData
      //var instane = new SplititWebApiPublic.UpdateInstallmentPlanRequest();
      //expect(instance).to.be();
    });

    it('should have the property billingAddress (base name: "BillingAddress")', function() {
      // uncomment below and update the code to test the property billingAddress
      //var instane = new SplititWebApiPublic.UpdateInstallmentPlanRequest();
      //expect(instance).to.be();
    });

    it('should have the property creditCardDetails (base name: "CreditCardDetails")', function() {
      // uncomment below and update the code to test the property creditCardDetails
      //var instane = new SplititWebApiPublic.UpdateInstallmentPlanRequest();
      //expect(instance).to.be();
    });

    it('should have the property paymentToken (base name: "PaymentToken")', function() {
      // uncomment below and update the code to test the property paymentToken
      //var instane = new SplititWebApiPublic.UpdateInstallmentPlanRequest();
      //expect(instance).to.be();
    });

    it('should have the property planApprovalEvidence (base name: "PlanApprovalEvidence")', function() {
      // uncomment below and update the code to test the property planApprovalEvidence
      //var instane = new SplititWebApiPublic.UpdateInstallmentPlanRequest();
      //expect(instance).to.be();
    });

    it('should have the property redirectUrls (base name: "RedirectUrls")', function() {
      // uncomment below and update the code to test the property redirectUrls
      //var instane = new SplititWebApiPublic.UpdateInstallmentPlanRequest();
      //expect(instance).to.be();
    });

    it('should have the property eventsEndpoints (base name: "EventsEndpoints")', function() {
      // uncomment below and update the code to test the property eventsEndpoints
      //var instane = new SplititWebApiPublic.UpdateInstallmentPlanRequest();
      //expect(instance).to.be();
    });

    it('should have the property externalAuth (base name: "ExternalAuth")', function() {
      // uncomment below and update the code to test the property externalAuth
      //var instane = new SplititWebApiPublic.UpdateInstallmentPlanRequest();
      //expect(instance).to.be();
    });

  });

}));
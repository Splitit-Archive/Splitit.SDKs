/* 
 * splitit-web-api-public-sdk
 *
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using SwaggerDateConverter = Splitit.SDK.Client.Client.SwaggerDateConverter;

namespace Splitit.SDK.Client.Model
{
    /// <summary>
    /// GetPGTLResponse
    /// </summary>
    [DataContract]
    public partial class GetPGTLResponse :  IEquatable<GetPGTLResponse>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="GetPGTLResponse" /> class.
        /// </summary>
        /// <param name="responseHeader">responseHeader.</param>
        /// <param name="paymentGatewaytransactionResponses">paymentGatewaytransactionResponses.</param>
        public GetPGTLResponse(ResponseHeader responseHeader = default(ResponseHeader), Dictionary<string, List<PgtlDto>> paymentGatewaytransactionResponses = default(Dictionary<string, List<PgtlDto>>))
        {
            this.ResponseHeader = responseHeader;
            this.PaymentGatewaytransactionResponses = paymentGatewaytransactionResponses;
        }

        
        /// <summary>
        /// Gets or Sets ResponseHeader
        /// </summary>
        [DataMember(Name="ResponseHeader", EmitDefaultValue=false)]
        public ResponseHeader ResponseHeader { get; set; }

        /// <summary>
        /// Gets or Sets PaymentGatewaytransactionResponses
        /// </summary>
        [DataMember(Name="paymentGatewaytransactionResponses", EmitDefaultValue=false)]
        public Dictionary<string, List<PgtlDto>> PaymentGatewaytransactionResponses { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class GetPGTLResponse {\n");
            sb.Append("  ResponseHeader: ").Append(ResponseHeader).Append("\n");
            sb.Append("  PaymentGatewaytransactionResponses: ").Append(PaymentGatewaytransactionResponses).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as GetPGTLResponse);
        }

        /// <summary>
        /// Returns true if GetPGTLResponse instances are equal
        /// </summary>
        /// <param name="input">Instance of GetPGTLResponse to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(GetPGTLResponse input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.ResponseHeader == input.ResponseHeader ||
                    (this.ResponseHeader != null &&
                    this.ResponseHeader.Equals(input.ResponseHeader))
                ) && 
                (
                    this.PaymentGatewaytransactionResponses == input.PaymentGatewaytransactionResponses ||
                    this.PaymentGatewaytransactionResponses != null &&
                    this.PaymentGatewaytransactionResponses.SequenceEqual(input.PaymentGatewaytransactionResponses)
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.ResponseHeader != null)
                    hashCode = hashCode * 59 + this.ResponseHeader.GetHashCode();
                if (this.PaymentGatewaytransactionResponses != null)
                    hashCode = hashCode * 59 + this.PaymentGatewaytransactionResponses.GetHashCode();
                return hashCode;
            }
        }
    }

}

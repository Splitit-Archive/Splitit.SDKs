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
    /// PaymentToken
    /// </summary>
    [DataContract]
    public partial class PaymentToken :  IEquatable<PaymentToken>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PaymentToken" /> class.
        /// </summary>
        /// <param name="token">token.</param>
        /// <param name="type">type.</param>
        /// <param name="billingData">billingData.</param>
        public PaymentToken(string token = default(string), string type = default(string), Object billingData = default(Object))
        {
            this.Token = token;
            this.Type = type;
            this.BillingData = billingData;
        }

        
        /// <summary>
        /// Gets or Sets Token
        /// </summary>
        [DataMember(Name="Token", EmitDefaultValue=false)]
        public string Token { get; set; }

        /// <summary>
        /// Gets or Sets Type
        /// </summary>
        [DataMember(Name="Type", EmitDefaultValue=false)]
        public string Type { get; set; }

        /// <summary>
        /// Gets or Sets BillingData
        /// </summary>
        [DataMember(Name="BillingData", EmitDefaultValue=false)]
        public Object BillingData { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class PaymentToken {\n");
            sb.Append("  Token: ").Append(Token).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  BillingData: ").Append(BillingData).Append("\n");
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
            return this.Equals(input as PaymentToken);
        }

        /// <summary>
        /// Returns true if PaymentToken instances are equal
        /// </summary>
        /// <param name="input">Instance of PaymentToken to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PaymentToken input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Token == input.Token ||
                    (this.Token != null &&
                    this.Token.Equals(input.Token))
                ) && 
                (
                    this.Type == input.Type ||
                    (this.Type != null &&
                    this.Type.Equals(input.Type))
                ) && 
                (
                    this.BillingData == input.BillingData ||
                    (this.BillingData != null &&
                    this.BillingData.Equals(input.BillingData))
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
                if (this.Token != null)
                    hashCode = hashCode * 59 + this.Token.GetHashCode();
                if (this.Type != null)
                    hashCode = hashCode * 59 + this.Type.GetHashCode();
                if (this.BillingData != null)
                    hashCode = hashCode * 59 + this.BillingData.GetHashCode();
                return hashCode;
            }
        }
    }

}

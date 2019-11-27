/* 
 * splitit-web-api-public
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
using SwaggerDateConverter = Splitit.SDK.Client.Portable.Client.SwaggerDateConverter;

namespace Splitit.SDK.Client.Portable.Model
{
    /// <summary>
    /// AmountDetails
    /// </summary>
    [DataContract]
    public partial class AmountDetails :  IEquatable<AmountDetails>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="AmountDetails" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected AmountDetails() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="AmountDetails" /> class.
        /// </summary>
        /// <param name="subTotal">subTotal (required).</param>
        /// <param name="tax">tax (required).</param>
        /// <param name="shipping">shipping (required).</param>
        public AmountDetails(decimal? subTotal = default(decimal?), decimal? tax = default(decimal?), decimal? shipping = default(decimal?))
        {
            // to ensure "subTotal" is required (not null)
            if (subTotal == null)
            {
                throw new InvalidDataException("subTotal is a required property for AmountDetails and cannot be null");
            }
            else
            {
                this.SubTotal = subTotal;
            }
            // to ensure "tax" is required (not null)
            if (tax == null)
            {
                throw new InvalidDataException("tax is a required property for AmountDetails and cannot be null");
            }
            else
            {
                this.Tax = tax;
            }
            // to ensure "shipping" is required (not null)
            if (shipping == null)
            {
                throw new InvalidDataException("shipping is a required property for AmountDetails and cannot be null");
            }
            else
            {
                this.Shipping = shipping;
            }
        }
        
        /// <summary>
        /// Gets or Sets SubTotal
        /// </summary>
        [DataMember(Name="SubTotal", EmitDefaultValue=false)]
        public decimal? SubTotal { get; set; }

        /// <summary>
        /// Gets or Sets Tax
        /// </summary>
        [DataMember(Name="Tax", EmitDefaultValue=false)]
        public decimal? Tax { get; set; }

        /// <summary>
        /// Gets or Sets Shipping
        /// </summary>
        [DataMember(Name="Shipping", EmitDefaultValue=false)]
        public decimal? Shipping { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class AmountDetails {\n");
            sb.Append("  SubTotal: ").Append(SubTotal).Append("\n");
            sb.Append("  Tax: ").Append(Tax).Append("\n");
            sb.Append("  Shipping: ").Append(Shipping).Append("\n");
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
            return this.Equals(input as AmountDetails);
        }

        /// <summary>
        /// Returns true if AmountDetails instances are equal
        /// </summary>
        /// <param name="input">Instance of AmountDetails to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(AmountDetails input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.SubTotal == input.SubTotal ||
                    (this.SubTotal != null &&
                    this.SubTotal.Equals(input.SubTotal))
                ) && 
                (
                    this.Tax == input.Tax ||
                    (this.Tax != null &&
                    this.Tax.Equals(input.Tax))
                ) && 
                (
                    this.Shipping == input.Shipping ||
                    (this.Shipping != null &&
                    this.Shipping.Equals(input.Shipping))
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
                if (this.SubTotal != null)
                    hashCode = hashCode * 59 + this.SubTotal.GetHashCode();
                if (this.Tax != null)
                    hashCode = hashCode * 59 + this.Tax.GetHashCode();
                if (this.Shipping != null)
                    hashCode = hashCode * 59 + this.Shipping.GetHashCode();
                return hashCode;
            }
        }
    }

}

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
    /// GetPGTLRequest
    /// </summary>
    [DataContract]
    public partial class GetPGTLRequest :  IEquatable<GetPGTLRequest>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="GetPGTLRequest" /> class.
        /// </summary>
        /// <param name="installmentPlanNumber">installmentPlanNumber.</param>
        public GetPGTLRequest(string installmentPlanNumber = default(string))
        {
            this.InstallmentPlanNumber = installmentPlanNumber;
        }

        [DataMember(Name="RequestHeader", EmitDefaultValue=false)]
        internal RequestHeader RequestHeader { get; set; }
        
        /// <summary>
        /// Gets or Sets InstallmentPlanNumber
        /// </summary>
        [DataMember(Name="InstallmentPlanNumber", EmitDefaultValue=false)]
        public string InstallmentPlanNumber { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class GetPGTLRequest {\n");
            sb.Append("  InstallmentPlanNumber: ").Append(InstallmentPlanNumber).Append("\n");
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
            return this.Equals(input as GetPGTLRequest);
        }

        /// <summary>
        /// Returns true if GetPGTLRequest instances are equal
        /// </summary>
        /// <param name="input">Instance of GetPGTLRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(GetPGTLRequest input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.InstallmentPlanNumber == input.InstallmentPlanNumber ||
                    (this.InstallmentPlanNumber != null &&
                    this.InstallmentPlanNumber.Equals(input.InstallmentPlanNumber))
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
                if (this.InstallmentPlanNumber != null)
                    hashCode = hashCode * 59 + this.InstallmentPlanNumber.GetHashCode();
                return hashCode;
            }
        }
    }

}

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
    /// RelationsLoad
    /// </summary>
    [DataContract]
    public partial class RelationsLoad :  IEquatable<RelationsLoad>
    {
        /// <summary>
        /// Gets or Sets Installments
        /// </summary>
        [DataMember(Name="Installments", EmitDefaultValue=false)]
        public InstallmentPlanActivityStatus Installments { get; set; }
        /// <summary>
        /// Gets or Sets SecureAuthorizations
        /// </summary>
        [DataMember(Name="SecureAuthorizations", EmitDefaultValue=false)]
        public InstallmentPlanActivityStatus SecureAuthorizations { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="RelationsLoad" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected RelationsLoad() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="RelationsLoad" /> class.
        /// </summary>
        /// <param name="installments">installments (required).</param>
        /// <param name="secureAuthorizations">secureAuthorizations (required).</param>
        public RelationsLoad(InstallmentPlanActivityStatus installments = default(InstallmentPlanActivityStatus), InstallmentPlanActivityStatus secureAuthorizations = default(InstallmentPlanActivityStatus))
        {
            // to ensure "installments" is required (not null)
            if (installments == null)
            {
                throw new InvalidDataException("installments is a required property for RelationsLoad and cannot be null");
            }
            else
            {
                this.Installments = installments;
            }
            // to ensure "secureAuthorizations" is required (not null)
            if (secureAuthorizations == null)
            {
                throw new InvalidDataException("secureAuthorizations is a required property for RelationsLoad and cannot be null");
            }
            else
            {
                this.SecureAuthorizations = secureAuthorizations;
            }
        }
        


        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class RelationsLoad {\n");
            sb.Append("  Installments: ").Append(Installments).Append("\n");
            sb.Append("  SecureAuthorizations: ").Append(SecureAuthorizations).Append("\n");
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
            return this.Equals(input as RelationsLoad);
        }

        /// <summary>
        /// Returns true if RelationsLoad instances are equal
        /// </summary>
        /// <param name="input">Instance of RelationsLoad to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(RelationsLoad input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Installments == input.Installments ||
                    (this.Installments != null &&
                    this.Installments.Equals(input.Installments))
                ) && 
                (
                    this.SecureAuthorizations == input.SecureAuthorizations ||
                    (this.SecureAuthorizations != null &&
                    this.SecureAuthorizations.Equals(input.SecureAuthorizations))
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
                if (this.Installments != null)
                    hashCode = hashCode * 59 + this.Installments.GetHashCode();
                if (this.SecureAuthorizations != null)
                    hashCode = hashCode * 59 + this.SecureAuthorizations.GetHashCode();
                return hashCode;
            }
        }
    }

}

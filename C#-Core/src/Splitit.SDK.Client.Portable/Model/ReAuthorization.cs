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
    /// ReAuthorization
    /// </summary>
    [DataContract]
    public partial class ReAuthorization :  IEquatable<ReAuthorization>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ReAuthorization" /> class.
        /// </summary>
        /// <param name="processingDate">processingDate.</param>
        /// <param name="amount">amount.</param>
        /// <param name="transactionResults">transactionResults.</param>
        /// <param name="cardDetails">cardDetails.</param>
        /// <param name="result">result.</param>
        public ReAuthorization(DateTime? processingDate = default(DateTime?), Money amount = default(Money), List<TransactionResult> transactionResults = default(List<TransactionResult>), CardData cardDetails = default(CardData), bool? result = default(bool?))
        {
            this.ProcessingDate = processingDate;
            this.Amount = amount;
            this.TransactionResults = transactionResults;
            this.CardDetails = cardDetails;
            this.Result = result;
        }
        
        /// <summary>
        /// Gets or Sets ProcessingDate
        /// </summary>
        [DataMember(Name="ProcessingDate", EmitDefaultValue=false)]
        public DateTime? ProcessingDate { get; set; }

        /// <summary>
        /// Gets or Sets Amount
        /// </summary>
        [DataMember(Name="Amount", EmitDefaultValue=false)]
        public Money Amount { get; set; }

        /// <summary>
        /// Gets or Sets TransactionResults
        /// </summary>
        [DataMember(Name="TransactionResults", EmitDefaultValue=false)]
        public List<TransactionResult> TransactionResults { get; set; }

        /// <summary>
        /// Gets or Sets CardDetails
        /// </summary>
        [DataMember(Name="CardDetails", EmitDefaultValue=false)]
        public CardData CardDetails { get; set; }

        /// <summary>
        /// Gets or Sets Result
        /// </summary>
        [DataMember(Name="Result", EmitDefaultValue=false)]
        public bool? Result { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ReAuthorization {\n");
            sb.Append("  ProcessingDate: ").Append(ProcessingDate).Append("\n");
            sb.Append("  Amount: ").Append(Amount).Append("\n");
            sb.Append("  TransactionResults: ").Append(TransactionResults).Append("\n");
            sb.Append("  CardDetails: ").Append(CardDetails).Append("\n");
            sb.Append("  Result: ").Append(Result).Append("\n");
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
            return this.Equals(input as ReAuthorization);
        }

        /// <summary>
        /// Returns true if ReAuthorization instances are equal
        /// </summary>
        /// <param name="input">Instance of ReAuthorization to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ReAuthorization input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.ProcessingDate == input.ProcessingDate ||
                    (this.ProcessingDate != null &&
                    this.ProcessingDate.Equals(input.ProcessingDate))
                ) && 
                (
                    this.Amount == input.Amount ||
                    (this.Amount != null &&
                    this.Amount.Equals(input.Amount))
                ) && 
                (
                    this.TransactionResults == input.TransactionResults ||
                    this.TransactionResults != null &&
                    this.TransactionResults.SequenceEqual(input.TransactionResults)
                ) && 
                (
                    this.CardDetails == input.CardDetails ||
                    (this.CardDetails != null &&
                    this.CardDetails.Equals(input.CardDetails))
                ) && 
                (
                    this.Result == input.Result ||
                    (this.Result != null &&
                    this.Result.Equals(input.Result))
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
                if (this.ProcessingDate != null)
                    hashCode = hashCode * 59 + this.ProcessingDate.GetHashCode();
                if (this.Amount != null)
                    hashCode = hashCode * 59 + this.Amount.GetHashCode();
                if (this.TransactionResults != null)
                    hashCode = hashCode * 59 + this.TransactionResults.GetHashCode();
                if (this.CardDetails != null)
                    hashCode = hashCode * 59 + this.CardDetails.GetHashCode();
                if (this.Result != null)
                    hashCode = hashCode * 59 + this.Result.GetHashCode();
                return hashCode;
            }
        }
    }

}

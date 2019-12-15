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
    /// CardData
    /// </summary>
    [DataContract]
    public partial class CardData :  IEquatable<CardData>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CardData" /> class.
        /// </summary>
        /// <param name="cardId">cardId.</param>
        /// <param name="cardNumber">cardNumber.</param>
        /// <param name="cardExpMonth">cardExpMonth.</param>
        /// <param name="cardExpYear">cardExpYear.</param>
        /// <param name="cardBrand">cardBrand.</param>
        /// <param name="cardType">cardType.</param>
        /// <param name="bin">bin.</param>
        /// <param name="cardHolderFullName">cardHolderFullName.</param>
        /// <param name="cardCvv">cardCvv.</param>
        /// <param name="address">address.</param>
        /// <param name="token">token.</param>
        public CardData(string cardId = default(string), string cardNumber = default(string), string cardExpMonth = default(string), string cardExpYear = default(string), ReferenceEntityBase cardBrand = default(ReferenceEntityBase), ReferenceEntityBase cardType = default(ReferenceEntityBase), string bin = default(string), string cardHolderFullName = default(string), string cardCvv = default(string), AddressData address = default(AddressData), string token = default(string))
        {
            this.CardId = cardId;
            this.CardNumber = cardNumber;
            this.CardExpMonth = cardExpMonth;
            this.CardExpYear = cardExpYear;
            this.CardBrand = cardBrand;
            this.CardType = cardType;
            this.Bin = bin;
            this.CardHolderFullName = cardHolderFullName;
            this.CardCvv = cardCvv;
            this.Address = address;
            this.Token = token;
        }
        
        /// <summary>
        /// Gets or Sets CardId
        /// </summary>
        [DataMember(Name="CardId", EmitDefaultValue=false)]
        public string CardId { get; set; }

        /// <summary>
        /// Gets or Sets CardNumber
        /// </summary>
        [DataMember(Name="CardNumber", EmitDefaultValue=false)]
        public string CardNumber { get; set; }

        /// <summary>
        /// Gets or Sets CardExpMonth
        /// </summary>
        [DataMember(Name="CardExpMonth", EmitDefaultValue=false)]
        public string CardExpMonth { get; set; }

        /// <summary>
        /// Gets or Sets CardExpYear
        /// </summary>
        [DataMember(Name="CardExpYear", EmitDefaultValue=false)]
        public string CardExpYear { get; set; }

        /// <summary>
        /// Gets or Sets CardBrand
        /// </summary>
        [DataMember(Name="CardBrand", EmitDefaultValue=false)]
        public ReferenceEntityBase CardBrand { get; set; }

        /// <summary>
        /// Gets or Sets CardType
        /// </summary>
        [DataMember(Name="CardType", EmitDefaultValue=false)]
        public ReferenceEntityBase CardType { get; set; }

        /// <summary>
        /// Gets or Sets Bin
        /// </summary>
        [DataMember(Name="Bin", EmitDefaultValue=false)]
        public string Bin { get; set; }

        /// <summary>
        /// Gets or Sets CardHolderFullName
        /// </summary>
        [DataMember(Name="CardHolderFullName", EmitDefaultValue=false)]
        public string CardHolderFullName { get; set; }

        /// <summary>
        /// Gets or Sets CardCvv
        /// </summary>
        [DataMember(Name="CardCvv", EmitDefaultValue=false)]
        public string CardCvv { get; set; }

        /// <summary>
        /// Gets or Sets Address
        /// </summary>
        [DataMember(Name="Address", EmitDefaultValue=false)]
        public AddressData Address { get; set; }

        /// <summary>
        /// Gets or Sets Token
        /// </summary>
        [DataMember(Name="Token", EmitDefaultValue=false)]
        public string Token { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class CardData {\n");
            sb.Append("  CardId: ").Append(CardId).Append("\n");
            sb.Append("  CardNumber: ").Append(CardNumber).Append("\n");
            sb.Append("  CardExpMonth: ").Append(CardExpMonth).Append("\n");
            sb.Append("  CardExpYear: ").Append(CardExpYear).Append("\n");
            sb.Append("  CardBrand: ").Append(CardBrand).Append("\n");
            sb.Append("  CardType: ").Append(CardType).Append("\n");
            sb.Append("  Bin: ").Append(Bin).Append("\n");
            sb.Append("  CardHolderFullName: ").Append(CardHolderFullName).Append("\n");
            sb.Append("  CardCvv: ").Append(CardCvv).Append("\n");
            sb.Append("  Address: ").Append(Address).Append("\n");
            sb.Append("  Token: ").Append(Token).Append("\n");
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
            return this.Equals(input as CardData);
        }

        /// <summary>
        /// Returns true if CardData instances are equal
        /// </summary>
        /// <param name="input">Instance of CardData to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CardData input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.CardId == input.CardId ||
                    (this.CardId != null &&
                    this.CardId.Equals(input.CardId))
                ) && 
                (
                    this.CardNumber == input.CardNumber ||
                    (this.CardNumber != null &&
                    this.CardNumber.Equals(input.CardNumber))
                ) && 
                (
                    this.CardExpMonth == input.CardExpMonth ||
                    (this.CardExpMonth != null &&
                    this.CardExpMonth.Equals(input.CardExpMonth))
                ) && 
                (
                    this.CardExpYear == input.CardExpYear ||
                    (this.CardExpYear != null &&
                    this.CardExpYear.Equals(input.CardExpYear))
                ) && 
                (
                    this.CardBrand == input.CardBrand ||
                    (this.CardBrand != null &&
                    this.CardBrand.Equals(input.CardBrand))
                ) && 
                (
                    this.CardType == input.CardType ||
                    (this.CardType != null &&
                    this.CardType.Equals(input.CardType))
                ) && 
                (
                    this.Bin == input.Bin ||
                    (this.Bin != null &&
                    this.Bin.Equals(input.Bin))
                ) && 
                (
                    this.CardHolderFullName == input.CardHolderFullName ||
                    (this.CardHolderFullName != null &&
                    this.CardHolderFullName.Equals(input.CardHolderFullName))
                ) && 
                (
                    this.CardCvv == input.CardCvv ||
                    (this.CardCvv != null &&
                    this.CardCvv.Equals(input.CardCvv))
                ) && 
                (
                    this.Address == input.Address ||
                    (this.Address != null &&
                    this.Address.Equals(input.Address))
                ) && 
                (
                    this.Token == input.Token ||
                    (this.Token != null &&
                    this.Token.Equals(input.Token))
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
                if (this.CardId != null)
                    hashCode = hashCode * 59 + this.CardId.GetHashCode();
                if (this.CardNumber != null)
                    hashCode = hashCode * 59 + this.CardNumber.GetHashCode();
                if (this.CardExpMonth != null)
                    hashCode = hashCode * 59 + this.CardExpMonth.GetHashCode();
                if (this.CardExpYear != null)
                    hashCode = hashCode * 59 + this.CardExpYear.GetHashCode();
                if (this.CardBrand != null)
                    hashCode = hashCode * 59 + this.CardBrand.GetHashCode();
                if (this.CardType != null)
                    hashCode = hashCode * 59 + this.CardType.GetHashCode();
                if (this.Bin != null)
                    hashCode = hashCode * 59 + this.Bin.GetHashCode();
                if (this.CardHolderFullName != null)
                    hashCode = hashCode * 59 + this.CardHolderFullName.GetHashCode();
                if (this.CardCvv != null)
                    hashCode = hashCode * 59 + this.CardCvv.GetHashCode();
                if (this.Address != null)
                    hashCode = hashCode * 59 + this.Address.GetHashCode();
                if (this.Token != null)
                    hashCode = hashCode * 59 + this.Token.GetHashCode();
                return hashCode;
            }
        }
    }

}
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
    /// Defines InstallmentsPlanDateType
    /// </summary>
    
    [JsonConverter(typeof(StringEnumConverter))]
    
    public enum InstallmentsPlanDateType
    {
        
        /// <summary>
        /// Enum None for value: None
        /// </summary>
        [EnumMember(Value = "None")]
        None = 1,
        
        /// <summary>
        /// Enum LastChargeDate for value: LastChargeDate
        /// </summary>
        [EnumMember(Value = "LastChargeDate")]
        LastChargeDate = 2,
        
        /// <summary>
        /// Enum ReserveReturnDate for value: ReserveReturnDate
        /// </summary>
        [EnumMember(Value = "ReserveReturnDate")]
        ReserveReturnDate = 3,
        
        /// <summary>
        /// Enum CreatedDate for value: CreatedDate
        /// </summary>
        [EnumMember(Value = "CreatedDate")]
        CreatedDate = 4,
        
        /// <summary>
        /// Enum FinancedDate for value: FinancedDate
        /// </summary>
        [EnumMember(Value = "FinancedDate")]
        FinancedDate = 5,
        
        /// <summary>
        /// Enum ShippingDate for value: ShippingDate
        /// </summary>
        [EnumMember(Value = "ShippingDate")]
        ShippingDate = 6,
        
        /// <summary>
        /// Enum ProcessingDate for value: ProcessingDate
        /// </summary>
        [EnumMember(Value = "ProcessingDate")]
        ProcessingDate = 7
    }

}

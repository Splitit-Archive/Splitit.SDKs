<?php
/**
 * CardData
 *
 * PHP version 5
 *
 * @category Class
 * @package  SplititSdkClient
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */

/**
 * splitit-web-api-public-sdk
 *
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 * Swagger Codegen version: 2.4.12
 */

/**
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */

namespace SplititSdkClient\Model;

use \ArrayAccess;
use \SplititSdkClient\ObjectSerializer;

/**
 * CardData Class Doc Comment
 *
 * @category Class
 * @package  SplititSdkClient
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class CardData implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $swaggerModelName = 'CardData';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerTypes = [
        'card_id' => 'string',
        'card_number' => 'string',
        'card_exp_month' => 'string',
        'card_exp_year' => 'string',
        'card_brand' => '\SplititSdkClient\Model\ReferenceEntityBase',
        'card_type' => '\SplititSdkClient\Model\ReferenceEntityBase',
        'bin' => 'string',
        'card_holder_full_name' => 'string',
        'card_cvv' => 'string',
        'address' => '\SplititSdkClient\Model\AddressData',
        'token' => 'string'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerFormats = [
        'card_id' => null,
        'card_number' => null,
        'card_exp_month' => null,
        'card_exp_year' => null,
        'card_brand' => null,
        'card_type' => null,
        'bin' => null,
        'card_holder_full_name' => null,
        'card_cvv' => null,
        'address' => null,
        'token' => null
    ];

    /**
     * Array of property to type mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function swaggerTypes()
    {
        return self::$swaggerTypes;
    }

    /**
     * Array of property to format mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function swaggerFormats()
    {
        return self::$swaggerFormats;
    }

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @var string[]
     */
    protected static $attributeMap = [
        'card_id' => 'CardId',
        'card_number' => 'CardNumber',
        'card_exp_month' => 'CardExpMonth',
        'card_exp_year' => 'CardExpYear',
        'card_brand' => 'CardBrand',
        'card_type' => 'CardType',
        'bin' => 'Bin',
        'card_holder_full_name' => 'CardHolderFullName',
        'card_cvv' => 'CardCvv',
        'address' => 'Address',
        'token' => 'Token'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'card_id' => 'setCardId',
        'card_number' => 'setCardNumber',
        'card_exp_month' => 'setCardExpMonth',
        'card_exp_year' => 'setCardExpYear',
        'card_brand' => 'setCardBrand',
        'card_type' => 'setCardType',
        'bin' => 'setBin',
        'card_holder_full_name' => 'setCardHolderFullName',
        'card_cvv' => 'setCardCvv',
        'address' => 'setAddress',
        'token' => 'setToken'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'card_id' => 'getCardId',
        'card_number' => 'getCardNumber',
        'card_exp_month' => 'getCardExpMonth',
        'card_exp_year' => 'getCardExpYear',
        'card_brand' => 'getCardBrand',
        'card_type' => 'getCardType',
        'bin' => 'getBin',
        'card_holder_full_name' => 'getCardHolderFullName',
        'card_cvv' => 'getCardCvv',
        'address' => 'getAddress',
        'token' => 'getToken'
    ];

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @return array
     */
    public static function attributeMap()
    {
        return self::$attributeMap;
    }

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @return array
     */
    public static function setters()
    {
        return self::$setters;
    }

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @return array
     */
    public static function getters()
    {
        return self::$getters;
    }

    /**
     * The original name of the model.
     *
     * @return string
     */
    public function getModelName()
    {
        return self::$swaggerModelName;
    }

    

    

    /**
     * Associative array for storing property values
     *
     * @var mixed[]
     */
    protected $container = [];

    /**
     * Constructor
     *
     * @param mixed[] $data Associated array of property values
     *                      initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->container['card_id'] = isset($data['card_id']) ? $data['card_id'] : null;
        $this->container['card_number'] = isset($data['card_number']) ? $data['card_number'] : null;
        $this->container['card_exp_month'] = isset($data['card_exp_month']) ? $data['card_exp_month'] : null;
        $this->container['card_exp_year'] = isset($data['card_exp_year']) ? $data['card_exp_year'] : null;
        $this->container['card_brand'] = isset($data['card_brand']) ? $data['card_brand'] : null;
        $this->container['card_type'] = isset($data['card_type']) ? $data['card_type'] : null;
        $this->container['bin'] = isset($data['bin']) ? $data['bin'] : null;
        $this->container['card_holder_full_name'] = isset($data['card_holder_full_name']) ? $data['card_holder_full_name'] : null;
        $this->container['card_cvv'] = isset($data['card_cvv']) ? $data['card_cvv'] : null;
        $this->container['address'] = isset($data['address']) ? $data['address'] : null;
        $this->container['token'] = isset($data['token']) ? $data['token'] : null;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalidProperties = [];

        return $invalidProperties;
    }

    /**
     * Validate all the properties in the model
     * return true if all passed
     *
     * @return bool True if all properties are valid
     */
    public function valid()
    {
        return count($this->listInvalidProperties()) === 0;
    }


    /**
     * Gets card_id
     *
     * @return string
     */
    public function getCardId()
    {
        return $this->container['card_id'];
    }

    /**
     * Sets card_id
     *
     * @param string $card_id card_id
     *
     * @return $this
     */
    public function setCardId($card_id)
    {
        $this->container['card_id'] = $card_id;

        return $this;
    }

    /**
     * Gets card_number
     *
     * @return string
     */
    public function getCardNumber()
    {
        return $this->container['card_number'];
    }

    /**
     * Sets card_number
     *
     * @param string $card_number card_number
     *
     * @return $this
     */
    public function setCardNumber($card_number)
    {
        $this->container['card_number'] = $card_number;

        return $this;
    }

    /**
     * Gets card_exp_month
     *
     * @return string
     */
    public function getCardExpMonth()
    {
        return $this->container['card_exp_month'];
    }

    /**
     * Sets card_exp_month
     *
     * @param string $card_exp_month card_exp_month
     *
     * @return $this
     */
    public function setCardExpMonth($card_exp_month)
    {
        $this->container['card_exp_month'] = $card_exp_month;

        return $this;
    }

    /**
     * Gets card_exp_year
     *
     * @return string
     */
    public function getCardExpYear()
    {
        return $this->container['card_exp_year'];
    }

    /**
     * Sets card_exp_year
     *
     * @param string $card_exp_year card_exp_year
     *
     * @return $this
     */
    public function setCardExpYear($card_exp_year)
    {
        $this->container['card_exp_year'] = $card_exp_year;

        return $this;
    }

    /**
     * Gets card_brand
     *
     * @return \SplititSdkClient\Model\ReferenceEntityBase
     */
    public function getCardBrand()
    {
        return $this->container['card_brand'];
    }

    /**
     * Sets card_brand
     *
     * @param \SplititSdkClient\Model\ReferenceEntityBase $card_brand card_brand
     *
     * @return $this
     */
    public function setCardBrand($card_brand)
    {
        $this->container['card_brand'] = $card_brand;

        return $this;
    }

    /**
     * Gets card_type
     *
     * @return \SplititSdkClient\Model\ReferenceEntityBase
     */
    public function getCardType()
    {
        return $this->container['card_type'];
    }

    /**
     * Sets card_type
     *
     * @param \SplititSdkClient\Model\ReferenceEntityBase $card_type card_type
     *
     * @return $this
     */
    public function setCardType($card_type)
    {
        $this->container['card_type'] = $card_type;

        return $this;
    }

    /**
     * Gets bin
     *
     * @return string
     */
    public function getBin()
    {
        return $this->container['bin'];
    }

    /**
     * Sets bin
     *
     * @param string $bin bin
     *
     * @return $this
     */
    public function setBin($bin)
    {
        $this->container['bin'] = $bin;

        return $this;
    }

    /**
     * Gets card_holder_full_name
     *
     * @return string
     */
    public function getCardHolderFullName()
    {
        return $this->container['card_holder_full_name'];
    }

    /**
     * Sets card_holder_full_name
     *
     * @param string $card_holder_full_name card_holder_full_name
     *
     * @return $this
     */
    public function setCardHolderFullName($card_holder_full_name)
    {
        $this->container['card_holder_full_name'] = $card_holder_full_name;

        return $this;
    }

    /**
     * Gets card_cvv
     *
     * @return string
     */
    public function getCardCvv()
    {
        return $this->container['card_cvv'];
    }

    /**
     * Sets card_cvv
     *
     * @param string $card_cvv card_cvv
     *
     * @return $this
     */
    public function setCardCvv($card_cvv)
    {
        $this->container['card_cvv'] = $card_cvv;

        return $this;
    }

    /**
     * Gets address
     *
     * @return \SplititSdkClient\Model\AddressData
     */
    public function getAddress()
    {
        return $this->container['address'];
    }

    /**
     * Sets address
     *
     * @param \SplititSdkClient\Model\AddressData $address address
     *
     * @return $this
     */
    public function setAddress($address)
    {
        $this->container['address'] = $address;

        return $this;
    }

    /**
     * Gets token
     *
     * @return string
     */
    public function getToken()
    {
        return $this->container['token'];
    }

    /**
     * Sets token
     *
     * @param string $token token
     *
     * @return $this
     */
    public function setToken($token)
    {
        $this->container['token'] = $token;

        return $this;
    }
    /**
     * Returns true if offset exists. False otherwise.
     *
     * @param integer $offset Offset
     *
     * @return boolean
     */
    public function offsetExists($offset)
    {
        return isset($this->container[$offset]);
    }

    /**
     * Gets offset.
     *
     * @param integer $offset Offset
     *
     * @return mixed
     */
    public function offsetGet($offset)
    {
        return isset($this->container[$offset]) ? $this->container[$offset] : null;
    }

    /**
     * Sets value based on offset.
     *
     * @param integer $offset Offset
     * @param mixed   $value  Value to be set
     *
     * @return void
     */
    public function offsetSet($offset, $value)
    {
        if (is_null($offset)) {
            $this->container[] = $value;
        } else {
            $this->container[$offset] = $value;
        }
    }

    /**
     * Unsets offset.
     *
     * @param integer $offset Offset
     *
     * @return void
     */
    public function offsetUnset($offset)
    {
        unset($this->container[$offset]);
    }

    /**
     * Gets the string presentation of the object
     *
     * @return string
     */
    public function __toString()
    {
        if (defined('JSON_PRETTY_PRINT')) { // use JSON pretty print
            return json_encode(
                ObjectSerializer::sanitizeForSerialization($this),
                JSON_PRETTY_PRINT
            );
        }

        return json_encode(ObjectSerializer::sanitizeForSerialization($this));
    }
}



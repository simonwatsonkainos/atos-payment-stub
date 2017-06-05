
package sips.en.contract.dvla;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for notificationWalletDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="notificationWalletDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:sips:en:contract:dvla}notificationDTO">
 *       &lt;sequence>
 *         &lt;element name="complementaryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="complementaryInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="merchantId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="merchantSessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="merchantWalletId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="responseCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "notificationWalletDTO", propOrder = {
    "complementaryCode",
    "complementaryInfo",
    "merchantId",
    "merchantSessionId",
    "merchantWalletId",
    "responseCode"
})
public class NotificationWalletDTO
    extends NotificationDTO
{

    protected String complementaryCode;
    protected String complementaryInfo;
    @XmlElement(required = true)
    protected String merchantId;
    protected String merchantSessionId;
    @XmlElement(required = true)
    protected String merchantWalletId;
    @XmlElement(required = true)
    protected String responseCode;

    /**
     * Gets the value of the complementaryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplementaryCode() {
        return complementaryCode;
    }

    /**
     * Sets the value of the complementaryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplementaryCode(String value) {
        this.complementaryCode = value;
    }

    /**
     * Gets the value of the complementaryInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplementaryInfo() {
        return complementaryInfo;
    }

    /**
     * Sets the value of the complementaryInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplementaryInfo(String value) {
        this.complementaryInfo = value;
    }

    /**
     * Gets the value of the merchantId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantId() {
        return merchantId;
    }

    /**
     * Sets the value of the merchantId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantId(String value) {
        this.merchantId = value;
    }

    /**
     * Gets the value of the merchantSessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantSessionId() {
        return merchantSessionId;
    }

    /**
     * Sets the value of the merchantSessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantSessionId(String value) {
        this.merchantSessionId = value;
    }

    /**
     * Gets the value of the merchantWalletId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantWalletId() {
        return merchantWalletId;
    }

    /**
     * Sets the value of the merchantWalletId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantWalletId(String value) {
        this.merchantWalletId = value;
    }

    /**
     * Gets the value of the responseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseCode() {
        return responseCode;
    }

    /**
     * Sets the value of the responseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseCode(String value) {
        this.responseCode = value;
    }

}

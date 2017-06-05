
package sips.cn.contract;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="automaticResponseUrl" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0" form="unqualified"/>
 *         &lt;element name="customerLanguage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="merchantId" type="{http://www.w3.org/2001/XMLSchema}string" form="unqualified"/>
 *         &lt;element name="merchantSessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="merchantWalletId" type="{http://www.w3.org/2001/XMLSchema}string" form="unqualified"/>
 *         &lt;element name="normalReturnUrl" type="{http://www.w3.org/2001/XMLSchema}anyURI" form="unqualified"/>
 *         &lt;element name="requestVersion" type="{http://www.w3.org/2001/XMLSchema}string" form="unqualified"/>
 *         &lt;element name="templateFile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
public class Request {

    @XmlSchemaType(name = "anyURI")
    protected String automaticResponseUrl;
    protected String customerLanguage;
    @XmlElement(required = true)
    protected String merchantId;
    protected String merchantSessionId;
    @XmlElement(required = true)
    protected String merchantWalletId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String normalReturnUrl;
    @XmlElement(required = true)
    protected String requestVersion;
    protected String templateFile;

    /**
     * Gets the value of the automaticResponseUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutomaticResponseUrl() {
        return automaticResponseUrl;
    }

    /**
     * Sets the value of the automaticResponseUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutomaticResponseUrl(String value) {
        this.automaticResponseUrl = value;
    }

    /**
     * Gets the value of the customerLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerLanguage() {
        return customerLanguage;
    }

    /**
     * Sets the value of the customerLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerLanguage(String value) {
        this.customerLanguage = value;
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
     * Gets the value of the normalReturnUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNormalReturnUrl() {
        return normalReturnUrl;
    }

    /**
     * Sets the value of the normalReturnUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNormalReturnUrl(String value) {
        this.normalReturnUrl = value;
    }

    /**
     * Gets the value of the requestVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestVersion() {
        return requestVersion;
    }

    /**
     * Sets the value of the requestVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestVersion(String value) {
        this.requestVersion = value;
    }

    /**
     * Gets the value of the templateFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateFile() {
        return templateFile;
    }

    /**
     * Sets the value of the templateFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateFile(String value) {
        this.templateFile = value;
    }

}

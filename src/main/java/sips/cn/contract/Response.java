
package sips.cn.contract;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="redirectionData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="redirectionStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="redirectionStatusMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="redirectionUrl" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0" form="unqualified"/>
 *         &lt;element name="redirectionVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
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
public class Response {

    protected String redirectionData;
    protected String redirectionStatusCode;
    protected String redirectionStatusMessage;
    @XmlSchemaType(name = "anyURI")
    protected String redirectionUrl;
    protected String redirectionVersion;

    /**
     * Gets the value of the redirectionData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedirectionData() {
        return redirectionData;
    }

    /**
     * Sets the value of the redirectionData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedirectionData(String value) {
        this.redirectionData = value;
    }

    /**
     * Gets the value of the redirectionStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedirectionStatusCode() {
        return redirectionStatusCode;
    }

    /**
     * Sets the value of the redirectionStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedirectionStatusCode(String value) {
        this.redirectionStatusCode = value;
    }

    /**
     * Gets the value of the redirectionStatusMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedirectionStatusMessage() {
        return redirectionStatusMessage;
    }

    /**
     * Sets the value of the redirectionStatusMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedirectionStatusMessage(String value) {
        this.redirectionStatusMessage = value;
    }

    /**
     * Gets the value of the redirectionUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedirectionUrl() {
        return redirectionUrl;
    }

    /**
     * Sets the value of the redirectionUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedirectionUrl(String value) {
        this.redirectionUrl = value;
    }

    /**
     * Gets the value of the redirectionVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedirectionVersion() {
        return redirectionVersion;
    }

    /**
     * Sets the value of the redirectionVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedirectionVersion(String value) {
        this.redirectionVersion = value;
    }

}

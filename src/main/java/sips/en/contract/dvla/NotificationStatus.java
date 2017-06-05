
package sips.en.contract.dvla;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for notificationStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="notificationStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="autoResponseStatusCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="autoResponseStatusMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "notificationStatus", propOrder = {
    "autoResponseStatusCode",
    "autoResponseStatusMessage"
})
public class NotificationStatus {

    @XmlElement(required = true)
    protected String autoResponseStatusCode;
    @XmlElement(required = true)
    protected String autoResponseStatusMessage;

    /**
     * Gets the value of the autoResponseStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoResponseStatusCode() {
        return autoResponseStatusCode;
    }

    /**
     * Sets the value of the autoResponseStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoResponseStatusCode(String value) {
        this.autoResponseStatusCode = value;
    }

    /**
     * Gets the value of the autoResponseStatusMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoResponseStatusMessage() {
        return autoResponseStatusMessage;
    }

    /**
     * Sets the value of the autoResponseStatusMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoResponseStatusMessage(String value) {
        this.autoResponseStatusMessage = value;
    }

}

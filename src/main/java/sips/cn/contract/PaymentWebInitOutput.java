
package sips.cn.contract;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for paymentWebInitOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="paymentWebInitOutput">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:sips:cn:contract}output">
 *       &lt;sequence>
 *         &lt;element name="response" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="redirectionData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *                   &lt;element name="redirectionStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *                   &lt;element name="redirectionStatusMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *                   &lt;element name="redirectionUrl" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0" form="unqualified"/>
 *                   &lt;element name="redirectionVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *                 &lt;/all>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paymentWebInitOutput", propOrder = {
    "response"
})
public class PaymentWebInitOutput
    extends Output
{

    public PaymentWebInitOutput(Response2 response) {
        this.response = response;
    }

    @XmlElement(namespace = "urn:sips:cn:contract")
    protected Response2 response;

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link sips.cn.contract.Response2 }
     *     
     */
    public Response2 getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link sips.cn.contract.Response2 }
     *     
     */
    public void setResponse(Response2 value) {
        this.response = value;
    }

}


package sips.cn.contract;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for processPaymentWebInit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="processPaymentWebInit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="input" type="{urn:sips:cn:contract}paymentWebInitInput" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "processPaymentWebInit", propOrder = {
    "input"
})
public class ProcessPaymentWebInit {

    @XmlElement(namespace = "urn:sips:cn:contract")
    protected PaymentWebInitInput input;

    /**
     * Gets the value of the input property.
     * 
     * @return
     *     possible object is
     *     {@link sips.cn.contract.PaymentWebInitInput }
     *     
     */
    public PaymentWebInitInput getInput() {
        return input;
    }

    /**
     * Sets the value of the input property.
     * 
     * @param value
     *     allowed object is
     *     {@link sips.cn.contract.PaymentWebInitInput }
     *     
     */
    public void setInput(PaymentWebInitInput value) {
        this.input = value;
    }

}

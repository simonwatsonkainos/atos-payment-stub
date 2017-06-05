
package sips.cn.contract;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for processWalletManagementInitResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="processWalletManagementInitResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="output" type="{urn:sips:cn:contract}walletManagementInitOutput" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "processWalletManagementInitResponse", propOrder = {
    "output"
})
public class ProcessWalletManagementInitResponse {

    @XmlElement(namespace = "urn:sips:cn:contract")
    protected WalletManagementInitOutput output;

    /**
     * Gets the value of the output property.
     * 
     * @return
     *     possible object is
     *     {@link sips.cn.contract.WalletManagementInitOutput }
     *     
     */
    public WalletManagementInitOutput getOutput() {
        return output;
    }

    /**
     * Sets the value of the output property.
     * 
     * @param value
     *     allowed object is
     *     {@link sips.cn.contract.WalletManagementInitOutput }
     *     
     */
    public void setOutput(WalletManagementInitOutput value) {
        this.output = value;
    }

}

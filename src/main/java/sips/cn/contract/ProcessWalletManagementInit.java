
package sips.cn.contract;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for processWalletManagementInit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="processWalletManagementInit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="input" type="{urn:sips:cn:contract}walletManagementInitInput" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "processWalletManagementInit", propOrder = {
    "input"
})
public class ProcessWalletManagementInit {

    @XmlElement(namespace = "urn:sips:cn:contract")
    protected WalletManagementInitInput input;

    /**
     * Gets the value of the input property.
     * 
     * @return
     *     possible object is
     *     {@link sips.cn.contract.WalletManagementInitInput }
     *     
     */
    public WalletManagementInitInput getInput() {
        return input;
    }

    /**
     * Sets the value of the input property.
     * 
     * @param value
     *     allowed object is
     *     {@link sips.cn.contract.WalletManagementInitInput }
     *     
     */
    public void setInput(WalletManagementInitInput value) {
        this.input = value;
    }

}

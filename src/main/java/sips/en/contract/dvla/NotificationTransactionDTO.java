
package sips.en.contract.dvla;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter1;


/**
 * <p>Java class for notificationTransactionDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="notificationTransactionDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:sips:en:contract:dvla}notificationDTO">
 *       &lt;sequence>
 *         &lt;element name="acquirerResponseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="acquirerResponseDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="authorisationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="captureDay" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="captureMode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cardCreditDebitIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardCSCResultCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardExpiryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardScheme" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardSeqNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="chargeAmount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="complementaryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="complementaryInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="customerEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerIpAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="maskedPan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="merchantId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="merchantSessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="merchantTransactionDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="merchantWalletId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orderAmount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="orderChannel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="orderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="responseCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="responseDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="returnContext" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="threeDLiabilityShift" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="threeDRelegationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="threeDStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="transactionReference" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "notificationTransactionDTO", propOrder = {
    "acquirerResponseCode",
    "acquirerResponseDescription",
    "amount",
    "authorisationId",
    "captureDay",
    "captureMode",
    "cardCreditDebitIndicator",
    "cardCSCResultCode",
    "cardExpiryDate",
    "cardScheme",
    "cardSeqNumber",
    "chargeAmount",
    "complementaryCode",
    "complementaryInfo",
    "currencyCode",
    "customerEmail",
    "customerId",
    "customerIpAddress",
    "maskedPan",
    "merchantId",
    "merchantSessionId",
    "merchantTransactionDateTime",
    "merchantWalletId",
    "orderAmount",
    "orderChannel",
    "orderId",
    "responseCode",
    "responseDescription",
    "returnContext",
    "threeDLiabilityShift",
    "threeDRelegationCode",
    "threeDStatusCode",
    "transactionDateTime",
    "transactionReference",
    "userId"
})
public class NotificationTransactionDTO
    extends NotificationDTO
{

    protected String acquirerResponseCode;
    protected String acquirerResponseDescription;
    protected Long amount;
    protected String authorisationId;
    protected short captureDay;
    @XmlElement(required = true)
    protected String captureMode;
    protected String cardCreditDebitIndicator;
    protected String cardCSCResultCode;
    protected String cardExpiryDate;
    protected String cardScheme;
    protected String cardSeqNumber;
    protected Long chargeAmount;
    protected String complementaryCode;
    protected String complementaryInfo;
    @XmlElement(required = true)
    protected String currencyCode;
    protected String customerEmail;
    protected String customerId;
    @XmlElement(required = true)
    protected String customerIpAddress;
    protected String maskedPan;
    @XmlElement(required = true)
    protected String merchantId;
    protected String merchantSessionId;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date merchantTransactionDateTime;
    protected String merchantWalletId;
    protected long orderAmount;
    @XmlElement(required = true)
    protected String orderChannel;
    protected String orderId;
    @XmlElement(required = true)
    protected String responseCode;
    @XmlElement(required = true)
    protected String responseDescription;
    protected String returnContext;
    protected String threeDLiabilityShift;
    protected String threeDRelegationCode;
    protected String threeDStatusCode;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date transactionDateTime;
    @XmlElement(required = true)
    protected String transactionReference;
    protected String userId;

    /**
     * Gets the value of the acquirerResponseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcquirerResponseCode() {
        return acquirerResponseCode;
    }

    /**
     * Sets the value of the acquirerResponseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcquirerResponseCode(String value) {
        this.acquirerResponseCode = value;
    }

    /**
     * Gets the value of the acquirerResponseDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcquirerResponseDescription() {
        return acquirerResponseDescription;
    }

    /**
     * Sets the value of the acquirerResponseDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcquirerResponseDescription(String value) {
        this.acquirerResponseDescription = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAmount(Long value) {
        this.amount = value;
    }

    /**
     * Gets the value of the authorisationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorisationId() {
        return authorisationId;
    }

    /**
     * Sets the value of the authorisationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorisationId(String value) {
        this.authorisationId = value;
    }

    /**
     * Gets the value of the captureDay property.
     * 
     */
    public short getCaptureDay() {
        return captureDay;
    }

    /**
     * Sets the value of the captureDay property.
     * 
     */
    public void setCaptureDay(short value) {
        this.captureDay = value;
    }

    /**
     * Gets the value of the captureMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaptureMode() {
        return captureMode;
    }

    /**
     * Sets the value of the captureMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaptureMode(String value) {
        this.captureMode = value;
    }

    /**
     * Gets the value of the cardCreditDebitIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardCreditDebitIndicator() {
        return cardCreditDebitIndicator;
    }

    /**
     * Sets the value of the cardCreditDebitIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardCreditDebitIndicator(String value) {
        this.cardCreditDebitIndicator = value;
    }

    /**
     * Gets the value of the cardCSCResultCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardCSCResultCode() {
        return cardCSCResultCode;
    }

    /**
     * Sets the value of the cardCSCResultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardCSCResultCode(String value) {
        this.cardCSCResultCode = value;
    }

    /**
     * Gets the value of the cardExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardExpiryDate() {
        return cardExpiryDate;
    }

    /**
     * Sets the value of the cardExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardExpiryDate(String value) {
        this.cardExpiryDate = value;
    }

    /**
     * Gets the value of the cardScheme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardScheme() {
        return cardScheme;
    }

    /**
     * Sets the value of the cardScheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardScheme(String value) {
        this.cardScheme = value;
    }

    /**
     * Gets the value of the cardSeqNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardSeqNumber() {
        return cardSeqNumber;
    }

    /**
     * Sets the value of the cardSeqNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardSeqNumber(String value) {
        this.cardSeqNumber = value;
    }

    /**
     * Gets the value of the chargeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getChargeAmount() {
        return chargeAmount;
    }

    /**
     * Sets the value of the chargeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setChargeAmount(Long value) {
        this.chargeAmount = value;
    }

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
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the customerEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerEmail() {
        return customerEmail;
    }

    /**
     * Sets the value of the customerEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerEmail(String value) {
        this.customerEmail = value;
    }

    /**
     * Gets the value of the customerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerId(String value) {
        this.customerId = value;
    }

    /**
     * Gets the value of the customerIpAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerIpAddress() {
        return customerIpAddress;
    }

    /**
     * Sets the value of the customerIpAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerIpAddress(String value) {
        this.customerIpAddress = value;
    }

    /**
     * Gets the value of the maskedPan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaskedPan() {
        return maskedPan;
    }

    /**
     * Sets the value of the maskedPan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaskedPan(String value) {
        this.maskedPan = value;
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
     * Gets the value of the merchantTransactionDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getMerchantTransactionDateTime() {
        return merchantTransactionDateTime;
    }

    /**
     * Sets the value of the merchantTransactionDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantTransactionDateTime(Date value) {
        this.merchantTransactionDateTime = value;
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
     * Gets the value of the orderAmount property.
     * 
     */
    public long getOrderAmount() {
        return orderAmount;
    }

    /**
     * Sets the value of the orderAmount property.
     * 
     */
    public void setOrderAmount(long value) {
        this.orderAmount = value;
    }

    /**
     * Gets the value of the orderChannel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderChannel() {
        return orderChannel;
    }

    /**
     * Sets the value of the orderChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderChannel(String value) {
        this.orderChannel = value;
    }

    /**
     * Gets the value of the orderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * Sets the value of the orderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderId(String value) {
        this.orderId = value;
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

    /**
     * Gets the value of the responseDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseDescription() {
        return responseDescription;
    }

    /**
     * Sets the value of the responseDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseDescription(String value) {
        this.responseDescription = value;
    }

    /**
     * Gets the value of the returnContext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnContext() {
        return returnContext;
    }

    /**
     * Sets the value of the returnContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnContext(String value) {
        this.returnContext = value;
    }

    /**
     * Gets the value of the threeDLiabilityShift property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThreeDLiabilityShift() {
        return threeDLiabilityShift;
    }

    /**
     * Sets the value of the threeDLiabilityShift property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThreeDLiabilityShift(String value) {
        this.threeDLiabilityShift = value;
    }

    /**
     * Gets the value of the threeDRelegationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThreeDRelegationCode() {
        return threeDRelegationCode;
    }

    /**
     * Sets the value of the threeDRelegationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThreeDRelegationCode(String value) {
        this.threeDRelegationCode = value;
    }

    /**
     * Gets the value of the threeDStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThreeDStatusCode() {
        return threeDStatusCode;
    }

    /**
     * Sets the value of the threeDStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThreeDStatusCode(String value) {
        this.threeDStatusCode = value;
    }

    /**
     * Gets the value of the transactionDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getTransactionDateTime() {
        return transactionDateTime;
    }

    /**
     * Sets the value of the transactionDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionDateTime(Date value) {
        this.transactionDateTime = value;
    }

    /**
     * Gets the value of the transactionReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionReference() {
        return transactionReference;
    }

    /**
     * Sets the value of the transactionReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionReference(String value) {
        this.transactionReference = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

}

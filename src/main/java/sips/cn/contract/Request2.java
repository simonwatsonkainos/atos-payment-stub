package sips.cn.contract;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter1;

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
 *         &lt;element name="captureDay" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0" form="unqualified"/>
 *         &lt;element name="captureMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="currencyCode" type="{http://www.w3.org/2001/XMLSchema}string" form="unqualified"/>
 *         &lt;element name="customerEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="customerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="customerLanguage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="requestVersion" type="{http://www.w3.org/2001/XMLSchema}string" form="unqualified"/>
 *         &lt;element name="merchantId" type="{http://www.w3.org/2001/XMLSchema}string" form="unqualified"/>
 *         &lt;element name="merchantSessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="merchantTransactionDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0" form="unqualified"/>
 *         &lt;element name="merchantWalletId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="normalReturnUrl" type="{http://www.w3.org/2001/XMLSchema}anyURI" form="unqualified"/>
 *         &lt;element name="orderAmount" type="{http://www.w3.org/2001/XMLSchema}long" form="unqualified"/>
 *         &lt;element name="orderChannel" type="{http://www.w3.org/2001/XMLSchema}string" form="unqualified"/>
 *         &lt;element name="orderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="paymentMeans" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="returnContext" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="templateFile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="transactionReference" type="{http://www.w3.org/2001/XMLSchema}string" form="unqualified"/>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "request", propOrder = {
})
public class Request2 {

    @XmlElement
    @XmlSchemaType(name = "anyURI")
    protected String automaticResponseUrl;

    @XmlElement
    protected Short captureDay;

    @XmlElement
    protected String captureMode;

    @XmlElement(required = true)
    protected String currencyCode;

    @XmlElement
    protected String customerEmail;

    @XmlElement
    protected String customerId;

    @XmlElement
    protected String customerLanguage;

    @XmlElement(required = true)
    protected String requestVersion;

    @XmlElement(required = true)
    protected String merchantId;

    @XmlElement
    protected String merchantSessionId;

    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date merchantTransactionDateTime;

    @XmlElement
    protected String merchantWalletId;

    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String normalReturnUrl;

    @XmlElement
    protected Long orderAmount;

    @XmlElement(required = true)
    protected String orderChannel;

    @XmlElement
    protected String orderId;

    @XmlElement
    protected String paymentMeans;

    @XmlElement
    protected String returnContext;

    @XmlElement
    protected String templateFile;

    @XmlElement(required = true)
    protected String transactionReference;

    @XmlElement
    protected String userId;

    public Request2() {
    }

    public Request2(String automaticResponseUrl, Short captureDay, String captureMode, String currencyCode, String customerEmail, String customerId, String customerLanguage, String requestVersion, String merchantId, String merchantSessionId, Date merchantTransactionDateTime, String merchantWalletId, String normalReturnUrl, long orderAmount, String orderChannel, String orderId, String paymentMeans, String returnContext, String templateFile, String transactionReference, String userId) {
        this.automaticResponseUrl = automaticResponseUrl;
        this.captureDay = captureDay;
        this.captureMode = captureMode;
        this.currencyCode = currencyCode;
        this.customerEmail = customerEmail;
        this.customerId = customerId;
        this.customerLanguage = customerLanguage;
        this.requestVersion = requestVersion;
        this.merchantId = merchantId;
        this.merchantSessionId = merchantSessionId;
        this.merchantTransactionDateTime = merchantTransactionDateTime;
        this.merchantWalletId = merchantWalletId;
        this.normalReturnUrl = normalReturnUrl;
        this.orderAmount = orderAmount;
        this.orderChannel = orderChannel;
        this.orderId = orderId;
        this.paymentMeans = paymentMeans;
        this.returnContext = returnContext;
        this.templateFile = templateFile;
        this.transactionReference = transactionReference;
        this.userId = userId;
    }

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
     * Gets the value of the captureDay property.
     *
     * @return
     *     possible object is
     *     {@link Short }
     *
     */
    public Short getCaptureDay() {
        return captureDay;
    }

    /**
     * Sets the value of the captureDay property.
     *
     * @param value
     *     allowed object is
     *     {@link Short }
     *
     */
    public void setCaptureDay(Short value) {
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
     * Gets the value of the paymentMeans property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPaymentMeans() {
        return paymentMeans;
    }

    /**
     * Sets the value of the paymentMeans property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPaymentMeans(String value) {
        this.paymentMeans = value;
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

    @Override
    public String toString() {
        return "Request2{" +
                "automaticResponseUrl='" + automaticResponseUrl + '\'' +
                ", captureDay=" + captureDay +
                ", captureMode='" + captureMode + '\'' +
                ", currencyCode='" + currencyCode + '\'' +
                ", customerEmail='" + customerEmail + '\'' +
                ", customerId='" + customerId + '\'' +
                ", customerLanguage='" + customerLanguage + '\'' +
                ", requestVersion='" + requestVersion + '\'' +
                ", merchantId='" + merchantId + '\'' +
                ", merchantSessionId='" + merchantSessionId + '\'' +
                ", merchantTransactionDateTime=" + merchantTransactionDateTime +
                ", merchantWalletId='" + merchantWalletId + '\'' +
                ", normalReturnUrl='" + normalReturnUrl + '\'' +
                ", orderAmount=" + orderAmount +
                ", orderChannel='" + orderChannel + '\'' +
                ", orderId='" + orderId + '\'' +
                ", paymentMeans='" + paymentMeans + '\'' +
                ", returnContext='" + returnContext + '\'' +
                ", templateFile='" + templateFile + '\'' +
                ", transactionReference='" + transactionReference + '\'' +
                ", userId='" + userId + '\'' +
                '}';
    }
}

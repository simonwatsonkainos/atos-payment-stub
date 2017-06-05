
package sips.cn.contract;

import uk.gov.hmpo.models.builders.Response2Builder;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the sips.cn.contract package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ProcessWalletManagementInitResponse_QNAME = new QName("urn:sips:cn:contract", "processWalletManagementInitResponse");
    private final static QName _Request_QNAME = new QName("urn:sips:cn:contract", "Request");
    private final static QName _ProcessWalletManagementInit_QNAME = new QName("urn:sips:cn:contract", "processWalletManagementInit");
    private final static QName _Response_QNAME = new QName("urn:sips:cn:contract", "Response");
    private final static QName _ProcessPaymentWebInit_QNAME = new QName("urn:sips:cn:contract", "processPaymentWebInit");
    private final static QName _ProcessPaymentWebInitResponse_QNAME = new QName("urn:sips:cn:contract", "processPaymentWebInitResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: sips.cn.contract
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProcessPaymentWebInit }
     * 
     */
    public ProcessPaymentWebInit createProcessPaymentWebInit() {
        return new ProcessPaymentWebInit();
    }

    /**
     * Create an instance of {@link ProcessPaymentWebInitResponse }
     * 
     */
    public ProcessPaymentWebInitResponse createProcessPaymentWebInitResponse() {
        return new ProcessPaymentWebInitResponse();
    }

    /**
     * Create an instance of {@link ProcessWalletManagementInitResponse }
     * 
     */
    public ProcessWalletManagementInitResponse createProcessWalletManagementInitResponse() {
        return new ProcessWalletManagementInitResponse();
    }

    /**
     * Create an instance of {@link ProcessWalletManagementInit }
     * 
     */
    public ProcessWalletManagementInit createProcessWalletManagementInit() {
        return new ProcessWalletManagementInit();
    }

    /**
     * Create an instance of {@link PaymentWebInitOutput }
     * 
     */
    public PaymentWebInitOutput createPaymentWebInitOutput() {
        return new PaymentWebInitOutput(createResponse2());
    }

    /**
     * Create an instance of {@link PaymentWebInitInput }
     * 
     */
    public PaymentWebInitInput createPaymentWebInitInput() {
        return new PaymentWebInitInput();
    }

    /**
     * Create an instance of {@link WalletManagementInitInput }
     * 
     */
    public WalletManagementInitInput createWalletManagementInitInput() {
        return new WalletManagementInitInput();
    }

    /**
     * Create an instance of {@link WalletManagementInitOutput }
     * 
     */
    public WalletManagementInitOutput createWalletManagementInitOutput() {
        return new WalletManagementInitOutput();
    }

    /**
     * Create an instance of {@link sips.cn.contract.Response }
     * 
     */
    public Response createResponse() {
        return new Response();
    }

    /**
     * Create an instance of {@link sips.cn.contract.Request }
     * 
     */
    public Request createRequest() {
        return new Request();
    }

    /**
     * Create an instance of {@link sips.cn.contract.Request2 }
     * 
     */
    public Request2 createRequest2() {
        return new Request2();
    }

    /**
     * Create an instance of {@link sips.cn.contract.Response2 }
     * 
     */
    public Response2 createResponse2() {
        return new Response2Builder().create();
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link ProcessWalletManagementInitResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sips:cn:contract", name = "processWalletManagementInitResponse")
    public JAXBElement<ProcessWalletManagementInitResponse> createProcessWalletManagementInitResponse(ProcessWalletManagementInitResponse value) {
        return new JAXBElement<ProcessWalletManagementInitResponse>(_ProcessWalletManagementInitResponse_QNAME, ProcessWalletManagementInitResponse.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sips:cn:contract", name = "Request")
    public JAXBElement<Object> createRequest(Object value) {
        return new JAXBElement<Object>(_Request_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link ProcessWalletManagementInit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sips:cn:contract", name = "processWalletManagementInit")
    public JAXBElement<ProcessWalletManagementInit> createProcessWalletManagementInit(ProcessWalletManagementInit value) {
        return new JAXBElement<ProcessWalletManagementInit>(_ProcessWalletManagementInit_QNAME, ProcessWalletManagementInit.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sips:cn:contract", name = "Response")
    public JAXBElement<Object> createResponse(Object value) {
        return new JAXBElement<Object>(_Response_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link ProcessPaymentWebInit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sips:cn:contract", name = "processPaymentWebInit")
    public JAXBElement<ProcessPaymentWebInit> createProcessPaymentWebInit(ProcessPaymentWebInit value) {
        return new JAXBElement<ProcessPaymentWebInit>(_ProcessPaymentWebInit_QNAME, ProcessPaymentWebInit.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link ProcessPaymentWebInitResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sips:cn:contract", name = "processPaymentWebInitResponse")
    public JAXBElement<ProcessPaymentWebInitResponse> createProcessPaymentWebInitResponse(ProcessPaymentWebInitResponse value) {
        return new JAXBElement<ProcessPaymentWebInitResponse>(_ProcessPaymentWebInitResponse_QNAME, ProcessPaymentWebInitResponse.class, null, value);
    }

}

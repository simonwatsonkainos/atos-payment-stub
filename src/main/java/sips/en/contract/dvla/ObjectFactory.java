
package sips.en.contract.dvla;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the sips.en.contract.dvla package. 
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

    private final static QName _NotificationTransactionRequest_QNAME = new QName("urn:sips:en:contract:dvla", "NotificationTransactionRequest");
    private final static QName _NotificationWalletRequest_QNAME = new QName("urn:sips:en:contract:dvla", "NotificationWalletRequest");
    private final static QName _NotificationTransactionResponse_QNAME = new QName("urn:sips:en:contract:dvla", "NotificationTransactionResponse");
    private final static QName _NotificationWalletResponse_QNAME = new QName("urn:sips:en:contract:dvla", "NotificationWalletResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: sips.en.contract.dvla
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NotificationTransactionRequest }
     * 
     */
    public NotificationTransactionRequest createNotificationTransactionRequest() {
        return new NotificationTransactionRequest();
    }

    /**
     * Create an instance of {@link NotificationWalletRequest }
     * 
     */
    public NotificationWalletRequest createNotificationWalletRequest() {
        return new NotificationWalletRequest();
    }

    /**
     * Create an instance of {@link NotificationWalletResponse }
     * 
     */
    public NotificationWalletResponse createNotificationWalletResponse() {
        return new NotificationWalletResponse();
    }

    /**
     * Create an instance of {@link NotificationTransactionResponse }
     * 
     */
    public NotificationTransactionResponse createNotificationTransactionResponse() {
        return new NotificationTransactionResponse();
    }

    /**
     * Create an instance of {@link NotificationDTO }
     * 
     */
    public NotificationDTO createNotificationDTO() {
        return new NotificationDTO();
    }

    /**
     * Create an instance of {@link NotificationStatus }
     * 
     */
    public NotificationStatus createNotificationStatus() {
        return new NotificationStatus();
    }

    /**
     * Create an instance of {@link NotificationWalletDTO }
     * 
     */
    public NotificationWalletDTO createNotificationWalletDTO() {
        return new NotificationWalletDTO();
    }

    /**
     * Create an instance of {@link NotificationTransactionDTO }
     * 
     */
    public NotificationTransactionDTO createNotificationTransactionDTO() {
        return new NotificationTransactionDTO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotificationTransactionRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sips:en:contract:dvla", name = "NotificationTransactionRequest")
    public JAXBElement<NotificationTransactionRequest> createNotificationTransactionRequest(NotificationTransactionRequest value) {
        return new JAXBElement<NotificationTransactionRequest>(_NotificationTransactionRequest_QNAME, NotificationTransactionRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotificationWalletRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sips:en:contract:dvla", name = "NotificationWalletRequest")
    public JAXBElement<NotificationWalletRequest> createNotificationWalletRequest(NotificationWalletRequest value) {
        return new JAXBElement<NotificationWalletRequest>(_NotificationWalletRequest_QNAME, NotificationWalletRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotificationTransactionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sips:en:contract:dvla", name = "NotificationTransactionResponse")
    public JAXBElement<NotificationTransactionResponse> createNotificationTransactionResponse(NotificationTransactionResponse value) {
        return new JAXBElement<NotificationTransactionResponse>(_NotificationTransactionResponse_QNAME, NotificationTransactionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotificationWalletResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sips:en:contract:dvla", name = "NotificationWalletResponse")
    public JAXBElement<NotificationWalletResponse> createNotificationWalletResponse(NotificationWalletResponse value) {
        return new JAXBElement<NotificationWalletResponse>(_NotificationWalletResponse_QNAME, NotificationWalletResponse.class, null, value);
    }

}

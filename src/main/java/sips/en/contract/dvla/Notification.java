package sips.en.contract.dvla;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.0.1
 * 2014-09-24T10:47:25.489+01:00
 * Generated source version: 3.0.1
 * 
 */
@WebService(targetNamespace = "urn:sips:en:contract:dvla", name = "Notification")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface Notification {

    @WebMethod
    @WebResult(name = "NotificationTransactionResponse", targetNamespace = "urn:sips:en:contract:dvla", partName = "parameters")
    public NotificationTransactionResponse notifyTransaction(
        @WebParam(partName = "parameters", name = "NotificationTransactionRequest", targetNamespace = "urn:sips:en:contract:dvla")
        NotificationTransactionRequest parameters
    );

    @WebMethod
    @WebResult(name = "NotificationWalletResponse", targetNamespace = "urn:sips:en:contract:dvla", partName = "parameters")
    public NotificationWalletResponse notifyWallet(
        @WebParam(partName = "parameters", name = "NotificationWalletRequest", targetNamespace = "urn:sips:en:contract:dvla")
        NotificationWalletRequest parameters
    );
}

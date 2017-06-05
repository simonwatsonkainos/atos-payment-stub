package sips.cn.contract;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
public class Input2 {

    @XmlElement(namespace = "urn:sips:cn:contract")
    protected Request2 request;

    public Request2 getRequest() {
        return request;
    }

    public void setRequest(Request2 request) {
        this.request = request;
    }
}

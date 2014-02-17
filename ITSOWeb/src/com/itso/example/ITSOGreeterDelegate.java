package com.itso.example;

import javax.jws.WebService;


@WebService ( serviceName="ITSOGreeterService", portName="ITSOGreeterPort", wsdlLocation="WEB-INF/wsdl/ITSOGreeterService.wsdl")
public class ITSOGreeterDelegate{

    com.itso.example.ITSOGreeter _iTSOGreeter = null;

    public String getValue (String name) {
        return _iTSOGreeter.getValue(name);
    }

    public ITSOGreeterDelegate() {
        _iTSOGreeter = new com.itso.example.ITSOGreeter(); }

}
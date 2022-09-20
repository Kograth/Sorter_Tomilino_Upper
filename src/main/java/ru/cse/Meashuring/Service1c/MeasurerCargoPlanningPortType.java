package ru.cse.Meashuring.Service1c;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.7
 * 2022-09-20T10:03:05.200+03:00
 * Generated source version: 3.1.7
 * 
 */
@WebService(targetNamespace = "http://www.cse-cargo.ru/MeasurerCargo", name = "MeasurerCargoPlanningPortType")
@XmlSeeAlso({ObjectFactory.class})
public interface MeasurerCargoPlanningPortType {

    @WebMethod(operationName = "Ping", action = "http://www.cse-cargo.ru/MeasurerCargo#MeasurerCargoPlanning:Ping")
    @RequestWrapper(localName = "Ping", targetNamespace = "http://www.cse-cargo.ru/MeasurerCargo", className = "ru.cse.Meashuring.Service1c.Ping")
    @ResponseWrapper(localName = "PingResponse", targetNamespace = "http://www.cse-cargo.ru/MeasurerCargo", className = "ru.cse.Meashuring.Service1c.PingResponse")
    @WebResult(name = "return", targetNamespace = "http://www.cse-cargo.ru/MeasurerCargo")
    public boolean ping();

    @WebMethod(operationName = "Measurement", action = "http://www.cse-cargo.ru/MeasurerCargo#MeasurerCargoPlanning:Measurement")
    @RequestWrapper(localName = "Measurement", targetNamespace = "http://www.cse-cargo.ru/MeasurerCargo", className = "ru.cse.Meashuring.Service1c.Measurement")
    @ResponseWrapper(localName = "MeasurementResponse", targetNamespace = "http://www.cse-cargo.ru/MeasurerCargo", className = "ru.cse.Meashuring.Service1c.MeasurementResponse")
    @WebResult(name = "return", targetNamespace = "http://www.cse-cargo.ru/MeasurerCargo")
    public ru.cse.Meashuring.Service1c.ResultString measurement(
        @WebParam(name = "Number", targetNamespace = "http://www.cse-cargo.ru/MeasurerCargo")
        java.lang.String number,
        @WebParam(name = "Length", targetNamespace = "http://www.cse-cargo.ru/MeasurerCargo")
        java.lang.Float length,
        @WebParam(name = "Height", targetNamespace = "http://www.cse-cargo.ru/MeasurerCargo")
        java.lang.Float height,
        @WebParam(name = "Width", targetNamespace = "http://www.cse-cargo.ru/MeasurerCargo")
        java.lang.Float width,
        @WebParam(name = "Weight", targetNamespace = "http://www.cse-cargo.ru/MeasurerCargo")
        java.lang.Float weight,
        @WebParam(name = "inLogin", targetNamespace = "http://www.cse-cargo.ru/MeasurerCargo")
        java.lang.String inLogin
    );

    @WebMethod(operationName = "FotoCargo", action = "http://www.cse-cargo.ru/MeasurerCargo#MeasurerCargoPlanning:FotoCargo")
    @RequestWrapper(localName = "FotoCargo", targetNamespace = "http://www.cse-cargo.ru/MeasurerCargo", className = "ru.cse.Meashuring.Service1c.FotoCargo")
    @ResponseWrapper(localName = "FotoCargoResponse", targetNamespace = "http://www.cse-cargo.ru/MeasurerCargo", className = "ru.cse.Meashuring.Service1c.FotoCargoResponse")
    @WebResult(name = "return", targetNamespace = "http://www.cse-cargo.ru/MeasurerCargo")
    public ru.cse.Meashuring.Service1c.ResultString fotoCargo(
        @WebParam(name = "Number", targetNamespace = "http://www.cse-cargo.ru/MeasurerCargo")
        java.lang.String number,
        @WebParam(name = "Foto", targetNamespace = "http://www.cse-cargo.ru/MeasurerCargo")
        java.lang.String foto
    );
}

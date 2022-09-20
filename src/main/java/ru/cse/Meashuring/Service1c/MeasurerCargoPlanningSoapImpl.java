
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package ru.cse.Meashuring.Service1c;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.7
 * 2022-09-20T10:03:05.195+03:00
 * Generated source version: 3.1.7
 * 
 */

@javax.jws.WebService(
                      serviceName = "MeasurerCargoPlanning",
                      portName = "MeasurerCargoPlanningSoap",
                      targetNamespace = "http://www.cse-cargo.ru/MeasurerCargo",
                      wsdlLocation = "http://lk-test.cse.ru/cargo3_test_it/ws/MeasurerCargoPlanning?wsdl",
                      endpointInterface = "ru.cse.Meashuring.Service1c.MeasurerCargoPlanningPortType")
                      
public class MeasurerCargoPlanningSoapImpl implements MeasurerCargoPlanningPortType {

    private static final Logger LOG = Logger.getLogger(MeasurerCargoPlanningSoapImpl.class.getName());

    /* (non-Javadoc)
     * @see ru.cse.Meashuring.Service1c.MeasurerCargoPlanningPortType#ping()*
     */
    public boolean ping() { 
        LOG.info("Executing operation ping");
        try {
            boolean _return = false;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see ru.cse.Meashuring.Service1c.MeasurerCargoPlanningPortType#measurement(java.lang.String number, java.lang.Float length, java.lang.Float height, java.lang.Float width, java.lang.Float weight, java.lang.String inLogin)*
     */
    public ru.cse.Meashuring.Service1c.ResultString measurement(java.lang.String number, java.lang.Float length, java.lang.Float height, java.lang.Float width, java.lang.Float weight, java.lang.String inLogin) { 
        LOG.info("Executing operation measurement");
        System.out.println(number);
        System.out.println(length);
        System.out.println(height);
        System.out.println(width);
        System.out.println(weight);
        System.out.println(inLogin);
        try {
            ru.cse.Meashuring.Service1c.ResultString _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see ru.cse.Meashuring.Service1c.MeasurerCargoPlanningPortType#fotoCargo(java.lang.String number, java.lang.String foto)*
     */
    public ru.cse.Meashuring.Service1c.ResultString fotoCargo(java.lang.String number, java.lang.String foto) { 
        LOG.info("Executing operation fotoCargo");
        System.out.println(number);
        System.out.println(foto);
        try {
            ru.cse.Meashuring.Service1c.ResultString _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}

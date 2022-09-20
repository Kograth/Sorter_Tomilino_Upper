package ru.cse.proxysorter.Processors;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.apache.camel.component.cxf.common.message.CxfConstants;
import org.apache.camel.component.ehcache.EhcacheConstants;
import ru.cse.APILk.Service1c.GetDataPushExit;
import ru.cse.APILk.Service1c.GetDataPushExitResponse;
import ru.cse.APILk.Service1c.SaveErrors;
import ru.cse.Meashuring.Service1c.Measurement;
import ru.cse.proxysorter.ConstantsSorter;
import ru.cse.proxysorter.Message.Request11;
import ru.cse.proxysorter.Message.Request13;

import java.lang.reflect.Type;

public class ProcessorTreatmentErrors  implements Processor {
    @Override
    public void process(Exchange exchange) throws Exception {

        Message In = exchange.getIn();
        String TypeError = (String) In.getHeader(ConstantsSorter.SOURCE_SORTER);
        SaveErrors Reqto1C = new SaveErrors();
        String barCode1c = "";
        int errorCode = 0;

        if (TypeError == "4") {

            Request13 Req13 = In.getBody(Request13.class);
            barCode1c = String.valueOf(Req13.getCodeProduct());
            errorCode = 9;

            Reqto1C.setBarcode(barCode1c);
            Reqto1C.setErrorCode(errorCode);
        }
        else {
            barCode1c = (String) exchange.getMessage().getHeader("ErrorBarcode");
            errorCode = (int) exchange.getMessage().getHeader("ErrorCode");
            Reqto1C.setBarcode(barCode1c);
            Reqto1C.setErrorCode(errorCode);
        }


        Reqto1C.setInLogin(String.valueOf(3));

        Message Out = exchange.getMessage();
        Out.setBody(Reqto1C);
        Out.setHeader(CxfConstants.OPERATION_NAME, "SaveErrors");
        Out.setHeader(CxfConstants.OPERATION_NAMESPACE, "http://www.cse-cargo.ru/client");
    }

}

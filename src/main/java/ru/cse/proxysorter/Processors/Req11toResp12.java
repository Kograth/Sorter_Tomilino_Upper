/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.cse.proxysorter.Processors;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import ru.cse.proxysorter.ConstantsSorter;
import ru.cse.proxysorter.Message.Request11;
import ru.cse.proxysorter.Message.Response12;
import ru.cse.APILk.Service1c.SaveErrorsResponse;

import javax.print.DocFlavor;

import static ru.cse.proxysorter.ConstantsSorter.*;

/**
 *
 * @author Oleynik
 */
public class Req11toResp12 implements Processor {

    @Override
    public void process(Exchange exchng) throws Exception {
        Message In = exchng.getIn();

        Response12 returnAnswer = new Response12();
        Request11 Req11 = In.getBody(Request11.class);

        String barCode1c = Req11.getBarcode1С();
        byte Wellsping   = Req11.getWellspring();
        byte WellsprigA  = 113;
        byte WellsprigB  = 114;

        //SaveErrorsResponse SaveErrorD = In.getBody(SaveErrorsResponse.class);
        short ExitNumber = 202;
        if (Wellsping == WellsprigA|Wellsping ==WellsprigB) {
            //Для ручной выкладки параметры веса не важны
            ExitNumber = Req11.getExitNumber();
        }
        else {
            if (Req11.getWeight() > 0 | Req11.getStateWeight() != 0) {

                ExitNumber = Req11.getExitNumber();
            }
        }
        returnAnswer.setCodeProduct(Req11.getCodePLK());
        returnAnswer.setExitNumber(ExitNumber);

        In.setHeader(ERROR_BARCODE,barCode1c);
        In.setHeader(ERROR_CODE,Req11.getErrorCode());

        In.setBody(returnAnswer);


    }
    
}

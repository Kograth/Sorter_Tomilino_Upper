package ru.cse.proxysorter.Processors;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import ru.cse.proxysorter.ConstantsSorter;
import ru.cse.proxysorter.Message.Request11;
import ru.cse.proxysorter.Message.Request13;
import ru.cse.proxysorter.Message.Request21;

public class ProcessorUpdateHeader implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {


        Request11 Req11 = exchange.getIn().getBody(Request11.class);
        Request13 Req13 = exchange.getIn().getBody(Request13.class);
        Request21 Req21 = exchange.getIn().getBody(Request21.class);

        if (!(Req21 == null)) {

            Message in = exchange.getIn();
            in.setHeader(ConstantsSorter.SOURCE_SORTER,"1");

        }

        if (!(Req11 == null)) {


            Message in = exchange.getIn();
            in.setHeader(ConstantsSorter.SOURCE_SORTER,"0");
        }

        if (!(Req13 == null)) {

            Short Reset = Req13.getSource();

            Message in = exchange.getIn();
            //Если это правильная телеграмма то здесь будет источник. если это ошибочная телеграмма то будет код ошибки
            //кода ошибки всего два 0хF0 успешный сброс и 0xF1 ошибка сброса

            if (Reset == 0xF1) {
                in.setHeader(ConstantsSorter.SOURCE_SORTER,"4");
            }
            else in.setHeader(ConstantsSorter.SOURCE_SORTER,"2");
        }


    }
}

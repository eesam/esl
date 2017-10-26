package com.huasky;


import org.freeswitch.esl.client.IEslEventListener;
import org.freeswitch.esl.client.transport.event.EslEvent;

public class EslEventHandle implements IEslEventListener {

    @Override
    public void eventReceived(EslEvent event) {
        System.out.println("eventReceived:" + event.toString());
    }

    @Override
    public void backgroundJobResultReceived(EslEvent event) {
        System.out.println("backgroundJobResultReceived:" + event.toString());
    }
}

package com.huasky;

import org.freeswitch.esl.client.inbound.Client;
import org.freeswitch.esl.client.inbound.InboundConnectionFailure;

public class esl {
    public static void main(String[] args) {
        EslEventHandle eslEventHandle = new EslEventHandle();
        Client client = new Client();
        try {
            client.connect( "127.0.0.1", 8021, "ClueCon", 30 );
        } catch (InboundConnectionFailure inboundConnectionFailure) {
            inboundConnectionFailure.printStackTrace();
        }

        client.sendAsyncApiCommand("plain","all");
        client.addEventListener(eslEventHandle);

        while (true) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

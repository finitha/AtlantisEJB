/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.atlantis.datamgmt.queue;

import java.io.IOException;
import java.io.Serializable;
import java.util.concurrent.TimeoutException;
import org.apache.commons.lang.SerializationUtils;

/**
 *
 * @author gmartin
 */
public class Producer extends EndPoint {
    
    public Producer(String endpointName) throws IOException, TimeoutException {
        super(endpointName);
    }
    
    public void sendMessage(Serializable object) throws IOException{
        channel.basicPublish("", endPointName, null, SerializationUtils.serialize(object));
    }
    
}

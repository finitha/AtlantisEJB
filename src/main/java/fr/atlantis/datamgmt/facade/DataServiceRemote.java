/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.atlantis.datamgmt.facade;

import fr.atlantis.datamgmt.domain.Calculated;
import fr.atlantis.datamgmt.domain.Device;
import fr.atlantis.datamgmt.domain.Measure;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author gmartin
 */
@Remote
public interface DataServiceRemote extends DataServiceEndpointInterface{
    List<Device> lookUpAllUserDevices(String userId);
    List<Measure> lookUpAllDeviceMeasures(String deviceId);
    List<Calculated> lookUpAllDeviceCalculated(String deviceId);
}

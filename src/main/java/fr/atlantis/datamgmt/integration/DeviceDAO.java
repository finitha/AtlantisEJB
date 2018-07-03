package fr.atlantis.datamgmt.integration;

import fr.atlantis.datamgmt.domain.Calculated;
import fr.atlantis.datamgmt.domain.Device;
import fr.atlantis.datamgmt.domain.Measure;
import java.util.List;

/**
 *
 * @author gmartin
 */
public interface DeviceDAO {
    List<Device> lookUpAllUserDevices(String id);
    List<Measure> lookUpAllDeviceMeasures(String id);
    List<Calculated> lookUpAllDeviceCalculated(String id);
}

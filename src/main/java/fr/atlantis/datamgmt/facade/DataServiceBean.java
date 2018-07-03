package fr.atlantis.datamgmt.facade;

import com.rabbitmq.client.AMQP.BasicProperties;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.ConnectionFactory;
import fr.atlantis.datamgmt.domain.Calculated;
import fr.atlantis.datamgmt.domain.Device;
import fr.atlantis.datamgmt.domain.Measure;
import fr.atlantis.datamgmt.domain.User;
import fr.atlantis.datamgmt.integration.DeviceDAO;
import fr.atlantis.datamgmt.integration.UserDAO;
import java.io.IOException;
import java.net.URISyntaxException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebService;

/**
 *
 * @author gmartin
 */
@Stateless
@WebService(
endpointInterface="fr.atlantis.datamgmt.facade.DataServiceEndpointInterface",
portName="DataPort",
serviceName="DataService")
public class DataServiceBean implements DataServiceEndpointInterface, DataServiceRemote {

    @Inject
    private UserDAO userDAO;
    
    @Inject
    private DeviceDAO deviceDAO;
    
    @Override
    public Boolean login(String username, String password) {
        if(username != null && password != null){
            System.out.println("Username = "+username);
            User u = new User();
            u.setUsername(username);
            u.setPassword(password);
            u = userDAO.add(u);
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public List<Device> lookUpAllUserDevices(String userId) {
        List<Device> devices = deviceDAO.lookUpAllUserDevices(userId);
        return devices;
    }

    @Override
    public List<Measure> lookUpAllDeviceMeasures(String deviceId) {
        List<Measure> measures = deviceDAO.lookUpAllDeviceMeasures(deviceId);
        return measures;
    }

    @Override
    public List<Calculated> lookUpAllDeviceCalculated(String deviceId) {
        List<Calculated> calculated = deviceDAO.lookUpAllDeviceCalculated(deviceId);
        return calculated;
    }
    
    
    
    


}

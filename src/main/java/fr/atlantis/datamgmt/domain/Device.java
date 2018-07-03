package fr.atlantis.datamgmt.domain;

import java.io.Serializable;
/**
 *
 * @author gmartin
 */
public class Device implements Serializable{
    private String id;
    private String name;
    private String deviceType;
    private String[] usersId;

    public String[] getUsersId() {
        return usersId;
    }

    public void setUsersId(String[] usersId) {
        this.usersId = usersId;
    }


    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    @Override
    public String toString() {
        return "Device{" + "id=" + id + ", name=" + name + ", deviceType=" + deviceType + '}';
    }
    
    
}

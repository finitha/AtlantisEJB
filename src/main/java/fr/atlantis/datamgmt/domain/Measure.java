package fr.atlantis.datamgmt.domain;

import java.io.Serializable;
/**
 *
 * @author gmartin
 */
public class Measure implements Serializable{
    private String deviceId;
    private String metricDate;
    private String deviceType;
    private String metricValue;

    public String getDeviceId() {
        return deviceId;
    }

    public String getMetricDate() {
        return metricDate;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public String getMetricValue() {
        return metricValue;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public void setMetricDate(String metricDate) {
        this.metricDate = metricDate;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public void setMetricValue(String metricValue) {
        this.metricValue = metricValue;
    }

    @Override
    public String toString() {
        return "Measure{" + "deviceId=" + deviceId + ", metricDate=" + metricDate + ", deviceType=" + deviceType + ", metricValue=" + metricValue + '}';
    }    
}

package fr.atlantis.datamgmt.domain;

import java.io.Serializable;
/**
 *
 * @author gmartin
 */
public class Calculated implements Serializable{
    private String deviceId;
    private String calculatedType;
    private String dayNumber;
    private String minValue;
    private String maxValue;
    private String averageValue;

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getCalculatedType() {
        return calculatedType;
    }

    public void setCalculatedType(String calculatedType) {
        this.calculatedType = calculatedType;
    }

    public String getDayNumber() {
        return dayNumber;
    }

    public void setDayNumber(String dayNumber) {
        this.dayNumber = dayNumber;
    }

    public String getMinValue() {
        return minValue;
    }

    public void setMinValue(String minValue) {
        this.minValue = minValue;
    }

    public String getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(String maxValue) {
        this.maxValue = maxValue;
    }

    public String getAverageValue() {
        return averageValue;
    }

    public void setAverageValue(String averageValue) {
        this.averageValue = averageValue;
    }

    @Override
    public String toString() {
        return "Caclulated{" + "deviceId=" + deviceId + ", calculatedType=" + calculatedType + ", dayNumber=" + dayNumber + ", minValue=" + minValue + ", maxValue=" + maxValue + ", averageValue=" + averageValue + '}';
    }
}

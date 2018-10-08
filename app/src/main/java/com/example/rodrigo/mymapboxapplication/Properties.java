
package com.example.rodrigo.mymapboxapplication;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Properties {

    @SerializedName("ID")
    @Expose
    private Long iD;
    @SerializedName("Time")
    @Expose
    private String time;
    @SerializedName("GPSTime")
    @Expose
    private String gPSTime;
    @SerializedName("Latitude")
    @Expose
    private Double latitude;
    @SerializedName("Longitude")
    @Expose
    private Double longitude;
    @SerializedName("SinalGSM")
    @Expose
    private Integer sinalGSM;
    @SerializedName("Temperatura")
    @Expose
    private Integer temperatura;

    public Long getID() {
        return iD;
    }

    public void setID(Long iD) {
        this.iD = iD;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getGPSTime() {
        return gPSTime;
    }

    public void setGPSTime(String gPSTime) {
        this.gPSTime = gPSTime;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Integer getSinalGSM() {
        return sinalGSM;
    }

    public void setSinalGSM(Integer sinalGSM) {
        this.sinalGSM = sinalGSM;
    }

    public Integer getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Integer temperatura) {
        this.temperatura = temperatura;
    }

}

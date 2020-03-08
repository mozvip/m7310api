package com.github.mozvip.m7310.responses;

public class StatusDeviceInfo {

    String productID;
    String productRegion;
    String model;
    String hardwareVer;
    String firmwareVer;
    String mac;
    String imei;
    String simNumber;
    String imsi;

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getProductRegion() {
        return productRegion;
    }

    public void setProductRegion(String productRegion) {
        this.productRegion = productRegion;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getHardwareVer() {
        return hardwareVer;
    }

    public void setHardwareVer(String hardwareVer) {
        this.hardwareVer = hardwareVer;
    }

    public String getFirmwareVer() {
        return firmwareVer;
    }

    public void setFirmwareVer(String firmwareVer) {
        this.firmwareVer = firmwareVer;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getSimNumber() {
        return simNumber;
    }

    public void setSimNumber(String simNumber) {
        this.simNumber = simNumber;
    }

    public String getImsi() {
        return imsi;
    }

    public void setImsi(String imsi) {
        this.imsi = imsi;
    }

    @Override
    public String toString() {
        return "StatusDeviceInfo{" +
                "productID='" + productID + '\'' +
                ", productRegion='" + productRegion + '\'' +
                ", model='" + model + '\'' +
                ", hardwareVer='" + hardwareVer + '\'' +
                ", firmwareVer='" + firmwareVer + '\'' +
                ", mac='" + mac + '\'' +
                ", imei='" + imei + '\'' +
                ", simNumber='" + simNumber + '\'' +
                ", imsi='" + imsi + '\'' +
                '}';
    }
}

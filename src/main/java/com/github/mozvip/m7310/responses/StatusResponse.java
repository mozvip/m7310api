package com.github.mozvip.m7310.responses;

/*
{
	"battery":	{
		"connected":	true,
		"charging":	true,
		"voltage":	100
	},
	"wlan":	{
		"enable":	1,
		"channel":	0,
		"ssid":	"GuiguiNet",
		"region":	"DE",
		"mode":	1,
		"bandType":	0,
		"wispConnectStatus":	false,
		"connectedSSID":	"GuiguiNet",
		"connectedSecurity":	0,
		"connectedSignal":	4
	},
	"connectedDevices":	{
		"number":	0
	},
	"sdcard":	{
		"status":	0,
		"mode":	0,
		"volume":	"",
		"used":	"",
		"left":	""
	}
}
 */

public class StatusResponse {
    boolean factoryDefault;
    StatusDeviceInfo deviceInfo;
    StatusWan wan;
    StatusMessage message;
    int result;

    public boolean isFactoryDefault() {
        return factoryDefault;
    }

    public void setFactoryDefault(boolean factoryDefault) {
        this.factoryDefault = factoryDefault;
    }

    public StatusWan getWan() {
        return wan;
    }

    public void setWan(StatusWan wan) {
        this.wan = wan;
    }

    public StatusMessage getMessage() {
        return message;
    }

    public void setMessage(StatusMessage message) {
        this.message = message;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public StatusDeviceInfo getDeviceInfo() {
        return deviceInfo;
    }

    public void setDeviceInfo(StatusDeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
    }

    @Override
    public String toString() {
        return "StatusResponse{" +
                "factoryDefault=" + factoryDefault +
                ", deviceInfo=" + deviceInfo +
                ", wan=" + wan +
                ", message=" + message +
                ", result=" + result +
                '}';
    }
}

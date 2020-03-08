package com.github.mozvip.m7310.responses;

public class StatusWan {

    int connectMode;
    int registerStatus;
    int connectStatus;
    String ipv4;
    String dns1v4;
    String dns2v4;
    String ipv6;
    String dns1v6;
    String dns2v6;
    int networkType;
    int roaming;
    int signalStrength;
    boolean roamingEnabled;
    String totalStatistics;
    String dailyStatistics;
    boolean enablePaymentDay;
    int txSpeed;
    int rxSpeed;
    String totalConnTime;
    int limitType;
    int dataLimit;
    int simStatus;
    int operator;
    String operatorName;

    public int getConnectMode() {
        return connectMode;
    }

    public void setConnectMode(int connectMode) {
        this.connectMode = connectMode;
    }

    public int getRegisterStatus() {
        return registerStatus;
    }

    public void setRegisterStatus(int registerStatus) {
        this.registerStatus = registerStatus;
    }

    public int getConnectStatus() {
        return connectStatus;
    }

    public void setConnectStatus(int connectStatus) {
        this.connectStatus = connectStatus;
    }

    public String getIpv4() {
        return ipv4;
    }

    public void setIpv4(String ipv4) {
        this.ipv4 = ipv4;
    }

    public String getDns1v4() {
        return dns1v4;
    }

    public void setDns1v4(String dns1v4) {
        this.dns1v4 = dns1v4;
    }

    public String getDns2v4() {
        return dns2v4;
    }

    public void setDns2v4(String dns2v4) {
        this.dns2v4 = dns2v4;
    }

    public String getIpv6() {
        return ipv6;
    }

    public void setIpv6(String ipv6) {
        this.ipv6 = ipv6;
    }

    public String getDns1v6() {
        return dns1v6;
    }

    public void setDns1v6(String dns1v6) {
        this.dns1v6 = dns1v6;
    }

    public String getDns2v6() {
        return dns2v6;
    }

    public void setDns2v6(String dns2v6) {
        this.dns2v6 = dns2v6;
    }

    public int getNetworkType() {
        return networkType;
    }

    public void setNetworkType(int networkType) {
        this.networkType = networkType;
    }

    public int getRoaming() {
        return roaming;
    }

    public void setRoaming(int roaming) {
        this.roaming = roaming;
    }

    public int getSignalStrength() {
        return signalStrength;
    }

    public void setSignalStrength(int signalStrength) {
        this.signalStrength = signalStrength;
    }

    public boolean isRoamingEnabled() {
        return roamingEnabled;
    }

    public void setRoamingEnabled(boolean roamingEnabled) {
        this.roamingEnabled = roamingEnabled;
    }

    public String getTotalStatistics() {
        return totalStatistics;
    }

    public void setTotalStatistics(String totalStatistics) {
        this.totalStatistics = totalStatistics;
    }

    public String getDailyStatistics() {
        return dailyStatistics;
    }

    public void setDailyStatistics(String dailyStatistics) {
        this.dailyStatistics = dailyStatistics;
    }

    public boolean isEnablePaymentDay() {
        return enablePaymentDay;
    }

    public void setEnablePaymentDay(boolean enablePaymentDay) {
        this.enablePaymentDay = enablePaymentDay;
    }

    public int getTxSpeed() {
        return txSpeed;
    }

    public void setTxSpeed(int txSpeed) {
        this.txSpeed = txSpeed;
    }

    public int getRxSpeed() {
        return rxSpeed;
    }

    public void setRxSpeed(int rxSpeed) {
        this.rxSpeed = rxSpeed;
    }

    public String getTotalConnTime() {
        return totalConnTime;
    }

    public void setTotalConnTime(String totalConnTime) {
        this.totalConnTime = totalConnTime;
    }

    public int getLimitType() {
        return limitType;
    }

    public void setLimitType(int limitType) {
        this.limitType = limitType;
    }

    public int getDataLimit() {
        return dataLimit;
    }

    public void setDataLimit(int dataLimit) {
        this.dataLimit = dataLimit;
    }

    public int getSimStatus() {
        return simStatus;
    }

    public void setSimStatus(int simStatus) {
        this.simStatus = simStatus;
    }

    public int getOperator() {
        return operator;
    }

    public void setOperator(int operator) {
        this.operator = operator;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    @Override
    public String toString() {
        return "StatusWan{" +
                "connectMode=" + connectMode +
                ", registerStatus=" + registerStatus +
                ", connectStatus=" + connectStatus +
                ", ipv4='" + ipv4 + '\'' +
                ", dns1v4='" + dns1v4 + '\'' +
                ", dns2v4='" + dns2v4 + '\'' +
                ", ipv6='" + ipv6 + '\'' +
                ", dns1v6='" + dns1v6 + '\'' +
                ", dns2v6='" + dns2v6 + '\'' +
                ", networkType=" + networkType +
                ", roaming=" + roaming +
                ", signalStrength=" + signalStrength +
                ", roamingEnabled=" + roamingEnabled +
                ", totalStatistics='" + totalStatistics + '\'' +
                ", dailyStatistics='" + dailyStatistics + '\'' +
                ", enablePaymentDay=" + enablePaymentDay +
                ", txSpeed='" + txSpeed + '\'' +
                ", rxSpeed='" + rxSpeed + '\'' +
                ", totalConnTime='" + totalConnTime + '\'' +
                ", limitType=" + limitType +
                ", dataLimit=" + dataLimit +
                ", simStatus=" + simStatus +
                ", operator=" + operator +
                ", operatorName='" + operatorName + '\'' +
                '}';
    }
}

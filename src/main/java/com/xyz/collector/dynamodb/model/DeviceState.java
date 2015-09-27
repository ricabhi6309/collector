package com.xyz.collector.dynamodb.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

/**
 * Created by abhinavgarg on 22/09/15.
 */
@DynamoDBTable(tableName="DeviceState")
public class DeviceState {

    private String uniqueId;
    private String deviceId;
    private String userId;
    private Boolean switch1;
    private Boolean switch2;
    private Boolean switch3;
    private Boolean switch4;
    private Boolean switch5;
    private Integer dimmer1;
    private Integer dimmer2;
    private Integer dimmer3;



    @DynamoDBHashKey(attributeName="uniqueId")
    public String getuniqueId() { return uniqueId; }
    public void setuniqueId(String id) { this.uniqueId = id; }

    @DynamoDBAttribute(attributeName="deviceId")
    public String getDeviceId() { return deviceId; }
    public void setDeviceId(String deviceId) { this.deviceId = deviceId; }

    @DynamoDBAttribute(attributeName="userId")
    public String getUserId() { return userId; }
    public void setUserId(String userId) { this.userId = userId;}

    @DynamoDBAttribute(attributeName="switch4")
    public Boolean isSwitch4() { return switch4; }
    public void setSwitch4(Boolean switch4) { this.switch4 = switch4;}

    @DynamoDBAttribute(attributeName="switch1")
    public Boolean isSwitch1() { return switch1; }
    public void setSwitch1(Boolean switch1) { this.switch1 = switch1;}

    @DynamoDBAttribute(attributeName="switch2")
    public Boolean isSwitch2() { return switch2; }
    public void setSwitch2(Boolean switch2) { this.switch2 = switch2;}

    @DynamoDBAttribute(attributeName="switch3")
    public Boolean isSwitch3() { return switch3; }
    public void setSwitch3(Boolean switch3) { this.switch3 = switch3;}

    @DynamoDBAttribute(attributeName="switch5")
    public Boolean isSwitch5() { return switch5; }
    public void setSwitch5(Boolean switch5) { this.switch5 = switch5;}

    @DynamoDBAttribute(attributeName="dimmer1")
    public Integer getDimmer1() { return dimmer1; }
    public void setDimmer1(Integer dimmer1) { this.dimmer1 = dimmer1;}

    @DynamoDBAttribute(attributeName="dimmer2")
    public Integer getDimmer2() { return dimmer2; }
    public void setDimmer2(Integer dimmer2) { this.dimmer2 = dimmer2;}

    @DynamoDBAttribute(attributeName="dimmer3")
    public Integer getDimmer3() { return dimmer3; }
    public void setDimmer3(Integer dimmer3) { this.dimmer3 = dimmer3;}


    @Override
    public String toString() {
        return "Device status [Device=" + deviceId + ", user=" + userId
                + ", switch1=" + switch1 + ", switch2=" + switch2 + ", switch3=" + switch3 +
                ", switch4=" + switch4 + ", switch5=" + switch5 + ", dimmer1=" + dimmer1 + ", dimmer2=" + dimmer2  +
                ", dimmer3=" + dimmer3  + "]";
    }

}

package com.xyz.collector.Utils;

import com.xyz.collector.dynamodb.model.DeviceState;
import com.xyz.collector.generated.Properties;
import com.xyz.collector.generated.Status;

/**
 * Created by abhinavgarg on 27/09/15.
 */
public class PropertyStatusMapper {

    public static Status populatePropertyinStatus(String userId, String deviceId,
                                                      String property, String value) {
        Properties properties = new Properties();
        switch (property) {
            case "switch1" :
                properties.withSwitch1(value);
                break;
            case "switch2" :
                properties.withSwitch2(value);
                break;
            case "switch3" :
                properties.withSwitch3(value);
                break;
            case "switch4" :
                properties.withSwitch4(value);
                break;
            case "switch5" :
                properties.withSwitch5(value);
                break;
            case "dimmer1" :
                properties.withDimmer1(Integer.parseInt(value));
                break;
            case "dimmer2" :
                properties.withDimmer2(Integer.parseInt(value));
                break;
            case "dimmer3" :
                properties.withDimmer3(Integer.parseInt(value));
                break;
            default:
                return null;
        }
        Status deviceState = new Status();
        deviceState.withUserId(userId).withDeviceId(deviceId).withProperties(properties);
        return deviceState;
    }
}

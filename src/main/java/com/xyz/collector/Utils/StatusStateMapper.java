package com.xyz.collector.Utils;

import com.xyz.collector.dynamodb.model.DeviceState;
import com.xyz.collector.generated.Status;
import org.apache.commons.lang.StringUtils;

/**
 * Created by abhinavgarg on 27/09/15.
 */
public class StatusStateMapper {
    private StatusStateMapper() {

    }

    public static DeviceState toState(Status status) {
        DeviceState deviceState = null;

        if (status != null) {
            deviceState = new DeviceState();
            deviceState.setuniqueId(status.userId + "-" + status.deviceId);
            deviceState.setUserId(status.userId);
            deviceState.setDeviceId(status.deviceId);
            if (status.properties.switch1 != null) {
                deviceState.setSwitch1(Boolean.valueOf(status.properties.switch1));
            }
            if (status.properties.switch2 != null) {
                deviceState.setSwitch2(Boolean.valueOf(status.properties.switch2));
            }
            if (status.properties.switch3 != null) {
                deviceState.setSwitch3(Boolean.valueOf(status.properties.switch3));
            }
            if (status.properties.switch4 != null) {
                deviceState.setSwitch4(Boolean.valueOf(status.properties.switch4));
            }
            if (status.properties.switch5 != null) {
                deviceState.setSwitch5(Boolean.valueOf(status.properties.switch5));
            }
            if (status.properties.dimmer1 != null) {
                deviceState.setDimmer1(status.properties.dimmer1);
            }
            if (status.properties.dimmer2 != null) {
                deviceState.setDimmer2(status.properties.dimmer3);
            }
            if (status.properties.dimmer3 != null) {
                deviceState.setDimmer3(status.properties.dimmer3);
            }
        }
        return deviceState;
    }

    public static boolean validStatus(Status status) {
        if (status == null
                || StringUtils.isEmpty(status.deviceId)
                || StringUtils.isEmpty(status.userId)) {
            return false;
        }
        return true;
    }
}

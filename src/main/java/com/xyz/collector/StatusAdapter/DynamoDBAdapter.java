package com.xyz.collector.StatusAdapter;

import com.xyz.collector.Utils.StatusStateMapper;
import com.xyz.collector.dynamodb.DynamoFactory;
import com.xyz.collector.dynamodb.IDynamoClient;
import com.xyz.collector.dynamodb.model.DeviceState;
import com.xyz.collector.generated.Status;

/**
 * Created by abhinavgarg on 27/09/15.
 */
public class DynamoDBAdapter implements StatusAdapter {

    private static IDynamoClient dynamoClient = DynamoFactory.getDynamoClient();

    @Override
    public void putStatus(Status status) {
        DeviceState deviceState = StatusStateMapper.toState(status);
        dynamoClient.putStatus(deviceState);
    }

    @Override
    public void updateStatus(Status status) {
        DeviceState deviceState = StatusStateMapper.toState(status);
        dynamoClient.updateStatus(deviceState);
    }

//    public Status getStatus (Status status) {
//
//    }
}

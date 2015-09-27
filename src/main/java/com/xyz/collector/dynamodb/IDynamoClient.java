package com.xyz.collector.dynamodb;

import com.amazonaws.services.dynamodbv2.model.DeleteItemRequest;
import com.amazonaws.services.dynamodbv2.model.GetItemRequest;
import com.amazonaws.services.dynamodbv2.model.PutItemRequest;
import com.amazonaws.services.dynamodbv2.model.UpdateItemRequest;
import com.xyz.collector.dynamodb.model.DeviceState;

/**
 * Created by abhinavgarg on 22/09/15.
 */
public interface IDynamoClient {


    int putStatus(DeviceState deviceState);

    int updateStatus(DeviceState deviceState);

    int deleteStatus(DeleteItemRequest deleteItemRequest);

    DeviceState getStatus(DeviceState deviceState);
}

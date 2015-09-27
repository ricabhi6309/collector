package com.xyz.collector.dynamodb;

import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.model.*;
import com.xyz.collector.dynamodb.model.DeviceState;

/**
 * Created by abhinavgarg on 22/09/15.
 */
public class DynamoClient implements IDynamoClient{

    private static AmazonDynamoDBClient client;
    private static DynamoDBMapper mapper;
    static{
        client = new AmazonDynamoDBClient();
        client.setRegion(Region.getRegion(Regions.US_WEST_2));
        mapper = new DynamoDBMapper(client);
    }

    protected DynamoClient() {}

    @Override
    public int putStatus(DeviceState deviceState) {
        long startTime = System.currentTimeMillis();
        mapper.save(deviceState);
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println("Time for putting " + totalTime);
        return 0;
    }

    @Override
    public int updateStatus(DeviceState deviceState) {
        DeviceState oldState = mapper.load(DeviceState.class, deviceState.getuniqueId());
        if (oldState != null) {
            if (deviceState.getDimmer1()!= null) {
                oldState.setDimmer1(deviceState.getDimmer1());
            }
            if (deviceState.getDimmer2()!= null) {
                oldState.setDimmer2(deviceState.getDimmer2());
            }
            if (deviceState.getDimmer3()!= null) {
                oldState.setDimmer3(deviceState.getDimmer3());
            }
            if (deviceState.isSwitch1() != null) {
                oldState.setSwitch1(deviceState.isSwitch1());
            }
            if (deviceState.isSwitch2()!= null) {
                oldState.setSwitch2(deviceState.isSwitch2());
            }
            if (deviceState.isSwitch3()!= null) {
                oldState.setSwitch3(deviceState.isSwitch3());
            }
            if (deviceState.isSwitch4()!= null) {
                oldState.setSwitch4(deviceState.isSwitch4());
            }
            if (deviceState.isSwitch5()!= null) {
                oldState.setSwitch5(deviceState.isSwitch5());
            }
            mapper.save(oldState);
        } else {
            mapper.save(deviceState);
        }
        return 0;
    }

    @Override
    public int deleteStatus(DeleteItemRequest deleteItemRequest) {
        return 0;
    }

    @Override
    public DeviceState getStatus(DeviceState deviceState) {
        return mapper.load(DeviceState.class, deviceState.getuniqueId());
    }
}

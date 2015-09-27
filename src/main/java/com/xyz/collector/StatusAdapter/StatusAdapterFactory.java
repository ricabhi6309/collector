package com.xyz.collector.StatusAdapter;

/**
 * Created by abhinavgarg on 27/09/15.
 */
public class StatusAdapterFactory {

    private static StatusAdapter statusAdapter = new DynamoDBAdapter();

    public static StatusAdapter getStatusAdapter() {
        return statusAdapter;
    }
}

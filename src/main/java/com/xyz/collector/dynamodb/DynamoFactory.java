package com.xyz.collector.dynamodb;

/**
 * Created by abhinavgarg on 22/09/15.
 */
public class DynamoFactory {


    private static IDynamoClient dynamoClient = new DynamoClient();


    private DynamoFactory() {}

    public static IDynamoClient getDynamoClient() {
        return dynamoClient;
    }
}

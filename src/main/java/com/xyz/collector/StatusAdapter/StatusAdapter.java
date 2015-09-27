package com.xyz.collector.StatusAdapter;

import com.xyz.collector.generated.Status;

/**
 * Created by abhinavgarg on 27/09/15.
 */
public interface StatusAdapter {

    void putStatus(Status status);

    void updateStatus(Status status);
}

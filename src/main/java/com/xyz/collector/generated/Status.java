package com.xyz.collector.generated;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.xyz")
@JsonPropertyOrder({
"userId",
"deviceId",
"properties"
})
public class Status {

@JsonProperty("userId")
public String userId;
@JsonProperty("deviceId")
public String deviceId;
@JsonProperty("properties")
public Properties properties;

public Status withUserId(String userId) {
this.userId = userId;
return this;
}

public Status withDeviceId(String deviceId) {
this.deviceId = deviceId;
return this;
}

public Status withProperties(Properties properties) {
this.properties = properties;
return this;
}

@Override
public String toString() {
return ToStringBuilder.reflectionToString(this);
}

@Override
public int hashCode() {
return new HashCodeBuilder().append(userId).append(deviceId).append(properties).toHashCode();
}

@Override
public boolean equals(Object other) {
if (other == this) {
return true;
}
if ((other instanceof Status) == false) {
return false;
}
Status rhs = ((Status) other);
return new EqualsBuilder().append(userId, rhs.userId).append(deviceId, rhs.deviceId).append(properties, rhs.properties).isEquals();
}

}
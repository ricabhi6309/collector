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
"switch1",
"switch2",
"switch3",
"switch4",
"switch5",
"dimmer1",
"dimmer2",
"dimmer3"
})
public class Properties {

@JsonProperty("switch1")
public String switch1;
@JsonProperty("switch2")
public String switch2;
@JsonProperty("switch3")
public String switch3;
@JsonProperty("switch4")
public String switch4;
@JsonProperty("switch5")
public String switch5;
@JsonProperty("dimmer1")
public int dimmer1;
@JsonProperty("dimmer2")
public int dimmer2;
@JsonProperty("dimmer3")
public int dimmer3;

public Properties withSwitch1(String switch1) {
this.switch1 = switch1;
return this;
}

public Properties withSwitch2(String switch2) {
this.switch2 = switch2;
return this;
}

public Properties withSwitch3(String switch3) {
this.switch3 = switch3;
return this;
}

public Properties withSwitch4(String switch4) {
this.switch4 = switch4;
return this;
}

public Properties withSwitch5(String switch5) {
this.switch5 = switch5;
return this;
}

public Properties withDimmer1(int dimmer1) {
this.dimmer1 = dimmer1;
return this;
}

public Properties withDimmer2(int dimmer2) {
this.dimmer2 = dimmer2;
return this;
}

public Properties withDimmer3(int dimmer3) {
this.dimmer3 = dimmer3;
return this;
}

@Override
public String toString() {
return ToStringBuilder.reflectionToString(this);
}

@Override
public int hashCode() {
return new HashCodeBuilder().append(switch1).append(switch2).append(switch3).append(switch4).append(switch5).append(dimmer1).append(dimmer2).append(dimmer3).toHashCode();
}

@Override
public boolean equals(Object other) {
if (other == this) {
return true;
}
if ((other instanceof Properties) == false) {
return false;
}
Properties rhs = ((Properties) other);
return new EqualsBuilder().append(switch1, rhs.switch1).append(switch2, rhs.switch2).append(switch3, rhs.switch3).append(switch4, rhs.switch4).append(switch5, rhs.switch5).append(dimmer1, rhs.dimmer1).append(dimmer2, rhs.dimmer2).append(dimmer3, rhs.dimmer3).isEquals();
}

}
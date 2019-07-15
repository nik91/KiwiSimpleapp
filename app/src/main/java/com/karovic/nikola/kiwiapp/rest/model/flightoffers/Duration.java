
package com.karovic.nikola.kiwiapp.rest.model.flightoffers;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "departure",
    "return",
    "total"
})
public class Duration {

    @JsonProperty("departure")
    private Integer departure;
    @JsonProperty("return")
    private Integer _return;
    @JsonProperty("total")
    private Integer total;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("departure")
    public Integer getDeparture() {
        return departure;
    }

    @JsonProperty("departure")
    public void setDeparture(Integer departure) {
        this.departure = departure;
    }

    @JsonProperty("return")
    public Integer getReturn() {
        return _return;
    }

    @JsonProperty("return")
    public void setReturn(Integer _return) {
        this._return = _return;
    }

    @JsonProperty("total")
    public Integer getTotal() {
        return total;
    }

    @JsonProperty("total")
    public void setTotal(Integer total) {
        this.total = total;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}


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
    "1",
    "2"
})
public class BagsPrice {

    @JsonProperty("1")
    private Double _1;
    @JsonProperty("2")
    private Double _2;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("1")
    public Double get1() {
        return _1;
    }

    @JsonProperty("1")
    public void set1(Double _1) {
        this._1 = _1;
    }

    @JsonProperty("2")
    public Double get2() {
        return _2;
    }

    @JsonProperty("2")
    public void set2(Double _2) {
        this._2 = _2;
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


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
    "flyFrom_type",
    "to_type",
    "seats"
})
public class SearchParams {

    @JsonProperty("flyFrom_type")
    private String flyFromType;
    @JsonProperty("to_type")
    private String toType;
    @JsonProperty("seats")
    private Seats seats;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("flyFrom_type")
    public String getFlyFromType() {
        return flyFromType;
    }

    @JsonProperty("flyFrom_type")
    public void setFlyFromType(String flyFromType) {
        this.flyFromType = flyFromType;
    }

    @JsonProperty("to_type")
    public String getToType() {
        return toType;
    }

    @JsonProperty("to_type")
    public void setToType(String toType) {
        this.toType = toType;
    }

    @JsonProperty("seats")
    public Seats getSeats() {
        return seats;
    }

    @JsonProperty("seats")
    public void setSeats(Seats seats) {
        this.seats = seats;
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

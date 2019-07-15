
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
    "hold_width",
    "hold_height",
    "hold_length",
    "hold_dimensions_sum",
    "hold_weight",
    "hand_width",
    "hand_height",
    "hand_length",
    "hand_weight"
})
public class Baglimit {

    @JsonProperty("hold_width")
    private Integer holdWidth;
    @JsonProperty("hold_height")
    private Integer holdHeight;
    @JsonProperty("hold_length")
    private Integer holdLength;
    @JsonProperty("hold_dimensions_sum")
    private Object holdDimensionsSum;
    @JsonProperty("hold_weight")
    private Integer holdWeight;
    @JsonProperty("hand_width")
    private Integer handWidth;
    @JsonProperty("hand_height")
    private Integer handHeight;
    @JsonProperty("hand_length")
    private Integer handLength;
    @JsonProperty("hand_weight")
    private Integer handWeight;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("hold_width")
    public Integer getHoldWidth() {
        return holdWidth;
    }

    @JsonProperty("hold_width")
    public void setHoldWidth(Integer holdWidth) {
        this.holdWidth = holdWidth;
    }

    @JsonProperty("hold_height")
    public Integer getHoldHeight() {
        return holdHeight;
    }

    @JsonProperty("hold_height")
    public void setHoldHeight(Integer holdHeight) {
        this.holdHeight = holdHeight;
    }

    @JsonProperty("hold_length")
    public Integer getHoldLength() {
        return holdLength;
    }

    @JsonProperty("hold_length")
    public void setHoldLength(Integer holdLength) {
        this.holdLength = holdLength;
    }

    @JsonProperty("hold_dimensions_sum")
    public Object getHoldDimensionsSum() {
        return holdDimensionsSum;
    }

    @JsonProperty("hold_dimensions_sum")
    public void setHoldDimensionsSum(Object holdDimensionsSum) {
        this.holdDimensionsSum = holdDimensionsSum;
    }

    @JsonProperty("hold_weight")
    public Integer getHoldWeight() {
        return holdWeight;
    }

    @JsonProperty("hold_weight")
    public void setHoldWeight(Integer holdWeight) {
        this.holdWeight = holdWeight;
    }

    @JsonProperty("hand_width")
    public Integer getHandWidth() {
        return handWidth;
    }

    @JsonProperty("hand_width")
    public void setHandWidth(Integer handWidth) {
        this.handWidth = handWidth;
    }

    @JsonProperty("hand_height")
    public Integer getHandHeight() {
        return handHeight;
    }

    @JsonProperty("hand_height")
    public void setHandHeight(Integer handHeight) {
        this.handHeight = handHeight;
    }

    @JsonProperty("hand_length")
    public Integer getHandLength() {
        return handLength;
    }

    @JsonProperty("hand_length")
    public void setHandLength(Integer handLength) {
        this.handLength = handLength;
    }

    @JsonProperty("hand_weight")
    public Integer getHandWeight() {
        return handWeight;
    }

    @JsonProperty("hand_weight")
    public void setHandWeight(Integer handWeight) {
        this.handWeight = handWeight;
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

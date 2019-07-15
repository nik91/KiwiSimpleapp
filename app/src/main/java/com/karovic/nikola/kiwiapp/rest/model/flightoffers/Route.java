
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
    "id",
    "combination_id",
    "return",
    "original_return",
    "source",
    "found_on",
    "price",
    "aTime",
    "dTime",
    "aTimeUTC",
    "dTimeUTC",
    "mapIdfrom",
    "mapIdto",
    "cityTo",
    "cityFrom",
    "flyTo",
    "airline",
    "operating_carrier",
    "equipment",
    "flyFrom",
    "latFrom",
    "lngFrom",
    "latTo",
    "lngTo",
    "flight_no",
    "vehicle_type",
    "refresh_timestamp",
    "bags_recheck_required",
    "guarantee",
    "fare_classes",
    "fare_basis",
    "fare_family",
    "fare_category",
    "last_seen",
    "operating_flight_no"
})
public class Route {

    @JsonProperty("id")
    private String id;
    @JsonProperty("combination_id")
    private String combinationId;
    @JsonProperty("return")
    private Integer _return;
    @JsonProperty("original_return")
    private Integer originalReturn;
    @JsonProperty("source")
    private String source;
    @JsonProperty("found_on")
    private String foundOn;
    @JsonProperty("price")
    private Integer price;
    @JsonProperty("aTime")
    private Integer aTime;
    @JsonProperty("dTime")
    private Integer dTime;
    @JsonProperty("aTimeUTC")
    private Integer aTimeUTC;
    @JsonProperty("dTimeUTC")
    private Integer dTimeUTC;
    @JsonProperty("mapIdfrom")
    private String mapIdfrom;
    @JsonProperty("mapIdto")
    private String mapIdto;
    @JsonProperty("cityTo")
    private String cityTo;
    @JsonProperty("cityFrom")
    private String cityFrom;
    @JsonProperty("flyTo")
    private String flyTo;
    @JsonProperty("airline")
    private String airline;
    @JsonProperty("operating_carrier")
    private String operatingCarrier;
    @JsonProperty("equipment")
    private Object equipment;
    @JsonProperty("flyFrom")
    private String flyFrom;
    @JsonProperty("latFrom")
    private Double latFrom;
    @JsonProperty("lngFrom")
    private Double lngFrom;
    @JsonProperty("latTo")
    private Double latTo;
    @JsonProperty("lngTo")
    private Double lngTo;
    @JsonProperty("flight_no")
    private Integer flightNo;
    @JsonProperty("vehicle_type")
    private String vehicleType;
    @JsonProperty("refresh_timestamp")
    private Integer refreshTimestamp;
    @JsonProperty("bags_recheck_required")
    private Boolean bagsRecheckRequired;
    @JsonProperty("guarantee")
    private Boolean guarantee;
    @JsonProperty("fare_classes")
    private String fareClasses;
    @JsonProperty("fare_basis")
    private String fareBasis;
    @JsonProperty("fare_family")
    private String fareFamily;
    @JsonProperty("fare_category")
    private String fareCategory;
    @JsonProperty("last_seen")
    private Integer lastSeen;
    @JsonProperty("operating_flight_no")
    private String operatingFlightNo;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("combination_id")
    public String getCombinationId() {
        return combinationId;
    }

    @JsonProperty("combination_id")
    public void setCombinationId(String combinationId) {
        this.combinationId = combinationId;
    }

    @JsonProperty("return")
    public Integer getReturn() {
        return _return;
    }

    @JsonProperty("return")
    public void setReturn(Integer _return) {
        this._return = _return;
    }

    @JsonProperty("original_return")
    public Integer getOriginalReturn() {
        return originalReturn;
    }

    @JsonProperty("original_return")
    public void setOriginalReturn(Integer originalReturn) {
        this.originalReturn = originalReturn;
    }

    @JsonProperty("source")
    public String getSource() {
        return source;
    }

    @JsonProperty("source")
    public void setSource(String source) {
        this.source = source;
    }

    @JsonProperty("found_on")
    public String getFoundOn() {
        return foundOn;
    }

    @JsonProperty("found_on")
    public void setFoundOn(String foundOn) {
        this.foundOn = foundOn;
    }

    @JsonProperty("price")
    public Integer getPrice() {
        return price;
    }

    @JsonProperty("price")
    public void setPrice(Integer price) {
        this.price = price;
    }

    @JsonProperty("aTime")
    public Integer getATime() {
        return aTime;
    }

    @JsonProperty("aTime")
    public void setATime(Integer aTime) {
        this.aTime = aTime;
    }

    @JsonProperty("dTime")
    public Integer getDTime() {
        return dTime;
    }

    @JsonProperty("dTime")
    public void setDTime(Integer dTime) {
        this.dTime = dTime;
    }

    @JsonProperty("aTimeUTC")
    public Integer getATimeUTC() {
        return aTimeUTC;
    }

    @JsonProperty("aTimeUTC")
    public void setATimeUTC(Integer aTimeUTC) {
        this.aTimeUTC = aTimeUTC;
    }

    @JsonProperty("dTimeUTC")
    public Integer getDTimeUTC() {
        return dTimeUTC;
    }

    @JsonProperty("dTimeUTC")
    public void setDTimeUTC(Integer dTimeUTC) {
        this.dTimeUTC = dTimeUTC;
    }

    @JsonProperty("mapIdfrom")
    public String getMapIdfrom() {
        return mapIdfrom;
    }

    @JsonProperty("mapIdfrom")
    public void setMapIdfrom(String mapIdfrom) {
        this.mapIdfrom = mapIdfrom;
    }

    @JsonProperty("mapIdto")
    public String getMapIdto() {
        return mapIdto;
    }

    @JsonProperty("mapIdto")
    public void setMapIdto(String mapIdto) {
        this.mapIdto = mapIdto;
    }

    @JsonProperty("cityTo")
    public String getCityTo() {
        return cityTo;
    }

    @JsonProperty("cityTo")
    public void setCityTo(String cityTo) {
        this.cityTo = cityTo;
    }

    @JsonProperty("cityFrom")
    public String getCityFrom() {
        return cityFrom;
    }

    @JsonProperty("cityFrom")
    public void setCityFrom(String cityFrom) {
        this.cityFrom = cityFrom;
    }

    @JsonProperty("flyTo")
    public String getFlyTo() {
        return flyTo;
    }

    @JsonProperty("flyTo")
    public void setFlyTo(String flyTo) {
        this.flyTo = flyTo;
    }

    @JsonProperty("airline")
    public String getAirline() {
        return airline;
    }

    @JsonProperty("airline")
    public void setAirline(String airline) {
        this.airline = airline;
    }

    @JsonProperty("operating_carrier")
    public String getOperatingCarrier() {
        return operatingCarrier;
    }

    @JsonProperty("operating_carrier")
    public void setOperatingCarrier(String operatingCarrier) {
        this.operatingCarrier = operatingCarrier;
    }

    @JsonProperty("equipment")
    public Object getEquipment() {
        return equipment;
    }

    @JsonProperty("equipment")
    public void setEquipment(Object equipment) {
        this.equipment = equipment;
    }

    @JsonProperty("flyFrom")
    public String getFlyFrom() {
        return flyFrom;
    }

    @JsonProperty("flyFrom")
    public void setFlyFrom(String flyFrom) {
        this.flyFrom = flyFrom;
    }

    @JsonProperty("latFrom")
    public Double getLatFrom() {
        return latFrom;
    }

    @JsonProperty("latFrom")
    public void setLatFrom(Double latFrom) {
        this.latFrom = latFrom;
    }

    @JsonProperty("lngFrom")
    public Double getLngFrom() {
        return lngFrom;
    }

    @JsonProperty("lngFrom")
    public void setLngFrom(Double lngFrom) {
        this.lngFrom = lngFrom;
    }

    @JsonProperty("latTo")
    public Double getLatTo() {
        return latTo;
    }

    @JsonProperty("latTo")
    public void setLatTo(Double latTo) {
        this.latTo = latTo;
    }

    @JsonProperty("lngTo")
    public Double getLngTo() {
        return lngTo;
    }

    @JsonProperty("lngTo")
    public void setLngTo(Double lngTo) {
        this.lngTo = lngTo;
    }

    @JsonProperty("flight_no")
    public Integer getFlightNo() {
        return flightNo;
    }

    @JsonProperty("flight_no")
    public void setFlightNo(Integer flightNo) {
        this.flightNo = flightNo;
    }

    @JsonProperty("vehicle_type")
    public String getVehicleType() {
        return vehicleType;
    }

    @JsonProperty("vehicle_type")
    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    @JsonProperty("refresh_timestamp")
    public Integer getRefreshTimestamp() {
        return refreshTimestamp;
    }

    @JsonProperty("refresh_timestamp")
    public void setRefreshTimestamp(Integer refreshTimestamp) {
        this.refreshTimestamp = refreshTimestamp;
    }

    @JsonProperty("bags_recheck_required")
    public Boolean getBagsRecheckRequired() {
        return bagsRecheckRequired;
    }

    @JsonProperty("bags_recheck_required")
    public void setBagsRecheckRequired(Boolean bagsRecheckRequired) {
        this.bagsRecheckRequired = bagsRecheckRequired;
    }

    @JsonProperty("guarantee")
    public Boolean getGuarantee() {
        return guarantee;
    }

    @JsonProperty("guarantee")
    public void setGuarantee(Boolean guarantee) {
        this.guarantee = guarantee;
    }

    @JsonProperty("fare_classes")
    public String getFareClasses() {
        return fareClasses;
    }

    @JsonProperty("fare_classes")
    public void setFareClasses(String fareClasses) {
        this.fareClasses = fareClasses;
    }

    @JsonProperty("fare_basis")
    public String getFareBasis() {
        return fareBasis;
    }

    @JsonProperty("fare_basis")
    public void setFareBasis(String fareBasis) {
        this.fareBasis = fareBasis;
    }

    @JsonProperty("fare_family")
    public String getFareFamily() {
        return fareFamily;
    }

    @JsonProperty("fare_family")
    public void setFareFamily(String fareFamily) {
        this.fareFamily = fareFamily;
    }

    @JsonProperty("fare_category")
    public String getFareCategory() {
        return fareCategory;
    }

    @JsonProperty("fare_category")
    public void setFareCategory(String fareCategory) {
        this.fareCategory = fareCategory;
    }

    @JsonProperty("last_seen")
    public Integer getLastSeen() {
        return lastSeen;
    }

    @JsonProperty("last_seen")
    public void setLastSeen(Integer lastSeen) {
        this.lastSeen = lastSeen;
    }

    @JsonProperty("operating_flight_no")
    public String getOperatingFlightNo() {
        return operatingFlightNo;
    }

    @JsonProperty("operating_flight_no")
    public void setOperatingFlightNo(String operatingFlightNo) {
        this.operatingFlightNo = operatingFlightNo;
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

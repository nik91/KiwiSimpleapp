
package com.karovic.nikola.kiwiapp.rest.response;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.karovic.nikola.kiwiapp.rest.model.flightoffers.AirportsList;
import com.karovic.nikola.kiwiapp.rest.model.flightoffers.FlightData;
import com.karovic.nikola.kiwiapp.rest.model.flightoffers.Hashtag;
import com.karovic.nikola.kiwiapp.rest.model.flightoffers.SearchParams;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "search_id",
    "data",
    "connections",
    "time",
    "currency",
    "currency_rate",
    "fx_rate",
    "refresh",
    "del",
    "ref_tasks",
    "search_params",
    "airlinesList",
    "airportsList",
    "all_airlines",
    "all_stopover_airports",
    "best_results",
    "hashtags",
    "location_hashtags",
    "_results"
})
public class FlightResults {

    @JsonProperty("search_id")
    private String searchId;
    @JsonProperty("data")
    private List<FlightData> data = null;
    @JsonProperty("connections")
    private List<Object> connections = null;
    @JsonProperty("time")
    private Integer time;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("currency_rate")
    private Integer currencyRate;
    @JsonProperty("fx_rate")
    private Integer fxRate;
    @JsonProperty("refresh")
    private List<Object> refresh = null;
    @JsonProperty("del")
    private Integer del;
    @JsonProperty("ref_tasks")
    private List<Object> refTasks = null;
    @JsonProperty("search_params")
    private SearchParams searchParams;
    @JsonProperty("airlinesList")
    private List<Object> airlinesList = null;
    @JsonProperty("airportsList")
    private List<AirportsList> airportsList = null;
    @JsonProperty("all_airlines")
    private List<Object> allAirlines = null;
    @JsonProperty("all_stopover_airports")
    private List<String> allStopoverAirports = null;
    @JsonProperty("best_results")
    private List<Object> bestResults = null;
    @JsonProperty("hashtags")
    private List<Hashtag> hashtags = null;
    @JsonProperty("location_hashtags")
    private List<String> locationHashtags = null;
    @JsonProperty("_results")
    private Integer results;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("search_id")
    public String getSearchId() {
        return searchId;
    }

    @JsonProperty("search_id")
    public void setSearchId(String searchId) {
        this.searchId = searchId;
    }

    @JsonProperty("data")
    public List<FlightData> getData() {
        return data;
    }

    @JsonProperty("data")
    public void setData(List<FlightData> data) {
        this.data = data;
    }

    @JsonProperty("connections")
    public List<Object> getConnections() {
        return connections;
    }

    @JsonProperty("connections")
    public void setConnections(List<Object> connections) {
        this.connections = connections;
    }

    @JsonProperty("time")
    public Integer getTime() {
        return time;
    }

    @JsonProperty("time")
    public void setTime(Integer time) {
        this.time = time;
    }

    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @JsonProperty("currency_rate")
    public Integer getCurrencyRate() {
        return currencyRate;
    }

    @JsonProperty("currency_rate")
    public void setCurrencyRate(Integer currencyRate) {
        this.currencyRate = currencyRate;
    }

    @JsonProperty("fx_rate")
    public Integer getFxRate() {
        return fxRate;
    }

    @JsonProperty("fx_rate")
    public void setFxRate(Integer fxRate) {
        this.fxRate = fxRate;
    }

    @JsonProperty("refresh")
    public List<Object> getRefresh() {
        return refresh;
    }

    @JsonProperty("refresh")
    public void setRefresh(List<Object> refresh) {
        this.refresh = refresh;
    }

    @JsonProperty("del")
    public Integer getDel() {
        return del;
    }

    @JsonProperty("del")
    public void setDel(Integer del) {
        this.del = del;
    }

    @JsonProperty("ref_tasks")
    public List<Object> getRefTasks() {
        return refTasks;
    }

    @JsonProperty("ref_tasks")
    public void setRefTasks(List<Object> refTasks) {
        this.refTasks = refTasks;
    }

    @JsonProperty("search_params")
    public SearchParams getSearchParams() {
        return searchParams;
    }

    @JsonProperty("search_params")
    public void setSearchParams(SearchParams searchParams) {
        this.searchParams = searchParams;
    }

    @JsonProperty("airlinesList")
    public List<Object> getAirlinesList() {
        return airlinesList;
    }

    @JsonProperty("airlinesList")
    public void setAirlinesList(List<Object> airlinesList) {
        this.airlinesList = airlinesList;
    }

    @JsonProperty("airportsList")
    public List<AirportsList> getAirportsList() {
        return airportsList;
    }

    @JsonProperty("airportsList")
    public void setAirportsList(List<AirportsList> airportsList) {
        this.airportsList = airportsList;
    }

    @JsonProperty("all_airlines")
    public List<Object> getAllAirlines() {
        return allAirlines;
    }

    @JsonProperty("all_airlines")
    public void setAllAirlines(List<Object> allAirlines) {
        this.allAirlines = allAirlines;
    }

    @JsonProperty("all_stopover_airports")
    public List<String> getAllStopoverAirports() {
        return allStopoverAirports;
    }

    @JsonProperty("all_stopover_airports")
    public void setAllStopoverAirports(List<String> allStopoverAirports) {
        this.allStopoverAirports = allStopoverAirports;
    }

    @JsonProperty("best_results")
    public List<Object> getBestResults() {
        return bestResults;
    }

    @JsonProperty("best_results")
    public void setBestResults(List<Object> bestResults) {
        this.bestResults = bestResults;
    }

    @JsonProperty("hashtags")
    public List<Hashtag> getHashtags() {
        return hashtags;
    }

    @JsonProperty("hashtags")
    public void setHashtags(List<Hashtag> hashtags) {
        this.hashtags = hashtags;
    }

    @JsonProperty("location_hashtags")
    public List<String> getLocationHashtags() {
        return locationHashtags;
    }

    @JsonProperty("location_hashtags")
    public void setLocationHashtags(List<String> locationHashtags) {
        this.locationHashtags = locationHashtags;
    }

    @JsonProperty("_results")
    public Integer getResults() {
        return results;
    }

    @JsonProperty("_results")
    public void setResults(Integer results) {
        this.results = results;
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

package api.response.createBooking;

import java.util.HashMap;
import java.util.Map;
import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@JsonPropertyOrder({
        "type",
        "query",
        "queryParameters",
        "queryParametersObj",
        "isCountry"
})
public class BookingCompleted {

    @JsonProperty("type")
    private String type;
    @JsonProperty("query")
    private String query;
    @JsonProperty("queryParameters")
    private String queryParameters;
    @JsonProperty("queryParametersObj")
    private QueryParametersObj queryParametersObj;
    @JsonProperty("isCountry")
    private Boolean isCountry;

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("query")
    public String getQuery() {
        return query;
    }

    @JsonProperty("query")
    public void setQuery(String query) {
        this.query = query;
    }

    @JsonProperty("queryParameters")
    public String getQueryParameters() {
        return queryParameters;
    }

    @JsonProperty("queryParameters")
    public void setQueryParameters(String queryParameters) {
        this.queryParameters = queryParameters;
    }

    @JsonProperty("queryParametersObj")
    public QueryParametersObj getQueryParametersObj() {
        return queryParametersObj;
    }

    @JsonProperty("queryParametersObj")
    public void setQueryParametersObj(QueryParametersObj queryParametersObj) {
        this.queryParametersObj = queryParametersObj;
    }

    @JsonProperty("isCountry")
    public Boolean getIsCountry() {
        return isCountry;
    }

    @JsonProperty("isCountry")
    public void setIsCountry(Boolean isCountry) {
        this.isCountry = isCountry;
    }

}

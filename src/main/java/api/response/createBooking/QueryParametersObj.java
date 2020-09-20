package api.response.createBooking;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@JsonPropertyOrder({
        "sortBy",
        "isGeo",
        "hId",
        "isCountry",
        "placeId",
        "types"
})
public class QueryParametersObj {

    @JsonProperty("sortBy")
    private String sortBy;
    @JsonProperty("isGeo")
    private Integer isGeo;
    @JsonProperty("hId")
    private String hId;
    @JsonProperty("isCountry")
    private String isCountry;
    @JsonProperty("placeId")
    private String placeId;
    @JsonProperty("types")
    private List<Object> types = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("sortBy")
    public String getSortBy() {
        return sortBy;
    }

    @JsonProperty("sortBy")
    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    @JsonProperty("isGeo")
    public Integer getIsGeo() {
        return isGeo;
    }

    @JsonProperty("isGeo")
    public void setIsGeo(Integer isGeo) {
        this.isGeo = isGeo;
    }

    @JsonProperty("hId")
    public String getHId() {
        return hId;
    }

    @JsonProperty("hId")
    public void setHId(String hId) {
        this.hId = hId;
    }

    @JsonProperty("isCountry")
    public String getIsCountry() {
        return isCountry;
    }

    @JsonProperty("isCountry")
    public void setIsCountry(String isCountry) {
        this.isCountry = isCountry;
    }

    @JsonProperty("placeId")
    public String getPlaceId() {
        return placeId;
    }

    @JsonProperty("placeId")
    public void setPlaceId(String placeId) {
        this.placeId = placeId;
    }

    @JsonProperty("types")
    public List<Object> getTypes() {
        return types;
    }

    @JsonProperty("types")
    public void setTypes(List<Object> types) {
        this.types = types;
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

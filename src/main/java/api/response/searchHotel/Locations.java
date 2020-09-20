package api.response.searchHotel;


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
        "name",
        "placeId",
        "source",
        "country",
        "city",
        "displayType",
        "googleType"
})
public class Locations {

    @JsonProperty("name")
    private String name;
    @JsonProperty("placeId")
    private String placeId;
    @JsonProperty("source")
    private String source;
    @JsonProperty("country")
    private String country;
    @JsonProperty("city")
    private String city;
    @JsonProperty("displayType")
    private String displayType;
    @JsonProperty("googleType")
    private GoogleType googleType;

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("placeId")
    public String getPlaceId() {
        return placeId;
    }

    @JsonProperty("placeId")
    public void setPlaceId(String placeId) {
        this.placeId = placeId;
    }

    @JsonProperty("source")
    public String getSource() {
        return source;
    }

    @JsonProperty("source")
    public void setSource(String source) {
        this.source = source;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    @JsonProperty("displayType")
    public String getDisplayType() {
        return displayType;
    }

    @JsonProperty("displayType")
    public void setDisplayType(String displayType) {
        this.displayType = displayType;
    }

    @JsonProperty("googleType")
    public GoogleType getGoogleType() {
        return googleType;
    }

    @JsonProperty("googleType")
    public void setGoogleType(GoogleType googleType) {
        this.googleType = googleType;
    }

}


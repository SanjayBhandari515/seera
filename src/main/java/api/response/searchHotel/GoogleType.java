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
        "TypeNameEN",
        "TypeNameAR"
})
public class GoogleType {

    @JsonProperty("TypeNameEN")
    private String typeNameEN;
    @JsonProperty("TypeNameAR")
    private String typeNameAR;

    @JsonProperty("TypeNameEN")
    public String getTypeNameEN() {
        return typeNameEN;
    }

    @JsonProperty("TypeNameEN")
    public void setTypeNameEN(String typeNameEN) {
        this.typeNameEN = typeNameEN;
    }

    @JsonProperty("TypeNameAR")
    public String getTypeNameAR() {
        return typeNameAR;
    }

    @JsonProperty("TypeNameAR")
    public void setTypeNameAR(String typeNameAR) {
        this.typeNameAR = typeNameAR;
    }

}
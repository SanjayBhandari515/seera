package api.request.createBooking;

        import org.codehaus.jackson.annotate.JsonProperty;
        import org.codehaus.jackson.annotate.JsonPropertyOrder;
        import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@JsonPropertyOrder({
        "guest"
})
public class Room {

    @JsonProperty("guest")
    private Guest[] guest;

    @JsonProperty("guest")
    public Guest[] getGuest() {
        return guest;
    }

    @JsonProperty("guest")
    public void setGuest(Guest[] guest) {
        this.guest = guest;
    }

}

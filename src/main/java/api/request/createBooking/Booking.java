package api.request.createBooking;

        import org.codehaus.jackson.annotate.JsonProperty;
        import org.codehaus.jackson.annotate.JsonPropertyOrder;
        import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@JsonPropertyOrder({
        "dates",
        "destination",
        "room",
        "placeId"
})
public class Booking {

    @JsonProperty("dates")
    private Dates dates;
    @JsonProperty("destination")
    private String destination;
    @JsonProperty("room")
    private Room[] room = null;
    @JsonProperty("placeId")
    private String placeId;

    @JsonProperty("dates")
    public Dates getDates() {
        return dates;
    }

    @JsonProperty("dates")
    public void setDates(Dates dates) {
        this.dates = dates;
    }

    @JsonProperty("destination")
    public String getDestination() {
        return destination;
    }

    @JsonProperty("destination")
    public void setDestination(String destination) {
        this.destination = destination;
    }

    @JsonProperty("room")
    public Room[] getRoom() {
        return room;
    }

    @JsonProperty("room")
    public void setRoom(Room[] room) {
        this.room = room;
    }

    @JsonProperty("placeId")
    public String getPlaceId() {
        return placeId;
    }

    @JsonProperty("placeId")
    public void setPlaceId(String placeId) {
        this.placeId = placeId;
    }
}

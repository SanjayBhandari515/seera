package api.response.searchHotel;

public class SearchHotel
{
    private Hotels[] hotels;

    private Locations[] locations;

    public Hotels[] getHotels ()
    {
        return hotels;
    }

    public void setHotels (Hotels[] hotels)
    {
        this.hotels = hotels;
    }

    public Locations[] getLocations ()
    {
        return locations;
    }

    public void setLocations (Locations[] locations)
    {
        this.locations = locations;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [hotels = "+hotels+", locations = "+locations+"]";
    }
}


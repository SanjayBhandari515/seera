package api.response.searchHotel;

public class Hotels
{
    private String country;

    private String displayType;

    private String city;

    private String latitude;

    private String name;

    private String hotelId;

    private String thumbnail_url;

    private String isActive;

    private String longitude;

    public String getCountry ()
    {
        return country;
    }

    public void setCountry (String country)
    {
        this.country = country;
    }

    public String getDisplayType ()
    {
        return displayType;
    }

    public void setDisplayType (String displayType)
    {
        this.displayType = displayType;
    }

    public String getCity ()
    {
        return city;
    }

    public void setCity (String city)
    {
        this.city = city;
    }

    public String getLatitude ()
    {
        return latitude;
    }

    public void setLatitude (String latitude)
    {
        this.latitude = latitude;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getHotelId ()
    {
        return hotelId;
    }

    public void setHotelId (String hotelId)
    {
        this.hotelId = hotelId;
    }

    public String getThumbnail_url ()
    {
        return thumbnail_url;
    }

    public void setThumbnail_url (String thumbnail_url)
    {
        this.thumbnail_url = thumbnail_url;
    }

    public String getIsActive ()
    {
        return isActive;
    }

    public void setIsActive (String isActive)
    {
        this.isActive = isActive;
    }

    public String getLongitude ()
    {
        return longitude;
    }

    public void setLongitude (String longitude)
    {
        this.longitude = longitude;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [country = "+country+", displayType = "+displayType+", city = "+city+", latitude = "+latitude+", name = "+name+", hotelId = "+hotelId+", thumbnail_url = "+thumbnail_url+", isActive = "+isActive+", longitude = "+longitude+"]";
    }
}


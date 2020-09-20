package api.pages;

import api.response.searchHotel.Hotels;
import api.response.searchHotel.Locations;
import api.response.searchHotel.SearchHotel;
import api.utils.apiMethods.Requests;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import org.junit.Assert;

import java.util.Arrays;
import java.util.List;

public class SearchHotels extends AdvancedPage {

    public SearchHotels getHotelDetails(String queryParam, String value){

        String url = readConfig("employee.details.url") + "?" + queryParam + "=" + value;

        System.out.println(url);

        Response response = Requests.getRequest(url, contentTypeJson);
        System.out.println("Response code --> "+response.statusCode());
        Assert.assertEquals(response.statusCode(), 200);

        ResponseBody body = response.getBody();

        System.out.println("Response Body is: " + body.asString());

        SearchHotel searchHotel =
                response.as(SearchHotel.class);

        List<Hotels> hotelsList = Arrays.asList(searchHotel.getHotels());

        int length = searchHotel.getHotels().length;
        int number = generateRandomNumberBetweenTwo(0,length);

        String  str =  value.toLowerCase();
        String city = str.substring(0, 1).toUpperCase() + str.substring(1);

        Assert.assertEquals(hotelsList.get(number).getCity(), city);
        Assert.assertEquals(hotelsList.get(number).getDisplayType(), "Hotel");
        Assert.assertEquals(hotelsList.get(number).getIsActive(), "1");

        Assert.assertTrue(hotelsList.get(number).getName().matches(".*[A-Z].*"));
        Assert.assertTrue(hotelsList.get(number).getHotelId().matches("[0-9]+"));
        Assert.assertTrue(hotelsList.get(number).getLatitude().matches("[0-9.]*"));
        Assert.assertTrue(hotelsList.get(number).getLongitude().matches("[0-9.]*"));
        Assert.assertTrue(hotelsList.get(number).getThumbnail_url().contains(".jpeg"));
        Assert.assertTrue(hotelsList.get(number).getCountry() != null || hotelsList.get(number).getCountry().isEmpty());

        List<Locations> locationsList = Arrays.asList(searchHotel.getLocations());

        Assert.assertEquals(locationsList.get(number).getDisplayType(), "Location");
        Assert.assertEquals(locationsList.get(number).getSource(), "google");

        Assert.assertTrue(locationsList.get(number).getName().contains(city));
        Assert.assertTrue(locationsList.get(number).getCity().matches(".*[A-Z].*"));
        Assert.assertTrue(locationsList.get(number).getCountry().matches(".*[A-Z].*"));
        Assert.assertTrue(locationsList.get(number).getPlaceId() != null || locationsList.get(number).getPlaceId().isEmpty());
        Assert.assertTrue(locationsList.get(number).getGoogleType().getTypeNameAR() != null || locationsList.get(number).getGoogleType().getTypeNameAR().isEmpty());
        Assert.assertTrue(locationsList.get(number).getGoogleType().getTypeNameEN().matches(".*[a-z].*"));

        return new SearchHotels();
    }
}

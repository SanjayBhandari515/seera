package junit;

import api.pages.SearchHotels;
import org.junit.Test;

public class SearchHotelsTests {

    @Test
    public void searchHotelByCity() {
        SearchHotels apiLink = new SearchHotels();

        apiLink
                .getHotelDetails("query", "paris");
    }
}

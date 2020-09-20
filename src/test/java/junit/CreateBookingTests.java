package junit;

import api.pages.CreateBooking;
import org.junit.Test;

public class CreateBookingTests {


    @Test
    public void createBooking() {
        CreateBooking apiLink = new CreateBooking();

        apiLink
                .createBookingForUser("ChIJD7fiBh9u5kcRYJSMaMOCCwQ", "paris", 21, 1, 2, 1, 8);
    }
}

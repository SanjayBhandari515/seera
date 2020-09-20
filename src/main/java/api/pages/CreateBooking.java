package api.pages;

import api.request.createBooking.Booking;
import api.request.createBooking.Dates;
import api.request.createBooking.Guest;
import api.request.createBooking.Room;
import api.response.createBooking.BookingCompleted;
import api.utils.apiMethods.Requests;
import api.utils.enums.GuestType;
import com.google.gson.Gson;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import org.junit.Assert;

public class CreateBooking extends AdvancedPage {

    public CreateBooking createBookingForUser(String destination, String placeId, int age, int cknMth, int cknDay, int ckoMth, int ckoDay) {

        String url = readConfig("createBooking.url");

        String body = setCreateBookingRequest(destination, placeId, age, cknMth, cknDay, ckoMth, ckoDay);

        Response response = Requests.postRequest(url, body, contentTypeJson);

        System.out.println("Response code --> " + response.statusCode());

        ResponseBody body1 = response.getBody();

        System.out.println("Response Body is: " + body1.asString());
        Assert.assertEquals(response.statusCode(), 200);

        BookingCompleted bookingCompleted =
                response.as(BookingCompleted.class);

        Assert.assertEquals(bookingCompleted.getQueryParametersObj().getPlaceId(), placeId);
        Assert.assertEquals(bookingCompleted.getType(), "hotel");

        return new CreateBooking();
    }

    private String setCreateBookingRequest(String destination, String placeId, int guestAge, int checkinMonth, int checkinDays, int checkoutMonth, int checkoutday) {
        Booking booking = new Booking();

        Dates dates = new Dates();
        String checkInDate = getFutureDate(0, checkinMonth, checkinDays);
        String checkoutDate = getFutureDate(0, checkoutMonth, checkoutday);
        dates.setCheckin(checkInDate);
        dates.setCheckout(checkoutDate);
        booking.setDates(dates);
        booking.setDestination(destination);

        Guest[] guests = new Guest[3];

        Guest guest = new Guest();
        guest.setType(GuestType.ADT.name());

        Guest guest1 = new Guest();
        guest1.setType(GuestType.ADT.name());

        Guest guest2 = new Guest();
        guest2.setType(GuestType.CHD.name());
        guest2.setAge(guestAge);
        guests[0] = guest;
        guests[1] = guest1;
        guests[2] = guest2;

        Room room = new Room();
        room.setGuest(guests);

        Room[] rooms = new Room[2];
        rooms[0] = room;

        Guest[] guests1 = new Guest[3];
        Guest guest11 = new Guest();
        guest11.setType(GuestType.ADT.name());

        Guest guest22 = new Guest();
        guest22.setType(GuestType.ADT.name());

        guests1[0] = guest11;
        guests1[1] = guest22;

        Room room1 = new Room();
        room1.setGuest(guests1);
        rooms[1] = room1;
        booking.setRoom(rooms);

        booking.setPlaceId(placeId);

        Gson gson = new Gson();
        String json = gson.toJson(booking);
        System.out.println(json);

        return json;
    }
}

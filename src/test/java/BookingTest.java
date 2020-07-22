import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {
    private Booking booking;
    private Bedroom singleBedroom;

    @Before
    public void before(){
        booking = new Booking(singleBedroom, 10);
        singleBedroom = new Bedroom(2, 10, "single", false, 10.00);
    }

    @Test
    public void canGiveTotalBill(){

        assertEquals(100.00, booking.getTotalBill(singleBedroom, 10), 0.01);
    }
}

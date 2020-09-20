package junit.regresssion;

import junit.CreateBookingTests;
import junit.SearchHotelsTests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Suite.class)
@Suite.SuiteClasses( { SearchHotelsTests.class,
        CreateBookingTests.class } )
public class JunitTestSuite {
}

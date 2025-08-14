import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NextDayCalculatorTest {

    @Test
    @DisplayName("Test nextDay(1,1)")
    void testNextDay() {
        Object[][] testCases = {
                {0,0,"Invalid month"},
                {1,0,"Invalid month"},
                {2,0,"Invalid month"},
                {15,0,"Invalid month"},
                {30,0,"Invalid month"},
                {31,0,"Invalid month"},
                {32,0,"Invalid month"},

                {0,1,"Invalid day"},
                {1,1,"2/1"},
                {2,1,"3/1"},
                {15,1,"16/1"},
                {30,1,"31/1"},
                {31,1,"1/2"},
                {32,1,"Invalid day"},

                {0,2,"Invalid day"},
                {1,2,"2/2"},
                {2,2,"3/2"},
                {15,2,"16/2"},
                {28,2,"1/3"},
                {30,2,"Invalid day"},
                {31,2,"Invalid day"},

                {0,6,"Invalid day"},
                {1,6,"2/6"},
                {2,6,"3/6"},
                {15,6,"16/6"},
                {30,6,"1/7"},
                {31,6,"Invalid day"},
                {32,6,"Invalid day"},

                {0,11,"Invalid day"},
                {1,11,"2/11"},
                {2,11,"3/11"},
                {15,11,"16/11"},
                {30,11,"1/12"},
                {31,11,"Invalid day"},
                {32,11,"Invalid day"},

                {0,12,"Invalid day"},
                {1,12,"2/12"},
                {2,12,"3/12"},
                {15,12,"16/12"},
                {30,12,"31/12"},
                {31,12,"1/1"},
                {32,12,"Invalid day"},

                {0,13,"Invalid month"},
                {1,13,"Invalid month"},
                {2,13,"Invalid month"},
                {15,13,"Invalid month"},
                {30,13,"Invalid month"},
                {31,13,"Invalid month"},
                {32,13,"Invalid month"}

        };
        for (Object[] testCase : testCases) {
            int day = (Integer)testCase[0];
            int month = (Integer)testCase[1];
            String expected =  (String)testCase[2];
            String result = NextDayCalculator.NextDay(day, month);
           assertEquals(expected,result);
        }

    }
}
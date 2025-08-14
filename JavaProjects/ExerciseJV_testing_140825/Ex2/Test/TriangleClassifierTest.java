import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @Test
    @DisplayName("All test case for triangleClass")
    void TestTriangleClass() {
        Object[][] testCase = new Object[][]{
                {2,2,2,"Equilateral Triangle"},
                {2,2,3,"Isosceles Triangle"},
                {3,4,5,"Normal Triangle"},
                {8,3,2,"Not a triangle"},

                {-1,2,1,"Not a triangle"},
                {0,1,1,"Not a triangle"}
        };
        for (Object[] testcase : testCase) {
            int sideA = (Integer)testcase[0];
            int sideB = (Integer)testcase[1];
            int sideC = (Integer)testcase[2];
            String expectedResult = (String)testcase[3];
            String result = TriangleClassifier.TriangleClass(sideA, sideB, sideC);
            assertEquals(expectedResult, result);
        }
    }
}
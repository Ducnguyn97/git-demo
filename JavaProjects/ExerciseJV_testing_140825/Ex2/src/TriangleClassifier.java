public class TriangleClassifier {
    public static String TriangleClass(int sideA, int sideB, int sideC) {
        String result = "";
        if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
            result = "Not a triangle";
        } else {
            if (sideA == sideB && sideA == sideC && sideB == sideC) {
                result = "Equilateral Triangle";
            } else if (sideA == sideB || sideA == sideC || sideB == sideC) {
                result = "Isosceles Triangle";
            } else if (sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA) {
                result = "Normal Triangle";
            } else {
                result = "Not a triangle";
            }
        }
        return result;
    }
}

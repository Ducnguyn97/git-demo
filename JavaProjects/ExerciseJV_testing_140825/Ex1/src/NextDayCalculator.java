public class NextDayCalculator {
    public static String NextDay(int day, int month) {
        if (month < 1 || month > 12) {
            return"Invalid month";
        }else {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    if (day >= 1 && day <= 30) {
                        day = day + 1;
                    } else if (day == 31) {
                        day = 1;
                        if (month >= 1 && month < 12) {
                            month = month + 1;
                        } else {
                            month = 1;
                        }
                    } else {
                        return "Invalid day";
                    }
                    break;
                case 2:
                    if (day >= 1 && day <= 27) {
                        day = day + 1;
                    } else if (day == 28) {
                        day = 1;
                        month = month + 1;
                    } else {
                        return "Invalid day";
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    if (day >= 1 && day <= 29) {
                        day = day + 1;
                    } else if (day == 30) {
                        day = 1;
                        month = month + 1;
                    } else {
                        return "Invalid day";
                    }
            }
        }
        return day + "/" + month;
    }
}

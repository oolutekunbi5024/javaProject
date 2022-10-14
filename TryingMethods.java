
/**
 * TryingMethods Class
 */
public class TryingMethods {

    public static void main(String[] args) {
     
    }

    //dynamicMethod for days of the week

    String dynamicMethod1(int daysOfTheWeek){
    String days;
        switch (daysOfTheWeek) {
        case 1:
        days="Monday";
        break;
    case 2:
        days="Tuesday";
        break;
    case 3:
        days="Wednesday";
        break;
        case 4:
        days="Thursday";
        break;
    case 5:
        days="Friday";
        break;
    case 6:
        days="Saturday";
        break;
    case 7:
        days="Sunday";
        break;
    
        default:
        days="This is day is not a day of the Week";
            break;
    }
    return days;
}



}


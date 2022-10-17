/**
 * TryingMethods
 */
public class TryingMethods {

<<<<<<< HEAD
    public static void main(String[] args) {
       
    }
//first static method
    static int sum() {
    int i=1;
        int sumValue=0;
        while (i<1000) {
            sumValue+= i;
            i++;
          
}
    return sumValue;
    }
}
=======
    //Dynamic Method for Score sheets
void scoreCard(){
        int score=70;
    if (score>=70) {
    System.out.println("Excellent");
    if (score>=60) {
    System.out.println("Good");
}
    else if (score>=50) {
    System.out.println("Pass");
}
}
    }
//forLoop
    public static void forLoop(){
        int sum=0;
        for (int i = 12; i < 103; i++) {
            if (i%2==0) {
                sum+=i;
                            }
           
        }   
        System.out.print(sum); 
    }



/**
 * TryingMethods Class
 */
    public static void main(String[] args) {
     
    }

    //dynamicMethod for days of the week

    String weekDaysCase(int daysOfTheWeek){
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



>>>>>>> main

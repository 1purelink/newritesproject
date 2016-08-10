package ritestest;

/**
 * Created by man on 7/21/16.
 */
public class Callendar {
    Weeks sunday = Weeks.SATURDAY;
    Weeks monday = Weeks.MONDAY;

    public static void main(String[] args){
        for(Weeks week : Weeks.values()) {
            System.out.println(week);
        }

        Color myColor = Color.BLUE;
        System.out.println(myColor.rgbValue());
        System.out.println(myColor);
    }

}

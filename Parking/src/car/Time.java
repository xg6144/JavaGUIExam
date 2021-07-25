package car;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Time {
    public Time(){
        dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    }
    SimpleDateFormat dateFormat;
    public static String[][] time_list_one = new String[2][8];
    public static String[][] time_list_two = new String[2][8];
    Date time;

    public void add_time(int park_Number){
        time = new Date();

        String insert_time = dateFormat.format(time);

        switch (park_Number){
            case 1:
                time_list_one[0][0] = insert_time;
                break;
            case 2:
                time_list_one[0][1] = insert_time;
                break;
            case 3:
                time_list_one[0][2] = insert_time;
                break;
            case 4:
                time_list_one[0][3] = insert_time;
                break;
            case 5:
                time_list_one[0][4] = insert_time;
                break;
            case 6:
                time_list_one[0][5] = insert_time;
                break;
            case 7:
                time_list_one[0][6] = insert_time;
                break;
            case 8:
                time_list_one[0][7] = insert_time;
                break;
            case 9:
                time_list_one[1][0] = insert_time;
                break;
            case 10:
                time_list_one[1][1] = insert_time;
                break;
            case 11:
                time_list_one[1][2] = insert_time;
                break;
            case 12:
                time_list_one[1][3] = insert_time;
                break;
            case 13:
                time_list_one[1][4] = insert_time;
                break;
            case 14:
                time_list_one[1][5] = insert_time;
                break;
            case 15:
                time_list_one[1][6] = insert_time;
                break;
            case 16:
                time_list_one[1][7] = insert_time;
                break;
            case 17:
                time_list_two[0][0] = insert_time;
                break;
            case 18:
                time_list_two[0][1] = insert_time;
                break;
            case 19:
                time_list_two[0][2] = insert_time;
                break;
            case 20:
                time_list_two[0][3] = insert_time;
                break;
            case 21:
                time_list_two[0][4] = insert_time;
                break;
            case 22:
                time_list_two[0][5] = insert_time;
                break;
            case 23:
                time_list_two[0][6] = insert_time;
                break;
            case 24:
                time_list_two[0][7] = insert_time;
                break;
            case 25:
                time_list_two[1][0] = insert_time;
                break;
            case 26:
                time_list_two[1][1] = insert_time;
                break;
            case 27:
                time_list_two[1][2] = insert_time;
                break;
            case 28:
                time_list_two[1][3] = insert_time;
                break;
            case 29:
                time_list_two[1][4] = insert_time;
                break;
            case 30:
                time_list_two[1][5] = insert_time;
                break;
            case 31:
                time_list_two[1][6] = insert_time;
                break;
            case 32:
                time_list_two[1][7] = insert_time;
                break;
        }
    }
}

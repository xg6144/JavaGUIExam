package car;

import parking.ParkingCar;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class InsertCar extends Car{
    Scanner scanner;
    ParkingCar parkingCar;
    public static Date[][] inTime_list_one = new Date[2][8];
    public static Date[][] inTime_list_two = new Date[2][8];
    SimpleDateFormat simpleDateFormat;
    Date nowTime;

    public void car_In(int parkNumber) {
        simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        parkingCar = new ParkingCar();
        scanner = new Scanner(System.in);
        System.out.print("차량번호를 입력하세요. : ");
        car_Number = scanner.nextLine();

        switch (parkNumber) {
            case 1:
                nowTime = new Date();
                inTime_list_one[0][0] = nowTime;
                car_Number_list_one[0][0] = car_Number;
                break;
            case 2:
                nowTime = new Date();
                inTime_list_one[0][1] = nowTime;
                car_Number_list_one[0][1] = car_Number;
                break;
            case 3:
                nowTime = new Date();
                inTime_list_one[0][2] = nowTime;
                car_Number_list_one[0][2] = car_Number;
                break;
            case 4:
                nowTime = new Date();
                inTime_list_one[0][3] = nowTime;
                car_Number_list_one[0][3] = car_Number;
                break;
            case 5:
                nowTime = new Date();
                inTime_list_one[0][4] = nowTime;
                car_Number_list_one[0][4] = car_Number;
                break;
            case 6:
                nowTime = new Date();
                inTime_list_one[0][5] = nowTime;
                car_Number_list_one[0][5] = car_Number;
                break;
            case 7:
                nowTime = new Date();
                inTime_list_one[0][6] = nowTime;
                car_Number_list_one[0][6] = car_Number;
                break;
            case 8:
                nowTime = new Date();
                inTime_list_one[0][7] = nowTime;
                car_Number_list_one[0][7] = car_Number;
                break;
            case 9:
                nowTime = new Date();
                inTime_list_one[1][0] = nowTime;
                car_Number_list_one[1][0] = car_Number;
                break;
            case 10:
                nowTime = new Date();
                inTime_list_one[1][1] = nowTime;
                car_Number_list_one[1][1] = car_Number;
                break;
            case 11:
                nowTime = new Date();
                inTime_list_one[1][2] = nowTime;
                car_Number_list_one[1][2] = car_Number;
                break;
            case 12:
                nowTime = new Date();
                inTime_list_one[1][3] = nowTime;
                car_Number_list_one[1][3] = car_Number;
                break;
            case 13:
                nowTime = new Date();
                inTime_list_one[1][4] = nowTime;
                car_Number_list_one[1][4] = car_Number;
                break;
            case 14:
                nowTime = new Date();
                inTime_list_one[1][5] = nowTime;
                car_Number_list_one[1][5] = car_Number;
                break;
            case 15:
                nowTime = new Date();
                inTime_list_one[1][6] = nowTime;
                car_Number_list_one[1][6] = car_Number;
                break;
            case 16:
                nowTime = new Date();
                inTime_list_one[1][7] = nowTime;
                car_Number_list_one[1][7] = car_Number;
                break;
            case 17:
                nowTime = new Date();
                inTime_list_two[0][0] = nowTime;
               car_Number_list_two[0][0] = car_Number;
               break;
            case 18:
                nowTime = new Date();
                inTime_list_two[0][1] = nowTime;
                car_Number_list_two[0][1] = car_Number;
                break;
            case 19:
                nowTime = new Date();
                inTime_list_two[0][2] = nowTime;
                car_Number_list_two[0][2] = car_Number;
                break;
            case 20:
                nowTime = new Date();
                inTime_list_two[0][3] = nowTime;
                car_Number_list_two[0][3] = car_Number;
                break;
            case 21:
                nowTime = new Date();
                inTime_list_two[0][4] = nowTime;
                car_Number_list_two[0][4] = car_Number;
                break;
            case 22:
                nowTime = new Date();
                inTime_list_two[0][5] = nowTime;
                car_Number_list_two[0][5] = car_Number;
                break;
            case 23:
                nowTime = new Date();
                inTime_list_two[0][6] = nowTime;
                car_Number_list_two[0][6] = car_Number;
                break;
            case 24:
                nowTime = new Date();
                inTime_list_two[0][7] = nowTime;
                car_Number_list_two[0][7] = car_Number;
                break;
            case 25:
                nowTime = new Date();
                inTime_list_two[1][0] = nowTime;
                car_Number_list_two[1][0] = car_Number;
                break;
            case 26:
                nowTime = new Date();
                inTime_list_two[1][1] = nowTime;
                car_Number_list_two[1][1] = car_Number;
                break;
            case 27:
                nowTime = new Date();
                inTime_list_two[1][2] = nowTime;
                car_Number_list_two[1][2] = car_Number;
                break;
            case 28:
                nowTime = new Date();
                inTime_list_two[1][3] = nowTime;
                car_Number_list_two[1][3] = car_Number;
                break;
            case 29:
                nowTime = new Date();
                inTime_list_two[1][4] = nowTime;
                car_Number_list_two[1][4] = car_Number;
                break;
            case 30:
                nowTime = new Date();
                inTime_list_two[1][5] = nowTime;
                car_Number_list_two[1][5] = car_Number;
                break;
            case 31:
                nowTime = new Date();
                inTime_list_two[1][6] = nowTime;
                car_Number_list_two[1][6] = car_Number;
                break;
            case 32:
                nowTime = new Date();
                inTime_list_two[1][7] = nowTime;
                car_Number_list_two[1][7] = car_Number;
                break;
            default:
                break;
        }
    }
}

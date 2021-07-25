package car;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Fee {
    Date inTime;
    Date outTime;
    Date nowTime;
    SimpleDateFormat simpleDateFormat;
    public static String[][] fee_list_one = new String[2][8];
    public static String[][] fee_list_two = new String[2][8];
    private void reset(int park_Number){
        if(park_Number >= 1 && park_Number <= 8){
            fee_list_one[0][park_Number-1] = null;
            Time.time_list_one[0][park_Number-1] = null;
            InsertCar.inTime_list_one[0][park_Number-1] = null;
        }else if(park_Number >= 9 && park_Number <= 16){
            fee_list_one[1][park_Number-9] = null;
            Time.time_list_one[1][park_Number-9] = null;
            InsertCar.inTime_list_one[1][park_Number-9] = null;
        }else if(park_Number >= 17 && park_Number <= 24){
            fee_list_two[0][park_Number-17] = null;
            Time.time_list_two[0][park_Number-17] = null;
            InsertCar.inTime_list_two[0][park_Number-17] = null;
        }else if(park_Number >= 25 && park_Number <= 32){
            fee_list_two[1][park_Number-25] = null;
            Time.time_list_two[1][park_Number-25] = null;
            InsertCar.inTime_list_two[1][park_Number-25] = null;
        }
    }
    private void time_cal(long cal){
        long cal_seconds = cal / 1000;
        if (cal_seconds <= 10) {
            System.out.println("Free");
        } else if (cal_seconds <= 20) {
            System.out.println("요금 : 4000원");
        } else if (cal_seconds <= 30) {
            System.out.println("요금 : 6000원");
        } else if (cal_seconds <= 40) {
            System.out.println("요금 : 8000원");
        } else {
            System.out.println("요금 : 10000원");
        }
    }
    private void parser(int park_Number){
        simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        inTime = new Date();
        outTime = new Date();
        String out_time = null;
        try {
            if (park_Number >= 1 && park_Number <= 8)
            {
                inTime = simpleDateFormat.parse(Time.time_list_one[0][park_Number-1]);
                out_time = simpleDateFormat.format(outTime);
                outTime = simpleDateFormat.parse(out_time);

                long cal = outTime.getTime() - inTime.getTime();
                time_cal(cal);
            }
            else if(park_Number >= 9 && park_Number <= 16){
                inTime = simpleDateFormat.parse(Time.time_list_one[1][park_Number-9]);
                out_time = simpleDateFormat.format(outTime);
                outTime = simpleDateFormat.parse(out_time);

                long cal = outTime.getTime() - inTime.getTime();
                time_cal(cal);
            }
            else if(park_Number >= 17 && park_Number <= 24){
                inTime = simpleDateFormat.parse(Time.time_list_two[0][park_Number-17]);
                out_time = simpleDateFormat.format(outTime);
                outTime = simpleDateFormat.parse(out_time);

                long cal = outTime.getTime() - inTime.getTime();
                time_cal(cal);
            }
            else if(park_Number >= 25 && park_Number <= 32){
                inTime = simpleDateFormat.parse(Time.time_list_two[1][park_Number-25]);
                out_time = simpleDateFormat.format(outTime);
                outTime = simpleDateFormat.parse(out_time);

                long cal = outTime.getTime() - inTime.getTime();
                time_cal(cal);
            }
        }
        catch (ParseException e) {
            e.printStackTrace();
        }
    }
    public void out_time(int park_Number){

        switch (park_Number){
            case 1:
                parser(park_Number);
                reset(park_Number);
                break;
            case 2:
                parser(park_Number);
                reset(park_Number);
                break;
            case 3:
                parser(park_Number);
                reset(park_Number);
                break;
            case 4:
                parser(park_Number);
                reset(park_Number);
                break;
            case 5:
                parser(park_Number);
                reset(park_Number);
                break;
            case 6:
                parser(park_Number);
                reset(park_Number);
                break;
            case 7:
                parser(park_Number);
                reset(park_Number);
                break;
            case 8:
                parser(park_Number);
                reset(park_Number);
                break;
            case 9:
                parser(park_Number);
                reset(park_Number);
                break;
            case 10:
                parser(park_Number);
                reset(park_Number);
                break;
            case 11:
                parser(park_Number);
                reset(park_Number);
                break;
            case 12:
                parser(park_Number);
                reset(park_Number);
                break;
            case 13:
                parser(park_Number);
                reset(park_Number);
                break;
            case 14:
                parser(park_Number);
                reset(park_Number);
                break;
            case 15:
                parser(park_Number);
                reset(park_Number);
                break;
            case 16:
                parser(park_Number);
                reset(park_Number);
                break;
            case 17:
                parser(park_Number);
                reset(park_Number);
                break;
            case 18:
                parser(park_Number);
                reset(park_Number);
                break;
            case 19:
                parser(park_Number);
                reset(park_Number);
                break;
            case 20:
                parser(park_Number);
                reset(park_Number);
                break;
            case 21:
                parser(park_Number);
                reset(park_Number);
                break;
            case 22:
                parser(park_Number);
                reset(park_Number);
                break;
            case 23:
                parser(park_Number);
                reset(park_Number);
                break;
            case 24:
                parser(park_Number);
                reset(park_Number);
                break;
            case 25:
                parser(park_Number);
                reset(park_Number);
                break;
            case 26:
                parser(park_Number);
                reset(park_Number);
                break;
            case 27:
                parser(park_Number);
                reset(park_Number);
                break;
            case 28:
                parser(park_Number);
                reset(park_Number);
                break;
            case 29:
                parser(park_Number);
                reset(park_Number);
                break;
            case 30:
                parser(park_Number);
                reset(park_Number);
                break;
            case 31:
                parser(park_Number);
                reset(park_Number);
                break;
            case 32:
                parser(park_Number);
                reset(park_Number);
                break;
        }
    }
    public void fee_realtime(){
        nowTime = new Date();
        simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        for(int i=0; i < fee_list_one.length; i++){
            for(int j=0; j < fee_list_one[0].length; j++){
                if(Arrays.equals(fee_list_one[i], fee_list_one[0])){
                    if(InsertCar.inTime_list_one[i][j] != null){
                        long cal = nowTime.getTime() - InsertCar.inTime_list_one[i][j].getTime();
                        long cal_seconds = cal / 1000;
                        if(cal_seconds <= 10){
                            fee_list_one[i][j] = "Free";
                        }else if(cal_seconds <= 20){
                            fee_list_one[i][j] = "4000원";
                        }else if(cal_seconds <= 30){
                            fee_list_one[i][j] = "6000원";
                        }else if(cal_seconds <= 40){
                            fee_list_one[i][j] = "8000원";
                        }else {
                            fee_list_one[i][j] = "10000원";
                        }
                        System.out.println((j+1)+"번");
                        System.out.println(fee_list_one[i][j]);
                    }
                }
                else if(Arrays.equals(fee_list_one[i], fee_list_one[1])){
                    if(fee_list_one[i][j] != null){
                        long cal = nowTime.getTime() - InsertCar.inTime_list_one[i][j].getTime();
                        long cal_seconds = cal / 1000;
                        if(cal_seconds <= 10){
                            fee_list_one[i][j] = "Free";
                        }else if(cal_seconds <= 20){
                            fee_list_one[i][j] = "4000원";
                        }else if(cal_seconds <= 30){
                            fee_list_one[i][j] = "6000원";
                        }else if(cal_seconds <= 40){
                            fee_list_one[i][j] = "8000원";
                        }else {
                            fee_list_one[i][j] = "10000원";
                        }
                        System.out.println((j+9)+"번");
                        System.out.println(fee_list_one[i][j]);
                    }
                }
            }
        }
        for(int i=0; i < fee_list_two.length; i++){
            for(int j=0; j < fee_list_two[0].length; j++){
                if(Arrays.equals(fee_list_two[i], fee_list_two[0]))
                {
                    if(InsertCar.inTime_list_two[i][j] != null) {
                        long cal = nowTime.getTime() - InsertCar.inTime_list_two[i][j].getTime();
                        long cal_seconds = cal / 1000;
                        if (cal_seconds <= 10) {
                            fee_list_two[i][j] = "Free";
                        } else if (cal_seconds <= 20) {
                            fee_list_two[i][j] = "4000원";
                        } else if (cal_seconds <= 30) {
                            fee_list_two[i][j] = "6000원";
                        } else if (cal_seconds <= 40) {
                            fee_list_two[i][j] = "8000원";
                        } else {
                            fee_list_two[i][j] = "10000원";
                        }
                        System.out.println((j + 17) + "번");
                        System.out.println(fee_list_two[i][j]);
                    }
                }else if(Arrays.equals(fee_list_two[i], fee_list_two[1])){
                    if(fee_list_two[i][j] != null){
                        long cal = nowTime.getTime() - InsertCar.inTime_list_two[i][j].getTime();
                        long cal_seconds = cal / 1000;
                        if(cal_seconds <= 10){
                            fee_list_two[i][j] = "Free";
                        }else if(cal_seconds <= 20){
                            fee_list_two[i][j] = "4000원";
                        }else if(cal_seconds <= 30){
                            fee_list_two[i][j] = "6000원";
                        }else if(cal_seconds <= 40){
                            fee_list_two[i][j] = "8000원";
                        }else {
                            fee_list_two[i][j] = "10000원";
                        }
                        System.out.println((j+25)+"번");
                        System.out.println(fee_list_two[i][j]);
                    }
                }
            }
        }
   }
}


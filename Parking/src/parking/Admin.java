package parking;

import car.Car;
import car.Fee;
import car.Time;

import java.util.Arrays;

public class Admin extends Car{
    ParkingLine parkingLine;
    public void count_car(String[][] parking_area_1, String[][] parking_area_2) {
        int cnt = 0;
        for(int i=0; i < parking_area_1.length; i++) {
            for(int j=0; j < parking_area_1[0].length; j++) {
                if(parking_area_1[i][j] != null){
                    cnt++;
                }
            }
        }

        for (int i = 0; i < parking_area_2.length; i++) {
            for (int j = 0; j < parking_area_2[0].length; j++) {
                if (parking_area_2[i][j] != null) {
                    cnt++;
                }
            }
        }

        System.out.println("현재 주차되어있는 차량의 수는 "+ cnt +"대 입니다.");
    }
    public void show_car() {
        parkingLine = new ParkingLine();
        parkingLine.draw_line_x(1);
        parkingLine.draw_line_x(2);
    }
    public void show_car_number(){
        for(int i=0; i < car_Number_list_one.length; i++){
            for(int j=0; j < car_Number_list_one[0].length; j++){
                if(Arrays.equals(car_Number_list_one[i], car_Number_list_one[0])){
                    if(car_Number_list_one[i][j] != null){
                        System.out.println((j+1)+"번 \n" + car_Number_list_one[i][j]);
                    }
                }
                else if(Arrays.equals(car_Number_list_one[i], car_Number_list_one[1])){
                    if(car_Number_list_one[i][j] != null) {
                        System.out.println((j+9) + "번 \n" + car_Number_list_one[i][j]);
                    }
                }
            }
        }

        for(int i=0; i < car_Number_list_two.length; i++){
            for(int j=0; j < car_Number_list_two[0].length; j++){
                if(Arrays.equals(car_Number_list_two[i], car_Number_list_two[0])){
                    if(car_Number_list_two[i][j] != null){
                        System.out.println((j+17)+"번\n" + car_Number_list_two[i][j]);
                    }
                }
                else if(Arrays.equals(car_Number_list_two[i], car_Number_list_two[1])){
                    if(car_Number_list_two[i][j] != null) {
                        System.out.println((j + 25) + "번\n" + car_Number_list_two[i][j]);
                    }
                }
            }
        }
    }
    public void show_time(){
        for(int i=0; i < Time.time_list_one.length; i++){
            for(int j=0; j < Time.time_list_one[0].length; j++){
                if(Arrays.equals(Time.time_list_one[i], Time.time_list_one[0])){
                    if(Time.time_list_one[i][j] != null){
                        System.out.println((j+1)+"번 \n" + Time.time_list_one[i][j]);
                    }
                }
                else if(Arrays.equals(Time.time_list_one[i], Time.time_list_one[1])){
                    if(Time.time_list_one[i][j] != null) {
                        System.out.println((j+9) + "번 \n" + Time.time_list_one[i][j]);
                    }
                }
            }
        }

        for(int i=0; i < Time.time_list_two.length; i++){
            for(int j=0; j < Time.time_list_two[0].length; j++){
                if(Arrays.equals(Time.time_list_two[i], Time.time_list_two[0])){
                    if(Time.time_list_two[i][j] != null){
                        System.out.println((j+17)+"번\n" + Time.time_list_two[i][j]);
                    }
                }
                else if(Arrays.equals(Time.time_list_two[i], Time.time_list_two[1])){
                    if(Time.time_list_two[i][j] != null) {
                        System.out.println((j + 25) + "번\n" + Time.time_list_two[i][j]);
                    }
                }
            }
        }
    }
    public void show_fee(){
        Fee fee = new Fee();
        fee.fee_realtime();
    }
}

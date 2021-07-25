package car;

import parking.ParkingCar;

import java.util.Scanner;

public class OutCar extends Car{
    Scanner scanner;
    ParkingCar parkingCar;
    private void reset(int park_Number){
        if(park_Number <= 8 && park_Number >= 1) {
            Fee.fee_list_one[0][park_Number-1] = null;
            car_Number_list_one[0][park_Number-1] = null;
        }
        else if(park_Number >= 9 && park_Number <= 16){
            Fee.fee_list_one[1][park_Number-9] = null;
            car_Number_list_one[1][park_Number-9] = null;
        }else if(park_Number >= 17 && park_Number <= 24){
            Fee.fee_list_two[0][park_Number-17] = null;
            car_Number_list_two[0][park_Number-17] = null;
        }else if(park_Number >= 25 && park_Number <= 32){
            Fee.fee_list_two[1][park_Number-25] = null;
            car_Number_list_two[1][park_Number-25] = null;
        }
    }
    public void outcar_carnumber(int park_Number){
        parkingCar = new ParkingCar();
        scanner = new Scanner(System.in);
        System.out.println("차량 번호를 입력해주세요\n >>>");
        String carNumber = scanner.nextLine();
        switch (park_Number){
            case 1:
                if(carNumber.equals(car_Number_list_one[0][0])){
                    reset(park_Number);
                    System.out.println("출차완료");
                }else{
                    System.out.println("차량 번호가 틀립니다.");
                    parkingCar.car_parking();
                }
                break;
            case 2:
                if(carNumber.equals(car_Number_list_one[0][1])){
                    reset(park_Number);
                    System.out.println("출차완료");
                }else{
                    System.out.println("차량 번호가 틀립니다.");
                    parkingCar.car_parking();
                }
                break;
            case 3:
                if(carNumber.equals(car_Number_list_one[0][2])){
                    reset(park_Number);
                    System.out.println("출차완료");
                }else{
                    System.out.println("차량 번호가 틀립니다.");
                    parkingCar.car_parking();
                }
                break;
            case 4:
                if(carNumber.equals(car_Number_list_one[0][3])){
                    reset(park_Number);
                    System.out.println("출차완료");
                }else{
                    System.out.println("차량 번호가 틀립니다.");
                    parkingCar.car_parking();
                }
                break;
            case 5:
                if(carNumber.equals(car_Number_list_one[0][4])){
                    reset(park_Number);
                    System.out.println("출차완료");
                }else{
                    System.out.println("차량 번호가 틀립니다.");
                    parkingCar.car_parking();
                }
                break;
            case 6:
                if(carNumber.equals(car_Number_list_one[0][5])){
                    reset(park_Number);
                    System.out.println("출차완료");
                }else{
                    System.out.println("차량 번호가 틀립니다.");
                    parkingCar.car_parking();
                }
                break;
            case 7:
                if(carNumber.equals(car_Number_list_one[0][6])){
                    reset(park_Number);
                    System.out.println("출차완료");
                }else{
                    System.out.println("차량 번호가 틀립니다.");
                    parkingCar.car_parking();
                }
                break;
            case 8:
                if(carNumber.equals(car_Number_list_one[0][7])){
                    reset(park_Number);
                    System.out.println("출차완료");
                }else{
                    System.out.println("차량 번호가 틀립니다.");
                    parkingCar.car_parking();
                }
                break;
            case 9:
                if(carNumber.equals(car_Number_list_one[1][0])){
                    reset(park_Number);
                    System.out.println("출차완료");
                }else{
                    System.out.println("차량 번호가 틀립니다.");
                    parkingCar.car_parking();
                }
                break;
            case 10:
                if(carNumber.equals(car_Number_list_one[1][1])){
                    reset(park_Number);
                    System.out.println("출차완료");
                }else{
                    System.out.println("차량 번호가 틀립니다.");
                    parkingCar.car_parking();
                }
                break;
            case 11:
                if(carNumber.equals(car_Number_list_one[1][2])){
                    reset(park_Number);
                    System.out.println("출차완료");
                }else{
                    System.out.println("차량 번호가 틀립니다.");
                    parkingCar.car_parking();
                }
                break;
            case 12:
                if(carNumber.equals(car_Number_list_one[1][3])){
                    reset(park_Number);
                    System.out.println("출차완료");
                }else{
                    System.out.println("차량 번호가 틀립니다.");
                    parkingCar.car_parking();
                }
                break;
            case 13:
                if(carNumber.equals(car_Number_list_one[1][4])){
                    reset(park_Number);
                    System.out.println("출차완료");
                }else{
                    System.out.println("차량 번호가 틀립니다.");
                    parkingCar.car_parking();
                }
                break;
            case 14:
                if(carNumber.equals(car_Number_list_one[1][5])){
                    reset(park_Number);
                    System.out.println("출차완료");
                }else{
                    System.out.println("차량 번호가 틀립니다.");
                    parkingCar.car_parking();
                }
                break;
            case 15:
                if(carNumber.equals(car_Number_list_one[1][6])){
                    reset(park_Number);
                    System.out.println("출차완료");
                }else{
                    System.out.println("차량 번호가 틀립니다.");
                    parkingCar.car_parking();
                }
                break;
            case 16:
                if(carNumber.equals(car_Number_list_one[1][7])){
                    reset(park_Number);
                    System.out.println("출차완료");
                }else{
                    System.out.println("차량 번호가 틀립니다.");
                    parkingCar.car_parking();
                }
            case 17:
                if(carNumber.equals(car_Number_list_two[0][0])){
                    reset(park_Number);
                    System.out.println("출차완료");
                }else{
                    System.out.println("차량 번호가 틀립니다.");
                    parkingCar.car_parking();
                }
                break;
            case 18:
                if(carNumber.equals(car_Number_list_two[0][1])){
                    reset(park_Number);
                    System.out.println("출차완료");
                }else{
                    System.out.println("차량 번호가 틀립니다.");
                    parkingCar.car_parking();
                }
                break;
            case 19:
                if(carNumber.equals(car_Number_list_two[0][2])){
                    reset(park_Number);
                    System.out.println("출차완료");
                }else{
                    System.out.println("차량 번호가 틀립니다.");
                    parkingCar.car_parking();
                }
                break;
            case 20:
                if(carNumber.equals(car_Number_list_two[0][3])){
                    reset(park_Number);
                    System.out.println("출차완료");
                }else{
                    System.out.println("차량 번호가 틀립니다.");
                    parkingCar.car_parking();
                }
                break;
            case 21:
                if(carNumber.equals(car_Number_list_two[0][4])){
                    reset(park_Number);
                    System.out.println("출차완료");
                }else{
                    System.out.println("차량 번호가 틀립니다.");
                    parkingCar.car_parking();
                }
                break;
            case 22:
                if(carNumber.equals(car_Number_list_two[0][5])){
                    reset(park_Number);
                    System.out.println("출차완료");
                }else{
                    System.out.println("차량 번호가 틀립니다.");
                    parkingCar.car_parking();
                }
                break;
            case 23:
                if(carNumber.equals(car_Number_list_two[0][6])){
                    reset(park_Number);
                    System.out.println("출차완료");
                }else{
                    System.out.println("차량 번호가 틀립니다.");
                    parkingCar.car_parking();
                }
                break;
            case 24:
                if(carNumber.equals(car_Number_list_two[0][7])){
                    reset(park_Number);
                    System.out.println("출차완료");
                }else{
                    System.out.println("차량 번호가 틀립니다.");
                    parkingCar.car_parking();
                }
                break;
            case 25:
                if(carNumber.equals(car_Number_list_two[1][0])){
                    reset(park_Number);
                    System.out.println("출차완료");
                }else{
                    System.out.println("차량 번호가 틀립니다.");
                    parkingCar.car_parking();
                }
                break;
            case 26:
                if(carNumber.equals(car_Number_list_two[1][1])){
                    reset(park_Number);
                    System.out.println("출차완료");
                }else{
                    System.out.println("차량 번호가 틀립니다.");
                    parkingCar.car_parking();
                }
                break;
            case 27:
                if(carNumber.equals(car_Number_list_two[1][2])){
                    reset(park_Number);
                    System.out.println("출차완료");
                }else{
                    System.out.println("차량 번호가 틀립니다.");
                    parkingCar.car_parking();
                }
                break;
            case 28:
                if(carNumber.equals(car_Number_list_two[1][3])){
                    reset(park_Number);
                    System.out.println("출차완료");
                }else{
                    System.out.println("차량 번호가 틀립니다.");
                    parkingCar.car_parking();
                }
                break;
            case 29:
                if(carNumber.equals(car_Number_list_two[1][4])){
                    reset(park_Number);
                    System.out.println("출차완료");
                }else{
                    System.out.println("차량 번호가 틀립니다.");
                    parkingCar.car_parking();
                }
                break;
            case 30:
                if(carNumber.equals(car_Number_list_two[1][5])){
                    reset(park_Number);
                    System.out.println("출차완료");
                }else{
                    System.out.println("차량 번호가 틀립니다.");
                    parkingCar.car_parking();
                }
                break;
            case 31:
                if(carNumber.equals(car_Number_list_two[1][6])){
                    reset(park_Number);
                    System.out.println("출차완료");
                }else{
                    System.out.println("차량 번호가 틀립니다.");
                    parkingCar.car_parking();
                }
                break;
            case 32:
                if(carNumber.equals(car_Number_list_two[1][7])){
                    reset(park_Number);
                    System.out.println("출차완료");
                }else{
                    System.out.println("차량 번호가 틀립니다.");
                    parkingCar.car_parking();
                }
                break;
        }
    }
}

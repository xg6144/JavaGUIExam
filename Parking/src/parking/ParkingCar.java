package parking;

import car.Fee;
import car.InsertCar;
import car.OutCar;
import car.Time;

import java.util.Date;
import java.util.Scanner;

public class ParkingCar extends Parking{
    ParkingLine parkingLine;
    Admin admin;
    Scanner scanner;
    InsertCar insertCar;
    OutCar outCar;
    Time time;
    Fee fee;
    public void parking_reset(){
        for(int i=0; i < 2; i++){
            for(int j=0; j < 8; j++){
                parking_area_1[i][j] = null;
                parking_area_2[i][j] = null;
            }
        }
    }
    public void car_parking() {
        parkingLine = new ParkingLine();
        admin =  new Admin();
        scanner = new Scanner(System.in);
        insertCar = new InsertCar();
        outCar = new OutCar();
        time = new Time();
        fee = new Fee();

        while (true) {
            System.out.print("1. 주차 || 2. 출차 || 3. 종료 || 4. 관리자 : \n >>>");
            park_state = scanner.nextLine();

            int floor;
            switch (park_state) {
                case "1":
                    System.out.println("1. 1층 || 2. 2층");
                    floor = Integer.parseInt(scanner.nextLine());
                    parkingLine.draw_line_x(floor);
                    if (floor == 1) {
                        System.out.print("Enter Parking Number : ");
                        park_Number = Integer.parseInt(scanner.nextLine());
                        insertCar.car_In(park_Number);
                        parking(park_Number, parking_area_1); //구역번호와 주차장 배열을 넘긴다.
                        time.add_time(park_Number);
                        parkingLine.draw_line_x(floor); //주차장을 그린다.
                    }
                    else if (floor == 2) {
                        System.out.print("Enter Parking Number : ");
                        park_Number = Integer.parseInt(scanner.nextLine());
                        insertCar.car_In(park_Number);
                        parking_second(park_Number, parking_area_2);
                        time.add_time(park_Number);
                        parkingLine.draw_line_x(floor);
                    }
                    else {
                        System.out.println("Error");
                    }
                    break;
                case "2":
                    System.out.println("1. 1층 || 2. 2층");
                    floor = Integer.parseInt(scanner.nextLine());
                    parkingLine.draw_line_x(floor);
                    if (floor == 1) {
                        System.out.print("Enter Parking Number : ");
                        park_Number = Integer.parseInt(scanner.nextLine());
                        outCar.outcar_carnumber(park_Number);
                        fee.out_time(park_Number);
                        parking_out(park_Number, parking_area_1);
                        parkingLine.draw_line_x(floor);
                    }
                    else if (floor == 2) {
                        System.out.print("Enter Parking Number : ");
                        park_Number = Integer.parseInt(scanner.nextLine());
                        outCar.outcar_carnumber(park_Number);
                        fee.out_time(park_Number);
                        parking_out_second(park_Number, parking_area_2);
                        parkingLine.draw_line_x(floor);
                    }
                    else {
                        System.out.println("Error");
                    }
                    break;
                case "3":
                    System.out.println("System ShutDown");
                    System.exit(0);
                    break;
                case "4":
                    System.out.print("1. 현재 주차된 차량의 대수 : || 2. 주차장 상태 : || 3. 차량 번호 확인 || 4. 입차시간 확인 || 5. 요금확인 \n >>>");
                    int admin_state = Integer.parseInt(scanner.nextLine());

                    switch (admin_state){
                        case 1:
                            admin.count_car(parking_area_1, parking_area_2);
                            break;
                        case 2:
                            admin.show_car();
                            break;
                        case 3:
                            admin.show_car_number();
                            break;
                        case 4:
                            admin.show_time();
                            break;
                        case 5:
                            admin.show_fee();
                            break;
                        default:
                            System.out.println("Error");
                            break;
                    }
                    break;
                default:
                    break;
            }
        }
    }
}
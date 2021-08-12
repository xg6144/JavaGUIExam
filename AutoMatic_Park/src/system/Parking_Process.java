package system;

import db.List_Class;

import java.util.Scanner;

public class Parking_Process {
    List_Class list_class;
    Scanner scanner;
    public Parking_Process(){
        list_class = new List_Class();
        scanner = new Scanner(System.in);;
    }
    //차량번호 입력
    private String return_car_num(){
        //차랑 정보 입력
        System.out.print("차량 번호 입력 : \n >>>>");
        String car_number = scanner.nextLine();
        return car_number;
    }

    private void check_car_num(String car_num){
        for(int i=0; i < list_class.parking_area_3.length; i++){
            for(int j=0; j < list_class.parking_area_3.length; j++){
                if(list_class.parking_area_3[i][j].equals(car_num)){
                    System.out.println("이미 주차되어 있는 차량 번호 입니다.");
                }
            }
        }
    }
    //차량 입차
    public void input_car() {
        //check_car_num으로 번호판의 유효성을 확인한다.

        String car_num = return_car_num();
        //check_car_num(car_num);

        //검사 후 차량을 주차장에 빈자리에 주차시킨다. 제일 먼저 주차되는 곳은 0,0 이다.
        //1. 주차장을 검사한다.
        //2. 0,0 자리가 비어있다면 차량을 주차시킨다.
        if(list_class.parking_area_3[0][0] == null){
            list_class.parking_area_3[0][0] = car_num;
            System.out.println("주차 성공");
        }else {
            //0,0 자리가 비지 않았다면 빈 자리에 차를 주차시킨다.
            for (int i = 0; i < list_class.parking_area_3.length; i++) {
                for (int j = 0; j < list_class.parking_area_3.length; j++) {
                    if (list_class.parking_area_3[i][j] == null){
                        list_class.parking_area_3[i][j] = car_num;
                        //주차를 시키자 마자 for문을 탈출하기 위해 break를 사용한다.
                        System.out.println("주차 성공");
                        menu();
                    }
                }
            }
        }
    }
    //차량 출차
    public void output_car () {
        String car_num = return_car_num();
        for (int i = 0; i < list_class.parking_area_1.size(); i++) {
            if (list_class.parking_area_1.get(i).equals(car_num)) {
                list_class.parking_area_1.remove(car_num);
                System.out.println("차량 출자 성공");
                menu();
            }else{
                System.out.println("차량 번호가 다름");
                output_car();
            }
        }
    }

    private void show_parking_car(){
        for(int i=0; i < list_class.parking_area_3.length; i++){
            for(int j=0; j < list_class.parking_area_3.length; j++){
                System.out.println(list_class.parking_area_3[i][j]);
            }
        }
    }
    //메뉴
    public void menu() {
        while (true) {
            System.out.print("1. 입차 || 2. 출차 || 3. 종료 || 4. 주차된 차량 확인 \n >>>>");

            int input_state = Integer.parseInt(scanner.nextLine());

            switch (input_state) {
                case 1 -> input_car();
                case 2 -> output_car();
                case 3 -> System.exit(0);
                case 4 -> show_parking_car();
                default -> System.out.println("잘못입력");
            }
        }
    }
}

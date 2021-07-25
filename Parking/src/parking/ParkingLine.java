package parking;

public class ParkingLine extends Parking{
    String x1,x2,x3,x4,x5,x6,x7,x8;
    String y1,y2,y3,y4,y5,y6,y7,y8;
    public void draw_line_x(int floor) {
        if(floor == 1) {
            check_car_1st();
        }else if(floor == 2){
            check_car_2nd();
        }
        System.out.print("-------------------------");
        System.out.println(" ");
        System.out.printf("|%s|%s|%s|%s|%s|%s|%s|%s|", x1, x2, x3, x4, x5, x6, x7, x8);
        System.out.println(" ");
        System.out.print("-------------------------");
        System.out.println(" ");
        System.out.printf("|%s|%s|%s|%s|%s|%s|%s|%s|", y1, y2, y3, y4, y5, y6, y7, y8);
        System.out.println(" ");
        System.out.print("-------------------------");
        System.out.println(" ");
    }
    private void check_car_1st() {
        if (parking_area_1[0][0] != null)
            x1 = "X";
        else
            x1 = "1";
        if (parking_area_1[0][1] != null)
            x2 = "X";
        else
            x2 = "2";
        if (parking_area_1[0][2] != null)
            x3 = "X";
        else
            x3 = "3";
        if (parking_area_1[0][3] != null)
            x4 = "X";
        else
            x4 = "4";
        if (parking_area_1[0][4] != null)
            x5 = "X";
        else
            x5 = "5";
        if (parking_area_1[0][5] != null)
            x6 = "X";
        else
            x6 = "6";
        if (parking_area_1[0][6] != null)
            x7 = "X";
        else
            x7 = "7";
        if (Parking.parking_area_1[0][7] != null)
            x8 = "X";
        else
            x8 = "8";
        if (Parking.parking_area_1[1][0] != null)
            y1 = "X";
        else
            y1 = "9";
        if (Parking.parking_area_1[1][1] != null)
            y2 = "X";
        else
            y2 = "10";
        if (Parking.parking_area_1[1][2] != null)
            y3 = "X";
        else
            y3 = "11";
        if (Parking.parking_area_1[1][3] != null)
            y4 = "X";
        else
            y4 = "12";
        if (Parking.parking_area_1[1][4] != null)
            y5 = "X";
        else
            y5 = "13";
        if (Parking.parking_area_1[1][5] != null)
            y6 = "X";
        else
            y6 = "14";
        if (Parking.parking_area_1[1][6] != null)
            y7 = "X";
        else
            y7 = "15";
        if (Parking.parking_area_1[1][7] != null)
            y8 = "X";
        else
            y8 = "16";
    }
    private void check_car_2nd(){
        if (Parking.parking_area_2[0][0] != null)
            x1 = "X";
        else
            x1 = "17";
        if (Parking.parking_area_2[0][1] != null)
            x2 = "X";
        else
            x2 = "18";
        if (Parking.parking_area_2[0][2] != null)
            x3 = "X";
        else
            x3 = "19";
        if (Parking.parking_area_2[0][3] != null)
            x4 = "X";
        else
            x4 = "20";
        if (Parking.parking_area_2[0][4] != null)
            x5 = "X";
        else
            x5 = "21";
        if (Parking.parking_area_2[0][5] != null)
            x6 = "X";
        else
            x6 = "22";
        if (Parking.parking_area_2[0][6] != null)
            x7 = "X";
        else
            x7 = "23";
        if (Parking.parking_area_2[0][7] != null)
            x8 = "X";
        else
            x8 = "24";
        if (Parking.parking_area_2[1][0] != null)
            y1 = "X";
        else
            y1 = "25";
        if (Parking.parking_area_2[1][1] != null)
            y2 = "X";
        else
            y2 = "26";
        if (Parking.parking_area_2[1][2] != null)
            y3 = "X";
        else
            y3 = "27";
        if (Parking.parking_area_2[1][3] != null)
            y4 = "X";
        else
            y4 = "28";
        if (Parking.parking_area_2[1][4] != null)
            y5 = "X";
        else
            y5 = "29";
        if (Parking.parking_area_2[1][5] != null)
            y6 = "X";
        else
            y6 = "30";
        if (Parking.parking_area_2[1][6] != null)
            y7 = "X";
        else
            y7 = "31";
        if (Parking.parking_area_2[1][7] != null)
            y8 = "X";
        else
            y8 = "32";
    }
}




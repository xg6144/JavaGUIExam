package parking;

public class Parking {
    public int park_Number;
    String park_state;
    static String[][] parking_area_1 = new String[2][8];
    static String[][] parking_area_2 = new String[2][8];

    protected void parking(int park_Number, String[][] parking_area) {
        if (park_Number == 1) {
            parking_process(park_Number, parking_area);
        }
        else if (park_Number == 2) {
            parking_process(park_Number, parking_area);
        }
        else if(park_Number == 3){
            parking_process(park_Number, parking_area);
        }
        else if(park_Number == 4){
            parking_process(park_Number, parking_area);
        }
        else if(park_Number == 5){
            parking_process(park_Number, parking_area);
        }
        else if(park_Number == 6){
            parking_process(park_Number, parking_area);
        }
        else if(park_Number == 7){
            parking_process(park_Number, parking_area);
        }
        else if(park_Number == 8){
            parking_process(park_Number, parking_area);
        }
        else if(park_Number == 9){
            parking_process(park_Number, parking_area);
        }
        else if(park_Number == 10){
            parking_process(park_Number, parking_area);
        }
        else if(park_Number == 11){
            parking_process(park_Number, parking_area);
        }
        else if(park_Number == 12){
            parking_process(park_Number, parking_area);
        }
        else if(park_Number == 13){
            parking_process(park_Number, parking_area);
        }
        else if(park_Number == 14){
            parking_process(park_Number, parking_area);
        }
        else if(park_Number == 15){
            parking_process(park_Number, parking_area);
        }
        else if(park_Number == 16){
            parking_process(park_Number, parking_area);
        }
    }
    protected void parking_out(int park_Number, String[][] parking_area) {
        if (park_Number == 1) {
            parking_out_process(park_Number, parking_area);
        }
        else if (park_Number == 2) {
            parking_out_process(park_Number, parking_area);
        }
        else if (park_Number == 3) {
            parking_out_process(park_Number, parking_area);
        }
        else if (park_Number == 4) {
            parking_out_process(park_Number, parking_area);
        }
        else if (park_Number == 5) {
            parking_out_process(park_Number, parking_area);
        }
        else if (park_Number == 6) {
            parking_out_process(park_Number, parking_area);
        }
        else if (park_Number == 7) {
            parking_out_process(park_Number, parking_area);
        }
        else if (park_Number == 8) {
            parking_out_process(park_Number, parking_area);
        }
        else if (park_Number == 9) {
            parking_out_process(park_Number, parking_area);
        }
        else if (park_Number == 10) {
            parking_out_process(park_Number, parking_area);
        }
        else if (park_Number == 11) {
            parking_out_process(park_Number, parking_area);
        }
        else if (park_Number == 12) {
            parking_out_process(park_Number, parking_area);
        }
        else if (park_Number == 13) {
            parking_out_process(park_Number, parking_area);
        }
        else if (park_Number == 14) {
            parking_out_process(park_Number, parking_area);
        }
        else if (park_Number == 15) {
            parking_out_process(park_Number, parking_area);
        }
        else if (park_Number == 16) {
            parking_out_process(park_Number, parking_area);
        }
    }
    protected void parking_process(int park_Number, String[][] parking_area) {
        if(park_Number <= 8)
        {
            if (parking_area[0][park_Number-1] == null) {
                parking_area[0][park_Number-1] = "Parking";
                System.out.println("Success Parking");
            } else
                System.out.println("Already Parking");
        }
        else
        {
            if(parking_area[1][park_Number-9] == null){
                parking_area[1][park_Number-9] = "Parking";
                System.out.println("Success Parking");
            }else
                System.out.println("Already Parking");
        }
    }
    protected void parking_out_process(int park_Number, String[][] parking_area) {
        if(park_Number <= 8)
        {
            if (parking_area[0][park_Number-1] != null) {
                parking_area[0][park_Number-1] = null;
                System.out.println("Success Delete");
            } else
                System.out.println("Already Delete");
        }else{
            if (parking_area[1][park_Number-9] != null) {
                parking_area[1][park_Number-9] = null;
                System.out.println("Success Delete");
            } else
                System.out.println("Already Delete");
        }
    }
    protected void parking_second(int park_Number, String[][] parking_area){
        if (park_Number == 17) {
            parking_process_second(park_Number, parking_area);
        }
        else if (park_Number == 18) {
            parking_process_second(park_Number, parking_area);
        }
        else if(park_Number == 19){
            parking_process_second(park_Number, parking_area);
        }
        else if(park_Number == 20){
            parking_process_second(park_Number, parking_area);
        }
        else if(park_Number == 21){
            parking_process_second(park_Number, parking_area);
        }
        else if(park_Number == 22){
            parking_process_second(park_Number, parking_area);
        }
        else if(park_Number == 23){
            parking_process_second(park_Number, parking_area);
        }
        else if(park_Number == 24){
            parking_process_second(park_Number, parking_area);
        }
        else if(park_Number == 25){
            parking_process_second(park_Number, parking_area);
        }
        else if(park_Number == 26){
            parking_process_second(park_Number, parking_area);
        }
        else if(park_Number == 27){
            parking_process_second(park_Number, parking_area);
        }
        else if(park_Number == 28){
            parking_process_second(park_Number, parking_area);
        }
        else if(park_Number == 29){
            parking_process_second(park_Number, parking_area);
        }
        else if(park_Number == 30){
            parking_process_second(park_Number, parking_area);
        }
        else if(park_Number == 31){
            parking_process_second(park_Number, parking_area);
        }
        else if(park_Number == 32){
            parking_process_second(park_Number, parking_area);
        }
    }
    protected void parking_process_second(int park_Number, String[][] parking_area){
        if(park_Number <= 24)
        {
            if (parking_area[0][park_Number-17] == null) {
                parking_area[0][park_Number-17] = "Parking";
                System.out.println("Success Parking");
            } else
                System.out.println("Already Parking");
        }
        else
        {
            if(parking_area[1][park_Number-25] == null){
                parking_area[1][park_Number-25] = "Parking";
                System.out.println("Success Parking");
            }else
                System.out.println("Already Parking");
        }
    }
    protected void parking_out_second(int park_Number, String[][] parking_area){
        if (park_Number == 17) {
            parking_out_process_second(park_Number, parking_area);
        }
        else if (park_Number == 18) {
            parking_out_process_second(park_Number, parking_area);
        }
        else if (park_Number == 19) {
            parking_out_process_second(park_Number, parking_area);
        }
        else if (park_Number == 20) {
            parking_out_process_second(park_Number, parking_area);
        }
        else if (park_Number == 21) {
            parking_out_process_second(park_Number, parking_area);
        }
        else if (park_Number == 22) {
            parking_out_process_second(park_Number, parking_area);
        }
        else if (park_Number == 23) {
            parking_out_process_second(park_Number, parking_area);
        }
        else if (park_Number == 24) {
            parking_out_process_second(park_Number, parking_area);
        }
        else if (park_Number == 25) {
            parking_out_process_second(park_Number, parking_area);
        }
        else if (park_Number == 26) {
            parking_out_process_second(park_Number, parking_area);
        }
        else if (park_Number == 27) {
            parking_out_process_second(park_Number, parking_area);
        }
        else if (park_Number == 28) {
            parking_out_process_second(park_Number, parking_area);
        }
        else if (park_Number == 29) {
            parking_out_process_second(park_Number, parking_area);
        }
        else if (park_Number == 30) {
            parking_out_process_second(park_Number, parking_area);
        }
        else if (park_Number == 31) {
            parking_out_process_second(park_Number, parking_area);
        }
        else if (park_Number == 32) {
            parking_out_process_second(park_Number, parking_area);
        }
    }
    protected void parking_out_process_second(int park_Number, String[][] parking_area) {
        if(park_Number <= 24)
        {
            if (parking_area[0][park_Number-17] != null) {
                parking_area[0][park_Number-17] = null;
                System.out.println("Success Delete");
            } else
                System.out.println("Already Delete");
        }else{
            if (parking_area[1][park_Number-25] != null) {
                parking_area[1][park_Number-25] = null;
                System.out.println("Success Delete");
            } else
                System.out.println("Already Delete");
        }
    }
}

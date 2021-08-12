package db;

import java.util.ArrayList;

public class List_Class {
    public List_Class(){
        System.out.println("Success");
    }
    public ArrayList<ArrayList<String>> main_parking_list = new ArrayList<>(4);
    public ArrayList<String> parking_area_1 = new ArrayList<>(4);
    public ArrayList<String> parking_area_2 = new ArrayList<>(4);

    public String[][] parking_area_3 = new String[4][4];
}

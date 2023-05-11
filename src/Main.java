
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        MyConverter converter = new MyConverter();


        double cm = 500;
        double meter = converter.cmToMeter(cm);
        System.out.println(cm + " سم = " + meter + " متر");

        meter = 2.5;
        cm = converter.meterToCm(meter);
        System.out.println(meter + " متر = " + cm + " سم");

        meter = 2500;
        double km = converter.meterToKm(meter);
        System.out.println(meter + " متر = " + km + " كم");


        km=3.7;
        meter = converter.kmToMeter(km);
        System.out.println(meter +"  متر ="+km + "كم ");




    }
}
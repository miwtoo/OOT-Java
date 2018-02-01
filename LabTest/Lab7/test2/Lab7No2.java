
package oot.lab7.test2;

public class Lab7No2 {
    public static void main(String[] args) {
        Mobile mb = new Sumsung("DTAC");
        Mobile ap = new Apple("AIS");
        System.out.println("Samsung's carrier is : " + mb.getCarrier() + " with "+ mb.getSimCount() + " sim(s).");
        System.out.println("Apple's carrier is : " + ap.getCarrier() + " with "+ ap.getSimCount() + " sim(s).");
    }
}

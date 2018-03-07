package oot.mid.test1;

public class Test {
    public static void main(String[] args){
        Robot r = new Robot("2015");
        Chip p = new Chip("C1");
        r.setChip(p);

        System.out.println(r.getYear() + " robot with chip " + r.getChip().getName() );
        Chip c = new Chip();
        c.setName("C2");

        r.repeat1With2(71312);
        r.repeat1With2(213);

        r.printRepeart(123,3);
        r.printRepeart(2000,4);
    }
}

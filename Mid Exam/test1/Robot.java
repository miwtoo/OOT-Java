package oot.mid.test1;

public class Robot {
    private String year;
    private Chip c;
    
    public Robot(String year){
        this.year = year;
    }
    
    public String getYear(){
        return year;
    }
    
    public void setChip(Chip c){
        this.c = c;
    }
    
    public Chip getChip(){
        return c;
    }
    
    public void repeat1With2(int ic){
        int n = ic + 10;
        System.out.println(year +  " robot repair chip "+ c.getName() +" with "+ ic +" to "+ n);
    }
    
    public void printRepeart(int n1, int n2){
        System.out.print(year +  " robot with chip "+ c.getName() +" print ");
        int count = countDigit(n1);
        /*int n[] = new int[count];
        for(int i = 0; i < count; i++){
            n[i] = n1 % 10;
            n1 /= 10;
        }
        
        for(int i = n2-1 ; i >= 0; i--){
            for (int j = count-1; j >= 0; j--) {
                System.out.print(n[i]);
            }
        } */
        
        System.out.println();
    }

    public int countDigit(int n){
        int count = 0;
        int i = 0;
        while(n > 0){
            n /= 10;
            count ++;
        }
        return count;
    }

}

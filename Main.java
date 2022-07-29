public class Main{
    public static void main(String[] args) {
        Distance d1 = new Distance();

        d1.displayDist(10, 15);
        d1.addDist(15, 12875654);
    }
}


class Distance {

    void displayDist(int feet, int inch){
        System.out.println("Feet: "+feet+"\n"+"Inch: "+inch);
    }
    void addDist(int feet, int inch){
        
        if(inch>=12){
            int s = inch/12;
            feet+=s;
            inch %=12;
            System.out.println("feet " +feet+" inch "+inch);
        }else{
            System.out.println("feet "+feet+" inch "+inch);
        }
    }
}
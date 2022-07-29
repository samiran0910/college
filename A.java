public class A {
    public static void main(String[] args) {
        // to find the sum of any number of integers entered as command line arguments
        int sum=0;
        for(String x: args){
            sum+=Integer.parseInt(x);
        }
        System.out.println(sum);


    }
    
}
package lab05;
public class Ex1 {
    public static void main(String[] args) {
        int sum=0;
        for(int i=1;i<=100;i++){
        if(i%2==0){
            sum+=i;
        }
        }
        System.out.println("Sum of even numbers from to 100 is "+sum);
    }
}
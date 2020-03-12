import java.util.*;
class bookofpotion{
    static Scanner scn = new Scanner(System.in);

    public static void sum(long num, int length){
        int i=10;
        long sum = 0;
        while(num!=0){
            long rem = num % 10;
            num = num / 10;
            sum = sum + (rem * i);
            i--;
        }
        if(sum % 11==0){
            System.out.print("Legal ISBN");
        }else{
            System.out.print("illegal ISBN");
        }
    }
    public static void main(String []args){
        long num = scn.nextLong();
        long temp = num;
        int length = 0;
        while(temp!=0){
            temp = temp / 10;
            length++;
        }
        if(length==10){
            sum(num,length);
        }else{
            System.out.print("illegal ISBN");
        }
    }
}
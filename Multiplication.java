import java.util.Scanner;
public class Multiplication{
    public  static void main(String[] args){
        Scanner a = new Scanner(System.in) ;
        int n = a.nextInt();
        for(int i=1; i<=10;i++){
            System .out.println(n +"x" + i + "=" +(n*i));
        }
        a.close();
    }
}


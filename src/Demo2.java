import java.util.Scanner;

/**
 * @ClassName Demo2
 * @Desc TODO
 * @Auther 28893
 * @Date 2019/11/2  11:24
 * @Veresion 1.0
 */
class Fib{
    public static long calc(int n){
        if(n==0||n==1){
            return 1;
        }
        else{
            return calc(n-1)+calc(n-2);
        }
    }
}
class FibThread extends Thread{
    private int n;

    public FibThread(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        long result=Fib.calc(n);
        System.out.printf("第%d项斐波那契数为： %d%n",n,result);
    }
}
public class Demo2 {
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
       while(true){
           System.out.println("请输入要计算的第几项斐波那契数");
           int n=scanner.nextInt();
           Thread thread=new FibThread(n);
           thread.start();
       }
    }
}

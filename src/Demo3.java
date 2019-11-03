import java.util.Scanner;

/**
 * @ClassName Demo3
 * @Desc TODO
 * @Auther 28893
 * @Date 2019/11/2  11:39
 * @Veresion 1.0
 */
public class Demo3 {
    private static class FibThred extends Thread{
        private int n;

        public FibThred(int n) {
            this.n = n;
        }

        @Override
        public void run() {
            long result=Fib.calc(n);
            System.out.printf("第%d项的斐波那契数为%d%n",n,result);
        }
    }

    public static void main(String[] args) throws InterruptedException{
        Scanner scanner=new Scanner(System.in);
        while(true){
            System.out.println("请输入：");
            int n=scanner.nextInt();
            Thread thread=new FibThread(n);
            System.out.println("计算中：");
            thread.start();
            while(thread.isAlive()){
                Thread.sleep(1000);
                System.out.println(".");
            }
        }
    }
}

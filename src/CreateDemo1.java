/**
 * @ClassName CreateDemo1
 * @Desc TODO
 * @Auther 28893
 * @Date 2019/11/2  15:08
 * @Veresion 1.0
 */
public class CreateDemo1 {
    private static int COUNT=100_0000;
    private static class MyThread extends Thread{

        @Override
        public void run() {
            int sum=0;
            for(int i=1;i<=COUNT;i++){
                sum+=i;
            }
            System.out.printf("1+2+……+n=%d%n",sum);
        }
    }
    private static class MyThread2 extends Thread{
        @Override
        public void run() {
            long sum=0;
            for(int i=0;i<=COUNT;i+=2){
                sum+=i;
            }
            System.out.printf("1+3+……+n=%d%n",sum);
        }
    }
    private static class MyThread3 extends Thread{
        @Override
        public void run() {
            long sum=0;
            for(int i=0;i<=COUNT;i++){
                sum+=(i*i);
            }
            System.out.printf("1*1+2*2+……+n*n=%d%n",sum);
        }
    }
    public static void main(String[] args) throws InterruptedException {
        long begin=System.currentTimeMillis();
        Thread thread1=new MyThread();
        Thread thread2=new MyThread2();
        Thread thread3=new MyThread3();

        thread1.start();
        thread2.start();
        thread3.start();
        thread1.join();;
        thread2.join();
        thread3.join();
        long end=System.currentTimeMillis();
        System.out.println((end-begin)*1.0/1000);
    }
}

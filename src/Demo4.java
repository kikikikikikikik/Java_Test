/**
 * @ClassName Demo4
 * @Desc TODO
 * @Auther 28893
 * @Date 2019/11/2  11:43
 * @Veresion 1.0
 */
public class Demo4 {
    private static final int COUNT=10_0000;
    public static void main(String[] args) throws InterruptedException {
        serial();//当数据少时串行模式耗时少
        concurrent();//当数据多时并行模式耗时少
    }

    private static void concurrent() throws InterruptedException {
        long begin=System.nanoTime();
        Thread thread1=new Thread();
        thread1.start();

        Thread thread2=new Thread();
        thread2.start();
        int a=0;
        for(int i=0;i<COUNT;i++){
            a++;
        }
        thread1.join();
        thread2.join();
        long end=System.nanoTime();
        double d=(end-begin)*1.0/1000/1000/1000;
        System.out.printf("并发模式耗时：%.4f%n",d);
    }

    private static void serial() {
        long begin=System.nanoTime();
        int a=0;
        int b=0;
        int c=0;
        for(long i=0;i<COUNT;i++){
            a++;
        }
        for(long i=0;i<COUNT;i++){
            b++;
        }
        for(long i=0;i<COUNT;i++){
            c++;
        }
        long end=System.nanoTime();
        double d=(end-begin)*1.0/1000/1000/1000;
        System.out.printf("串行模式耗时：%.4f%n",d);
    }
}

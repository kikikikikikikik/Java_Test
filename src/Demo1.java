/**
 * @ClassName Demo1
 * @Desc TODO
 * @Auther 28893
 * @Date 2019/11/2  11:03
 * @Veresion 1.0
 */
public class Demo1 {
    //两个死循环可以同时开始执行，没有一个卡住另一个的情况
    public static void main(String[] args)throws InterruptedException {
        method2();
        while(true){
            System.out.println("我在main中打印");
            Thread.sleep(1000);
        }
    }

    private static void method2() {
        Thread thread=new MyThread();
        thread.start();
    }

    private static class MyThread extends Thread {
        @Override
        public void run() {
            while(true){
                System.out.println("我在method2中打印");
                try{
                    Thread.sleep(1000);
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }


        }
    }
}

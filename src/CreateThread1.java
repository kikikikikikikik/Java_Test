/**
 * @ClassName CreateThread1
 * @Desc TODO
 * @Auther 28893
 * @Date 2019/11/2  14:37
 * @Veresion 1.0
 */
public class CreateThread1 {
    private static class MyThread extends Thread{
        private int n=0;
        @Override
        public void run() {
            while(n<60){
                System.out.println(n);
                try{
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                n++;
            }
        }

    }
    private static class Resource{
        public int n=0;
    }
    private static class MyThread2 extends Thread{
        private Resource resource;

        public MyThread2(Resource resource) {
            this.resource = resource;
        }

        @Override
        public void run() {
            while(resource.n<10){
                System.out.println(resource.n);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                resource.n++;
            }
        }
    }
    public static void main(String[] args) {
        /*Thread thread1=new MyThread();
        Thread thread2=new MyThread();*/
       /* Thread thread1=new Thread(new MyThread());
        Thread thread2=new Thread(new MyThread());*/
        Resource resource=new Resource();
        Thread thread1=new MyThread2(resource);
        Thread thread2=new MyThread2(resource);
        thread1.start();
        thread2.start();


    }
}

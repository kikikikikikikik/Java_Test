/**
 * @ClassName CreateDemo2
 * @Desc TODO
 * @Auther 28893
 * @Date 2019/11/2  15:31
 * @Veresion 1.0
 */
public class CreateDemo2 {
    private interface F{
        int f(int n);
    }
    private static class F1 implements F{

        @Override
        public int f(int n) {
            return n;
        }
    }

    private static class calculator{

        public long calc(int n,F f){
            int sum=0;
            for(int i=0;i<n;i++){
                sum+=f.f(i);
            }
            return sum;
        }
    }
    private static class p1 extends Thread{
        private int count=100_0000;

        @Override
        public void run() {
            calculator calculator=new calculator();
            long sum=calculator.calc(count,new F1());
            System.out.println(sum);

        }
    }

    public static void main(String[] args) {
        new p1().start();
    }
}

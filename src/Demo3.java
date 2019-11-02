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
}

/**
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。
 * n<=39
 */
public class Fibonacci {
    /**
     * 递归函数
     * 求某一项的时候可以，但是求解result[n], 会有大量重复运算
     * 751ms
     * 9428k
     */
    public int Fibonacci(int n) {
        if(n==0){
            return 0;
        }else if(n==1 ||n==2){
            return 1;
        }else{
            return Fibonacci(n-1)+Fibonacci(n-2);
        }
    }

    /**
     * 迭代
     * 如果求result[n]，迭代更好，不用重复计算result[i]
     * 13ms
     * 9148k
     */
    public int Fibonacci_1(int n){
        int first=1;
        int second=1;
        int third=0;
        if(n<=0){
            return 0;
        }else if(n==1||n==2){
            return 1;
        }else{
            for(int i=3;i<=n;i++){
                third=first+second;
                first=second;
                second=third;
            }
            return third;
        }
    }

    public static void main(String[] args) {
        Fibonacci f=new Fibonacci();
        System.out.println(f.Fibonacci(6));
    }
}

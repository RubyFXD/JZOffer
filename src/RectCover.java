/**
 * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
 * 请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 */
public class RectCover {
    /**
     * 迭代解决，迭代方法和斐波那契数列一样
     */
    public int RectCover(int target) {
        int first=1;
        int second=2;
        int third=0;
        if(target<=0){
            return 0;
        }else if(target==1 || target==2){
            return target;
        }else{
            for(int i=3;i<=target;i++){
                third=first+second;
                first=second;
                second=third;
            }
            return third;
        }
    }

    public static void main(String[] args) {
        RectCover rectCover=new RectCover();
        System.out.println(rectCover.RectCover(4));
    }
}

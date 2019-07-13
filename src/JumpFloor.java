/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
 */
public class JumpFloor {
    /**
     * 递归函数
     * 501ms
     * 9196k
     */
    public int JumpFloor(int target) {
        if(target<=0){
            return 0;
        }else if(target==1){
            return 1;
        }else if(target==2){
            return 2;
        }
        else{
            return JumpFloor(target-1)+JumpFloor(target-2);
        }
    }

    /**
     * 迭代
     * 15ms
     * 9440k
     */
    public int JumpFloor1(int target){
        int first=1;
        int second=2;
        int third=0;

        if(target<=0){
            return 0;
        }else if(target==1){
            return 1;
        }else if (target==2){
            return 2;
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
        JumpFloor jumpFloor=new JumpFloor();
        System.out.println(jumpFloor.JumpFloor(4));
    }
}

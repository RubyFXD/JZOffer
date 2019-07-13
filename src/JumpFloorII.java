/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */
public class JumpFloorII {
    /**
     * 迭代求解
     */
    public int JumpFloorII(int target) {
        int [] array= new int[target+1];
        array[0]=0;
        array[1]=1;
        if(target<=0){
            return array[0];
        }else if(target==1){
            return array[1];
        }else{
            for(int i=2;i<=target;i++){
                for(int j=i-1;j>0;j--){
                    array[i]=array[i]+array[j];
                }
                array[i]++;
            }
            return array[target];
        }
    }

    /**
     * 除了最后一个台阶必须站上、其他台阶都可以选择站过或者没站过
     * 2^(target-1)
     */

    public int JumpFloorII_1(int target){
        if(target<=0){
            return 0;
        }else{
            return (int)Math.pow(2,target-1);
        }
    }

    /**
     * 除了最后一个台阶必须站上、其他台阶都可以选择站过或者没站过
     * 2^(target-1)
     * 用迭代的方法
     */
    public int JumpFloorII_2(int target){
        if(target<=0){
            return 0;
        }if(target==1){
            return 1;
        }
        int first=1;
        int second=0;
        for(int i=2;i<=target;i++){
            second=first*2;
            first=second;
        }
        return second;
    }

    public static void main(String[] args) {
        JumpFloorII floorII=new JumpFloorII();
        System.out.println(floorII.JumpFloorII_2(5));
    }
}

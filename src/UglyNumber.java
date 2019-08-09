import java.util.ArrayList;

/**
 * 把只包含质因子2、3和5的数称作丑数（Ugly Number）。
 * 例如6、8都是丑数，但14不是，因为它包含质因子7。
 * 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
 */
public class UglyNumber {
    //没通过测试版，效率太低
    public int GetUglyNumber_Solution(int index){
        if(index<=1){
            return index;
        }
        int number=2;
        for(int count=2;count<=index;count++){
            int result=number;
            while(result!=1){
                if(result%2==0){
                    result=result/2;
                }else if(result%3==0){
                    result=result/3;
                }else if(result%5==0){
                    result=result/5;
                }else{
                    number++;
                    result=number;
                }
            }
            number++;
        }
        return number-1;
    }

    //高效版本
    public int GetUglyNumber_Solution1(int index){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        int p2=0,p3=0,p5=0;
        while (list.size()<index){
            int n2=list.get(p2)*2;
            int n3=list.get(p3)*3;
            int n5=list.get(p5)*5;
            int min=Math.min(n2, Math.min(n3,n5));
            list.add(min);
            if(min==n2){
                p2++;
            }
            if(min==n3){
                p3++;
            }
            if(min==n5){
                p5++;
            }
        }
        return list.get(list.size()-1);
    }

    public static void main(String[] args) {
        UglyNumber uglyNumber=new UglyNumber();
        //int result=uglyNumber.GetUglyNumber_Solution(8);
        int result1=uglyNumber.GetUglyNumber_Solution1(3);
        System.out.println(result1);
    }
}

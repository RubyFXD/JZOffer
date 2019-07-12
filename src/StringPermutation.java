/**
 * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。
 * 例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
 */

import java.util.ArrayList;
import java.util.Collections;

/**
 * 字符串+递归
 *
 * 将字符串的第一个字符分别与后面的所有字符交换
 *
 * 固定字符串的第一个字符，然后排列后边的子字符串；然后固定子字符串中的第一个字符，排列后边子字符串，进行递归
 *
 * 直到只子字符串只剩下一个字符，递归结束
 *
 */
public class StringPermutation {

    public ArrayList <String> Permutation(String str) {
        ArrayList<String> result= new ArrayList<String>();
        if(str.length()==0){
            return result;
        }
        char[] chars=str.toCharArray();
        stringPermutation(result,0, chars);
        //按字典顺序排列输出
        Collections.sort(result);
        return result;
    }

    private void stringPermutation(ArrayList<String> result, int i, char[] chars){
        //递归结束条件
        if(i==chars.length-1){
            if(!result.contains(new String (chars))){
                result.add(new String(chars));
                return;
            }
        }else{
            for(int j=i;j<chars.length;j++){
                //将当前字符串中第一个字符与后面所有字符进行交换
                swap(i,j,chars);
                //递归到最小规模
                stringPermutation(result,i+1,chars);
                //将第一个字符交换回来
                swap(i,j,chars);
            }
        }
    }
    private void swap(int i, int j, char[] chars){
        char temp;
        temp=chars[i];
        chars[i]=chars[j];
        chars[j]=temp;
    }

    public static void main(String[] args) {
        StringPermutation sp=new StringPermutation();
        ArrayList<String> result=sp.Permutation("abc");
        for(String s:result){
            System.out.println(s);
        }
    }

}

/**
 * 在一个二维数组中（每个一维数组的长度相同），
 * 每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */

public class Search2DArray {
    /**
     *
     * @param target
     * @param array
     * @return
     * 二维矩阵是有序的，同一行右>左，同一列下>上------取左下角或者右上角遍历
     * e.g. 取右下角开始遍历
     *      如果array[row][col]>target, target在同行的左边(col--)
     *      如果array[row][col]<target, target在同列的下边(row++)
     */
    public boolean Find(int target, int [][] array) {

        int row=0;
        int col=array[0].length-1;

        while(row<array.length && col>=0){
            if(target==array[row][col]) {
                return true;
            }else if(target>array[row][col]){
                row++;
            }else{
                col--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int [][] array={{1,2,3},{4,5,6},{7,8,9},{10,11,16}};
        int target=11;

        Search2DArray test=new Search2DArray();
        System.out.println(test.Find(target,array));
    }
}

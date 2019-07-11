/**
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */

public class StringReplaceSpace {
    public String replaceSpace(StringBuffer str) {
        String s= str.toString();
        String result=s.replaceAll("\\s","%20");
        return result;
    }

    public static void main(String[] args) {
        StringBuffer buffer=new StringBuffer();
        buffer.append("hi hellow world ! !");
        StringReplaceSpace test=new StringReplaceSpace();
        System.out.println(test.replaceSpace(buffer));
    }
}

/**
 * @Version 1.0
 * @Author:LiuXinYu
 * @Date:2020/5/15
 * @Content:
 */
public class TestDemo2 {
    //StringBuffer以及StringBuilder 的区别
    //StringBuilder和String一般用于单线程情况下
    //StringBuffer一般用于多线程  确保线程安全



    //String StringBuffer StringBuilder 的区别
    //1.String的拼接会产生大量的临时对象  StringBuffer以及StringBuilder不会
    //2.String的拼接会被优化为StringBuilder的append（）
    //3.后两者当中一些方法是String不具备的
    public static void main(String[] args) {
        //StringBuffer stringBuffer = new StringBuffer();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("abcd");
        stringBuilder.append("efg").append("1234");
        System.out.println(stringBuilder);

        StringBuffer sb2 = new StringBuffer();
        sb2.append("hello");
        sb2.reverse();
        System.out.println(sb2);
    }



    public static void main1(String[] args) {
//        String str = "abcdef";
//        str = str + "hello";
//        System.out.println(str);
        String str = "";
        for (int i = 0; i < 10; i++) {
            str += 'a';
        }
        System.out.println(str);//这种字符串的拼接 会产生大量临时变量
    }
}

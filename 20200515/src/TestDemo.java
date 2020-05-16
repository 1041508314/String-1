import java.util.Scanner;

/**
 * @Version 1.0
 * @Author:LiuXinYu
 * @Date:2020/5/15
 * @Content:
 */
public class TestDemo {
    public static String func(String str,int n){
        if(str == null || n <= 0 || n >= str.length()){
            return null;
        }
        str = reverse(str,0,n-1);
        str = reverse(str,n,str.length()-1);
        str = reverse(str,0,str.length()-1);
        return str;
    }
    public static void main(String[] args) {//从指定位置分割后 前半段和后半段换位置
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String str = scan.next();
        String ret = func(str,n);
        System.out.println(ret);
    }




    public static  String reverse(String str,int begin,int end){
        char[] val = str.toCharArray();
        while(begin < end){
            char tmp = val[begin];
            val[begin] = val[end];
            val[end] = tmp;
            begin++;
            end--;
        }
//        return new String(val);
        return String.copyValueOf(val);
    }
    public static void main15(String[] args) {
        String str = "abcdefg";
        String ret = reverse(str,0,str.length()-1);
        System.out.println(ret);
    }



    public static void main14(String[] args) {
        String str = "abcdefAbc";
        String ret = str.toLowerCase();
        System.out.println(ret.length());//length是个方法

        int[] array = {1,2,3,4,5};
        System.out.println(array.length);//length是属性
    }



    public static void main13(String[] args) {
        String str = "abcdefAbc";
        String ret = str.toLowerCase();//全变为小写
        //str.toUpperCase()//全变为大写
        //且只对字母有效
        System.out.println(ret);
    }



    public static void main12(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] strings1 = str.split(" ");
        for (String s : strings1) {
            System.out.print(s);
        }
    }



    /**
     *
     * 分割多次
     * @param args
     */
    public static void main11(String[] args) {
        String str = "name=zhangsan&age=18";
        String[] strings1 = str.split("&");
        //[name=zhangsan]    [age=18]
        //       0               1
        for (String s1 : strings1) {
            String[] strings2 = s1.split("=");
            for (String s2:strings2) {
                System.out.println(s2);
            }
        }
    }




    public static void main10(String[] args) {
        String str = "192.168.1.1";
        String[] strings = str.split("\\.");//对于 .$|()[{^?* 处理的时候加个\\   特殊的转义字符
        for (String s: strings) {
            System.out.println(s);
        }
    }



    public static void main9(String[] args) {
        String str = "abc de f";
        String[] strings = str.split(" ",2);// abc  de  f   以什么标准进行字符串拆分  分几组
        for (String s: strings) {
            System.out.println(s);
        }
    }




    public static void main8(String[] args) {
        String str = "ababcabcdabcde";
        boolean flg = str.endsWith("abc");//判断是不是这个字符串结尾的
        System.out.println(flg);
    }


    public static void main7(String[] args) {
        String str = "ababcabcdabcde";
        boolean flg = str.startsWith("abc",2);//从指定位置开始 判断是否以指定字符串开头的
        System.out.println(flg);
    }


    public static void main6(String[] args) {
        String str = "ababcabcdabcde";
        boolean flg = str.startsWith("ab");//判断是否以指定字符串开头的
        System.out.println(flg);
    }


    public static void main5(String[] args) {
        String str = "ababcabcdabcde";
        int flg = str.lastIndexOf("abc",3);//从指定位置开始 从后往前找
        System.out.println(flg);
    }


    public static void main4(String[] args) {
        String str = "ababcabcdabcde";
        int flg = str.lastIndexOf("abc");//从后往前找
        System.out.println(flg);
    }


    public static void main3(String[] args) {
        String str = "ababcabcdabcde";
        int flg = str.indexOf("abc",2);//从指定位置开始找
        System.out.println(flg);
    }


    public static void main2(String[] args) {
        String str = "ababcabcdabcde";
        int flg = str.indexOf("abc");//从头开始找这个字符串 找到了返回索引 找不到返回-1
        System.out.println(flg);
    }


    public static void main1(String[] args) {
        String str = "ababcabcdabcde";
        boolean flg = str.contains("abc");//查询是否包含这个字符
        System.out.println(flg);
    }
}

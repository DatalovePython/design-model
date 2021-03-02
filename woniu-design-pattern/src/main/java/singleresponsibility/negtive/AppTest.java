package singleresponsibility.negtive;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * @author luzc
 * @date 2021/3/2 16:25
 * @desc 统计一个文本文件种有多少个字符
 */
public class AppTest {
    public static void main(String[] args) throws IOException {

        // 字节流不查码表，字符流查码表

        // 字符流
        // Reader 默认查询的码表是与操作系统一致的码表，我们的操作系统是中文，所以Reader就会使用GBK码表
        // 而GBK码表一个汉字占2字节，且汉字的两个字节最高位都是1 utf-8 3字节，unicode 2字节
        Reader in = new FileReader("D:\\Project\\dev\\back-end\\design-model\\design-model" +
                "\\woniu-design-pattern\\src\\main\\java\\singleresponsibility\\readme.txt");

//        int n = in.read();
        // 有多少字符
//        int n;
//        int count = 0;
//        while((n = in.read()) != -1){
//            count++;
//        }
//        System.out.println(count);

        // 有多少单词
        BufferedReader br = new BufferedReader(in);

        StringBuilder sb = new StringBuilder("");
        String line;
        while ((line = br.readLine()) != null) {
            sb.append(line);
            sb.append("\n");
        }
        System.out.println(sb);
        String[] words = sb.toString().split(" ");
        for (String word : words) {
            System.out.println(word);
        }
        br.close();


        // char 查的是unicode码表 java只认unicode 顺序如下
        // 读取到记事本中的数字 - gbk - 单这个字 - 再用unicode转 - 21333
//        System.out.println(n + " " + (char) n);
//
//        in.close();

        //字节流
//        InputStream in = new FileInputStream("D:\\Project\\dev\\back-end\\design-model\\design-model" +
//                "\\woniu-design-pattern\\src\\main\\java\\singleresponsibility\\readme.txt");
//        int read = in.read();
//        System.out.println(read);
//        in.close();


        // 编码解码
        // 解码： 数字 -> 码表 -> 字符

        // 编码： 字符 -> 码表 -> 数字
//        String s = "单";
//        byte[] gbks = s.getBytes("gbk");
//        System.out.println(Arrays.toString(gbks));
//
//        // -2, -1 开头是 unicode码特有标志，java用的unicode码表，所以char 占用两个字节，即使一个字节就能满足
//        byte[] unicodes = s.getBytes("unicode");
//        System.out.println(Arrays.toString(unicodes));


    }
}

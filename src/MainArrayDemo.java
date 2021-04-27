/*
读取Java main函数的string数组，通过javac java命令编译并执行类文件
 */

public class MainArray {

    public static void main(String[] args){
        for (int i=0;i<args.length;i++) {
            System.out.println(args[i]);
        }
    }
}

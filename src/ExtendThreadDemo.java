//创建线程类的第一种方法：继承Thread类，调用run方法,可重写run方法

public class ExtendThreadDemo extends Thread {

    public void  run(){

        System.out.print("继承Thread类，重写run()方法");

    }

    public static void main(String[] args){

        ExtendThreadDemo tt = new ExtendThreadDemo();
         tt.run();
    }

}

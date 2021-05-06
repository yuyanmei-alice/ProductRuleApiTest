public class ThreadTest01 implements Runnable {
    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        System.out.print("实现Runnabel接口，重写run()方法");

    }
    public static void main(String[] arg){
        ThreadTest01 tt = new ThreadTest01();
        tt.run();

    }
}

package oe.stu.march;

/**
 * @Author： oe
 * @Description:
 * @Created by oe on 2018/3/12.
 */
public class JavaThreadCreationAndRun {
    public static void main(String[] args){
        System.out.println("The main method was executed by thread:"+Thread.currentThread().getName());
        Thread thread = new Thread(new Helper("cute girl in left"));
        thread.setName("let me see");
        thread.start();
    }
    static class Helper implements Runnable{
        private final String message;
        public Helper(String message){
            this.message = message;
        }
        private void doSomething(String message){
            System.out.println("THe doSomething was executed by Thread:"+Thread.currentThread().getName());
            System.out.println("Do something with:"+message);
        }
        @Override
        public void run(){
            doSomething("like learningb");
        }
    }
}

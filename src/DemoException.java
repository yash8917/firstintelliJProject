// how to create multithreaded application
class Mythread67 extends Thread{
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Mythread "+i);
        }
    }
}
public class DemoException {
    public static void main(String[] args) {
        Mythread67 obj=new Mythread67();
        obj.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread  "+i);
        }

    }

}

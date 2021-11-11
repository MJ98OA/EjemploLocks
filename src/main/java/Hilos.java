import java.util.Random;

public class Hilos extends Thread{

    Random r=new Random();
    int id=r.nextInt();

    @Override
    public void run(){
        Main.atenderAlHilo(this);
    }
}

import java.util.concurrent.locks.ReentrantLock;

public class Main {

    static ReentrantLock lock = new ReentrantLock();
    public static void main(String[] args){
        for(int i=0;i<15;i++){
            Hilos l=new Hilos();
            l.start();

        }

    }

    public static void atenderAlHilo(Hilos Hilos){
        try {
            //el primero que llega pasa
            System.out.println("He llegado" +Hilos.id);
            //esto haria lo mismo que el syncronice cuando acabe tendremos que darle el unlock
            lock.lock();

            System.out.println("Estoy trantando al hilo"+Hilos.id);
            Thread.sleep(1000);
            System.out.println("He terminado de tratar al hilo"+Hilos.id);

            lock.unlock();

        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

/**
 * @since 14/11/2025
 * @author Francesco Cantarella
 * @version 1
 * @see Telaio
 * <p> qusta classe rapresenta la fase in cui si mette la corda sulla rachetta</p>
 */


public class Corde extends Thread {
    @Override
    public void run() {
        System.out.println("inizio produzione del corda");
        try {
            System.out.println("corda: corde messe");
            sleep(3000);
            System.out.println("corda: corde messe in tenzione");
            sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("la corda è stata completata");

    }
}

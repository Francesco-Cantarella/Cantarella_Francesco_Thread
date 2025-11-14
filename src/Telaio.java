/**
 * @since 14/11/2025
 * @author Francesco Cantarella
 * @version 1
 * @see Corde
 * <p> qusta classe rapresenta la fase in cui si costuisce il telaio della rachetta</p>
 */

public class Telaio extends Thread {
    @Override
    public void run() {
        System.out.println("inizio produzione del telaio");
        /**
         * @throws InterruptedException eorre esegunzione thead telaio
         */

        try {
            System.out.println("telaio: telio stato motato");
            sleep(3000);
            System.out.println("telaio: telaio e stato verniciato");
            sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("il telatio è stata completato");

    }
}
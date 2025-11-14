/**
 * @since 14/11/2025
 * @author Francesco Cantarella
 * @version 1
 * @see Corde
 * @see Telaio
 * <p> qusta classe rapresenta tutta la crezione della racetta</p>
 */

    public static void main(String[] args) {
    System.out.println("inizio produzione della rachetta da tennis");
    System.out.println("");
    Thread faseTelaio = new Telaio();
    Thread faseIncordatura = new Corde();
    System.out.println("avvio delle fasi di produzione in corso");
    faseTelaio.start();
    faseIncordatura.start();
    /**
     * @throws InterruptedException eorre durante lo start del tread
     */
    try {
        faseTelaio.join();
    } catch (InterruptedException e) {
        System.out.println("produzione della racetta interota");
        System.out.println("");
        throw new RuntimeException(e);
    }
    /**
     * @throws InterruptedException eorre durante lo start del tread
     */
    try {
        faseIncordatura.join();
    } catch (InterruptedException e) {
        System.out.println("produzione della racetta interota");
        System.out.println("");
        throw new RuntimeException(e);
    }
    }


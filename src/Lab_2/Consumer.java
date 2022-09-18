package lab2;

public class Consumer {
    public void consume(Warehouse wh) throws InterruptedException {
        while (true) {
            synchronized (wh.getLock()) {

                while (wh.getQueue().size() == 0) {
                    wh.getLock().wait();
                }
                Products pr = wh.getQueue().poll();
                System.out.println(pr + " взят со склада");
                System.out.println("Количество продуктов на складе: " + wh.getQueue().size());
                wh.getLock().notify();
            }

            Thread.sleep(1000);
        }
    }
}
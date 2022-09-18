package lab2;

public class Producer {
    private int i = 0;

    public void produce(Warehouse wh) throws InterruptedException {
        while (true) {
            synchronized (wh.getLock()) {
                while (wh.getQueue().size() == wh.getLimit()) {
                    wh.getLock().wait();
                }
                Products pr = new Products(i);
                wh.getQueue().offer(pr);
                System.out.println("Произведен: " + pr);
                i++;
                wh.getLock().notify();
            }
        }
    }
}
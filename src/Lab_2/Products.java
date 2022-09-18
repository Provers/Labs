package lab2;

public class Products {
    private int id;

    public Products(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Products{" +
                "id=" + id +
                '}';
    }
}
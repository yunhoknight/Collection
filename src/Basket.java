Basket<Integer> basket2 = new Basket<Integer>(1);
public class Basket {
    private Integer item;

    public Basket(Integer item) {
        this.item = item;
    }

    public Integer getItem() {
        return item;
    }

    public void setItem(Integer item) {
        this.item = item;
    }
}

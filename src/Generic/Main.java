package Generic;

class Flower {}
class Rose extends Flower {}
class RosePasta {}
class Basket<T extends Flower> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}

class Main {
    public static void main(String[] args) {
        Basket<Rose> roseBasket = new Basket<>();
//        Basket<RosePasta> rosePastaBasket = new Basket<>(); 제한된 제네릭
    }
}

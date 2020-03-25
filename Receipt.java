import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.DoubleStream;

class Receipt{
    List<Item> items;

    public Receipt() {
        this.items = new ArrayList<>();
    }

    public Receipt(List<Item> items) {
        this();
        this.items = items;
    }

    public void addItem(Item item){
        this.items.add(item);
    }

    public void deleteItem(int IDitem){
        this.items.stream().filter(x -> x.getId() == IDitem).findFirst().ifPresent(item -> this.items.remove(item));
    }

    public double totalAmount(){
        return this.items.stream().flatMapToDouble(x-> DoubleStream.of(x.getPrice())).sum();
    }

    public double totalTaxReturn(){
        return this.items.stream().flatMapToDouble(x-> DoubleStream.of(x.taxReturn())).sum();
    }

    public Item mostExpensiveItem(){
        return this.items.stream().max(Comparator.comparing(Item::getPrice)).get();
    }
}
//list class
import java.util.ArrayList;

class List {
    private ArrayList<Data> inventoryList;
    private int size;

    public List(){
        inventoryList = new ArrayList<Data>();
        size = 0;
    }

    public void append(Data newdata) {
        inventoryList.add(newdata);
        size++;
    }

    public void delete(int index) {
        if (index >= 0 && index < size) {
            inventoryList.remove(index);
            System.out.println("It has been removed.");
            size--;
        }
        else {
            System.out.println("Sorry! This item doesn't exist.");
        }
    }
    public int getSize(){
        return size;
    }

    public Data getData(int index) {
        return inventoryList.get(index);
    }
    public void print() {
        if (size == 0) {
            System.out.println("Oops! You have no items.");
        } 
        else {
            System.out.printf("Printing all %d items:\n", size);

            int counter = 1;
            for (Data item:inventoryList) {
                System.out.printf("%d. ",counter++);
                item.print();
            }
        }

    }
}
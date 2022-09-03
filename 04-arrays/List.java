import java.util.ArrayList;

class List {
    ArrayList<String> groceries;

    public List(ArrayList<String> list) {
        groceries = list;
        System.out.println("Created the following list: " + groceries);
    }

    public void addItem(String item) {
        System.out.println("Try to add " + item + " to the list");
        if (groceries.indexOf(item) == -1) {
            groceries.add(item);
            System.out.println("Added " + item + " to the list");
        } else {
            System.out.println(item + " is already added to the list");
        }
        viewList();
    }

    public void removeItem(String item) {
        System.out.println("Try to remove " + item + " to the list");
        if (groceries.indexOf(item) != -1) {
            groceries.remove(item);
            System.out.println("Removed " + item + " to the list");
        } else {
            System.out.println(item + " not found on the list");
        }
        viewList();
    }

    public void changeItem(String oldItem, String newItem) {
        System.out.println("Changing " + oldItem +" for " + newItem);
        int selectedIndex = groceries.indexOf(oldItem);
        groceries.set(selectedIndex, newItem);
        viewList();
    }

    public void viewList() {
        System.out.println("Your list: " + groceries);
        System.out.println("You have " + groceries.size() + " items on your list");
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Manzana");
        list.add("Leche");
        list.add("Pollo");

        List list1 = new List(list);

        list1.addItem("Banana");
        list1.addItem("Fideos");
        list1.addItem("Fideos");
        list1.addItem("Naranaja");
        list1.removeItem("Banana");
        list1.removeItem("Banana");
        list1.changeItem("Manzana", "Kiwi");
    }

}
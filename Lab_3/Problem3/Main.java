package Lab_3.Problem3;

public class Main {
    public static void main(String[] args) {
        MyCollection collection = new MyList();

        collection.add("Apple");
        collection.add("Banana");

        System.out.println(collection.contains("Apple")); 
        System.out.println(collection.size()); 

        collection.remove("Apple");
        System.out.println(collection.size()); 

        collection.clear();
        System.out.println(collection.size()); 
    }
}
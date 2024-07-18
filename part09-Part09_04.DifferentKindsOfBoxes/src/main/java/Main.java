

public class Main {

    public static void main(String[] args) {
        OneItemBox box = new OneItemBox();
        box.add(new Item("Saludo", 5));
        box.add(new Item("Pirkka", 5));

        System.out.println(box.isInBox(new Item("Saludo")));
        System.out.println(box.isInBox(new Item("Pirkka")));
        
        MisplacingBox box1 = new MisplacingBox();
        box1.add(new Item("Saludo", 5));
        box1.add(new Item("Pirkka", 5));
        //System.out.println("---------");

        System.out.println(box1.isInBox(new Item("Saludo")));
        System.out.println(box1.isInBox(new Item("Pirkka")));
    }
}

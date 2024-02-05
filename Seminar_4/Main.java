import customarray.MyList;
import customarray.impl.MyArrayList;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyArrayList<>();
        myList.add(66);
        myList.add(1);
        myList.add(2);
        myList.add(18);
        myList.add(-9);
        myList.add(7);
        System.out.println(myList);

        myList.remove(4);
        System.out.println(myList);

        System.err.println(myList.get(3));
        myList.remove(0);
        System.out.println(myList);

        myList.add(12);
        myList.add(21);
        myList.add(38);

        System.out.println(myList);
    }
}
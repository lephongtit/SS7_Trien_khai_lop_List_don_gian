public class MylistTest {
    public static void main(String[] args) {
        Mylist<Integer>integerMylist =new Mylist<Integer>();
        integerMylist.add(1);
        integerMylist.add(2);
        integerMylist.add(3);
        integerMylist.add(4);
        System.out.println("element 1: "+integerMylist.get(1));
        System.out.println("element 2: "+integerMylist.get(3));
        System.out.println("element 3: "+integerMylist.get(2));
        System.out.println("element 4: "+integerMylist.get(0));

    }
}

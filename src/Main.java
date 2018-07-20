import MyArrayList.MyArrayList;

public class Main {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<String>();
        list.put("one");
        list.put("two");
        list.put("three");
        list.put("four");
        System.out.println(list.showAll());
    }
}

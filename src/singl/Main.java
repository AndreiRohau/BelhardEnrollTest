package singl;

/**
 * Created by rohau.andrei on 24.05.2017.
 */
public class Main {
    public static void main(String[] args) {
//        LinkedList<String> list = new LinkedList<>();
//        list.add("hello worlds");
//        list.add("hi");
//        list.add("go");
//        list.add("hello_world");
//
//        System.out.println(list.get(0) + "  " + list.get(3));
//
//        System.out.println(list.contains("hello worlds"));
        Singl s = Singl.getInstance();
        s.setName(1);
        s.setPwrd(1);
        System.out.println("s");
        s.toString();
        System.out.println();

        Singl k = Singl.getInstance();
        k.setName(2);
        k.setPwrd(2);
        System.out.println("k");
        k.toString();
        System.out.println();


        Singl.setName(3);
        Singl.setPwrd(3);

        int n = Singl.getName();
        int p = Singl.getPwrd();
        System.out.println(n + "  " + p);

        s.toString();
        k.toString();

    }
}

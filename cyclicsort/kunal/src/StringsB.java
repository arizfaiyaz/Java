public class StringsB {
    public static void main(String[] args){
        String a = "Kunal";
        String b = "Kunal";

        // System.out.println(a == b);
        String name1 = new String("Kunal");
        String name2 = new String("Kunal");
        System.out.println(name1.equals(name2));  // this is method and it will givetrue because we user the .equals()
        System.out.println(name1 == name2); // false comparator


    }
}

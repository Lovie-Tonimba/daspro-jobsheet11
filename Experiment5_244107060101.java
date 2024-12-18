public class Experiment5_244107060101 {
    static void show (String str, int ... a){
        System.out.println("String: " + str);
        System.out.println("Number of arguments/parameters: " + a.length);

        for(int i : a){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    static void example(Object...exm){
        System.out.println("Example using Object");
        System.out.println("Number of object: " + exm.length);
        for(Object i: exm){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        show("Programming Fundamentals 2024", 100, 200);
        show("Information Technology ", 1, 2, 3, 4, 5);
        show("Informatics");
        example(2, "book", 4, "novel", 5, "magazine");
    }
}

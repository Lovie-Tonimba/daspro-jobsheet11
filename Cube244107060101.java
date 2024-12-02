import java.util.Scanner;
public class Cube244107060101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the side of the cube: ");
        int s = sc.nextInt();

        areaOfCube(s);
        volumeOfCube(s);
    }
    static void areaOfCube(int s){
        int area = 6 * (s * s);
        System.out.println("Total area of the cube = " + area);
    }
    static void volumeOfCube(int s){
        int volume = s * s * s;
        System.out.println("Total volume of the cube = " + volume);
    }
}

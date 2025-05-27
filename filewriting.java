import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class FileWriteExample {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text to write to file: ");
        String text = sc.nextLine();
        sc.close();
        FileWriter writer = new FileWriter("output.txt");
        writer.write(text);
        writer.close();
        System.out.println("Text written to output.txt");
    }
}
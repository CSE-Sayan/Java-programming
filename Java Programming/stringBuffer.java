import java.util.Scanner;

public class stringBuffer{
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("Hello");
        sb.append(" ");
        sb.append("World");
        String message = sb.toString();
        System.out.println(message);
    }
}

/**
 * Created by LaunchCode
 */
public class HelloWorld {
    //This is a main() method. The compiler will always start at main().
    //It also accepts a single argument of type String array.
    public static void main(String[] args) {
        //This method also contains the System.out.println that sends text to the terminal.
        //As well as calling the sayHello method below.
        System.out.println(sayHello());
    }

    public static String sayHello() {
        //This return statement sends our Hello, World! string to line 10
        return "Hello, World!";
    }
}

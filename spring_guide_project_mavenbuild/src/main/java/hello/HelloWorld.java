package hello;
import org.joda.time.LocalTime;

public class HelloWorld {
    public static void main(String[] args) {
	LocalTime localTime = new LocalTime();
        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());
    }
}

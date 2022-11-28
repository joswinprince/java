##
Functional interface is an interface that has only one abstract method

```
package functionalinterfaceexample;
@FunctionalInterface
public interface GreetingMessage {
public abstract void greet();
}

```



```
package functionalinterfaceexample;

public class Main {
	
public static void main(String[] args) {
	GreetingMessage g = new GreetingMessage() {
		
		@Override
		public void greet(String name) {
			// TODO Auto-generated method stub
			System.out.println("Greeting "+name);
		}
	}; 
	g.greet("joswin");
}

}
```
Implementing Lamdas for greeting message
```
	GreetingMessage g2 = (String name)->{
		System.out.println("Greeting "+name);
	};
	g2.greet("Bethan");
```

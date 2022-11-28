




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

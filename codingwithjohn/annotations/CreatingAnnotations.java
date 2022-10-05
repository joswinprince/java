import java.lang.reflect.Method;

public class CreatingAnnotations {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        Cat mycat = new Cat("stella");

        Cat newcat =new Cat("beebee");
        Dog newdog = new Dog("denim");
           // To check if the class is annotated with VeryImportant
           System.out.println("CreatingAnnotations executed");
        if(newcat.getClass().isAnnotationPresent(VeryImportant.class))
        {
            System.out.println("Cat class is anotated with VeryImportant");
        }
        else
        {
            System.out.println("Cat class is not anotated with VeryImportant"); 
        }
        if(newdog.getClass().isAnnotationPresent(VeryImportant.class))
        {
            System.out.println("Dog class is anotated with VeryImportant");
        }
        else
        {
            System.out.println("Dog class is not anotated with VeryImportant");   
        }
        // Loop through all class methods
        for(Method method :newdog.getClass().getDeclaredMethods()){
            // To check if the methods are annotated with Very Important
           if(method.isAnnotationPresent(VeryImportant.class))
           {
            System.out.println("Dog Method [ "+method.getName()+" ] is anotated with VeryImportant");
           }
           else
           {
            System.out.println("Dog Method [ "+method.getName()+" ] is not anotated with VeryImportant");   
           }
        }
    }
}

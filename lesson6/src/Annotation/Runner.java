package Annotation;

public class Runner {
    public static void main(String[] args) throws Exception{
        MyService service = new MyService();
        SearchAnnotationProgram.testMyService(service);
    }
}

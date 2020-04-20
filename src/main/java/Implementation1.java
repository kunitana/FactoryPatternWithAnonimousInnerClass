public class Implementation1 implements Service {
    //Constructor
    private Implementation1(){}

    //methods from Service interface
    public void method1() {System.out.println("Implementation1 method1"); }
    public void method2() {System.out.println("Implementation1 method2"); }

    public static ServiceFactory factory =
            new ServiceFactory() {
                public Service getService() {
                    return new Implementation1();
                }
            };
}

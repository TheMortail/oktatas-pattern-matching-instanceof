import static java.lang.StringTemplate.STR;

public class Main {
    public static void main(String[] args) {
        example1();//base
//        example2();//not instance
//        example3();//scope !
        example4();//scope && ||
    }

    public static void example1(){
        Customer customer = new Customer("FirstName","MiddleName","LastName");
        String name;

        if (customer instanceof Customer cu){
            name = STR."\{ cu.getFirstName() } \{ cu.getMiddleName() } \{ cu.getLastName() }";
        }else{
            name = "Name";
        }

        System.out.println(name);
    }

    public static void example2(){
//        Customer customer = new Customer();
//        if (customer instanceof String string){
//            System.out.println(string);
//        }
    }

    public static void example3(){
//        Object obj;
//        if (!(obj instanceof String s)){
//            System.out.println(s);
//        }
    }

    public static void example4(){
        String string = "abcd";
        if (string instanceof String s && s.startsWith("a")){
            System.out.println(s);
        }

//        if (string instanceof String s || s.startsWith("a")){
//            System.out.println(s);
//        }
    }
}
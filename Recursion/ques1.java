
public class ques1 {

    String printName(int n, String name){
        if(n==0){
            return "";
        }
        return name + " " + printName(n-1, name);
    }
    public static void main(String[] args) {
        ques1 q = new ques1();
        System.out.println(q.printName(5, "Alice"));
    }
}

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> learn = new LinkedList<String>();
        learn.push("we");
        learn.push("wiz");
        learn.push("wise");
        learn.push("wiser");
        learn.addLast( "was");
        learn.addFirst("hope");
        String first = learn.removeFirst();
        String last = learn.removeLast();
        //learn.pop();
        System.out.println(learn);



    }
}


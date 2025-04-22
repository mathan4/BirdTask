import bird.Fly;
import com.gensparkTasks.Linkedlist;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Fly> allBirds = new ArrayList<>();
        Linkedlist link=new Linkedlist();
        link.addListNodeToTheEndOfLinkedList(5);
        link.addListNodeToTheEndOfLinkedList(10);
        link.addListNodeToTheEndOfLinkedList(20);
        link.addListNodeToTheEndOfLinkedList(30);
        link.addListNodeToTheEndOfLinkedList(40);
//        link.addListNodeToTheEndOfLinkedList(50);

        link.traverseTheLinkedList();

        link.deleteMiddleElement();
        link.traverseTheLinkedList();
    }
}
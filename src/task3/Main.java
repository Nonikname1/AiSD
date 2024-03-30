package task3;

import java.io.File;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        SimpleLinkedQueue<Integer> queue = new SimpleLinkedQueue<>();
        Queue<Integer> queue2 = new LinkedList<>();
        SimpleLinkedQueue<Integer> queueSorted = new SimpleLinkedQueue<>();

        String fileInputName = "C:\\Task\\AiSD\\src\\input3.txt";
        File fileinput = new File(fileInputName);
        Scanner sc = new Scanner(fileinput);
        while (sc.hasNextInt()){
            int x = sc.nextInt();
            queue.add(x);
            queue2.add(x);
        }


        queueSorted = filterEven1(queue);
        while (!queueSorted.empty()){
            System.out.println(queueSorted.element());
            queueSorted.remove();
        }

        System.out.println();

        filterEven2(queue2);
        while (!queue2.isEmpty()) {
            System.out.println(queue2.poll());
        }
    }
    public static void filterEven2(Queue<Integer> queue) {
        int size = queue.size();
        for (int i = 0; i < size; i++) {
            int num = queue.poll();
            if (num % 2 == 0) {
                queue.add(num);
            }
        }
    }
    public static SimpleLinkedQueue<Integer> filterEven1(SimpleLinkedQueue<Integer> queue){
        SimpleLinkedQueue<Integer> queueSorted = new SimpleLinkedQueue<>();
        for (Integer v : queue){
            if (v % 2 == 0) {
                queueSorted.add(v);
            }
        }
        return queueSorted;
    }

}

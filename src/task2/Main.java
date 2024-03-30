package task2;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        String fileInputName = "C:\\Task\\AiSD\\src\\inputForTask2";
        File fileInput = new File(fileInputName);
        Scanner scanner = new Scanner(fileInput);

        SimpleLinkedList<String> linkedList = new SimpleLinkedList<>();
        SimpleLinkedList<String> linkedListLongestWord = new SimpleLinkedList<>();
        while (scanner.hasNextLine()) {
            String str = scanner.nextLine();
            String[] parts = str.split("[!?.,;:\\s]+");
            for (String word : parts) {
                linkedList.addLast(word);
            }
        }
        int maxLen = 0;
        for (int i = 0; i < linkedList.size(); i++) {
            if (linkedList.get(i).length() > maxLen){
                maxLen = linkedList.get(i).length();
                linkedListLongestWord.clear();
                linkedListLongestWord.addLast(linkedList.get(i));
            }
        }

        int i = 0;
        for (String v : linkedList) {
            System.out.print((i > 0 ? ", " : "")+v);
            i++;
        }

    }

}

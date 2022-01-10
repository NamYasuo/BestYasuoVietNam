
import java.util.HashMap;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class LetterAndCharacter {

    private String content;

    public LetterAndCharacter() {
    }

    public LetterAndCharacter(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void input() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your content: ");
            content = sc.nextLine();
        }
    }

    public void countWord() {
        String[] words = content.split(" ");
        HashMap<String, Integer> f = new HashMap<>();
        for (String e : words) {
            if (!f.containsKey(e)) {
                f.put(e, 1);
            } else {
                f.replace(e, f.get(e) + 1);
            }

        }
        System.out.println(f.toString());
    }

    public void countLetter() {
        HashMap<Character, Integer> f = new HashMap<>();
        for (Character c : content.toCharArray()) {
            if (c == ' ') {
                continue;
            }

            if (!f.containsKey(c)) {
                f.put(c, 1);
            } else {
                f.replace(c, f.get(c) + 1);
            }
            System.out.println(f.toString());

        }

    }
}

package task_4;

/*4.Учитывая строку, содержащую символы '(', ')', '{', '}', '[' и ']', определите,
является ли входная строка допустимой.
Входная строка действительна, если:
Открытые скобки должны быть закрыты скобками того же типа.
Открытые скобки должны быть закрыты в правильном порядке.
Обратите внимание, что пустая строка также считается допустимой.*/

import java.util.Scanner;
import java.util.Stack;

public class Task_4 {
    public void runTask4() {
        System.out.println("Пожалуйста, введите строку для проверки: ");
        Scanner scan = new Scanner(System.in);
        int res;
        boolean stat;
        for (int j = 0; j < 30; j++) {
            Stack<Character> stack = new Stack<>();
            stack.push(' ');
            String str = scan.nextLine();
            res = 1;
            stat = true;

            for (int i = 0; i < str.length(); i++) {
                switch (str.charAt(i)) {
                    case '(':
                    case '[':
                    case '{':
                        stack.push(str.charAt(i));
                        break;
                    case ')':
                        if ((stack.peek() != '(') || stack.empty()) {
                            stat = false;
                            break;
                        } else stack.pop();
                        break;
                    case ']':
                        if ((stack.peek() != '[') || stack.empty()) {
                            stat = false;
                            break;
                        } else stack.pop();
                        break;
                    case '}':
                        if ((stack.peek() != '{') || stack.empty()) {
                            stat = false;
                            break;
                        } else stack.pop();
                        break;
                }
                if (!stat) {
                    res = 0;
                    break;
                }
            }
            stack.pop();
            if (!stack.empty()) res = 0;

            if (res == 0){
                System.out.println("Код введён верно");
            }else {
                System.out.println("Код введён не верно");
            }
        }
    }
}
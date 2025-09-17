import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Использование встроенного Stack
        Stack<Integer> stack = new Stack<>();
        
        // Добавление элементов (push)
        stack.push(10);
        stack.push(20);
        stack.push(30);
        
        System.out.println("Стек: " + stack);
        
        // Извлечение элементов (pop) - LIFO
        System.out.println("Извлечено: " + stack.pop()); // 30
        System.out.println("Извлечено: " + stack.pop()); // 20
        
        // Просмотр верхнего элемента (peek)
        System.out.println("Верхний элемент: " + stack.peek()); // 10
        
        // Проверка на пустоту
        System.out.println("Стек пуст: " + stack.isEmpty());
    }
}
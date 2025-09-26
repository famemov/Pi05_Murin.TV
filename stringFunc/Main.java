package stringFunc;


public class Main {
    public static void main(String[] args) {
        // Пример с целыми числами
        System.out.println("=== Пример с Integer ===");
        LinearSinglyLinkedList<Integer> intList = new LinearSinglyLinkedList<>();
        
        intList.add(10);
        intList.add(20);
        intList.addFirst(5);
        intList.add(2, 15);
        
        intList.print(); // Список: 5 -> 10 -> 15 -> 20 -> null
        
        System.out.println("Размер: " + intList.size());
        System.out.println("Элемент по индексу 2: " + intList.get(2));
        System.out.println("Содержит 15: " + intList.contains(15));
        System.out.println("Индекс 20: " + intList.indexOf(20));
        
        intList.remove(Integer.valueOf(15));
        intList.print(); // Список: 5 -> 10 -> 20 -> null
        
        // Пример со строками
        System.out.println("\n=== Пример с String ===");
        LinearSinglyLinkedList<String> stringList = new LinearSinglyLinkedList<>();
        
        stringList.add("Яблоко");
        stringList.add("Банан");
        stringList.addFirst("Апельсин");
        stringList.add(2, "Виноград");
        
        stringList.print(); // Список: Апельсин -> Яблоко -> Виноград -> Банан -> null
        
        // Пример с пользовательским классом
        System.out.println("\n=== Пример с пользовательским классом ===");
        LinearSinglyLinkedList<Student> studentList = new LinearSinglyLinkedList<>();
        
        studentList.add(new Student("Иван", 20));
        studentList.add(new Student("Мария", 22));
        studentList.addFirst(new Student("Петр", 19));
        
        studentList.print();
    }
}

class Student {
    private String name;
    private int age;
    
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    @Override
    public String toString() {
        return name + "(" + age + ")";
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return age == student.age && name.equals(student.name);
    }
}
# Использование списка как стека
stack = []

# Добавление элементов (push)
stack.append(10)
stack.append(20)
stack.append(30)

print("Стек:", stack)

# Извлечение элементов (pop) - LIFO
print("Извлечено:", stack.pop())  # 30
print("Извлечено:", stack.pop())  # 20

# Просмотр верхнего элемента
if stack:
    print("Верхний элемент:", stack[-1])  # 10

# Проверка на пустоту
print("Стек пуст:", len(stack) == 0)
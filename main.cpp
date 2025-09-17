#include <iostream>
#include <stack>
#include <stdexcept>

using namespace std;

int main() {
    // Использование std::stack
    stack<int> st;
    
    // Добавление элементов
    st.push(10);
    st.push(20);
    st.push(30);
    
    cout << "Размер стека: " << st.size() << endl;
    
    // Извлечение элементов - LIFO
    cout << "Извлечено: " << st.top() << endl; // 30
    st.pop();
    cout << "Извлечено: " << st.top() << endl; // 20
    st.pop();
    
    // Проверка на пустоту
    cout << "Стек пуст: " << st.empty() << endl;
    
    return 0;
}
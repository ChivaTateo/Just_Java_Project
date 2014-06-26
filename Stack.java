/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package just_java_project_1;

/**
 * Класс, реализующий стек на основе связного списка.
 * параметр T определяет класс элементов стека
 * @author Кирилл Климук
 * 
 */
public class Stack<T> 
{
    /**
     * Список элементов стека
     */
    private List<T> list;
    
    /**
     * Конструктор, создающий пустой список для стека
     */
    Stack()
    {
        list = new List();
    }
    
    /**
     * Кидает элемент в конец стека.
     * @param data значение элемента
     */
    void push(T data)
    {
        list.addEndElem(data);
    }
    
    /**
     * Получает текущий размер стека
     * @return размер стека
     */
    int getSize()
    {
        return list.getSize();
    }
    
    /**
     * Получает вершину стека(последний элемент)
     * @return вершина стека
     */
    T top()
    {
        return list.getData(list.getSize()-1);
    }
    
    /**
     * Убрать последний элемент из стека
     */
    void pop()
    {
        list.deleteEndElem();
    }
    
    /**
     * Очистить стек
     */
    void clear()
    {
        list.clear();
    }
}

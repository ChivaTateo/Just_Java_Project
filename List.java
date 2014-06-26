/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package just_java_project_1;

/**
 * Класс, реализующий список. 
 * Может добавить элемент в список, удалить его
 * или взять значение из элемента. 
 * Доступ к элементу происходит по его позиции в списке.
 * параметр T определяет класс элемента списка.
 * 
 * @author Кирилл Климук
 *
 */
public class List<T>
{
    /** 
     * Голова списка(начальный элемент)
     */
    private Node head;
    /**
     * Хвост списка(последний элемент)
     */
    private Node tail;
    /**
     * Размер списка
     */
    private int size;
    
    /**
     * Конструктор, создающий пустой список
     */
    List()
    {
        size = 0;
    }
    
    /**
     * Добавляет элемент в заданную позицию списка. 
     * Подсчет позиции идет с 0. 
     * Пример:
     * список: 1 2 3
     * Если выполнить addElem(10, 1), то список изменится так:
     * список: 1 10 2 3
     * @param data значение элемента
     * @param position позиция элемента
     */
    void addElem(T data, int position)
    {
       Node newElem = new Node(data);
       int number = 0;
       
       if (position < 0)
           position = 0;
       
       if (position >= size)
       {
            if (size == 0)
                head = newElem; 
            else 
                tail.setNext(newElem);
            tail = newElem;
            ++size;
            return;
       }
       
       Node cur = head;
       Node prev = null;

       while(cur != null && number != position)
       {
            prev = cur;
            cur = cur.getNext();
            ++number;
       }
       
       if (cur != null)
       {
            newElem.setNext(cur);
            if (cur == head)
                head = newElem;
            else
                prev.setNext(newElem);

            ++size;
       }     
    }
    
    /**
     * Добавляет элемент в конец списка.
     * Альтернатива addElem(data, 0)
     * 
     * @param data значение элемента
     */
    void addEndElem(T data)
    {
        Node newElem = new Node(data);
        if (size == 0)
            head = newElem; 
        else 
            tail.setNext(newElem);
        tail = newElem;
        ++size;
    }
    
    /**
     * Получает текущий размер списка.
     * @return размер списка
     */
    int getSize()
    {
        return this.size;
    }
    
    /**
     * Удаляет элемент из списка на заданной позиции.
     * @param position позиция элемента
     */
    void deleteElem(int position)
    {
        if (head == null)
            return;
        
        int number = 0;
        Node cur = head;
        Node prev = null;
        
        while(cur.getNext() != null && number != position)
        {
           prev = cur;
           cur = cur.getNext();
           ++number;
        }
        
        if (cur != null)
        {
            if (cur == head)
                head = head.getNext();
            else
                prev.setNext(cur.getNext());
            
            if(tail == cur)
            {
                tail = prev;
                if (tail != null)
                    tail.setNext(null);
            }
            
            --size;
        }
    }
    
    /**
     * Удаляет последний элемент из списка 
     */
    void deleteEndElem()
    {
        if (head == null)
            return;
        
        Node cur = head;
        Node prev = null;
        while (cur.getNext() != null)
        {
            prev = cur;
            cur = cur.getNext();
        }
        
        tail = prev;
        if (prev == null)
            head = head.getNext();
        else
            tail.setNext(null);
        --size;
    }
    
    /**
     * Получает значение элемента на заданной позиции.
     * Последовательно проходит весь список до нужного элемента
     * и берет значение из него.
     * @param position позиция
     * @return значение элемента
     */
    T getData(int position)
    {
        if (position > size - 1)
            position = size - 1;
        if (position < 0)
            position = 0;
        
        Node cur = head;
        for (int i = 0; i < position; ++i)
        {
            cur = cur.getNext();
        }
        return cur.getData();
    }

    /**
     * Очищает список.
     */
    void clear()
    {
        head = null;
        tail = null;
        size = 0;
        System.gc();
    }
    
    /** 
     * Класс элемента списка 
     */
    class Node
    {
        /**
         * значение элемента
         */
         private T data;
         /**
          * Следующий элемент
          */
         private Node next;
         
         /**
          * Конструктор, создающий пустой элемент
          */
         Node()
         {
         }
         
         /**
          * Конструктор, создающий элемент с заданным значением
          * @param data значение элемета
          */
         Node(T data) 
         {
            this.data = data;
         }
         
         /**
          * Получает значение элемента
          * @return значение элемента
          */
         T getData()
         {
             return data;
         }
         
         /**
          * Получает следующий элемент
          * @return следующий элемент
          */
         Node getNext()
         {
             return next;
         }
         
         /**
          * Меняет значение элемента на заданное
          * @param data новое значение элемента
          */
         void setData(T data)
         {
             this.data = data;
         }
         
         /**
          * Меняет следующий элемент
          * @param next новый следующий элемент
          */
         void setNext(Node next)
         {
             this.next = next;
         }

         
    }
}

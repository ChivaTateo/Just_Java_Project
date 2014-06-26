/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package just_java_project_1;

/**
 * Демонстрирующая программа списка и стека. 
 * 
 * @author Кирилл Климук
 */
public class Just_Java_Project_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Stack<Integer> stack = new Stack();
        List<Integer> list = new List();
        
        System.out.println("Демонстрация связного списка на Java.");
        System.out.println("Данный список способен:");
        System.out.println("Добавлять элемент в любую позицию списка");
        System.out.println("Удалять любой элемент по выбору его позиции");
        System.out.println("Получать требуемые данные из нужного узла списка.");   
        System.out.println("Нажмите Enter для продолжения!");
        try 
        {
            System.in.read();
        } 
        catch (Exception e) 
        {
        }
 
        System.out.println();
        System.out.println("Введем 10 значений в список:");
        for (int i = 0; i < 10; ++i)
        {
            list.addEndElem(i);
            System.out.print(i + " ");
        }
        
        System.out.println();
        System.out.println("Нажмите Enter для продолжения!");
        try 
        {
            System.in.read();
        } 
         catch (Exception e) 
        {
        }
        
        System.out.println("Удалим два последних элемента:");
        
        list.deleteEndElem();
        list.deleteEndElem();
        for (int i = 0; i < list.getSize(); ++i)
        {
            System.out.print(list.getData(i) + " ");
        }
        
        System.out.println();
        System.out.println("Нажмите Enter для продолжения!");
        try 
        {
            System.in.read();
        } 
         catch (Exception e) 
        {
        }
        System.out.println("Вставим в середину списка(позиция 3) число 10");
        
        list.addElem(10, 3);
        for (int i = 0; i < list.getSize(); ++i)
        {
            System.out.print(list.getData(i) + " ");
        }
        
        System.out.println();
        System.out.println("Нажмите Enter для продолжения!");
        try 
        {
            System.in.read();
        } 
         catch (Exception e) 
        {
        }
        System.out.println("Удалим 2 и 5 элемент:");
        
        list.deleteElem(1);
        list.deleteElem(3);
        for (int i = 0; i < list.getSize(); ++i)
        {
            System.out.print(list.getData(i) + " ");
        }
        
        System.out.println();
        System.out.println("Нажмите Enter для продолжения!");
        try 
        {
            System.in.read();
        } 
        catch (Exception e) 
        {
        }
        System.out.println("Получение данных используется при выводе и в демонстрации уже не нуждается :)");
        list.clear();
        System.gc();
        
        System.out.println("Теперь продемонстрируем стек.");
        System.out.println("Введем в него 4 значения, которые потом вытащим из стека и выведем в порядке вытаскивания.");
        
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        
        while(stack.getSize() != 0)
        {
            System.out.println(stack.top());
            stack.pop();
        }
        
        System.out.println();
        System.out.println("На этом демонстрация завершена.");
    
        try 
        {
            System.in.read();
        } 
         catch (Exception e) 
        {
        }
        // TODO code application logic here
    }
    
}

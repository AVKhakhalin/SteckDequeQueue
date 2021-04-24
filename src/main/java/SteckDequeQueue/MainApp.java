package SteckDequeQueue;

import java.util.*;

public class MainApp
{
    static Random random = new Random();
    final static int NUMBER_ADDED_ELEMENTS = 20;

    public static void main(String[] args)
    {
        System.out.println("\nДомашнее задание №4 студента университета GeekBrains Хахалина Андрея Владимировича\n");
        GeneralMethods generalMethods = new GeneralMethods(); // Создание класса с общими методами

        //region Решение задачи 4.1
        System.out.println("\nРЕШЕНИЕ ЗАДАЧИ 4.1:\n");
        /*
        Задание 4.1
        На основе данных объектного списка из задания 3.4 реализуйте простой стек и его базовые методы.
        Оцените время выполнения операций с помощью базового метода System.nanoTime().
        */
        // Создание простого стека с объектным списком
        Stack<Object_int> simpleStack = new Stack<>();
        // Добавление элементов в стек разными методами
        System.out.println("Добавление методом \"push\" в стек " + NUMBER_ADDED_ELEMENTS + generalMethods.textElements(NUMBER_ADDED_ELEMENTS) + " заняло " + generalMethods.createStack(simpleStack, NUMBER_ADDED_ELEMENTS) + " нс.");
        System.out.println("Добавление методом \"add\" в стек " + NUMBER_ADDED_ELEMENTS + generalMethods.textElements(NUMBER_ADDED_ELEMENTS) + " заняло " + generalMethods.createStackAdd(simpleStack, NUMBER_ADDED_ELEMENTS) + " нс.");
        // Чтение верхнего элемента стека
        System.out.println(generalMethods.getUpperElement(simpleStack));
        // Проверка стека на пустоту
        System.out.println(generalMethods.checkEmpty(simpleStack));
        // Вывод стека в консоль
        generalMethods.showStack(simpleStack);
        // Проверка стека на пустоту
        System.out.println(generalMethods.checkEmpty(simpleStack));
        //endregion----------------------------------------------------------------------------------------

        //region Решение задачи 4.2
        System.out.println("\n\nРЕШЕНИЕ ЗАДАЧИ 4.2:\n");
        /*
        Задание 4.2
        На основе данных объектного списка из задания 3.4 реализуйте простую очередь и его базовые методы.
        Реализуйте вспомогательные методы.
        Оцените время выполнения операций с помощью базового метода System.nanoTime().
        */
        // Создание простой очереди с объектным списком
        Queue<Object_int> simpleQueue = new LinkedList<>();
        // Добавление элементов в очередь методом add()
        generalMethods.createQueueAdd(simpleQueue, NUMBER_ADDED_ELEMENTS);
        // Просмотр первого элемента в очереди методом element()
        generalMethods.showFirstElementQueue(simpleQueue);
//ПРОВЕРИТЬ        // Удаление элемента из очереди методом remove()
        System.out.println("Удаление методом \"remove\" из очереди первого элемента заняло " + generalMethods.removeElementQueue(simpleQueue) + " нс.");
        // Добавление первого элемента в очереди методом offer()
        generalMethods.createQueueOffer(simpleQueue, NUMBER_ADDED_ELEMENTS);
        // Удаление первого элемента из очереди методом poll()
        generalMethods.deleteElementQueuePoll(simpleQueue);
        // Получение первого элемента очерди методом peek()
        generalMethods.showFirstElementQueuePeek(simpleQueue);
        // Вывод всей очереди с помощью метода poll()
        generalMethods.showAllElementsQueuePoll(simpleQueue);
        // Определение пустая ли очередь или нет методом isEmpty()
        generalMethods.determEmptyQueueIsEmpty(simpleQueue);
        //endregion----------------------------------------------------------------------------------------

        //region Решение задачи 4.3
        System.out.println("\n\nРЕШЕНИЕ ЗАДАЧИ 4.3:\n");
        /*
        Задание 4.3
        На основе данных объектного списка из задания 3.4 реализуйте простой дек и его базовые методы.
        Оцените время выполнения операций с помощью базового метода System.nanoTime().
        */
        // Создание простого дека на основе данных объектного списка
        Deque<Object_int> simpleDeque = new ArrayDeque<>();
        // Добавление элементов в дек методом add
        generalMethods.createDequeAdd(simpleDeque, NUMBER_ADDED_ELEMENTS);
        // Добавление элементов в дек методом addFirst
        generalMethods.createDequeAddFirst(simpleDeque, NUMBER_ADDED_ELEMENTS);
        // Добавление элементов в дек методом addLast
        generalMethods.createDequeAddLast(simpleDeque, NUMBER_ADDED_ELEMENTS);
        // Возвращение первого элемента дека методом getFirst
        generalMethods.DequeGetFirst(simpleDeque);
        // Возвращение последнего элемента дека getLast
        generalMethods.DequeGetLast(simpleDeque);
        // Удаление первых элементов дека методом removeFirst
        generalMethods.DequeRemoveFirst(simpleDeque, NUMBER_ADDED_ELEMENTS);
        // Удаление последних элементов дека методом removeLast
        generalMethods.DequeRemoveLast(simpleDeque, NUMBER_ADDED_ELEMENTS);
        // Удаление и вывод элементов дека методом poll
        generalMethods.DequeRemovePoll(simpleDeque, NUMBER_ADDED_ELEMENTS);
        // Проверка дека на наличие элементов методом isEmpty
        generalMethods.DequeIsEmpty(simpleDeque);
        // Добавление элементов в дек с помощью метода offer
        generalMethods.DequeOffer(simpleDeque, NUMBER_ADDED_ELEMENTS);
        // Удаление всех элементов дека с помощью метода clear
        generalMethods.DequeClear(simpleDeque);
        // Добавление элементов в начало дека с помощью метода offerFirst
        generalMethods.DequeOfferFirst(simpleDeque, NUMBER_ADDED_ELEMENTS);
        // Добавление элементов в начало дека с помощью метода offerLast
        generalMethods.DequeOfferLast(simpleDeque, NUMBER_ADDED_ELEMENTS);
        // Получение первого элемента из дека с помощью метода peekFirst
        generalMethods.DequePeekFirst(simpleDeque);
        // Получение первого элемента из дека с помощью метода peek
        generalMethods.DequePeek(simpleDeque);
        // Получение первого элемента из дека с помощью метода element
        generalMethods.DequeElement(simpleDeque);
        // Получение первого элемента из дека с помощью метода peekLast
        generalMethods.DequePeekLast(simpleDeque);
        // Получение и удаление первого элемента дека с помощью метода pollFirst
        generalMethods.DequePollFirst(simpleDeque);
        // Получение и удаление первого элемента дека с помощью метода pollLast
        generalMethods.DequePollLast(simpleDeque);
        // Получение и удаление первого попавшегося элемента дека с помощью метода removeFirstOccurrence
//        generalMethods.DequeRemoveFirstOccurrence(simpleDeque, NUMBER_ADDED_ELEMENTS);
        // Получение и удаление последнего попавшегося элемента дека с помощью метода removeLastOccurrence
//        generalMethods.DequeRemoveLastOccurrence(simpleDeque, NUMBER_ADDED_ELEMENTS);
        // Удаление элементов из дека методом remove()
        generalMethods.DequeRemove(simpleDeque, NUMBER_ADDED_ELEMENTS * 2);



        //endregion----------------------------------------------------------------------------------------

        //region Решение задачи 4.4
        System.out.println("\n\nРЕШЕНИЕ ЗАДАЧИ 4.4:\n");
        /*
        Задание 4.4
        Реализуйте приоритетную очередь на основе ссылочных типов данных, например, integer.
        Оцените время выполнения операций с помощью базового метода System.nanoTime().
        */
        // Создание приоритетной очереди
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        // Добавление элементов в приоритетную очередь
        generalMethods.priorityQueueAdd(priorityQueue, NUMBER_ADDED_ELEMENTS);
        // Вид приоритетной очереди
        generalMethods.priorityQueueShow(priorityQueue);
        //endregion----------------------------------------------------------------------------------------

        //region Решение задачи 4.5
        System.out.println("\n\nРЕШЕНИЕ ЗАДАЧИ 4.5:\n");
        /*
        Задание 4.5
        На основе данных из задания 4.1 и 4.2, реализуйте стек и очередь на базе связанного списка.
        Оцените время выполнения операций с помощью базового метода System.nanoTime().
         */
        // Создание стека на базе связанного списка
        OneLinkedStack oneLinkedStack = new OneLinkedStack();
        // Добавление элементов в стек
        int tempInt;
        long curTime = System.nanoTime();
        System.out.print("Добавленные элементы в стек: [");
        for (int i = 0; i < NUMBER_ADDED_ELEMENTS; i++)
        {
            tempInt = random.nextInt(NUMBER_ADDED_ELEMENTS);
            oneLinkedStack.push(tempInt);
            System.out.print(tempInt + (i == NUMBER_ADDED_ELEMENTS - 1 ? "]\n" : ", "));
        }
        System.out.println("    Создан стек из " + NUMBER_ADDED_ELEMENTS + generalMethods.textElements(NUMBER_ADDED_ELEMENTS) + " за " + (System.nanoTime() - curTime) + " нс.");
        // Отображение содержимого стека
        curTime = System.nanoTime();
        oneLinkedStack.show();
        System.out.println("    Отображение стека заняло " + (System.nanoTime() - curTime) + " нс.");
        // Удаление элементов стека
        if (oneLinkedStack.isEmpty() != true)
        {
            curTime = System.nanoTime();
            System.out.print("Удалены следующие элементы стека: [");
            for (int i = 0; i < NUMBER_ADDED_ELEMENTS; i++)
            {
                System.out.print(oneLinkedStack.pop().getNumber_int() + (oneLinkedStack.isEmpty() == true ? "]\n" : ", "));
            }
            System.out.println("    Удаление элементов стека заняло " + (System.nanoTime() - curTime) + " нс.");
        }
        // Проверка содержимого стека
        curTime = System.nanoTime();
        if (oneLinkedStack.isEmpty() == true)
        {
            System.out.println("Стек ПУСТ. Определено за " + (System.nanoTime() - curTime) + " нс.");
        }
        else
        {
            System.out.println("Стек НЕ ПУСТ. Определено за " + (System.nanoTime() - curTime) + " нс.");
        }

        // Создание очереди на базе связанного списка
        System.out.println();
        OneLinkedQueue oneLinkedQueue = new OneLinkedQueue();
        // Добавление элементов в очередь
        curTime = System.nanoTime();
        System.out.print("Добавленные элементы в очередь: [");
        for (int i = 0; i < NUMBER_ADDED_ELEMENTS; i++)
        {
            tempInt = random.nextInt(NUMBER_ADDED_ELEMENTS);
            oneLinkedQueue.insert(tempInt);
            System.out.print(tempInt + (i == NUMBER_ADDED_ELEMENTS - 1 ? "]\n" : ", "));
        }
        System.out.println("    Создана очередь из " + NUMBER_ADDED_ELEMENTS + generalMethods.textElements(NUMBER_ADDED_ELEMENTS) + " за " + (System.nanoTime() - curTime) + " нс.");
        // Отображение содержимого очереди
        curTime = System.nanoTime();
        oneLinkedQueue.show();
        System.out.println("    Отображение очереди заняло " + (System.nanoTime() - curTime) + " нс.");
        // Удаление элементов очереди
        if (oneLinkedQueue.isEmpty() != true)
        {
            curTime = System.nanoTime();
            System.out.print("Удалены все элементы из очереди: [");
            for (int i = 0; i < NUMBER_ADDED_ELEMENTS; i++)
            {
                System.out.print(oneLinkedQueue.pop().getNumber_int() + (oneLinkedQueue.isEmpty() == true ? "]\n" : ", "));
            }
            System.out.println("    Удаление всех элементов из очереди заняло " + (System.nanoTime() - curTime) + " нс.");
        }
        // Проверка содержимого очереди
        curTime = System.nanoTime();
        if (oneLinkedQueue.isEmpty() == true)
        {
            System.out.println("Очередь ПУСТА. Определено за " + (System.nanoTime() - curTime) + " нс.");
        }
        else
        {
            System.out.println("Очередь НЕ ПУСТА. Определено за " + (System.nanoTime() - curTime) + " нс.");
        }
        //endregion----------------------------------------------------------------------------------------
    }
}
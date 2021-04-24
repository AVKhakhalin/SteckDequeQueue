package SteckDequeQueue;

import java.util.*;

public class GeneralMethods
{
    Random random = new Random();
    long curTime;

    //region Методы для работы со стеком
    public long createStack(Stack<Object_int> curStack, int numberElements) // Добавление в стек элементов с помощью метода push
    {
        if (numberElements <= 0)
        {
            return 0;
        }
        curTime = System.nanoTime();
        for (int i = 0; i < numberElements; i++)
        {
            curStack.push(new Object_int(random.nextInt(numberElements)));
        }
        return (System.nanoTime() - curTime);
    }

    public long createStackAdd(Stack<Object_int> curStack, int numberElements) // Добавление в стек элементов с помощью метода Add
    {
        if (numberElements <= 0)
        {
            return 0;
        }
        curTime = System.nanoTime();
        for (int i = 0; i < numberElements; i++)
        {
            try
            {
                curStack.add(new Object_int(random.nextInt(numberElements)));
            }
            catch(Exception e)
            {
                System.out.println("Ошибка: Добавить новые элементы в стек не получилось.");
            }
        }
        return (System.nanoTime() - curTime);
    }

    public void showStack(Stack<Object_int> curStack) // Вывод содержимого стека
    {
        System.out.print("Содержимое стека: [");
        curTime = System.nanoTime();
        while(!curStack.isEmpty())
        {
            System.out.print(curStack.pop().getNumber_int());
            if (curStack.isEmpty() == true)
            {
                System.out.print("]\n");
            }
            else
            {
                System.out.print(", ");
            }
        }
        System.out.println("    На вывод стека потречено " + (System.nanoTime() - curTime) + " нс.");
    }

    public String getUpperElement(Stack<Object_int> curSteck) // Получение верхнего элемента стека
    {
        curTime = System.nanoTime();
        return "Верхний элемент стека " + curSteck.peek().getNumber_int() + " получен за " + (System.nanoTime() - curTime) + " нс.";
    }

    public String checkEmpty(Stack<Object_int> curStack) // Проверка стека на пустоту
    {
        curTime = System.nanoTime();
        if (curStack.isEmpty() == true)
        {
            return "Стек ПУСТОЙ. Выяснение этого вопроса заняло " + (System.nanoTime() - curTime) + " нс.";
        }
        else
        {
            return "Стек НЕ ПУСТОЙ. Выяснение этого вопроса заняло " + (System.nanoTime() - curTime) + " нс.";
        }
    }
    //endregion

    //region Методы для работы с очередью
    public void createQueueAdd(Queue<Object_int> curQueue, int numberElements) // Добавление в очередь элементов с помощью метода Add
    {
        if (numberElements <= 0)
        {
            System.out.println("Ошибка: Элементы в очередь не добавлены, потому что нужно указывать число элементов > 0.");
        }
        else
        {
            curTime = System.nanoTime();
            int tempInt;
            System.out.print("В очередь добавлены элементы: [");
            for (int i = 0; i < numberElements; i++)
            {
                try
                {
                    tempInt = random.nextInt(numberElements);
                    curQueue.add(new Object_int(tempInt));
                    System.out.print(tempInt + (i < numberElements - 1 ? ", " : "]\n    На добавление элементов потрачено " + (System.nanoTime() - curTime) + " нс.\n"));
                }
                catch(Exception e)
                {
                    System.out.println("Ошибка: Добавить элемент с индексом " + i + " в очередь не получилось.");
                    return;
                }
            }
        }
    }

    public long removeElementQueue(Queue<Object_int> curQueue) // Удаление элемента в очереди методом remove
    {
        curTime = System.nanoTime();
        try
        {
            curQueue.remove();
        }
        catch(Exception e)
        {
            System.out.println("Ошибка: Удалить элемент из очереди методом \"remove\" не получилось.");
        }
        return (System.nanoTime() - curTime);
    }

    public void showFirstElementQueue(Queue<Object_int> curQueue) // Просмотр первого элемента в очереди
    {
        curTime = System.nanoTime();
        try
        {
            System.out.print("Методом \"element\" получен первый элемент в очереди " + curQueue.element().getNumber_int() + " ");
        }
        catch(Exception e)
        {
            System.out.println("Ошибка: Удалить элемент из очереди методом \"element\" не получилось ");
        }
        System.out.println("за " + (System.nanoTime() - curTime) + " нс.");
    }

    public void createQueueOffer(Queue<Object_int> curQueue, int maxInt) // Добавление последнего элемента в очередь методом offer()
    {
        int tempInt = random.nextInt(maxInt);
        curTime = System.nanoTime();
        if (curQueue.offer(new Object_int(tempInt)) == true)
        {
            System.out.println("В очередь методом \"offer\" добавлен новый элемент " + tempInt + " за " + (System.nanoTime() - curTime) + " нс.");
        }
        else
        {
            System.out.println("В очередь методом \"offer\" не получилось добавить новый элемент " + tempInt + ". Потраченное время - " + (System.nanoTime() - curTime) + " нс.");
        }
    }

    public void deleteElementQueuePoll(Queue<Object_int> curQueue) // Удаление первого элемента в очереди методом poll()
    {
        Object_int curElement = curQueue.poll();
        curTime = System.nanoTime();
        if (curElement != null)
        {
            System.out.println("Из очереди методом \"poll\" удалён первый элемент " + curElement.getNumber_int() + " за " + (System.nanoTime() - curTime) + " нс.");
        }
        else
        {
            System.out.println("Из очереди методом \"poll\" НЕ ПОЛУЧИЛОСЬ удалить первый элемент. Потраченное время - " + (System.nanoTime() - curTime) + " нс.");
        }
    }

    public void showFirstElementQueuePeek(Queue<Object_int> curQueue) // Получение первого элемента из очереди методом peek()
    {
        Object_int curElement = curQueue.peek();
        curTime = System.nanoTime();
        if (curElement != null)
        {
            System.out.println("В очереди методом \"peek\" получен первый элемент " + curElement.getNumber_int() + " за " + (System.nanoTime() - curTime) + " нс.");
        }
        else
        {
            System.out.println("В очереди методом \"peek\" НЕ ПОЛУЧИЛОСЬ получить первый элемент. Потраченное время - " + (System.nanoTime() - curTime) + " нс.");
        }
    }

    public void showAllElementsQueuePoll(Queue<Object_int> curQueue) // Получением всех элементов очереди методом poll()
    {
        System.out.print("Текущее состояние очереди: [");
        while (curQueue.isEmpty() != true)
        {
            System.out.print(curQueue.poll().getNumber_int());
            if (curQueue.isEmpty() != true)
            {
                System.out.print(", ");
            }
            else
            {
                System.out.println("]");
            }
        }
    }

    public void determEmptyQueueIsEmpty(Queue<Object_int> curQueue) // Определение пустая ли очередь или нет
    {
        curTime = System.nanoTime();
        if (curQueue.isEmpty() == true)
        {
            System.out.println("Очередь ПУСТА. Определено за " + (System.nanoTime() - curTime) + " нс.");
        }
        else
        {
            System.out.println("Очередь НЕ ПУСТА. Определено за " + (System.nanoTime() - curTime) + " нс.");
        }
    }
    //endregion

    //region Методы для работы с деком
    public void createDequeAdd(Deque<Object_int> curDeque, int numberElements) // Добавление в дек элементов с помощью метода Add
    {
        if (numberElements <= 0)
        {
            System.out.println("Ошибка: Элементы в дек не добавлены, потому что нужно указывать число элементов > 0.");
        }
        else
        {
            curTime = System.nanoTime();
            int tempInt;
            System.out.print("В дек добавлены элементы: [");
            for (int i = 0; i < numberElements; i++)
            {
                tempInt = random.nextInt(numberElements);
                if (curDeque.add(new Object_int(tempInt)) == true)
                {
                    System.out.print(tempInt + (i < numberElements - 1 ? ", " : "]\n    На добавление элементов потрачено " + (System.nanoTime() - curTime) + " нс.\n"));
                }
                else
                {
                    System.out.println("Ошибка: Добавить элемент с индексом " + i + " в дек не получилось.");
                    return;
                }
            }
        }
    }

    public void createDequeAddFirst(Deque<Object_int> curDeque, int numberElements) // Добавление в начало дека элементов с помощью метода AddFirst
    {
        if (numberElements <= 0)
        {
            System.out.println("Ошибка: Элементы в дек не добавлены, потому что нужно указывать число элементов > 0.");
        }
        else
        {
            curTime = System.nanoTime();
            int tempInt;
            System.out.print("В начало дека добавлены элементы: [");
            for (int i = 0; i < numberElements; i++)
            {
                try
                {
                    tempInt = random.nextInt(numberElements);
                    curDeque.addFirst(new Object_int(tempInt));
                    System.out.print(tempInt + (i < numberElements - 1 ? ", " : "]\n    На добавление элементов потрачено " + (System.nanoTime() - curTime) + " нс.\n"));
                }
                catch (Exception e)
                {
                    System.out.println("Ошибка: Добавить элемент с индексом " + i + " в дек не получилось.");
                    return;
                }
            }
        }
    }

    public void createDequeAddLast(Deque<Object_int> curDeque, int numberElements) // Добавление в конец дека элементов с помощью метода AddLast
    {
        if (numberElements <= 0)
        {
            System.out.println("Ошибка: Элементы в дек не добавлены, потому что нужно указывать число элементов > 0.");
        }
        else
        {
            curTime = System.nanoTime();
            int tempInt;
            System.out.print("В конец дека добавлены элементы: [");
            for (int i = 0; i < numberElements; i++)
            {
                try
                {
                    tempInt = random.nextInt(numberElements);
                    curDeque.addLast(new Object_int(tempInt));
                    System.out.print(tempInt + (i < numberElements - 1 ? ", " : "]\n    На добавление элементов потрачено " + (System.nanoTime() - curTime) + " нс.\n"));
                }
                catch (Exception e)
                {
                    System.out.println("Ошибка: Добавить элемент с индексом " + i + " в дек не получилось.");
                    return;
                }
            }
        }
    }

    public void DequeGetFirst(Deque<Object_int> curDeque) // Получение первого элемента дека с помощью метода getFirst
    {
        curTime = System.nanoTime();
        int tempInt;
        System.out.print("Первый элемент дека: ");
        try
        {
            System.out.print(curDeque.getFirst().getNumber_int() + ". На его получение потрачено " + (System.nanoTime() - curTime) + " нс.\n");
        }
        catch (Exception e)
        {
            System.out.println("Дек пуст, поэтому первого элемента в нём нет.");
        }
    }

    public void DequeGetLast(Deque<Object_int> curDeque) // Получение последнего элемента дека с помощью метода getLast
    {
        curTime = System.nanoTime();
        int tempInt;
        System.out.print("Последний элемент дека: ");
        try
        {
            System.out.print(curDeque.getLast().getNumber_int() + ". На его получение потрачено " + (System.nanoTime() - curTime) + " нс.\n");
        }
        catch (Exception e)
        {
            System.out.println("Дек пуст, поэтому последнего элемента в нём нет.");
        }
    }

    public void DequeRemoveFirst(Deque<Object_int> curDeque, int numberElements) // Удаление первых элементов с помощью метода removeFirst
    {
        curTime = System.nanoTime();
        if (numberElements > 0)
        {
            System.out.print("Удаляемые первые элементы: [");
            for (int i = 0; i < numberElements; i++)
            {
                try
                {
                    System.out.print(curDeque.removeFirst().getNumber_int() + (i == numberElements - 1 ? "]\n" : ", "));
                }
                catch (Exception e)
                {
                    System.out.println("Удалить первый элемент " + (i + 1) + " раз не получилось.");
                    return;
                }
            }
            System.out.println("    Из дека удалено " + numberElements + " первых элементов за " + (System.nanoTime() - curTime) + " нс.");
        }
        else
        {
            System.out.println("Ошибка: Для удаления элементов нужно задать количество удаляемых элементов >0.");
        }
    }

    public void DequeRemoveLast(Deque<Object_int> curDeque, int numberElements) // Удаление последних элементов с помощью метода removeLast
    {
        curTime = System.nanoTime();
        if (numberElements > 0)
        {
            System.out.print("Удаляемые последние элементы: [");
            for (int i = 0; i < numberElements; i++)
            {
                try
                {
                    System.out.print(curDeque.removeLast().getNumber_int() + (i == numberElements - 1 ? "]\n" : ", "));
                }
                catch (Exception e)
                {
                    System.out.println("Удалить последний элемент " + (i + 1) + " раз не получилось.");
                    return;
                }
            }
            System.out.println("    Из дека удалено " + numberElements + " последних элементов за " + (System.nanoTime() - curTime) + " нс.");
        }
        else
        {
            System.out.println("Ошибка: Для удаления элементов нужно задать количество удаляемых элементов >0.");
        }
    }

    public void DequeRemovePoll(Deque<Object_int> curDeque, int numberElements) // Удаление и вывод элементов дека методом poll
    {
        curTime = System.nanoTime();
        if (numberElements > 0)
        {
            System.out.print("Удаляемые и выводимые элементы: [");
            for (int i = 0; i < numberElements; i++)
            {
                if (curDeque.isEmpty() == false)
                {
                    System.out.print(curDeque.poll().getNumber_int() + (i == numberElements - 1 ? "]\n" : ", "));
                }
                else
                {
                    System.out.println("Удалить и вывести элемент с индексом " + i + " не получилось.");
                }
            }
            System.out.println("    Из дека удалено и выведено в консоль " + numberElements + " элементов за " + (System.nanoTime() - curTime) + " нс.");
        }
        else
        {
            System.out.println("Ошибка: Для удаления и вывода элементов нужно задать количество удаляемых и выводимых элементов >0.");
        }
    }

    public void DequeIsEmpty(Deque<Object_int> curDeque) // Определение пуст ли дек или нет
    {
        curTime = System.nanoTime();
        if (curDeque.isEmpty() == true)
        {
            System.out.println("Теперь дек ПУСТ. Определено за " + (System.nanoTime() - curTime) + " нс.");
        }
        else
        {
            System.out.println("Теперь дек НЕ ПУСТ. Определено за " + (System.nanoTime() - curTime) + " нс.");
        }
    }

    public void DequeOffer(Deque<Object_int> curDeque, int numberElements) // Добавление элементов в дек с помощью метода Offer
    {
        if (numberElements <= 0)
        {
            System.out.println("Ошибка: Элементы в дек не добавлены, потому что нужно указывать число элементов > 0.");
        }
        else
        {
            curTime = System.nanoTime();
            int tempInt;
            System.out.print("В дек добавлены элементы: [");
            for (int i = 0; i < numberElements; i++)
            {
                try
                {
                    tempInt = random.nextInt(numberElements);
                    curDeque.offer(new Object_int(tempInt));
                    System.out.print(tempInt + (i < numberElements - 1 ? ", " : "]\n    На добавление элементов потрачено " + (System.nanoTime() - curTime) + " нс.\n"));
                }
                catch (Exception e)
                {
                    System.out.println("Ошибка: Добавить элемент с индексом " + i + " в дек не получилось.");
                    return;
                }
            }
        }
    }

    public void DequeClear(Deque<Object_int> curDeque) // Удаление всех элементов дека с помощью метода clear
    {
        if (curDeque.isEmpty() == true)
        {
            System.out.println("Дек пуст, в нём нечего удалять.");
        }
        else
        {
            curTime = System.nanoTime();
            curDeque.clear();
            System.out.println("Удалены все элементы дека за " + (System.nanoTime() - curTime) + " нс.");
        }
    }

    public void DequeOfferFirst(Deque<Object_int> curDeque, int numberElements) // Добавление элементов в начало дека с помощью метода OfferFirst
    {
        if (numberElements <= 0)
        {
            System.out.println("Ошибка: Элементы в дек не добавлены, потому что нужно указывать число элементов > 0.");
        }
        else
        {
            curTime = System.nanoTime();
            int tempInt;
            System.out.print("В начало дека добавлены элементы: [");
            for (int i = 0; i < numberElements; i++)
            {
                try
                {
                    tempInt = random.nextInt(numberElements);
                    curDeque.offerFirst(new Object_int(tempInt));
                    System.out.print(tempInt + (i < numberElements - 1 ? ", " : "]\n    На добавление элементов потрачено " + (System.nanoTime() - curTime) + " нс.\n"));
                }
                catch (Exception e)
                {
                    System.out.println("Ошибка: Добавить элемент с индексом " + i + " в дек не получилось.");
                    return;
                }
            }
        }
    }

    public void DequeOfferLast(Deque<Object_int> curDeque, int numberElements) // Добавление элементов в конец дека с помощью метода OfferLast
    {
        if (numberElements <= 0)
        {
            System.out.println("Ошибка: Элементы в дек не добавлены, потому что нужно указывать число элементов > 0.");
        }
        else
        {
            curTime = System.nanoTime();
            int tempInt;
            System.out.print("В конец дека добавлены элементы: [");
            for (int i = 0; i < numberElements; i++)
            {
                try
                {
                    tempInt = random.nextInt(numberElements);
                    curDeque.offerFirst(new Object_int(tempInt));
                    System.out.print(tempInt + (i < numberElements - 1 ? ", " : "]\n    На добавление элементов потрачено " + (System.nanoTime() - curTime) + " нс.\n"));
                }
                catch (Exception e)
                {
                    System.out.println("Ошибка: Добавить элемент с индексом " + i + " в дек не получилось.");
                    return;
                }
            }
        }
    }

    public void DequePeekFirst(Deque<Object_int> curDeque) // Получение первого элемента из дека с помощью метода peekFirst
    {
        if (curDeque.isEmpty() == true)
        {
            System.out.println("Дек пуст, получить первый элемент невозможно.");
        }
        else
        {
            curTime = System.nanoTime();
            System.out.println("Методом \"peekFirst\" получен первый элемент дека " + curDeque.peekFirst().getNumber_int() + " за " + (System.nanoTime() - curTime) + " нс.");
        }
    }

    public void DequePeek(Deque<Object_int> curDeque) // Получение первого элемента из дека с помощью метода peek
    {
        if (curDeque.isEmpty() == true)
        {
            System.out.println("Дек пуст, получить первый элемент невозможно.");
        }
        else
        {
            curTime = System.nanoTime();
            System.out.println("Методом \"peek\" получен первый элемент дека " + curDeque.peek().getNumber_int() + " за " + (System.nanoTime() - curTime) + " нс.");
        }
    }

    public void DequeElement(Deque<Object_int> curDeque) // Получение первого элемента из дека с помощью метода element
    {
        if (curDeque.isEmpty() == true)
        {
            System.out.println("Дек пуст, получить первый элемент невозможно.");
        }
        else
        {
            curTime = System.nanoTime();
            System.out.println("Методом \"element\" получен первый элемент дека " + curDeque.element().getNumber_int() + " за " + (System.nanoTime() - curTime) + " нс.");
        }
    }

    public void DequePeekLast(Deque<Object_int> curDeque) // Получение последнего элемента из дека с помощью метода peekLast
    {
        if (curDeque.isEmpty() == true)
        {
            System.out.println("Дек пуст, получить последний элемент невозможно.");
        }
        else
        {
            curTime = System.nanoTime();
            System.out.println("Методом \"peekLast\" получен последний элемент дека " + curDeque.peekLast().getNumber_int() + " за " + (System.nanoTime() - curTime) + " нс.");
        }
    }

    public void DequePollFirst(Deque<Object_int> curDeque) // Получение и удаление первого элемента дека с помощью метода pollFirst
    {
        curTime = System.nanoTime();
        try
        {
            System.out.print("Из дека получен и удалён первый элемент " + curDeque.pollFirst().getNumber_int() + " за " + (System.nanoTime() - curTime) + " нс.\n");
        }
        catch (Exception e)
        {
            System.out.println("Ошибка: Получить и удалить первый элемент не получилось.");
        }
    }

    public void DequePollLast(Deque<Object_int> curDeque) // Получение и удаление первого элемента дека с помощью метода pollLast
    {
        curTime = System.nanoTime();
        try
        {
            System.out.print("Из дека получен и удалён последний элемент " + curDeque.pollLast().getNumber_int() + " за " + (System.nanoTime() - curTime) + " нс.\n");
        }
        catch (Exception e)
        {
            System.out.println("Ошибка: Получить и удалить последний элемент не получилось.");
        }
    }

/*    public void DequeRemoveFirstOccurrence(Deque<Object_int> curDeque, int numberElements) // Получение и удаление первого попавшегося элемента дека с помощью метода removeFirstOccurrence
    {
        curTime = System.nanoTime();
        int tempInt = random.nextInt(numberElements);
        Object_int objectToDel = new Object_int(tempInt);
        try
        {
            boolean result = curDeque.removeFirstOccurrence(objectToDel);
            System.out.println(result);
            if (result == true)
            {
                System.out.print("Из дека удалён первый повстречавшийся элемент с начала " + tempInt + " за " + (System.nanoTime() - curTime) + " нс.\n");
            }
            else
            {
                System.out.print("В деке нет элемента " + tempInt + ", чтобы его можно было удалить. Потраченное время " + (System.nanoTime() - curTime) + " нс.\n");
            }
        }
        catch (Exception e)
        {
            System.out.println("Ошибка: Удалить первый повстречавшийся элемент с начала " + tempInt + " из дека не получилось.");
        }
    }

    public void DequeRemoveLastOccurrence(Deque<Object_int> curDeque, int numberElements) // Получение и удаление последнего попавшегося элемента дека с помощью метода removeLastOccurrence
    {
        curTime = System.nanoTime();
        int tempInt = random.nextInt(numberElements);
        try
        {
            if (curDeque.removeLastOccurrence(new Object_int(tempInt)) == true)
            {
                System.out.print("Из дека удалён первый повстречавшийся элемент от конца " + tempInt + " за " + (System.nanoTime() - curTime) + " нс.\n");
            }
            else
            {
                System.out.print("В деке нет элемента " + tempInt + ", чтобы его можно было удалить. Потраченное время " + (System.nanoTime() - curTime) + " нс.\n");
            }
        }
        catch (Exception e)
        {
            System.out.println("Ошибка: Удалить первый повстречавшийся элемент от конца " + tempInt + " из дека не получилось.");
        }
    }

 */
    public void DequeRemove(Deque<Object_int> curDeque, int numberElements) // Удаление элементов дека с помощью метода remove
    {
        if (numberElements <= 0)
        {
            System.out.println("Ошибка: Элементы из дека не удалены, потому что нужно указывать число элементов > 0.");
        }
        else
        {
            curTime = System.nanoTime();
            for (int i = 0; i < numberElements; i++)
            {
                try
                {
                    curDeque.remove();
                }
                catch (Exception e)
                {
                    if (i > 0)
                    {
                        System.out.print("Из дека удалено " + i + textElements(i) + " за " + (System.nanoTime() - curTime) + " нс.\n");
                    }
                    System.out.println("    Удалить элемент с индексом " + i + " из дека не получилось.");
                    return;
                }
            }
            System.out.print("Из дека удалено " + numberElements + textElements(numberElements) + " за " + (System.nanoTime() - curTime) + " нс.\n");
        }
    }
    //endregion

    //region Методы для работы с приоритетной очередью
    public void priorityQueueAdd(PriorityQueue<Integer> curPriorityQueue, int numberElements)
    {
        if (numberElements <= 0)
        {
            System.out.println("Ошибка: Элементы в приоритетную очередь не добавлены, потому что нужно указывать число элементов > 0.");
        }
        else
        {
            curTime = System.nanoTime();
            int tempInt;
            System.out.print("В приоритетную очередь добавлены элементы: [");
            for (int i = 0; i < numberElements; i++)
            {
                tempInt = random.nextInt(numberElements);
                if (curPriorityQueue.add(tempInt) == true)
                {
                    System.out.print(tempInt + (i < numberElements - 1 ? ", " : "]\n    На добавление элементов потрачено " + (System.nanoTime() - curTime) + " нс.\n"));
                }
                else
                {
                    if (i > 0)
                    {
                        System.out.print("]\n    На добавление элементов потрачено " + (System.nanoTime() - curTime) + " нс.\n");
                    }
                    System.out.println("Ошибка: Добавить элемент с индексом " + i + " в приоритную очередь не получилось.");
                    return;
                }
            }
        }
    }

    public void priorityQueueShow(PriorityQueue<Integer> curPriorityQueue)
    {
        if (curPriorityQueue.isEmpty() == true)
        {
            System.out.println("Приоритетная очередь пуста. Нечего выводить.");
        }
        else
        {
            curTime = System.nanoTime();
            System.out.print("Текущий вид приоритетной очереди: [");
            while(curPriorityQueue.isEmpty() == false)
            {
                System.out.print(curPriorityQueue.poll() + (curPriorityQueue.isEmpty() == true ? "]\n   На вывод приоритетной очериди потрачено " + (System.nanoTime() - curTime) + " нс." : ", "));
            }
        }
    }
    //endregion

    //region Метод, реализующий вывод правильного окончания в количестве элементов
    public String textElements(int numberElements)
    {
        numberElements = numberElements % 10;
        if (numberElements == 1)
        {
            return " элемент";
        }
        else
        {
            return " элементов";
        }
    }
    //endregion
}

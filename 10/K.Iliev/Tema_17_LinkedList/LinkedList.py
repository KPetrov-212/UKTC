# Определение на клас за възел в свързан списък
class Node:
    def __init__(self, data):
        # Инициализиране на възела с данни и указател към следващия възел, зададен на None
        self.data = data
        self.next = None

# Определение на клас за свързан списък
class LinkedList:
    def __init__(self):
        # Инициализиране на свързания списък с указател към главата, зададен на None
        self.head = None

    # Метод за добавяне на елемент към свързания списък
    def append(self, data):
        # Създаване на нов възел с предоставените данни
        new_node = Node(data)
        
        # Ако списъкът е празен, задаваме новия възел като начало
        if self.head is None:
            self.head = new_node
        else:
            # В противен случай, обхождаме до края на списъка и добавяме новия възел
            last = self.head
            while last.next:
                last = last.next
            last.next = new_node

    # Метод за изтриване на елемент от свързан списък по ключ
    def delete(self, key):
        temp = self.head
        
        # Проверка дали началният възел съдържа ключа за изтриване
        if temp is not None:
            if temp.data == key:
                # Ако е намерен, актуализираме началото към следващия възел и изтриваме текущия начален възел
                self.head = temp.next
                temp = None
                return
        
        # Обхождаме списъка, за да намерим възела за изтриване
        while temp is not None:
            if temp.data == key:
                break
            prev = temp
            temp = temp.next
        
        # Ако ключът не е намерен, връщаме се
        if temp is None:
            return
        
        # Актуализираме указателите, за да премахнем възела от списъка
        prev.next = temp.next
        temp = None

    # Метод за търсене на елемент в свързан списък по ключ
    def search(self, key):
        current = self.head
        
        # Обхождаме списъка, за да намерим ключа
        while current:
            if current.data == key:
                # Ако е намерен, връщаме True
                return True
            current = current.next
        
        # Ако не е намерен, връщаме False
        return False

    # Метод за отпечатване на всички елементи в свързан списък
    def print_list(self):
        node = self.head
        # Обхождаме списъка и отпечатваме данните на всеки възел
        while node:
            print(node.data, end=" ")
            node = node.next
        print() 

# Основен блок за тестване на изпълнението на свързан списък
if __name__ == "__main__":
    list = LinkedList()
    # Добавяне на елементи към списъка
    list.append(10)
    list.append(20)
    list.append(30)
    print("add [10, 20, 30]: ", end=" ")
    list.print_list()
    
    # Изтриване на елемент от списъка
    list.delete(20)
    print("del [20]: ", end=" ")
    list.print_list()
    
    # Търсене на елементи в списъка
    print("Search 10: ",list.search(10))
    print("Search 20: ", list.search(20))
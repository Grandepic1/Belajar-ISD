from ListNode import ListNode
from ResepMakanan import ResepMakanan
class SinglyLinkedList():
    def __init__(self, listNama):
        self.__nama = listNama
        self.__firstNode = self.__lastNode = None
        
    def isEmpty(self):
        return bool(self.__firstNode == None)
        
    def InsertAtFront(self,insertItem):
        newNode = ListNode(insertItem)
        
        if self.isEmpty():
            self.__firstNode = self.__lastNode = newNode
        else:
            newNode.next = self.__firstNode
            self.__firstNode = newNode
            
    def InsertAtBack(self,insertItem):
        newNode = ListNode(insertItem)
        
        if self.isEmpty():
            self.__firstNode = self.__lastNode = newNode
        else:
            self.__lastNode.next = newNode
            self.__lastNode = newNode
            
    def removeFromFront(self):
        if self.isEmpty():
            raise Exception(f"{self.__nama} is empty")
        
        removedItem = self.__firstNode.data
        if (self.__firstNode == self.__lastNode):
            self.__firstNode = self.__lastNode = None
        else:
            self.__firstNode = self.__firstNode.next
        return removedItem
    
    def removeFromBack(self):
        if self.isEmpty():
            raise Exception(f"{self.__nama} is empty")
        
        removedItem = self.__lastNode.data
        if (self.__firstNode == self.__lastNode):
            self.__firstNode = self.__lastNode = None
        else:
            iterator = self.__firstNode
            while iterator.next != self.__lastNode:
                iterator = iterator.next
            self.__lastNode = iterator
            iterator.next = None
        return removedItem
    
    def print(self):
        if self.isEmpty():
            print(f"Empty {self.__nama}")
            return
        
        print(f"List {self.__nama} : ")
        
        iterator = self.__firstNode
        
        while iterator:
            print(str(iterator.data))
            iterator = iterator.next
            
    def cariResep(self, namaResep):
        iterator = self.__firstNode
        while iterator != None:
            if isinstance(iterator.data, ResepMakanan):
                if iterator.data.getNamaResep() == namaResep:
                    print(f"Resep ditemukan : {iterator.data}")
                    return
            iterator = iterator.next
    from typing import List, TypeVar, Generic

T = TypeVar('T')

class Toko(Generic[T]):
    def __init__(self, capacity: int):
        """Initialize the list with the given capacity (not strictly needed in Python)."""
        self.list: List[T] = []

    def add_data(self, value: T):
        """Add an element to the list."""
        self.list.append(value)

    def display(self):
        """Display all elements in the list."""
        for item in self.list:
            print(item)
        print()

    def display_sort(self):
        """Sort the list and display the elements."""
        self.list.sort()
        for item in self.list:
            print(item)
        print()

    def remove_data(self, entry: T):
        """Remove an element from the list."""
        if entry in self.list:
            self.list.remove(entry)

    def set_data(self, object1: T, object2: T):
        """Replace an element with a new value."""
        if object1 in self.list:
            index = self.list.index(object1)
            self.list.insert(index, object2)

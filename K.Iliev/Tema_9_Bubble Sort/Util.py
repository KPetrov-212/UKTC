class Bubble:
    def __init__(self, arr):
        self.arr = arr

    def bubble_sort_for(self):
        n = len(self.arr)
        for i in range(n-1):
            swapped = False
            for j in range(0, n-i-1):
                if self.arr[j] > self.arr[j + 1]:
                    swapped = True
                    self.arr[j], self.arr[j + 1] = self.arr[j + 1], self.arr[j]
            if not swapped:
                return self.arr
    
    def sortWhile(self):
        n = len(self.arr)
        swapped = True
        while swapped:
            counter = 0
            swapped = False
            for j in range(0, n-1-counter):
                if self.arr[j] > self.arr[j + 1]:
                    swapped = True
                    self.arr[j], self.arr[j + 1] = self.arr[j + 1], self.arr[j]
                counter += 1
        return self.arr

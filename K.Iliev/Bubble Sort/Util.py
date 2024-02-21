class Bubble:
    def __init__(self, arr):
        self.arr = arr

    def sortFor(self):
        n = len(self.arr)
        for i in range(n-1):
            swapped = True
            for j in range(0, n-i-1):
                if self.arr[j] > self.arr[j + 1]:
                    swapped = True
                    self.arr[j], self.arr[j + 1] = self.arr[j + 1], self.arr[j]
            if not swapped:
                return self.arr
    
    def sortWhile(self):
        n = len(self.arr)
        i = 0
        swapped = True
        while swapped:
            swapped = False
            i += 1
            for j in range(0, n-i):
                if self.arr[j] > self.arr[j + 1]:
                    swapped = True
                    self.arr[j], self.arr[j + 1] = self.arr[j + 1], self.arr[j]
        return self.arr

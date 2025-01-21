import math

def factorial(n):
    return math.factorial(n)

def combinations(n, k):
    return math.comb(n, k)

def solve_tasks():
    results = {}

    # Task 1
    results[1] = factorial(10)

    # Task 2
    results[2] = factorial(7)

    # Task 3
    results[3] = combinations(8, 2)

    # Task 4
    results[4] = combinations(7, 3)

    # Task 5
    n = 10
    results[5] = n * (n - 3) // 2

    # Task 6
    results[6] = combinations(10, 3) * combinations(39, 3)

    # Task 7
    results[7] = combinations(20, 2) * combinations(25, 3)

    # Task 8
    results[8] = combinations(52, 13)

    # Task 9
    results[9] = 4 * factorial(4)

    # Task 10
    results[10] = combinations(9, 5) * factorial(5)

    # Task 11
    results[11] = factorial(4)

    # Task 12
    results[12] = 7 * 6 * 5 * 4

    # Task 13
    results[13] = combinations(49, 6)

    # Task 14
    results[14] = 5 * combinations(6, 4) * factorial(3)

    # Task 15
    results[15] = combinations(8, 2)  

    # Task 16
    results[16] = factorial(5) 

    # Task 17
    results[17] = factorial(6) 

    # Task 18
    results[18] = factorial(6) 

    # Task 19
    results[19] = factorial(4) * 2 

    # Task 20
    results[20] = 4 * 3 * 2 

    # Task 21
    results[21] = combinations(7, 3) * factorial(3) 

    # Task 22
    results[22] = combinations(15, 4) * factorial(4)  

    # Task 23
    results[23] = 4 * factorial(4)

    # Task 24
    results[24] = combinations(20, 3)

    # Task 25
    results[25] = 2 * combinations(16, 2)

    # Task 26
    results[26] = 80 * 79 * combinations(78, 3)

    return results

results = solve_tasks()
for task, result in results.items():
    print(f"Task {task}: {result}")

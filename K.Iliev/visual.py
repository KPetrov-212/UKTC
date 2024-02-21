import matplotlib.pyplot as plt
import numpy as np

a = 0.5e-9  
b = 1e-9    
cpu_speed = 1.80e9  


best_case_cycles = 7
best_case_time = best_case_cycles * a
best_case_time_seconds = best_case_time / cpu_speed


worst_case_cycles = 15
worst_case_time = worst_case_cycles * b
worst_case_time_seconds = worst_case_time / cpu_speed


n_values = np.arange(1, 1001, 1)  
best_case_graph = a * (7 * n_values - 1) / cpu_speed
worst_case_graph = b * (15 * n_values - 1) / cpu_speed

plt.figure(figsize=(10, 6))
plt.plot(n_values, best_case_graph, label='BEST CASE', color='green')
plt.plot(n_values, worst_case_graph, label='WORST CASE', color='red')

plt.scatter([1], [best_case_time_seconds], color='green', marker='o')
plt.scatter([1], [worst_case_time_seconds], color='red', marker='o')

plt.legend()
plt.title('Графика на бързодействието на алгоритъма arrayMax')
plt.xlabel('Размер на входните данни (n)')
plt.ylabel('Време за изпълнение (секунди)')

plt.show()
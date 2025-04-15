import matplotlib.pyplot as plt
import numpy as np

v1_draw = np.array([0, 3])
v2_draw = np.array([1, 1])
result2 = v1_draw - v2_draw

plt.quiver(0, 0, v1_draw[0], v1_draw[1], angles='xy', scale_units='xy', scale=1, color='r', label='v1')
plt.quiver(0, 0, v2_draw[0], v2_draw[1], angles='xy', scale_units='xy', scale=1, color='b', label='v2')
plt.quiver(0, 0, result2[0], result2[1], angles='xy', scale_units='xy', scale=1, color='g', label='v1 - v2')
plt.xlim(-2, 4)
plt.ylim(-2, 4)
plt.grid()
plt.legend()
plt.show()
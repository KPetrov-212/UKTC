import math

students = {}
num = 1

while True:
    student_scores = input()
    if not student_scores:
        break
    scores = list(map(int, student_scores.split(', ')))
    students[num] = scores
    num += 1
print(students)

for number, scores in students.items():
    avg_score = sum(scores) / len(scores)
    grade = 2 + (avg_score / 100 * 4)
    avg_score = math.ceil(avg_score)
    print(f"{number}: {avg_score} -> {grade:.2f}")
import math

students = {}

number = 1
while True:
    scores_input = input().strip()
    if not scores_input:
        break
    scores = list(map(int, scores_input.split(", ")))
    avg_score = sum(scores) / len(scores)
    grade = 2 + (avg_score / 100 * 4)
    avg_score = math.ceil(avg_score)
    grade = round(grade, 2)
    students[number] = (avg_score, grade)
    number += 1

for number, (avg_score, grade) in students.items():
    print(f"{number}: {avg_score} -> {grade:.2f}")

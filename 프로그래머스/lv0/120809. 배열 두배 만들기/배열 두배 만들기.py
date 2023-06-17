'''
처음 푼 방식인데, 굉장히 자바스럽다 ㅋㅋㅋㅋㅋㅋㅋ

def solution(numbers):
    answer = numbers
    for i in range(len(numbers)):
        answer[i] = numbers[i]*2
    return answer
'''

'''
# 파이썬스럽게 1
def solution(numbers):
    answer = []
    for i in range(len(numbers)):
        answer.append(numbers[i]*2)
    return answer
'''

# 파이썬스럽게 2
def solution(numbers):
    return [num*2 for num in numbers]


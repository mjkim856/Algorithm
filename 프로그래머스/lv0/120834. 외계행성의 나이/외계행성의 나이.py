def solution(age):
    # 97 = a
    answer = ''
    for i in str(age):
        answer += chr(97+int(i))
    return answer
    
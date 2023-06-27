'''
def solution(age):
    # 97 = a
    answer = ''
    for i in str(age):
        answer += chr(97+int(i))
    return answer
'''

def solution(age):
    return ''.join([chr(97 + int(i)) for i in str(age)])

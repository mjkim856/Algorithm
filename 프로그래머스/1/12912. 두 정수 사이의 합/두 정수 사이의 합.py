def solution(a, b):
    
    t1 = a
    t2 = b
    
    if t1 > t2: 
        a = t2
        b = t1
    else:
        a = t1
        b = t2

    answer = 0

    for i in range(a, b+1):
        answer += i

    return answer
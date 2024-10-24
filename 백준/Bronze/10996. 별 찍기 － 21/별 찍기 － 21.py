n = int(input())

# round()는 사사오입 원칙을 따른다. 
# 반올림할 자리의 수가 5이면 반올림 할 때 앞자리의 숫자가 짝수면 내림하고 홀수면 올림 한다.
# 어쩐지 이상하더라... 예를 들어 4/2 = 2고, 5/2도 2다.
r = round(n/2 + 0.1)

if n == 1:
    print("*")
else:
    for i in range(n):
        print("* " * r)
        print(" *" * (n-r))

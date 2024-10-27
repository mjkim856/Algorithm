import sys
input = sys.stdin.readline

add = 0

for i in range(5):
    n = int(input())
    if n > 40: add += n
    else: add += 40
    
# print(int(add/5)) 이건 실수 몫(68.0)이 나와서 형변환 해야 함
print(add//5) # 이건 정수 몫 나와서 형변환 안 해도 댐 !!

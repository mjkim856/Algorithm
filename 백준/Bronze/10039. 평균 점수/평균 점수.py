import sys
input = sys.stdin.readline

add = 0

for i in range(5):
    n = int(input())
    if n > 40: add += n
    else: add += 40
    
print(int(add/5))
import sys
input = sys.stdin.readline

li = list(map(int, input().split()))
li.sort()

print(li[1])
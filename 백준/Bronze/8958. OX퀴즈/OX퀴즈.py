import sys
input = sys.stdin.readline    # 시간이 줄어든당

n = int(input())

for i in range(n):
    ox = input()
    add = 0
    result = 0

    for j in ox:        # 이런 식으로도 할 수 있구나
        if j == 'O':
            add += 1
            result += add
        else: add = 0
    print(result)

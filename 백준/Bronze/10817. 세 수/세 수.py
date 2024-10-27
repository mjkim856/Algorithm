li = list(map(int, input().split()))
li.sort()

print(li[1])

'''
처음 실패: 지금 li의 요소는 str라서 아래의 결과가 나옴
1 3 22 >> 1 22 3 >> 22가 출력됨

li = input().split()
li.sort()
print(li)

print(li[1])

================================
============  2nd  =============
================================

li = map(int, input().split())
li.sort()

print(li[1])

오류 발생 : AttributeError: 'map' object has no attribute 'sort
왜냐면 지금 li의 타입은 map이거든 ...
그래서 list로 또 형변환 해줘야 함 
'''

# 내 방법
# a, b = input().split(' ')
# print('a =', a)
# print('b =', b)

# 가장 많이 사용된 방법
# 문자의 형태였던 input() 값들을 int 형태로 바꾸어 a, b에 넣는다. 이래서 map 사용하는 듯
# strip()은 공백 제거 위해, split()은 ' ' 기준으로 입력값을 자르기 위해 사용했다.
# 파이썬 특이점 : print() 할 때 , 뒤 애들이 자동 띄어쓰기 됨. 자바랑 다르군
a, b = map(int, input().strip().split(' '))
print("a =",a) 
print("b =",b)
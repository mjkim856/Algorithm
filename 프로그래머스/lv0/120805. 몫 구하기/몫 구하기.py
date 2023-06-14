#def solution(num1, num2):
#    return num1//num2

# divmod 사용
# 0은 몫, 1은 나머지!
def solution(num1, num2):
   return divmod(num1, num2)[0];

# n1 / n2를 하면, 각각 7과 3일 때 3.5라는 결과가 나온다. 개꿀?
# 프로그래머스는 입출력 없음 주의 ⚠️ 
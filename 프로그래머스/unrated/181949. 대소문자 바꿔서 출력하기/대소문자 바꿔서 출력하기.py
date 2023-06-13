#my_string = input()

# 특이점. 파이썬은 꼭 def를 사용해야 하나?
# def solution(my_string):
#     answer = ''
#     for i in my_string:
#         if i.isupper():
#             answer+=i.lower()
#         else:
#             answer+=i.upper()
#     return answer
    
# print(solution(my_string))

# 킹치만 이렇게 하면 훨씬 쉬워진다!
print(input().swapcase())
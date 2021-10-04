def sol(s):
    stack=[]
    dict={'(': ')', '{': '}', '[': ']',')': '(', '}': '{', ']': '['}
    for i in s:
        if len(stack)>0 and stack[-1]<i and stack[-1]==dict.get(i):
            stack.pop()
        else:
            stack.append(i)
        return len(stack)==0
s=str(input())
print(sol(s))
dic={'I':1,'V':5,'X':10,'L':50,'C':100,'D':500,'M':1000}
n=input()
res=0
pre=0
for i in range(len(n)):
    s1=dic[n[i]]
    if (i+1<len(n)):
        s2=dic[n[i+1]]
        if s1>=s2:
            res+=s1
        else:
            res-=s1
    else:
        res+=s1
print(res)
    
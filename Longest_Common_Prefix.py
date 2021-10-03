l=list(map(str,input().split()))
a1,a2,a3=len(l[0]),len(l[1]),len(l[2])
mini=min(a1,a2,a3)
res=[]
s=''
if l[0]==l[1]==l[2]:
    print(l[0]) 
else:
    for i in range(mini):
        if l[0][i]==l[1][i]==l[2][i]:
            res.append(l[0][i])

    for i in res:
        s+=i

    print(s)


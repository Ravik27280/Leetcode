def lcp(l):

    minl=len(l[0])
    for i in range(len(l)):
        minl=min(len(l[i]),minl)
    s=''
    i=0
    while i<minl:
        char= l[0][i]
        for j in range(1,len(l)):
            if l[j][i]!=char:
                return s
        s=s+char
        i+=1
    return s

l=list(map(str,input().split()))
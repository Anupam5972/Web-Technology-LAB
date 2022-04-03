# cook your dish here
for _ in range(int(input())):
    side=(input())
    o,e=0,0
    for i in range(len(sid)):
        if int(sid[i]%2 == 0)
            e+=1
        else:
            o+=1
    if int(sid[-1])%2==0 and e >= 2:
        print("YES")
    elif int(sid[-1])%2!=0 and o >= 2:
        print("YES")
    else:
        print("NO")
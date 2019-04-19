import math
testcase = int(input())

for i in range(testcase):
    lst = list(input().split(" "))
    d = float(lst[0])
    v = float(lst[1])
    u = float(lst[2])

    if u == 0 or v == 0 or u <= v:
        print("Case %d: can\'t determine"% (i+1))
    else:
        # fastest path
        t1 = float(d/u)

        # shortest path
        uv = math.sqrt((u*u) - (v*v))
        t2 = float(d/uv)

        print("Case %d: %.3f"% (i+1, abs(t1-t2)))
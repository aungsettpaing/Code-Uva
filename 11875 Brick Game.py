testcase = int(input())
for i in range(testcase):
    lst = list(input().split(" "))
    index = int(int(lst[0]) / 2)
    lst = lst[1:]
    print("Case {}: {}".format((i+1), lst[index]))

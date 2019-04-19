import math

testcase = int(input())

for i in range(testcase):
    lst = list(input().split(" "))
    num1 = list(lst[0])
    num2 = list(lst[1])

    # reverse
    num1 = num1[::-1]
    num2 = num2[::-1]

    # list to string
    num1 = "".join(num1)
    num2 = "".join(num2)

    # integer
    int1 = int(num1)
    int2 = int(num2)

    # add two numbers
    result = int1 + int2
    result = list(str(result))
    result = result[::-1]
    result = "".join(result)

    print(int(result))
import math

testcase = int(input())

for i in range(testcase):
    lst = list(input().split(" "))
    lower = int(lst[0])
    upper = int(lst[1])

    maximum = 0
    value = 0

    for n in range(lower, upper+1):
        squareroot = (int)(math.sqrt(n))
        count = 0
        for j in range(1, squareroot+1):
            if n%j == 0:
                if j*j == n:
                    count += 1
                else:
                    count += 2

        if maximum < count:
            maximum = count
            value = n

    print("Between %d and %d, %d has a maximum of %d divisors."%(lower, upper, value, maximum))

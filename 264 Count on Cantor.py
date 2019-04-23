up = list([1])
down = list([1])

count = 1
number = 2
forward = True

while count <= 10000000:

    if forward:
        for i in range(1, number+1):
            up.append(i)
        for i in range(number, 0, -1):
            down.append(i)
        forward = False
    else:
        for i in range(number, 0, -1):
            up.append(i)
        for i in range(1, number+1):
            down.append(i)
        forward = True

    count += number
    number += 1

while True:
    try:
        lst = list(input().split())
        for nth in lst:
            nth = int(nth)
            string = "TERM "+str(nth)+" IS "+str(up[nth-1])+"/"+str(down[nth-1])
            print(string)
    except:
        break
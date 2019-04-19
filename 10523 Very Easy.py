while True:
    try:
        lst = list(input().split(" "))
        N = int(lst[0])
        A = int(lst[1])
        summ = 0
        for i in range(1, N + 1):
            summ += (pow(A, i) * i)
        print(summ)
    except:
        break

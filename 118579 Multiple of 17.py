while True:
    number = input()
    if number == "0":
        break

    first = int(number[:-1])
    d5 = int(number[-1]) * 5

    if (first-d5)%17 == 0:
        print("1")
    else:
        print("0")

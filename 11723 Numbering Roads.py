lst = list(input().split(" "))

road = int(lst[0])
integer = int(lst[1])
case = 1

while road != 0 and integer != 0:
    diff = road - integer
    suffix = 1

    if diff <= 0:
        string = "Case " + str(case) + ": 0"
        print(string)
    else:
        while integer * suffix < diff and suffix <= 26:
            suffix += 1

        if integer*suffix >= diff and suffix <= 26:
            string = "Case "+ str(case) +": "+ str(suffix)
            print(string)
        else:
            string = "Case " + str(case) + ": impossible"
            print(string)

    case += 1
    lst = list(input().split(" "))
    road = int(lst[0])
    integer = int(lst[1])
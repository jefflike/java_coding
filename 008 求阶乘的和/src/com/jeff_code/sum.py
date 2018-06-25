def di_gui(a):
    if a == 1:
        return 1
    return a * di_gui(a - 1)


sum = 0


for i in range(1, 21):
    sum += di_gui(i)


print(sum)

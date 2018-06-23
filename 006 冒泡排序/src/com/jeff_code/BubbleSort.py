a = [5, 7, 3, 9, 2]

for i in range(len(a) - 1):
    for j in range(len(a) - i -1):
        if a[j] > a[j + 1]:
            a[j], a[j + 1] = a[j + 1],a[j]

print(a)

def di_gui(i):
    if i == 1:
        return 1
    return i + di_gui(i - 1)


print(di_gui(100))

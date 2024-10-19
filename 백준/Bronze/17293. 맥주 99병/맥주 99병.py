n = int(input())

if n == 1: 
    print("1 bottle of beer on the wall, 1 bottle of beer.\nTake one down and pass it around, no more bottles of beer on the wall.\n")
    print("No more bottles of beer on the wall, no more bottles of beer.\nGo to the store and buy some more, 1 bottle of beer on the wall.")
else:
    for i in range(n, 0, -1):
        if i > 2: print("%d bottles of beer on the wall, %d bottles of beer.\nTake one down and pass it around, %d bottles of beer on the wall.\n" % (i, i, i-1))
        elif i == 2: print("2 bottles of beer on the wall, 2 bottles of beer.\nTake one down and pass it around, 1 bottle of beer on the wall.\n")
        else: print("1 bottle of beer on the wall, 1 bottle of beer.\nTake one down and pass it around, no more bottles of beer on the wall.\n\n"
                    "No more bottles of beer on the wall, no more bottles of beer.\nGo to the store and buy some more, %d bottles of beer on the wall." % n)

# ㅎㅎ i == 2인 경우 1 bottles >> 1 bottle으로 변경하는 것 안 했음 ㅎㅎ... 
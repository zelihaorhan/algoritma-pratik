# Fibonacci serisinin ilk 10 terimini yazdiran kod

sayi1=1
sayi2=1

print(sayi1)
print(sayi2)

for i in range(0,8):
    temp=sayi1+sayi2
    sayi1=sayi2
    sayi2=temp
    print(temp)
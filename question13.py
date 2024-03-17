# 10 ile 1000 arasindaki tam kare sayilari ekrana yazdiran kod.

for i in range(10,1000):
    if(i**0.5).is_integer():
        print(i)
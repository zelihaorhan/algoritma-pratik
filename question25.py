# Girilen a ve b sayisi 50'den buyuk oldugunda c=a+b islemini yapan degilse bu sayilar uygun degildir yazan programin kodu.

a=int(input("a sayisini giriniz:"))
b=int(input("b sayisini giriniz:"))

if a>50 and b>50:
    print("c:" + str(a+b))
else:
    print("Bu sayilar uygun degildir.")
# Klavyeden girilen sayinin pozitif, negatif veya 0 oldugunu bulan kod.

sayi=(int)(input("Bir sayi giriniz:"))

if sayi>0:
    print("Sayi pozitiftir.")
elif sayi<0:
    print("Sayi negatiftir.")
else:
    print("Sayi 0'dir.")
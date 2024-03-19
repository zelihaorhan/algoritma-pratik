# Girilen sayinin mukemmel sayi olup olmadigini bulan kod.

sayi=(int)(input("Bir sayi giriniz:"))
bolenToplam=0

for i in range(1,sayi):
    if(sayi%i==0):
        bolenToplam+=i;

if(sayi==bolenToplam):
    print("Girilen sayi mukemmel sayidir.")
else:
    print("Girilen sayi mukemmel sayi degildir")
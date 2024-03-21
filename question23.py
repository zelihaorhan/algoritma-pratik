# Girilen bir sayi abundant(guclu) mı deficient(guclu) oldugunu bulan kod.
# Abundant sayi: bolenlerinin toplami kendinden buyukse olan sayidir.
# Deficient sayi: bolenlerinin toplami kendinden kucuk olan sayidir.

sayi=int(input("Bir sayi giriniz:"))
bolenToplam=0

for i in range(0,sayi):
    if(sayi%i==0):
        bolenToplam+=i

if bolenToplam>sayi:
    print("Girilen sayi abundanttir")
else:
    print("Girilen sayi deficienttir.")

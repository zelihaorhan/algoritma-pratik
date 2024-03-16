# Girilen sayinin kac basamakli oldugunu bulan kod

sayi=int(input("Sayi giriniz: "))
basamakSayisi=1

while(sayi>9):
    sayi=sayi/10
    basamakSayisi=basamakSayisi+1

print("Girilen sayinin basamak sayisi: " + str(basamakSayisi))

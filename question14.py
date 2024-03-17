# klavyeden girilen 25 adet sayidan negatif olanlarin toplamini, cift olanlarin carpimini ve 7'ye esit olanlarin adedini bulup ekrana yazdiran kod.

negTop=0
ciftCarp=1
yedi=0

for i in range(0,25):
    sayi=(int(input("Bir sayi giriniz:")))
    if(sayi<0):
        negTop=negTop+sayi
    if(sayi%2==0):
        ciftCarp=ciftCarp*sayi
    if(sayi==7):
        yedi=yedi+1

print("Negatif sayilarin toplami:" + str(negTop))

print("Cift sayilarin carpimi:" + str(ciftCarp))

print("Yedi adedi: " + str(yedi))
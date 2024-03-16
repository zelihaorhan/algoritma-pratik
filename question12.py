# klavyeden girilen 20 adet sayidan cift olanlarin toplaminin tek olanlarin toplamina oranini bulan kod

tekTop=0
ciftTop=0

for i in range(0,20):
    sayi=int(input("Bir sayi giriniz: "))
    
    if sayi%2==0:
        ciftTop=ciftTop+sayi
    else:
        tekTop=tekTop+sayi

oran=ciftTop/tekTop

print("Cift sayilarin toplaminin tek sayilarin toplamina orani: " + str(oran))

# girilen sayinin 5'in kuvveti olup olmadigini bulan kod

sayi=(int(input("Bir sayi giriniz:")))

def besinKuvvetiMi(sayi):
    if sayi<=0:
        return False
    while sayi>1:
        if sayi%5!=0:
            return False
        sayi=sayi/5
    return True

if besinKuvvetiMi(sayi):
    print(f"{sayi} sayisi 5'in kuvvetidir.")
else:
    print(f"{sayi} sayisi 5'in kuvveti degildir.")
# herhangi bir sayinin herhangi bir derecden kuvvetini bulan kod.

sayi=int(input("Bir sayi giriniz:"))
derece=int(input("Derece giriniz:"))

sonuc=1

for i in range(0,derece):
    sonuc*=sayi

print("Sonuc:" + str(sonuc))
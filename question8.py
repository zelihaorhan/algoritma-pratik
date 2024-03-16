# bolme islemini cikarma kullanarak bulan kod

bolunen=int(input("Bolunen sayiyi giriniz:"))
bolen=int(input("Bolen sayiyi giriniz:"))
sonuc=0

while(bolunen>=bolen):
    bolunen=bolunen-bolen
    sonuc=sonuc+1

print("Bolme isleminin sonucu:" + str(sonuc))
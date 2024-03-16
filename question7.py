# carpma islemini toplama kullanarak bulan kod

carpan1=int(input("Ilk carpani giriniz:"))
carpan2=int(input("Ikinci carpani giriniz:"))
sonuc=0
while carpan1>0:
    sonuc+=carpan2
    carpan1=carpan1-1
    
print("Carpimin sonucu:" + str(sonuc))

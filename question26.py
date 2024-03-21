# 1'den 63'e olan sayilar arasinda istenilen sayiyi maksimum 6 seferde bulan kod

hedefSayi=int(input("Bir hedef sayi giriniz:"))
denemeSayisi=0

while(True):
    denemeSayisi=denemeSayisi+1
    tahmin=int(input("Tahmininizi giriniz:"))
    if(tahmin==hedefSayi):
        print("Tebrikler, hedefe " + str(denemeSayisi) + " .adimda ulastiniz.")
        break
    elif(tahmin<hedefSayi):
        print("Daha buyuk bir sayi giriniz.")
    else:
        print("Daha kucuk bir sayi giriniz.")
        
    if(denemeSayisi>=6):
        print("Maksimum deneme sayisina ulastiniz ve hedef sayiyi bulamadiniz.")
        
    
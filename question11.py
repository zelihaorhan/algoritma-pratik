# girilen 3 basamakli bir sayinin basamaklarinin kuplerinin toplami sayinin kendisine esit olup olmadigini bulan kod

sayi=int(input("Bir sayi giriniz: "))

birler=sayi%10
onlar=(sayi%100)/10
yuzler=sayi%100

toplam=(birler**3)+(onlar**3)+(yuzler**3)

if(toplam==sayi):
    print("Esittir.")
else:
    print("Esit degildir.")
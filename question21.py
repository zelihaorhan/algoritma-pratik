#1-100 arasindaki cift sayilarin toplaminin mukemmel sayi olup olmadigini bulan kod.

toplam=0

for i in range(1,100):
    if(i%2==0){
        toplam+=i
    }

carpanToplam=0

for i in range(1,toplam):
    if(toplam%i==0):
        carpanToplam+=i

if(toplam==carpanToplam):
    print("Toplam mukemmel sayidir.")
else:
    print("Toplam mukemmel sayi degildir.")
    

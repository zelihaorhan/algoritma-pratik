# girilen sayinin faktoriyelini hesaplayan kod

sayi=int(input("Faktoriyeli hesaplanacak sayi: "))

faktoriyel=1

for i in range(1,sayi+1):
    faktoriyel*=i
    
print("Faktoriyelin sonucu : " + str(faktoriyel))
# Girilen decimal (onluk) bir sayinin binary (ikilik) bir sayiya donusturen kod.




def decimalToBinary(onluk):
    while(onluk>0):
        kalan=onluk%2
        ikilik=bin(onluk)[2:]
        return ikilik
    

onluk = int(input("Onluk tabanda bir sayi giriniz:"))
ikilik=decimalToBinary(onluk)
print("Girilen onluk sayinin ikilik tabandaki hali:" + str(ikilik))
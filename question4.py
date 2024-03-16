# 1'den 100'e kadar olan sayilarin toplamini bulan kod

toplam=0

for sayi in range (1,101):
    toplam+=sayi**3
    
print("1'den 100'e kadar olan sayilarin kuplerinin toplami:" + str(toplam))
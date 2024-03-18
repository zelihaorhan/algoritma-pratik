# X ve Y pozitif olmak uzere, X sayisinin carpanlari toplami Y sayisina, Y sayisinin carpanlari toplami X sayisina esit ise bu sayılar dost sayilardir. Buna gore girilen iki sayinin dost sayi olup olmadigini bulan kod.

x=(int(input("Bir sayi giriniz:")))
y=(int(input("Bir sayi giriniz:")))

xTop=0
yTop=0
for i in range(1,x):
    if(x%i==0):
        xTop=xTop+i

for i in range(1,y):
    if(y%i==0):
        yTop=yTop+i

if(x==yTop and y==xTop):
    print("Girilen sayilar dost sayilardir.")
else:
    print("Girilen sayilar dost sayilar degildir.")
    
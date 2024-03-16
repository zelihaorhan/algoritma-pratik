from datetime import datetime
# dogum tarihi girilen kisinin yasini hesaplayan kod

dYil=int(input("Dogum yilinizi giriniz:"))

mTarih=datetime.now()
mYil=mTarih.year

yas = mYil-dYil

print("Yasiniz:" + str(yas))

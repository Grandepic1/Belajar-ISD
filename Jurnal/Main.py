from Elek import AlatMusikElektronik
from Trad import AlatMusikTadisional
from Toko import Toko
Elek = Toko(5)
Elek.add_data(AlatMusikElektronik("E001", "Gitar","Elektronik",30000,30))
Elek.add_data(AlatMusikElektronik("E003", "Drum","Elektronik",30000,30))
Elek.add_data(AlatMusikElektronik("E002", "Bass","Elektronik",30000,30))
Elek.display()

Tradisi = Toko(5)
Tradisi.add_data(AlatMusikTadisional("T003", "Suling", "Tradisional","250000","500"))
Tradisi.add_data(AlatMusikTadisional("T002", "Angklung", "Tradisional","250000","500"))
Tradisi.add_data(AlatMusikTadisional("T001", "Kecapi", "Tradisional","250000","500"))

Tradisi.display()
Tradisi.display_sort()

print(AlatMusikTadisional("T001", "Kecapi", "Tradisional","250000","500"))
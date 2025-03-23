class ResepMakanan():
    def __init__(self, namaResep, bahanUtama, waktuMasak):
        self.__namaResep = namaResep
        self.__bahanUtama = bahanUtama
        self.__waktuMasak = waktuMasak
        
        
    def getNamaResep(self):
        return self.__namaResep
    
    def getBahanUtama(self):
        return self.__bahanUtama
    
    def getWaktuMasak(self):
        return self.__waktuMasak
    
    def __str__(self):
        return f"Nama Resep = {self.__namaResep}, Bahan utama = {self.__bahanUtama}, Waktu = {self.__waktuMasak}"
    
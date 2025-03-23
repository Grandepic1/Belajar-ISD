
class AlatMusikElektronik():
    def __init__(self, kode:str, nama:str, kategori:str, harga:int, stok:int):
        self.__kode = kode
        self.__nama = nama
        self.__kategori = kategori
        self.__harga = harga
        self.__stok = stok
    
    def __str__(self):
        return f"AlatMusikElektronik [kode= {self.__kode}  , nama= {self.__nama} , kategori= {self.__kategori}, harga=Rp.{self.__harga}, stok= {self.__stok}]"
    
    def getKode(self):
        return self.__kode
    
    def __lt__(self, other):
        return self.__kode < other.__kode
    
    def __eq__(self, other):
        return self.__kode == other.__kode
class Mahasiswa():
    def __init__(self, nim:str,nama:str,kelas:str):
        self.__nim = nim
        self.__nama = nama
        self.__kelas = kelas
    
    def __str__(self):
        return f"Nim = {self.__nim}, Nama = {self.__nama}, Kelas = {self.__kelas}"
    
    def setNama(self,nama:str):
        self.__nama = nama
    
    def setNim(self,nim:str):
        self.__nim = nim
    
    def setKelas(self,kelas:str):
        self.__kelas = kelas
    
    def getNama(self):
        return self.__nama
    
    def getNim(self):
        return self.__nim
    
    def getKelas(self):
        return self.__kelas
    
    
    
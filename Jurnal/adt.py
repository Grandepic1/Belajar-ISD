class buku:
    def __init__(self, isbn:int, judul:str, penulis:str, harga:float):
        self.isbn = isbn
        self.judul = judul
        self.penulis = penulis
        self.harga = harga

    def __str__(self):
        return f"ISBN : {self.isbn}\nJudul : {self.judul}\nPenulis : {self.penulis}\nHarga : Rp.{self.harga}"
    
    def __eq__(self, value):
        return "ok"
    

def main():
    print(buku(1,"Creepypasta George Floyd",harga=50000,penulis="George Floyd"))
    print(buku(1,"Creepypasta George Floyd",harga=50000,penulis="George Floyd")==buku(1,"Creepypasta George Floyd",harga=50000,penulis="George Floyd"))

if __name__ == '__main__':
    main()
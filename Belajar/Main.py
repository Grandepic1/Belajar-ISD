from SinglyLinkedList import SinglyLinkedList
from ResepMakanan import ResepMakanan

def inputResep():
    namaResep = input("Masukan nama resep : ")
    bahanUtama = input("Masukan nama bahan utama : ")
    waktu = int(input("Masukan waktu : "))
    return ResepMakanan(namaResep,bahanUtama,waktu)

def main():
    linkedList = SinglyLinkedList("Resep")
    
    while True:
        pilih = int(input("""\
                1. Tambah resep dari depans
                2. Tambah resep dari belakang
                3. Hapus resep dari depan
                4. Hapus resep dari belakang
                5. Tampilkan semua resep
                6. Cari resep
                7. Keluar
                Pilihan: """))
        match pilih:
            case 1|2:
                resep = inputResep()
                if pilih == 1:
                    linkedList.InsertAtFront(resep)
                else:
                    linkedList.InsertAtBack(resep)
            case 3:
                print(f"Berhasil menghapus {linkedList.removeFromFront()}")
            case 4:
                print(f"Berhasil menghapus {linkedList.removeFromBack}")
            case 5:
                linkedList.print()
            case 6:
                namaResep = input("Masukan nama resep: ")
                linkedList.cariResep(namaResep)
            case 7:
                print("Keluar....")
                return
            case _:
                print("Pilihan tidak valid")
                
if __name__ == '__main__':
    main()
                
    
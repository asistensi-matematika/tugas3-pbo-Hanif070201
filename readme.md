# TUGAS 3 ASISTENSI PBO - Jumat, 4 Oktober 2019

NAMA: Muhammad Hanif Sulaiman Iskandar

NRP: 06111840000087

## Deskripsi Soal
Buat class **LinearEquation** untuk sistem persamaan linear 2x2:
* ax+by=e
* cx+dy=f
* x = (ed-bf)/(ad-bc)
* y = (af-ec)/(ad-bc)

Ketentuan class-nya:
* Menggunakan modifier **private** untuk a, b, c, d, e, f.
* Konstruktor kosong dan konstruktor dengan argumen a, b, c, d, e, f.
* method **setter** dan **getter** untuk a, b, c, d, e, f.
* Sebuah method **cekSolusi** untuk mengecek apakah persamaan yang diinputkan memiliki solusi atau tidak. Tidak memiliki solusi jika ad-bc=0

Buat juga **Diagram UML** dan **main class** untuk mengimplementasikan semua method di class **LinearEquation** yang kalian buat.

## Contoh
Contoh 1:
![](/img/1.png)

Penjelasan:
* a=4,b=-5,c=7,d=7,e=10,f=12
* x=  (10*7-(-5)*12)/(4*7-(-5)*7)=130/63=2,06
* y=  (4*12-10*7)/(4*7-(-5)*7)= -22/63≈-0,35

Contoh 2:
![](/img/2.png)
Penjelasan:
ad-bc=2*3-3*2=0
Karena penyebut nya 0, maka tidak memiliki solusi.

## Soal
Input 	: 12 5 13 0 12 7

Output	: ...


Input 	: -18 9 10,5 11 0 0

Output	: ...


### 1 extra mile
soal opsional, tapi selesaikan semua soal di atas terlebih dahulu

![](/img/3.png)

## Screenshot hasil
![Tugas3Soal1](https://user-images.githubusercontent.com/56248817/66329448-bedc1900-e958-11e9-8715-fadf66d4024b.PNG)
![Tugas3Soal2](https://user-images.githubusercontent.com/56248817/66329449-bedc1900-e958-11e9-88a4-5c93ea217cd5.PNG)
![Tugas3Soal3](https://user-images.githubusercontent.com/56248817/66329450-bedc1900-e958-11e9-8bc7-a11621ae66bf.PNG)

## Upload
upload seluruh folder project java-nya ke repository ini

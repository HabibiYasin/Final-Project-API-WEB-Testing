# Automated Testing Framework API and UI Web with Java

## Tujuan Proyek
Tujuan proyek ini adalah untuk membuat sebuah framework pengujian otomatis yang dapat digunakan untuk melakukan pengujian pada aplikasi web menggunakan bahasa pemrograman Java. Framework ini menggunakan berbagai alat dan teknologi termasuk Gradle, TestNG, Selenium WebDriver, Rest Assured, dan Cucumber dengan format Gherkin.

## Cara Menjalankan Proyek
Berikut adalah langkah-langkah untuk menjalankan proyek:

### Prasyarat
Pastikan Anda telah memasang perangkat lunak berikut sebelum menjalankan proyek:
- Java Development Kit (JDK)
- Gradle
- Browser (Edge)

## Library yang Digunakan
Proyek ini menggunakan Maven untuk manajemen dependensi dan menyertakan library-library berikut dari repositori Maven:
- JUnit untuk pengujian API
- Selenium Java untuk pengujian UI website

## Konsep Page Object Model
Konsep Page Object Model digunakan dalam proyek ini untuk mengelola elemen-elemen UI dan tindakan yang terkait dengan halaman-halaman dalam website. Pendekatan ini memungkinkan pemisahan antara logika pengujian dan representasi UI, sehingga memudahkan pemeliharaan dan perubahan.

## Cara Menjalankan Proyek
1. Clone repository ini ke komputer lokal Anda.
2. Buka IntelliJ IDEA atau IDE Java lainnya.
3. Buka terminal di IntelliJ IDEA.
4. Ketik perintah berikut untuk menjalankan pengujian: ./gradlew cucumber
5. **Lihat Hasil Pengujian**
Setelah pengujian selesai, Anda dapat melihat hasilnya di laporan pengujian yang dihasilkan, biasanya berada di direktori `reports/`.

**##Contoh Hasil Report**
![Hasiil-Report](https://github.com/HabibiYasin/Final-Project-API-WEB-Testing/blob/master/Report%20Cucumber%20HTML.jpg)
## Catatan
- Pastikan untuk mengonfigurasi URL atau endpoint yang sesuai dengan aplikasi yang ingin diuji.
- Jika ada dependensi tambahan yang diperlukan, pastikan untuk menambahkannya ke dalam berkas `build.gradle`.
- Disarankan untuk memperbarui dan menjalankan dependensi sebelum menjalankan proyek.

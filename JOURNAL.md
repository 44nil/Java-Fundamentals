# 📝 Mühendislik Günlüğü - Esra

## [07.02.2026] - Day 3: Metodlar & ArrayList & Bellek
### 🧠 Memory Management: Stack vs. Heap

**Altın Kural:** Kod çalıştığında, işletim sistemi RAM'de bir alan ayırır ve burayı iki ana bölgeye böler:

1. **Stack (The Office Desk):**
   - Hızlı ve geçicidir.
   - İlkel veri tipleri (`int`, `boolean`) ve nesnelerin **anahtarları (referansları)** burada durur.
   - Metod bittiğinde buradaki her şey silinir (Masa temizlenir).

2. **Heap (The Warehouse):**
   - Büyük ve kalıcıdır.
   - `new` ile oluşturulan her şey (ArrayList, Nesneler) burada saklanır.
   - Buradaki "kolilerin" anahtarları Stack'teki masanda durur.
   - Garbage Collector (Çöp Toplayıcı) gelene kadar burada kalırlar.

> **Mühendislik Notu:** `ArrayList<String> cities = new ArrayList<>();` yazdığımda; 
> `cities` anahtarı **Stack**'te, listenin devasa gövdesi **Heap**'tedir!


### 🔑 Referans Mantığı (Reference Passing)
- `Student otherStudent = mySelf;` satırı yeni bir nesne YARATMAZ.
- Sadece mevcut nesnenin adresini (anahtarını) kopyalar.
- İki referans da Heap'teki aynı nesneyi işaret eder. 
- Birinden yapılan değişiklik diğerini de etkiler. Buna **"Aliasing"** denir.
>new keywordu yok bak çünkü. 

>StackOverflowError: Sınıf seviyesinde (metod dışında) new Student(...) diyerek kendi tipinden >bir nesne üretmeye çalıştığımda sonsuz bir döngü oluştuğunu ve Stack belleğinin saniyeler >içinde taştığını gördüm. Nesne üretim emirlerini main gibi metodların içine alarak bu düğümü >çözdüm.




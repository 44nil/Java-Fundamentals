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

Encapsulation (Kapsülleme)

Altın Kural: Verileri private yaparak zırhla, erişimi Getter/Setter metodlarıyla kontrollü sağla.

Neden Yapıldı: Kullanıcı şifrelerinin veya yetki seviyelerinin (authLevel) dışarıdan rastgele değiştirilmesini engellemek için.

Mühendislik Notu: private String password; diyerek veriyi sakladık, sadece izin verdiğimiz metodlar üzerinden erişim sağladık.

Inheritance (Kalıtım)

Altın Kural: Ortak özellikleri bir "Baba" sınıfta topla (BaseUser), "Çocuk" sınıflarda (AdminUser) extends ile miras al.

Neden Yapıldı: Kod tekrarını bitirmek için. EduQr'da her kullanıcı tipi için tekrar tekrar email/password yazmak yerine BaseUser'dan miras aldık.

Kritik Komut: super(email, password); ile çocuk sınıftan gelen bilgileri babanın constructor'ına elden teslim ettik.

 Polymorphism (Çok Biçimlilik) 
Konu: Bir nesnenin farklı şekillere bürünebilme yeteneği.

Uygulama: List<BaseUser> içinde hem AdminUser hem de CustomerUser nesnelerini aynı anda sakladık.

Mühendislik Kazanımı: Tek bir for döngüsüyle tüm kullanıcılara login() emri verdik. Java, nesnenin gerçekte kim olduğunu (Admin mi Müşteri mi) çalışma anında anlayarak doğru metodu çalıştırdı (Dynamic Method Dispatch).

Proje Vizyonu: Sisteme yeni kullanıcı tipleri (Aşçı, Garson) eklendiğinde mevcut yönetim döngüsünü değiştirmeden sisteme entegre edebilme esnekliği kazandık.

 Abstraction (Soyutlama) 
Konu: Sınıfları ve metodları birer "şablon" (blueprint) haline getirme.

Neden Yapıldı: Kimsenin yanlışlıkla "içi boş" bir BaseUser oluşturmasını engellemek için. Artık new BaseUser() komutu Java tarafından reddediliyor.

Mühendislik Notu: public abstract void login(); diyerek metodun gövdesini sildik. "Herkes giriş yapmalı ama nasıl yapacağını çocuk sınıflar kendi belirlemeli" kuralını (Abstract Method) koyduk.

Mimari Karar: Mimari bir kural seti oluşturuldu. Sisteme eklenecek her yeni sınıf, belirlenen bu soyut standartlara uymak zorunda bırakıldı.
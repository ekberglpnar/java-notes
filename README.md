# ☕ 50 Adımda Sıfırdan Zirveye Java (Java to Hero)

<div align="center">

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Status](https://img.shields.io/badge/Status-Completed-success?style=for-the-badge)
![License](https://img.shields.io/badge/License-MIT-blue?style=for-the-badge)

**Java öğrenme yolculuğunuzda size rehberlik edecek, özenle hazırlanmış 50 pratik örnek.**
*Sıfırdan başlayıp, Nesne Yönelimli Programlama (OOP) ve İleri Seviye Konulara kadar uzanan kapsamlı bir rehber.*

[Örnekleri İncele](#-proje-i̇çeriği) • [Nasıl Çalıştırılır?](#-kurulum-ve-çalıştırma) • [İletişim](#-i̇letişim)

</div>

---

## 📖 Proje Hakkında

Bu repository, Java programlama dilini öğrenmek isteyenler için **adım adım** zorlaşan bir yapı ile tasarlanmıştır. Her bir kod dosyası:
- ✅ **Açıklayıcı Yorum Satırları:** Kodun ne yaptığı satır satır anlatılmıştır.
- ✅ **Temiz Kod Prensipleri:** Okunabilir ve düzenli kod yapısı kullanılmıştır.
- ✅ **Gerçek Hayat Senaryoları:** Soyut kavramlar somut örneklerle pekiştirilmiştir.

## 📂 Proje İçeriği

Proje, öğrenme sürecini kolaylaştırmak için **8 Ana Modüle** ayrılmıştır.

| Modül | Konu Başlıkları | Örnek Sayısı |
|:---|:---|:---:|
| **01_Basics** | Değişkenler, Veri Tipleri, Operatörler, Scanner | 5 |
| **02_ControlFlow** | If-Else, Döngüler (For/While), Switch-Case | 10 |
| **03_Arrays_Strings** | Diziler, String Metotları, Algoritmalar | 5 |
| **04_Methods** | Metot Tanımlama, Overloading, Recursion | 5 |
| **05_OOP_Basics** | Class & Object, Constructor, Encapsulation | 5 |
| **06_OOP_Advanced** | Kalıtım (Inheritance), Çok Biçimlilik (Polymorphism), Interface | 10 |
| **07_Collections** | List, Set, Map Yapıları, Iterator | 5 |
| **08_Exceptions_IO** | Hata Yakalama (Try-Catch), Dosya Okuma/Yazma | 5 |

<details>
<summary>📂 <b>Detaylı Dosya Ağacı (Tıklayın)</b></summary>

```text
.
├── 01_Basics
│   ├── HelloWorld.java
│   └── VariablesDatatypes.java ...
├── 02_ControlFlow
│   ├── IfElseBasics.java
│   └── LoopExamples.java ...
...
├── 08_Exceptions_IO
│   ├── TryCatchBasic.java
│   └── FileOperations.java ...
└── README.md
```
</details>

## 🚀 Kurulum ve Çalıştırma

Bu projeyi bilgisayarınızda çalıştırmak için aşağıdaki adımları izleyebilirsiniz.

### Gereksinimler
- **Java Development Kit (JDK) 8** veya üzeri.
- Herhangi bir kod editörü (VS Code, IntelliJ IDEA, Eclipse).

### Terminal ile Çalıştırma

> **Önemli:** Klasör adları sıra numarası taşır (`01_Basics`), paket adları ise taşımaz (`package Basics;`).
> Bu yüzden derleme **proje kök dizininden** yapılmalı ve `-d` ile ayrı bir çıktı klasörü verilmelidir.
> Klasörün içine girip `javac HelloWorld.java` demek `ClassNotFoundException` verir.

```bash
# Örnek: HelloWorld.java'yı çalıştırma (proje kök dizinindeyken)
javac -d out 01_Basics/HelloWorld.java
java -cp out Basics.HelloWorld
```

Başka bir örneği çalıştırmak için yolu ve paket adını değiştirmeniz yeterli:

```bash
# Örnek: HashMapDemo.java'yı çalıştırma
javac -d out 07_Collections/HashMapDemo.java
java -cp out Collections.HashMapDemo
```

| Klasör | Paket adı |
|:---|:---|
| `01_Basics` | `Basics` |
| `02_ControlFlow` | `ControlFlow` |
| `03_Arrays_Strings` | `ArraysStrings` |
| `04_Methods` | `Methods` |
| `05_OOP_Basics` | `OOP_Basics` |
| `06_OOP_Advanced` | `OOP_Advanced` |
| `07_Collections` | `Collections` |
| `08_Exceptions_IO` | `Exceptions_IO` |

### IDE ile Çalıştırma
Projeyi favori IDE'niz ile açın (Open Folder / Open Project diyerek `java-notes` klasörünü seçin). Ardından çalıştırmak istediğiniz dosyaya sağ tıklayıp **Run** diyerek kolayca çalıştırabilirsiniz.



---
<div align="center">
  <sub>Bu proje ❤️ ile <b>Java Öğrenenler</b> için hazırlanmıştır.</sub>
</div>

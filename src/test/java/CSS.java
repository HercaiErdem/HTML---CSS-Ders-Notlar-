public class CSS {


    //            -Cascading Style Sheet(CSS) Nedir?-

    /*
 * CSS, web sayfalarını biçimlendirmek için
 HTML’nin tamamlayıcısı olarak kullanılan bir işaretleme dilidir.

 * HTML ile sayafanın iskeleti ve içeriği tanımlanırken, CSS ile biçimlendirmesi yapılır.
 Yani CSS ile web sayfalarına makyaj yapmış oluruz.

 *CSS eklemek için ilgili tagın içine style attribute’ u eklenir. Buna inline stil denir.
 Koddan önce 'style=' yazılır.
 Örneğin; <p style="color: red">Bugun CSS ogreniyorum</p> => web sayfasında "Bugun CSS ogreniyorum"
 cümlesi kırmızı renk gözükür.
*/


     //                 -En Temel CSS Kodları-

    /*
  * font-size:  Yazının büyüklüğünü değiştirmek için kullanılır.

  * text-align: Yazının sağda, solda, ortada veya sağa ve sola dayalı şekilde olması için kullanılır.
 text-align özelliğine,  left, right, center, justify degerleri verebiliriz.
 Örneğin; <h3 style="text-align:center">En Temel CSS Kodları</h3> => Başık web sayfasında ortada olur.

 *color: Yazının rengini değiştirmek için kullanılır.

 * background-color Html elemanının zemin rengini değiştirmek için kullanılır.

-Harici CSS Nedir?-

* Web sitemize CSS eklemenin en uygun yolu, onu harici bir .css dosyasına bağlamaktır.
* Harici bir CSS dosyasına bir bağlantı, yine sayfanın <head></head> bölümü arasına yerleştirilir.
Genel yazılımı </head> ın üst satırıdır.
Örneğin; <link rel="stylesheet" href="css/style.css" />
  </head>
* Aynı .css dosyası birden fazla sayfada kullanılabilir.
*/

        //     -CSS Seçiciler (Selectors) Nedir?
    /*
 *HTML sayfasında bulunan herhangi bir elemanı (elementi)
 veya birden fazla elemanı seçerek özelliklerini değiştirmemize olanak verir.

 *Clear code açısından önemlidir.

 *Genel Seçici (*) ler, tüm Html elemanlarını seçmemize olanak verir.
 Seçmeyi “*” karakteri ile yapalır.
Örneğin; *{
    text-align: center;
 }

* Bazı html elemanlarını seçmek için class tanımlaması yapılır.

* Class ismini yazmak için class="" diyip class ismi "" arasına yazılır.
Örneğin; HTLM de <p class="renk">Merhaba</p> , CSS harici dosyasında
.renk {
text-align: center;
color: red;
}

* web sayfamızda renk isminde tanımladıgımız HTML kodları kırmızı renk yazılacaktır.

** CSS harici dosyasına class ismini çekmek icin class name den önce "."(nokta) konulur.
* text-decoration: Metnin altına, üstüne veya üzerine çizgi çekmek için kullanılır.
underline, overline, line-through, none değerlerini alabilir.

* font-style: Yazıyı italik hale getirmek için kullanılır. normal, italic değerlerini alabilir.

* width: Html taglarının genişliğini (yatayda kapladığı alanı) ayarlamak için kullanılır.

* height: Html taglarının yüksekliğini (dikeyde kapladığı alanı) ayarlamak için kullanılır.
- width ve height için %, px birim olarak kullanılabilir.

*Border (Çerçeve): Elementlere çerçeve vermek için border stili uygulanır.

*border: genişlik tip renk şeklindedir. Genişlik px birim olarak kullanılır.

*Tip için verilebilecek değerler: dotted, dashed, solid, double, groove, ridge, inset, outset, none

*border-radius: Çerçevelerin köşelerini yumuşatmak için kullanılır.
*Shadow (Gölge): text-shadow: Yazılara gölge vermek için, box-shadow: Elementlere gölge vermek için kullanılır.
Örneğin; box-shadow: 5px 5px 20px 5px black;

*flex-direction: dizlimin yönü belirlenebilir. Row olursa yan yana, column olursa alt alta gösterilir.

*justify-content Flex içindeki elemanları hizalamak için kullanılır.

*align-items: Flex içindeki elemanları hizalamak için kullanılır.

*padding: Elementin içindeki diğer elementlerin kenarlardan olan uzaklığını belirler.

*margin: Elementin dıştaki elementlerden olan uzaklığını belirler.
Örneğin; CSS dosyasındaki yazılımı,
.kutu{
padding: 50px;
margin: 90px;
}

 */
}

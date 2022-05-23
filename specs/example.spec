Getting Started with Gauge
==========================

This is an executable specification file. This file follows markdown syntax. Every heading in this file denotes a scenario. Every bulleted point denotes a step.
To execute this specification, use `mvn test`

Search
----------------------------
*"3" kadar bekle
*"com.ozdilek.ozdilekteyim:id/tv_startShoppingStore" bul ve "ALIŞVERİŞE BAŞLA" değerini kontrol et
*"3" kadar bekle
*"//*[@resource-id='com.ozdilek.ozdilekteyim:id/nav_categories']" xpathli elementi bul ve tıkla.
*"3" kadar bekle
*"//*[@resource-id='com.ozdilek.ozdilekteyim:id/relLayCategoriesItem'][2]" xpathli elementi bul ve tıkla.
*"1" kadar bekle
*"//*[@resource-id='com.ozdilek.ozdilekteyim:id/relLayCategoriesItem'][10]" xpathli elementi bul ve tıkla.
*"3" kadar bekle
*Sayfayı yukarı kaydır
*"1" kadar bekle
*Sayfayı yukarı kaydır
*"3" kadar bekle
*Random seçim
*"//*[@resource-id='com.ozdilek.ozdilekteyim:id/imgFav']" xpathli elementi bul ve tıkla.
*"3" kadar bekle
*"com.ozdilek.ozdilekteyim:id/etEposta" id'li elemente "kullanıcı adı text" değerini yaz
*"3" kadar bekle
*"com.ozdilek.ozdilekteyim:id/etPassword" id'li elemente "şifre text" değerini yaz
*"3" kadar bekle
//hocam kusura bakmayın çalışan inspector hiçbir şey yapmadığım halde bağlanmadığı için butonun elementine bakamıyorum.
//geri, geri kısmını atlayarak devam ettim.
*Random seçim
*"3" kadar bekle
//random beden seçimi
//Sepete ekleme kısmının elementi olmadığı için tıklatamıyorum.




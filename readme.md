# BestBuy Automation Tests

Bu repo Kloia Test Bootcamp'in final projelerinden Web Otomasyon Test projesi için oluşturulmuştur. Proje içerisinde Java Selenium Cucumber ile Page Object Model kullanılarak birçok test otomasyonu yazıldı. Burada yapılan bazı test senaryoları ürün arama, giriş yapma, google ile giriş yapma, ürün filtreleme, ürün kaydetme gibi test senaryoları idi. Ayrıca bu projede BDD yaklaşımı uygulanmıştır. BDD yaklaşımı tüm birimler tarafından anlaşılabilen ortak bir dil kullanarak test otomasyonunun kolay anlaşılabilir olmasını sağlamaktadır. Test senaryoları "resources/features/CaseStudy.feature" altında yer almaktadır. 

## Kurulum Öncesi Gereksinimler
* Java 
* Maven 
* Selenium-java
* Cucumber-java
* Webdrivermanager
* Cucumber-junit

## Kurulum Adımları

1- Bash ekranı açılır.
`

2- BestBuy-Cucumber-TestAutomation reposu lokal cihaza kopyalanır.

``` git clone https://github.com/acelyagul/BestBuy-Cucumber-TestAutomation.git ```

3- Klasöre gidilir.

``` cd BestBuy-Cucumber-TestAutomation ```

4- Ana dizinde yer alan "configurations.properties" dosyası içerisine bestbuy.com için kullanıcı hesap bilgileri tanımlanr.

```
username=[bestbuyusername]
password=[bestbuypassword]

gmail_username=[gmailusernameforbestbuy]
gmail_password=[gmailusernameforbestbuy]

browserName=[browsername]
```

5- Ardından test dosyaları çalıştırılır.

``` mvn clean test -Dtest=CucumberRunner  ```

Not: Test sonuçları "Target" klasörü altında yer alan "default-html-reports" klasöründe raporlanmaktadır. 


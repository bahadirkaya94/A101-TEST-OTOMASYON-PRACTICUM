Feature: A101 Test Otomasyon Practicum

  @SmokeTest
  Scenario Outline: A101'in web sitesinden 1 adet dizaltı siyah çorabı sepete ekleyip, e-posta ile devam ettikten sonra, adres bilgilerini girip, garantiPay ile ödeme seçeneğini seçip, ödeme ekranına gelmek

    Given web sitesine gidilir

    And acilan cerezler kapatilir
      | acceptCookies |
    And giyim & aksesuar kategorisine gidilir
      | giyimAndAksesuar |
    And dizalti corap alt kategorisine tiklanir
      | dizaltiCorap |
    And siyah olan ilk urune tiklanir
      | product |
    And Urunun renginin siyah oldugu dogrulanir
      | productColour | <colour> |
    And acilan sayfada sepete ekle butonuna tiklanir
      | addToCart |
    And acilan sayfada sepeti goruntule butonuna tiklanir
      | viewCart |
    And acilan sayfada sepeti onayla butonuna tiklanir
      | confirmCart |
    And acilan sayfada uye olmadan devam et butonuna tiklanir
      | continueWithoutAMember |
    And acilan sayfada e-mail adresi girilir
      | eMail | <mailExtension> |
    And devam et butonuna tiklanir
      | continueButton |
    And acilan sayfada yeni adres olustur butonuna tiklanir
      | createNewAddress |
    And acilan formda adres basligi, ad, soyad, cep telefonu, adres bilgileri girilir
      | addressTitle | <adresBasligi> |
      | firstName    | <ad>           |
      | lastName     | <soyAd>        |
      | phoneNumber  | <telefonNo>    |
      | fullAddress  | <acikAdres>    |
    And ile tiklanir
      | city |
    And il secilir
      | city | <cityValue> |
    And ilceye tiklanir
      | town |
    And ilce secilir
      | town | <townValue> |
    And mahalleye tiklanir
      | district |
    And mahalle secilir
      | district | <districtValue> |
    And acilan formda kaydet butonuna tiklanir
      | saveAddress |
    And acilan sayfada kargo firmasi secilir
      | cargo           |
    And kaydet ve devam et butonuna tiklanir
      | saveAndContinue |
    Then acilan sayfada garanti pay butonuna tiklanir
      | garantiPay |
    And acilan sayfada sozlesme onay butonuna tiklanir
      | contractConfirmation |
    And garanti pay ile ode butonuna tiklanir
      | payWithGarantiPay |
    And odeme sayfasinin geldigi dogrulanir

    Examples: Examples: 1
      | colour | mailExtension | adresBasligi | ad      | soyAd | telefonNo  | acikAdres                        | cityValue | townValue | districtValue |
      | SİYAH  | @a101.com     | A101         | Bahadır | Kaya  | 1234567890 | Nagehan Sokağı No: 4B D:1, 34676 | 40        | 485       | 36320         |